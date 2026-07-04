package com.computermod.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;

import com.computermod.energy.EnergyContainer;

public abstract class EnergyBlockEntity extends BlockEntity {
    protected EnergyContainer energyContainer;

    public EnergyBlockEntity(net.minecraft.block.entity.BlockEntityType<?> type, BlockPos pos, BlockState state, int maxEnergy, int transferRate) {
        super(type, pos, state);
        this.energyContainer = new EnergyContainer(maxEnergy, transferRate);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        if (nbt.contains("Energy")) {
            energyContainer.setStoredEnergy(nbt.getInt("Energy"));
        }
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        nbt.putInt("Energy", energyContainer.getStoredEnergy());
    }

    public EnergyContainer getEnergyContainer() {
        return energyContainer;
    }
}
