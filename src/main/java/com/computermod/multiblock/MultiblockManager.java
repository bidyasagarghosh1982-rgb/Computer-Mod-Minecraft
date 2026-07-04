package com.computermod.multiblock;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import java.util.HashMap;
import java.util.Map;

public class MultiblockManager {
    private static final Map<BlockPos, MultiblockComputer> computers = new HashMap<>();

    public static void registerComputer(BlockPos pos, MultiblockComputer computer) {
        computers.put(pos, computer);
    }

    public static void unregisterComputer(BlockPos pos) {
        computers.remove(pos);
    }

    public static MultiblockComputer getComputer(BlockPos pos) {
        return computers.get(pos);
    }

    public static boolean isValidComputer(BlockPos pos) {
        MultiblockComputer computer = computers.get(pos);
        return computer != null && computer.isValid();
    }

    public static int getComputerCount() {
        return computers.size();
    }
}
