package com.computermod.clock;

import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import com.computermod.ComputerMod;

public class ClockBlockEntities {
    public static final BlockEntityType<DigitalClockBlockEntity> DIGITAL_CLOCK_ENTITY = Registry.register(
            Registries.BLOCK_ENTITY_TYPE,
            new Identifier(ComputerMod.MOD_ID, "digital_clock_entity"),
            BlockEntityType.Builder.create(DigitalClockBlockEntity::new, ClockBlocks.DIGITAL_CLOCK_BLOCK).build()
    );

    public static void register() {
        ComputerMod.LOGGER.debug("Registering Clock Block Entities");
    }
}
