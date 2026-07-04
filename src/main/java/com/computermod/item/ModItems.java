package com.computermod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import com.computermod.ComputerMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ComputerMod.MOD_ID);

    // Graphics Card / GPU
    public static final RegistryObject<Item> GPU = ITEMS.register("gpu",
            () -> new Item(new Item.Properties()));

    // CPU
    public static final RegistryObject<Item> CPU = ITEMS.register("cpu",
            () -> new Item(new Item.Properties()));

    // RAM
    public static final RegistryObject<Item> RAM = ITEMS.register("ram",
            () -> new Item(new Item.Properties()));

    // Motherboard
    public static final RegistryObject<Item> MOTHERBOARD = ITEMS.register("motherboard",
            () -> new Item(new Item.Properties()));

    // Power Supply
    public static final RegistryObject<Item> POWER_SUPPLY = ITEMS.register("power_supply",
            () -> new Item(new Item.Properties()));

    // Cooling System
    public static final RegistryObject<Item> COOLING_SYSTEM = ITEMS.register("cooling_system",
            () -> new Item(new Item.Properties()));

    // Storage Drive
    public static final RegistryObject<Item> STORAGE_DRIVE = ITEMS.register("storage_drive",
            () -> new Item(new Item.Properties()));

    // Computer Case
    public static final RegistryObject<Item> COMPUTER_CASE = ITEMS.register("computer_case",
            () -> new Item(new Item.Properties()));

    // Computer Assembly
    public static final RegistryObject<Item> ASSEMBLED_COMPUTER = ITEMS.register("assembled_computer",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
