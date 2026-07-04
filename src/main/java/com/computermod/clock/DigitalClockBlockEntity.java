package com.computermod.clock;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

public class DigitalClockBlockEntity extends BlockEntity {
    private TimeZoneManager.TimeZone currentTimeZone = TimeZoneManager.TimeZone.UTC;
    private int updateTicks = 0;
    private static final int UPDATE_INTERVAL = 20; // Update every second

    public DigitalClockBlockEntity(BlockPos pos, BlockState state) {
        super(ClockBlockEntities.DIGITAL_CLOCK_ENTITY, pos, state);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        if (nbt.contains("TimeZone")) {
            try {
                currentTimeZone = TimeZoneManager.TimeZone.valueOf(nbt.getString("TimeZone"));
            } catch (IllegalArgumentException e) {
                currentTimeZone = TimeZoneManager.TimeZone.UTC;
            }
        }
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        nbt.putString("TimeZone", currentTimeZone.name());
    }

    public void cycleTimeZone() {
        TimeZoneManager.TimeZone[] zones = TimeZoneManager.TimeZone.values();
        int currentIndex = currentTimeZone.ordinal();
        currentTimeZone = zones[(currentIndex + 1) % zones.length];
        markDirty();
        if (world != null) {
            world.updateListeners(pos, getCachedState(), getCachedState(), 3);
        }
    }

    public TimeZoneManager.TimeZone getCurrentTimeZone() {
        return currentTimeZone;
    }

    public String getCurrentTime() {
        return TimeZoneManager.getCurrentTimeForZone(currentTimeZone);
    }

    public String getCurrentDate() {
        return TimeZoneManager.getCurrentDateForZone(currentTimeZone);
    }

    public String getTimeZoneInfo() {
        return TimeZoneManager.getFormattedTimeZoneInfo(currentTimeZone);
    }

    @Nullable
    @Override
    public BlockEntityUpdateS2CPacket toUpdatePacket() {
        return BlockEntityUpdateS2CPacket.create(this);
    }

    @Override
    public NbtCompound toInitialChunkDataNbt() {
        NbtCompound nbt = new NbtCompound();
        writeNbt(nbt);
        return nbt;
    }
}
