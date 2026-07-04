package com.computermod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.computermod.item.ModItems;
import com.computermod.block.ModBlocks;

public class ComputerMod implements ModInitializer {
    public static final String MOD_ID = "computermod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Computer Mod initializing...");

        // Register items
        ModItems.register();
        ModBlocks.register();

        // Add items to creative tabs
        addItemsToCreativeTab();

        LOGGER.info("Computer Mod loaded successfully!");
    }

    private void addItemsToCreativeTab() {
        // Add all items to Tools creative tab
        ItemGroupEvents.modifyEntriesByTab(ItemGroups.TOOLS).register(contents -> {
            // GPUs
            contents.add(ModItems.RTX_5090);
            contents.add(ModItems.RTX_5080);
            contents.add(ModItems.RTX_5070_TI);
            contents.add(ModItems.RTX_5070);
            contents.add(ModItems.RTX_4070_TI_SUPER);

            contents.add(ModItems.RX_9070_XT);
            contents.add(ModItems.RX_7900_XTX);
            contents.add(ModItems.RX_7800_XT);
            contents.add(ModItems.RX_9060_XT);

            contents.add(ModItems.INTEL_ARC_B770);
            contents.add(ModItems.INTEL_ARC_A770);

            // CPUs
            contents.add(ModItems.RYZEN_9_9950X3D);
            contents.add(ModItems.RYZEN_7_9800X3D);
            contents.add(ModItems.RYZEN_7_9700X);
            contents.add(ModItems.RYZEN_5_9600X);
            contents.add(ModItems.RYZEN_5_7600);

            contents.add(ModItems.INTEL_CORE_ULTRA_9_285K);
            contents.add(ModItems.INTEL_CORE_I9_14900K);
            contents.add(ModItems.INTEL_CORE_I9_14900KS);
            contents.add(ModItems.INTEL_CORE_ULTRA_7_265K);
            contents.add(ModItems.INTEL_CORE_I5_13400F);

            // Motherboards
            contents.add(ModItems.LGA_1700_MOTHERBOARD);
            contents.add(ModItems.AM5_MOTHERBOARD);
            contents.add(ModItems.TRX50_MOTHERBOARD);

            // RAM
            contents.add(ModItems.DDR5_64GB);
            contents.add(ModItems.DDR5_48GB);
            contents.add(ModItems.DDR5_32GB);
            contents.add(ModItems.DDR5_24GB);
            contents.add(ModItems.DDR5_16GB);
            contents.add(ModItems.DDR5_12GB);
            contents.add(ModItems.DDR5_8GB);

            contents.add(ModItems.DDR4_64GB);
            contents.add(ModItems.DDR4_48GB);
            contents.add(ModItems.DDR4_32GB);
            contents.add(ModItems.DDR4_24GB);
            contents.add(ModItems.DDR4_16GB);
            contents.add(ModItems.DDR4_12GB);
            contents.add(ModItems.DDR4_8GB);

            contents.add(ModItems.DDR3_32GB);
            contents.add(ModItems.DDR3_16GB);
            contents.add(ModItems.DDR3_8GB);
            contents.add(ModItems.DDR3_4GB);

            // Storage
            contents.add(ModItems.NVMe_2TB);
            contents.add(ModItems.NVMe_1TB);
            contents.add(ModItems.SSD_1TB);
            contents.add(ModItems.HDD_4TB);

            // Power Supplies
            contents.add(ModItems.PSU_1200W);
            contents.add(ModItems.PSU_850W);
            contents.add(ModItems.PSU_650W);
            contents.add(ModItems.PSU_500W);

            // Cooling
            contents.add(ModItems.LIQUID_COOLER_360MM);
            contents.add(ModItems.LIQUID_COOLER_280MM);
            contents.add(ModItems.AIR_COOLER_TOWER);
            contents.add(ModItems.AIR_COOLER_DOWNDRAFT);

            // Cases
            contents.add(ModItems.CASE_FULL_TOWER);
            contents.add(ModItems.CASE_MID_TOWER);
            contents.add(ModItems.CASE_MINI_ITX);

            // Operating Systems
            contents.add(ModItems.WINDOWS_11_PRO);
            contents.add(ModItems.WINDOWS_11_HOME);
            contents.add(ModItems.WINDOWS_10_PRO);
            contents.add(ModItems.UBUNTU_24_LTS);
            contents.add(ModItems.FEDORA_40);
            contents.add(ModItems.MACOS_SONOMA);
            contents.add(ModItems.ARCH_LINUX);
            contents.add(ModItems.DEBIAN_12);

            // Components
            contents.add(ModItems.WIFI_CARD);
            contents.add(ModItems.ETHERNET_CARD);
            contents.add(ModItems.SOUND_CARD);
            contents.add(ModItems.CAPTURE_CARD);
            contents.add(ModItems.USB_HUB);

            // Peripherals
            contents.add(ModItems.GAMING_KEYBOARD);
            contents.add(ModItems.GAMING_MOUSE);
            contents.add(ModItems.GAMING_MONITOR_4K);
            contents.add(ModItems.GAMING_MONITOR_1440P);
            contents.add(ModItems.MECHANICAL_KEYBOARD);
            contents.add(ModItems.WIRELESS_MOUSE);

            // Pre-built PCs
            contents.add(ModItems.GAMING_PC_HIGH_END);
            contents.add(ModItems.GAMING_PC_MID_RANGE);
            contents.add(ModItems.WORKSTATION_PC);
            contents.add(ModItems.BUDGET_PC);
            contents.add(ModItems.STREAMING_PC);
            contents.add(ModItems.SERVER_PC);
        });
    }
}
