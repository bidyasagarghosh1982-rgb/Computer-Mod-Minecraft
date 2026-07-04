package com.computermod.multiblock;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import java.util.HashMap;
import java.util.Map;

public class MultiblockComputer {
    private final BlockPos controllerPos;
    private final World world;
    private final Map<BlockPos, String> componentPositions;
    private boolean isValid;
    private String computerType; // GAMING, WORKSTATION, SERVER, etc.

    public MultiblockComputer(BlockPos controllerPos, World world) {
        this.controllerPos = controllerPos;
        this.world = world;
        this.componentPositions = new HashMap<>();
        this.isValid = false;
        this.computerType = "UNKNOWN";
    }

    public void addComponent(BlockPos pos, String componentType) {
        componentPositions.put(pos, componentType);
    }

    public boolean validate() {
        // Validate that all required components are present
        boolean hasGPU = componentPositions.values().stream().anyMatch(c -> c.contains("GPU"));
        boolean hasCPU = componentPositions.values().stream().anyMatch(c -> c.contains("CPU"));
        boolean hasRAM = componentPositions.values().stream().anyMatch(c -> c.contains("RAM"));
        boolean hasMotherboard = componentPositions.values().stream().anyMatch(c -> c.contains("MOTHERBOARD"));
        boolean hasPSU = componentPositions.values().stream().anyMatch(c -> c.contains("PSU"));
        boolean hasCooling = componentPositions.values().stream().anyMatch(c -> c.contains("COOLING"));
        boolean hasStorage = componentPositions.values().stream().anyMatch(c -> c.contains("STORAGE"));

        isValid = hasGPU && hasCPU && hasRAM && hasMotherboard && hasPSU && hasCooling && hasStorage;
        return isValid;
    }

    public BlockPos getControllerPos() {
        return controllerPos;
    }

    public boolean isValid() {
        return isValid;
    }

    public String getComputerType() {
        return computerType;
    }

    public void setComputerType(String type) {
        this.computerType = type;
    }

    public int getComponentCount() {
        return componentPositions.size();
    }
}
