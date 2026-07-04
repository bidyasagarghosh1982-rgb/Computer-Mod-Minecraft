package com.computermod.client.gui;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;

public class PowerGeneratorGui extends Screen {
    private int energy;
    private int maxEnergy;

    public PowerGeneratorGui(Text title, int energy, int maxEnergy) {
        super(title);
        this.energy = energy;
        this.maxEnergy = maxEnergy;
    }

    @Override
    protected void init() {
        super.init();
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        this.renderBackground(matrices);
        // Draw energy bar
        float energyPercentage = (float) energy / maxEnergy;
        drawEnergyBar(matrices, energyPercentage);
        super.render(matrices, mouseX, mouseY, delta);
    }

    private void drawEnergyBar(MatrixStack matrices, float percentage) {
        // Draw energy bar visualization
    }

    @Override
    public boolean shouldCloseOnEsc() {
        return true;
    }
}
