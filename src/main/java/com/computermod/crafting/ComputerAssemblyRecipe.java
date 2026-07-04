package com.computermod.crafting;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

import com.computermod.ComputerMod;

public class ComputerAssemblyRecipe implements Recipe<Inventory> {
    public static final RecipeType<ComputerAssemblyRecipe> RECIPE_TYPE = new RecipeType<ComputerAssemblyRecipe>() {
        @Override
        public String toString() {
            return ComputerMod.MOD_ID + ":computer_assembly";
        }
    };

    private final Identifier id;
    private final ItemStack output;
    private final int craftingTime;
    private final int energyCost;

    public ComputerAssemblyRecipe(Identifier id, ItemStack output, int craftingTime, int energyCost) {
        this.id = id;
        this.output = output;
        this.craftingTime = craftingTime;
        this.energyCost = energyCost;
    }

    @Override
    public boolean matches(Inventory inventory, World world) {
        return true;
    }

    @Override
    public ItemStack craft(Inventory inventory) {
        return output.copy();
    }

    @Override
    public boolean fits(int width, int height) {
        return true;
    }

    @Override
    public ItemStack getOutput() {
        return output;
    }

    @Override
    public Identifier getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return null;
    }

    @Override
    public RecipeType<?> getType() {
        return RECIPE_TYPE;
    }

    public int getCraftingTime() {
        return craftingTime;
    }

    public int getEnergyCost() {
        return energyCost;
    }
}
