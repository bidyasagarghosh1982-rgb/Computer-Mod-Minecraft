package com.computermod.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import com.computermod.ComputerMod;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ComputerMod.MOD_ID);

    // GPU Processing Block
    public static final RegistryObject<Block> GPU_BLOCK = BLOCKS.register("gpu_block",
            () -> new Block(Block.Properties.of(Material.METAL).strength(5.0f, 6.0f)));

    // CPU Processing Block
    public static final RegistryObject<Block> CPU_BLOCK = BLOCKS.register("cpu_block",
            () -> new Block(Block.Properties.of(Material.METAL).strength(5.0f, 6.0f)));

    // RAM Storage Block
    public static final RegistryObject<Block> RAM_BLOCK = BLOCKS.register("ram_block",
            () -> new Block(Block.Properties.of(Material.METAL).strength(3.0f, 4.0f)));

    // Motherboard Block
    public static final RegistryObject<Block> MOTHERBOARD_BLOCK = BLOCKS.register("motherboard_block",
            () -> new Block(Block.Properties.of(Material.METAL).strength(4.0f, 5.0f)));

    // Power Supply Block
    public static final RegistryObject<Block> POWER_SUPPLY_BLOCK = BLOCKS.register("power_supply_block",
            () -> new Block(Block.Properties.of(Material.METAL).strength(6.0f, 8.0f)));

    // Cooling System Block
    public static final RegistryObject<Block> COOLING_BLOCK = BLOCKS.register("cooling_block",
            () -> new Block(Block.Properties.of(Material.METAL).strength(4.0f, 5.0f)));

    // Storage Block
    public static final RegistryObject<Block> STORAGE_BLOCK = BLOCKS.register("storage_block",
            () -> new Block(Block.Properties.of(Material.METAL).strength(5.0f, 6.0f)));

    // Computer Assembly Station
    public static final RegistryObject<Block> ASSEMBLY_STATION = BLOCKS.register("assembly_station",
            () -> new Block(Block.Properties.of(Material.METAL).strength(7.0f, 9.0f)));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
