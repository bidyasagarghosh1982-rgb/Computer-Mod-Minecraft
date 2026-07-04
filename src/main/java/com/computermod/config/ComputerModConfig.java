package com.computermod.config;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ComputerModConfig {
    public static class General {
        public static boolean enableEnergySystem = true;
        public static boolean enableMultiblockComputers = true;
        public static int energyTransferRate = 100;
        public static int maxEnergyStorage = 10000;
    }

    public static class Clock {
        public static boolean enableClockBlock = true;
        public static int updateInterval = 20; // ticks
    }

    public static class Crafting {
        public static boolean enableCustomCrafting = true;
        public static int assemblyStationEnergyCost = 500;
        public static int assemblyStationCraftingTime = 200; // ticks
    }

    public static void load() {
        // Load configuration from file
        // For now, using default values
    }

    public static void save() {
        // Save configuration to file
    }
}
