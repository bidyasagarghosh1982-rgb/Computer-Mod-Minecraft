package com.computermod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import com.computermod.ComputerMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ComputerMod.MOD_ID);

    // ========== NVIDIA GPUs (High-End) ==========
    public static final RegistryObject<Item> RTX_5090 = ITEMS.register("rtx_5090",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RTX_5080 = ITEMS.register("rtx_5080",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RTX_5070_TI = ITEMS.register("rtx_5070_ti",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RTX_5070 = ITEMS.register("rtx_5070",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RTX_4070_TI_SUPER = ITEMS.register("rtx_4070_ti_super",
            () -> new Item(new Item.Properties()));

    // ========== AMD GPUs (High-End & Value) ==========
    public static final RegistryObject<Item> RX_9070_XT = ITEMS.register("rx_9070_xt",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RX_7900_XTX = ITEMS.register("rx_7900_xtx",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RX_7800_XT = ITEMS.register("rx_7800_xt",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RX_9060_XT = ITEMS.register("rx_9060_xt",
            () -> new Item(new Item.Properties()));

    // ========== INTEL GPUs ==========
    public static final RegistryObject<Item> INTEL_ARC_B770 = ITEMS.register("intel_arc_b770",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INTEL_ARC_A770 = ITEMS.register("intel_arc_a770",
            () -> new Item(new Item.Properties()));

    // ========== AMD CPUs (Flagship & Gaming) ==========
    public static final RegistryObject<Item> RYZEN_9_9950X3D = ITEMS.register("ryzen_9_9950x3d",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RYZEN_7_9800X3D = ITEMS.register("ryzen_7_9800x3d",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RYZEN_7_9700X = ITEMS.register("ryzen_7_9700x",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RYZEN_5_9600X = ITEMS.register("ryzen_5_9600x",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RYZEN_5_7600 = ITEMS.register("ryzen_5_7600",
            () -> new Item(new Item.Properties()));

    // ========== INTEL CPUs (Flagship & Gaming) ==========
    public static final RegistryObject<Item> INTEL_CORE_ULTRA_9_285K = ITEMS.register("intel_core_ultra_9_285k",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INTEL_CORE_I9_14900K = ITEMS.register("intel_core_i9_14900k",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INTEL_CORE_I9_14900KS = ITEMS.register("intel_core_i9_14900ks",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INTEL_CORE_ULTRA_7_265K = ITEMS.register("intel_core_ultra_7_265k",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INTEL_CORE_I5_13400F = ITEMS.register("intel_core_i5_13400f",
            () -> new Item(new Item.Properties()));

    // ========== MOTHERBOARDS ==========
    public static final RegistryObject<Item> LGA_1700_MOTHERBOARD = ITEMS.register("lga_1700_motherboard",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AM5_MOTHERBOARD = ITEMS.register("am5_motherboard",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TRX50_MOTHERBOARD = ITEMS.register("trx50_motherboard",
            () -> new Item(new Item.Properties()));

    // ========== DDR5 RAM MODULES (Premium) ==========
    public static final RegistryObject<Item> DDR5_64GB = ITEMS.register("ddr5_64gb",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DDR5_48GB = ITEMS.register("ddr5_48gb",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DDR5_32GB = ITEMS.register("ddr5_32gb",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DDR5_24GB = ITEMS.register("ddr5_24gb",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DDR5_16GB = ITEMS.register("ddr5_16gb",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DDR5_12GB = ITEMS.register("ddr5_12gb",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DDR5_8GB = ITEMS.register("ddr5_8gb",
            () -> new Item(new Item.Properties()));

    // ========== DDR4 RAM MODULES (Standard) ==========
    public static final RegistryObject<Item> DDR4_64GB = ITEMS.register("ddr4_64gb",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DDR4_48GB = ITEMS.register("ddr4_48gb",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DDR4_32GB = ITEMS.register("ddr4_32gb",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DDR4_24GB = ITEMS.register("ddr4_24gb",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DDR4_16GB = ITEMS.register("ddr4_16gb",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DDR4_12GB = ITEMS.register("ddr4_12gb",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DDR4_8GB = ITEMS.register("ddr4_8gb",
            () -> new Item(new Item.Properties()));

    // ========== DDR3 RAM MODULES (Legacy) ==========
    public static final RegistryObject<Item> DDR3_32GB = ITEMS.register("ddr3_32gb",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DDR3_16GB = ITEMS.register("ddr3_16gb",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DDR3_8GB = ITEMS.register("ddr3_8gb",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DDR3_4GB = ITEMS.register("ddr3_4gb",
            () -> new Item(new Item.Properties()));

    // ========== STORAGE DRIVES ==========
    public static final RegistryObject<Item> NVMe_2TB = ITEMS.register("nvme_2tb",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NVMe_1TB = ITEMS.register("nvme_1tb",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SSD_1TB = ITEMS.register("ssd_1tb",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HDD_4TB = ITEMS.register("hdd_4tb",
            () -> new Item(new Item.Properties()));

    // ========== POWER SUPPLIES ==========
    public static final RegistryObject<Item> PSU_1200W = ITEMS.register("psu_1200w",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PSU_850W = ITEMS.register("psu_850w",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PSU_650W = ITEMS.register("psu_650w",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PSU_500W = ITEMS.register("psu_500w",
            () -> new Item(new Item.Properties()));

    // ========== COOLING SOLUTIONS ==========
    public static final RegistryObject<Item> LIQUID_COOLER_360MM = ITEMS.register("liquid_cooler_360mm",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LIQUID_COOLER_280MM = ITEMS.register("liquid_cooler_280mm",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AIR_COOLER_TOWER = ITEMS.register("air_cooler_tower",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AIR_COOLER_DOWNDRAFT = ITEMS.register("air_cooler_downdraft",
            () -> new Item(new Item.Properties()));

    // ========== CASES ==========
    public static final RegistryObject<Item> CASE_FULL_TOWER = ITEMS.register("case_full_tower",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CASE_MID_TOWER = ITEMS.register("case_mid_tower",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CASE_MINI_ITX = ITEMS.register("case_mini_itx",
            () -> new Item(new Item.Properties()));

    // ========== OPERATING SYSTEMS ==========
    public static final RegistryObject<Item> WINDOWS_11_PRO = ITEMS.register("windows_11_pro",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WINDOWS_11_HOME = ITEMS.register("windows_11_home",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WINDOWS_10_PRO = ITEMS.register("windows_10_pro",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> UBUNTU_24_LTS = ITEMS.register("ubuntu_24_lts",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FEDORA_40 = ITEMS.register("fedora_40",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MACOS_SONOMA = ITEMS.register("macos_sonoma",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ARCH_LINUX = ITEMS.register("arch_linux",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DEBIAN_12 = ITEMS.register("debian_12",
            () -> new Item(new Item.Properties()));

    // ========== ADDITIONAL COMPONENTS ==========
    public static final RegistryObject<Item> WIFI_CARD = ITEMS.register("wifi_card",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ETHERNET_CARD = ITEMS.register("ethernet_card",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SOUND_CARD = ITEMS.register("sound_card",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CAPTURE_CARD = ITEMS.register("capture_card",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> USB_HUB = ITEMS.register("usb_hub",
            () -> new Item(new Item.Properties()));

    // ========== PERIPHERALS ==========
    public static final RegistryObject<Item> GAMING_KEYBOARD = ITEMS.register("gaming_keyboard",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GAMING_MOUSE = ITEMS.register("gaming_mouse",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GAMING_MONITOR_4K = ITEMS.register("gaming_monitor_4k",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GAMING_MONITOR_1440P = ITEMS.register("gaming_monitor_1440p",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MECHANICAL_KEYBOARD = ITEMS.register("mechanical_keyboard",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WIRELESS_MOUSE = ITEMS.register("wireless_mouse",
            () -> new Item(new Item.Properties()));

    // ========== ASSEMBLED COMPUTERS ==========
    public static final RegistryObject<Item> GAMING_PC_HIGH_END = ITEMS.register("gaming_pc_high_end",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GAMING_PC_MID_RANGE = ITEMS.register("gaming_pc_mid_range",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WORKSTATION_PC = ITEMS.register("workstation_pc",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BUDGET_PC = ITEMS.register("budget_pc",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STREAMING_PC = ITEMS.register("streaming_pc",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SERVER_PC = ITEMS.register("server_pc",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
