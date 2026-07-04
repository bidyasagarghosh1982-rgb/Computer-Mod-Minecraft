package com.computermod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import com.computermod.ComputerMod;

public class ModItems {
    // ========== NVIDIA GPUs (High-End) ==========
    public static final Item RTX_5090 = registerItem("rtx_5090", new Item(new Item.Settings()));
    public static final Item RTX_5080 = registerItem("rtx_5080", new Item(new Item.Settings()));
    public static final Item RTX_5070_TI = registerItem("rtx_5070_ti", new Item(new Item.Settings()));
    public static final Item RTX_5070 = registerItem("rtx_5070", new Item(new Item.Settings()));
    public static final Item RTX_4070_TI_SUPER = registerItem("rtx_4070_ti_super", new Item(new Item.Settings()));

    // ========== AMD GPUs (High-End & Value) ==========
    public static final Item RX_9070_XT = registerItem("rx_9070_xt", new Item(new Item.Settings()));
    public static final Item RX_7900_XTX = registerItem("rx_7900_xtx", new Item(new Item.Settings()));
    public static final Item RX_7800_XT = registerItem("rx_7800_xt", new Item(new Item.Settings()));
    public static final Item RX_9060_XT = registerItem("rx_9060_xt", new Item(new Item.Settings()));

    // ========== INTEL GPUs ==========
    public static final Item INTEL_ARC_B770 = registerItem("intel_arc_b770", new Item(new Item.Settings()));
    public static final Item INTEL_ARC_A770 = registerItem("intel_arc_a770", new Item(new Item.Settings()));

    // ========== AMD CPUs (Flagship & Gaming) ==========
    public static final Item RYZEN_9_9950X3D = registerItem("ryzen_9_9950x3d", new Item(new Item.Settings()));
    public static final Item RYZEN_7_9800X3D = registerItem("ryzen_7_9800x3d", new Item(new Item.Settings()));
    public static final Item RYZEN_7_9700X = registerItem("ryzen_7_9700x", new Item(new Item.Settings()));
    public static final Item RYZEN_5_9600X = registerItem("ryzen_5_9600x", new Item(new Item.Settings()));
    public static final Item RYZEN_5_7600 = registerItem("ryzen_5_7600", new Item(new Item.Settings()));

    // ========== INTEL CPUs (Flagship & Gaming) ==========
    public static final Item INTEL_CORE_ULTRA_9_285K = registerItem("intel_core_ultra_9_285k", new Item(new Item.Settings()));
    public static final Item INTEL_CORE_I9_14900K = registerItem("intel_core_i9_14900k", new Item(new Item.Settings()));
    public static final Item INTEL_CORE_I9_14900KS = registerItem("intel_core_i9_14900ks", new Item(new Item.Settings()));
    public static final Item INTEL_CORE_ULTRA_7_265K = registerItem("intel_core_ultra_7_265k", new Item(new Item.Settings()));
    public static final Item INTEL_CORE_I5_13400F = registerItem("intel_core_i5_13400f", new Item(new Item.Settings()));

    // ========== MOTHERBOARDS ==========
    public static final Item LGA_1700_MOTHERBOARD = registerItem("lga_1700_motherboard", new Item(new Item.Settings()));
    public static final Item AM5_MOTHERBOARD = registerItem("am5_motherboard", new Item(new Item.Settings()));
    public static final Item TRX50_MOTHERBOARD = registerItem("trx50_motherboard", new Item(new Item.Settings()));

    // ========== DDR5 RAM MODULES (Premium) ==========
    public static final Item DDR5_64GB = registerItem("ddr5_64gb", new Item(new Item.Settings()));
    public static final Item DDR5_48GB = registerItem("ddr5_48gb", new Item(new Item.Settings()));
    public static final Item DDR5_32GB = registerItem("ddr5_32gb", new Item(new Item.Settings()));
    public static final Item DDR5_24GB = registerItem("ddr5_24gb", new Item(new Item.Settings()));
    public static final Item DDR5_16GB = registerItem("ddr5_16gb", new Item(new Item.Settings()));
    public static final Item DDR5_12GB = registerItem("ddr5_12gb", new Item(new Item.Settings()));
    public static final Item DDR5_8GB = registerItem("ddr5_8gb", new Item(new Item.Settings()));

    // ========== DDR4 RAM MODULES (Standard) ==========
    public static final Item DDR4_64GB = registerItem("ddr4_64gb", new Item(new Item.Settings()));
    public static final Item DDR4_48GB = registerItem("ddr4_48gb", new Item(new Item.Settings()));
    public static final Item DDR4_32GB = registerItem("ddr4_32gb", new Item(new Item.Settings()));
    public static final Item DDR4_24GB = registerItem("ddr4_24gb", new Item(new Item.Settings()));
    public static final Item DDR4_16GB = registerItem("ddr4_16gb", new Item(new Item.Settings()));
    public static final Item DDR4_12GB = registerItem("ddr4_12gb", new Item(new Item.Settings()));
    public static final Item DDR4_8GB = registerItem("ddr4_8gb", new Item(new Item.Settings()));

    // ========== DDR3 RAM MODULES (Legacy) ==========
    public static final Item DDR3_32GB = registerItem("ddr3_32gb", new Item(new Item.Settings()));
    public static final Item DDR3_16GB = registerItem("ddr3_16gb", new Item(new Item.Settings()));
    public static final Item DDR3_8GB = registerItem("ddr3_8gb", new Item(new Item.Settings()));
    public static final Item DDR3_4GB = registerItem("ddr3_4gb", new Item(new Item.Settings()));

    // ========== STORAGE DRIVES ==========
    public static final Item NVMe_2TB = registerItem("nvme_2tb", new Item(new Item.Settings()));
    public static final Item NVMe_1TB = registerItem("nvme_1tb", new Item(new Item.Settings()));
    public static final Item SSD_1TB = registerItem("ssd_1tb", new Item(new Item.Settings()));
    public static final Item HDD_4TB = registerItem("hdd_4tb", new Item(new Item.Settings()));

    // ========== POWER SUPPLIES ==========
    public static final Item PSU_1200W = registerItem("psu_1200w", new Item(new Item.Settings()));
    public static final Item PSU_850W = registerItem("psu_850w", new Item(new Item.Settings()));
    public static final Item PSU_650W = registerItem("psu_650w", new Item(new Item.Settings()));
    public static final Item PSU_500W = registerItem("psu_500w", new Item(new Item.Settings()));

    // ========== COOLING SOLUTIONS ==========
    public static final Item LIQUID_COOLER_360MM = registerItem("liquid_cooler_360mm", new Item(new Item.Settings()));
    public static final Item LIQUID_COOLER_280MM = registerItem("liquid_cooler_280mm", new Item(new Item.Settings()));
    public static final Item AIR_COOLER_TOWER = registerItem("air_cooler_tower", new Item(new Item.Settings()));
    public static final Item AIR_COOLER_DOWNDRAFT = registerItem("air_cooler_downdraft", new Item(new Item.Settings()));

    // ========== CASES ==========
    public static final Item CASE_FULL_TOWER = registerItem("case_full_tower", new Item(new Item.Settings()));
    public static final Item CASE_MID_TOWER = registerItem("case_mid_tower", new Item(new Item.Settings()));
    public static final Item CASE_MINI_ITX = registerItem("case_mini_itx", new Item(new Item.Settings()));

    // ========== OPERATING SYSTEMS ==========
    public static final Item WINDOWS_11_PRO = registerItem("windows_11_pro", new Item(new Item.Settings()));
    public static final Item WINDOWS_11_HOME = registerItem("windows_11_home", new Item(new Item.Settings()));
    public static final Item WINDOWS_10_PRO = registerItem("windows_10_pro", new Item(new Item.Settings()));
    public static final Item UBUNTU_24_LTS = registerItem("ubuntu_24_lts", new Item(new Item.Settings()));
    public static final Item FEDORA_40 = registerItem("fedora_40", new Item(new Item.Settings()));
    public static final Item MACOS_SONOMA = registerItem("macos_sonoma", new Item(new Item.Settings()));
    public static final Item ARCH_LINUX = registerItem("arch_linux", new Item(new Item.Settings()));
    public static final Item DEBIAN_12 = registerItem("debian_12", new Item(new Item.Settings()));

    // ========== ADDITIONAL COMPONENTS ==========
    public static final Item WIFI_CARD = registerItem("wifi_card", new Item(new Item.Settings()));
    public static final Item ETHERNET_CARD = registerItem("ethernet_card", new Item(new Item.Settings()));
    public static final Item SOUND_CARD = registerItem("sound_card", new Item(new Item.Settings()));
    public static final Item CAPTURE_CARD = registerItem("capture_card", new Item(new Item.Settings()));
    public static final Item USB_HUB = registerItem("usb_hub", new Item(new Item.Settings()));

    // ========== PERIPHERALS ==========
    public static final Item GAMING_KEYBOARD = registerItem("gaming_keyboard", new Item(new Item.Settings()));
    public static final Item GAMING_MOUSE = registerItem("gaming_mouse", new Item(new Item.Settings()));
    public static final Item GAMING_MONITOR_4K = registerItem("gaming_monitor_4k", new Item(new Item.Settings()));
    public static final Item GAMING_MONITOR_1440P = registerItem("gaming_monitor_1440p", new Item(new Item.Settings()));
    public static final Item MECHANICAL_KEYBOARD = registerItem("mechanical_keyboard", new Item(new Item.Settings()));
    public static final Item WIRELESS_MOUSE = registerItem("wireless_mouse", new Item(new Item.Settings()));

    // ========== ASSEMBLED COMPUTERS ==========
    public static final Item GAMING_PC_HIGH_END = registerItem("gaming_pc_high_end", new Item(new Item.Settings()));
    public static final Item GAMING_PC_MID_RANGE = registerItem("gaming_pc_mid_range", new Item(new Item.Settings()));
    public static final Item WORKSTATION_PC = registerItem("workstation_pc", new Item(new Item.Settings()));
    public static final Item BUDGET_PC = registerItem("budget_pc", new Item(new Item.Settings()));
    public static final Item STREAMING_PC = registerItem("streaming_pc", new Item(new Item.Settings()));
    public static final Item SERVER_PC = registerItem("server_pc", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ComputerMod.MOD_ID, name), item);
    }

    public static void register() {
        ComputerMod.LOGGER.debug("Registering Computer Mod items");
    }
}
