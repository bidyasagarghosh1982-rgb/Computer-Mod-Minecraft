package com.computermod.block;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import com.computermod.ComputerMod;

public class ModBlocks {
    // GPU Processing Block
    public static final Block GPU_BLOCK = registerBlock("gpu_block",
            new Block(Block.Settings.copy(Blocks.IRON_BLOCK).strength(5.0f, 6.0f)));

    // CPU Processing Block
    public static final Block CPU_BLOCK = registerBlock("cpu_block",
            new Block(Block.Settings.copy(Blocks.IRON_BLOCK).strength(5.0f, 6.0f)));

    // RAM Storage Block
    public static final Block RAM_BLOCK = registerBlock("ram_block",
            new Block(Block.Settings.copy(Blocks.IRON_BLOCK).strength(3.0f, 4.0f)));

    // Motherboard Block
    public static final Block MOTHERBOARD_BLOCK = registerBlock("motherboard_block",
            new Block(Block.Settings.copy(Blocks.IRON_BLOCK).strength(4.0f, 5.0f)));

    // Power Supply Block
    public static final Block POWER_SUPPLY_BLOCK = registerBlock("power_supply_block",
            new Block(Block.Settings.copy(Blocks.IRON_BLOCK).strength(6.0f, 8.0f)));

    // Cooling System Block
    public static final Block COOLING_BLOCK = registerBlock("cooling_block",
            new Block(Block.Settings.copy(Blocks.IRON_BLOCK).strength(4.0f, 5.0f)));

    // Storage Block
    public static final Block STORAGE_BLOCK = registerBlock("storage_block",
            new Block(Block.Settings.copy(Blocks.IRON_BLOCK).strength(5.0f, 6.0f)));

    // Computer Assembly Station
    public static final Block ASSEMBLY_STATION = registerBlock("assembly_station",
            new Block(Block.Settings.copy(Blocks.IRON_BLOCK).strength(7.0f, 9.0f)));

    private static Block registerBlock(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(ComputerMod.MOD_ID, name), block);
    }

    public static void register() {
        ComputerMod.LOGGER.debug("Registering Computer Mod blocks");
    }
}
