package com.computermod.energy;

public interface EnergyHolder {
    int getStoredEnergy();
    void setStoredEnergy(int energy);
    int getMaxEnergy();
    int addEnergy(int amount);
    int removeEnergy(int amount);
    boolean canAddEnergy();
    boolean canRemoveEnergy();
}
