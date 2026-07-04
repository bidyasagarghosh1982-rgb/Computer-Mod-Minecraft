package com.computermod.network;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.util.Identifier;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.network.ServerPlayerEntity;

import com.computermod.ComputerMod;

public class ComputerModNetworking {
    public static final Identifier CLOCK_TIME_SYNC = new Identifier(ComputerMod.MOD_ID, "clock_time_sync");
    public static final Identifier ENERGY_SYNC = new Identifier(ComputerMod.MOD_ID, "energy_sync");
    public static final Identifier MULTIBLOCK_SYNC = new Identifier(ComputerMod.MOD_ID, "multiblock_sync");

    public static void registerServerReceivers() {
        ServerPlayNetworking.registerGlobalReceiver(CLOCK_TIME_SYNC, (server, player, handler, buf, responseSender) -> {
            // Handle clock time sync from client
        });

        ServerPlayNetworking.registerGlobalReceiver(ENERGY_SYNC, (server, player, handler, buf, responseSender) -> {
            // Handle energy sync from client
        });

        ServerPlayNetworking.registerGlobalReceiver(MULTIBLOCK_SYNC, (server, player, handler, buf, responseSender) -> {
            // Handle multiblock sync from client
        });
    }

    public static void sendClockTimeSync(ServerPlayerEntity player, String time, String timeZone) {
        PacketByteBuf buf = ServerPlayNetworking.createS2CPacket(CLOCK_TIME_SYNC, buf2 -> {
            buf2.writeString(time);
            buf2.writeString(timeZone);
        });
    }

    public static void sendEnergySync(ServerPlayerEntity player, int energy, int maxEnergy) {
        ServerPlayNetworking.send(player, ENERGY_SYNC, buf -> {
            buf.writeInt(energy);
            buf.writeInt(maxEnergy);
        });
    }
}
