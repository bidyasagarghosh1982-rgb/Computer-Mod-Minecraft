package com.computermod.energy;

public class EnergyContainer implements EnergyHolder {
    private int storedEnergy;
    private final int maxEnergy;
    private final int transferRate;

    public EnergyContainer(int maxEnergy, int transferRate) {
        this.storedEnergy = 0;
        this.maxEnergy = maxEnergy;
        this.transferRate = transferRate;
    }

    @Override
    public int getStoredEnergy() {
        return storedEnergy;
    }

    @Override
    public void setStoredEnergy(int energy) {
        this.storedEnergy = Math.max(0, Math.min(energy, maxEnergy));
    }

    @Override
    public int getMaxEnergy() {
        return maxEnergy;
    }

    @Override
    public int addEnergy(int amount) {
        int canAdd = maxEnergy - storedEnergy;
        int toAdd = Math.min(amount, Math.min(canAdd, transferRate));
        storedEnergy += toAdd;
        return toAdd;
    }

    @Override
    public int removeEnergy(int amount) {
        int canRemove = Math.min(storedEnergy, transferRate);
        int toRemove = Math.min(amount, canRemove);
        storedEnergy -= toRemove;
        return toRemove;
    }

    @Override
    public boolean canAddEnergy() {
        return storedEnergy < maxEnergy;
    }

    @Override
    public boolean canRemoveEnergy() {
        return storedEnergy > 0;
    }

    public float getStoragePercentage() {
        return (float) storedEnergy / maxEnergy;
    }
}
