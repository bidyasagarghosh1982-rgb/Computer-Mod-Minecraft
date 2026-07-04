package com.computermod.client.render.block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.RotationAxis;

import com.computermod.clock.DigitalClockBlockEntity;

@Environment(EnvType.CLIENT)
public class DigitalClockBlockEntityRenderer implements BlockEntityRenderer<DigitalClockBlockEntity> {
    @Override
    public void render(DigitalClockBlockEntity entity, float tickDelta, MatrixStack matrices,
                       VertexConsumerProvider vertexConsumers, int light, int overlay) {
        // This will be enhanced with custom rendering if needed
        // For now, the block model will handle the display
    }

    @Override
    public int getRenderDistance() {
        return 256;
    }
}
