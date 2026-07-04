package com.computermod.clock;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import com.computermod.ComputerMod;

public class ClockModItems {
    public static void register() {
        ComputerMod.LOGGER.debug("Registering Clock Items");
        
        // Add digital clock to Tools creative tab
        ItemGroupEvents.modifyEntriesByTab(ItemGroups.TOOLS).register(contents -> {
            contents.add(ClockBlocks.DIGITAL_CLOCK_BLOCK);
        });
    }
}
