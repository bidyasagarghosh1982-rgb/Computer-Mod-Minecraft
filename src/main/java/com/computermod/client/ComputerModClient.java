package com.computermod.client;

import net.fabricmc.api.ClientModInitializer;

import com.computermod.ComputerMod;

public class ComputerModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ComputerMod.LOGGER.info("Computer Mod client initialized");
    }
}
