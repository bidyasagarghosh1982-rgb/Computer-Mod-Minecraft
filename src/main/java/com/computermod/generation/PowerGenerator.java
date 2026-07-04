package com.computermod.generation;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PowerGenerator {
    private final World world;
    private final BlockPos pos;
    private int generatedEnergy = 0;

    public PowerGenerator(World world, BlockPos pos) {
        this.world = world;
        this.pos = pos;
    }

    public int generatePower() {
        // Check for nearby sunlight
        if (world.isDay() && world.canSeeSky(pos)) {
            generatedEnergy += 10; // Solar power
        }

        // Check for nearby lava (geothermal)
        if (isNearLava()) {
            generatedEnergy += 15; // Geothermal power
        }

        // Check for nearby water (hydro)
        if (isNearWater()) {
            generatedEnergy += 8; // Hydro power
        }

        return Math.min(generatedEnergy, 100); // Cap at 100 energy per tick
    }

    private boolean isNearLava() {
        for (BlockPos blockPos : BlockPos.iterateOutwards(pos, 4, 4, 4)) {
            BlockState state = world.getBlockState(blockPos);
            if (state.getBlock() == Blocks.LAVA) {
                return true;
            }
        }
        return false;
    }

    private boolean isNearWater() {
        for (BlockPos blockPos : BlockPos.iterateOutwards(pos, 4, 4, 4)) {
            BlockState state = world.getBlockState(blockPos);
            if (state.getBlock() == Blocks.WATER) {
                return true;
            }
        }
        return false;
    }
}
