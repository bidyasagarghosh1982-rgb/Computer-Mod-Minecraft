package com.computermod.clock;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import com.computermod.ComputerMod;

public class ClockBlocks {
    public static final Block DIGITAL_CLOCK_BLOCK = registerBlock("digital_clock_block", new DigitalClockBlock());

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(ComputerMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(ComputerMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void register() {
        ComputerMod.LOGGER.debug("Registering Clock Blocks");
    }
}
