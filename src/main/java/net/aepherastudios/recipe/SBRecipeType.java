package net.aepherastudios.recipe;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.*;

public interface SBRecipeType<T extends Recipe<?>> {
    RecipeType<CokingRecipe> COKING = register("coking");

    static <T extends Recipe<?>> RecipeType<T> register(final String pIdentifier) {
        return Registry.register(BuiltInRegistries.RECIPE_TYPE, new ResourceLocation(pIdentifier), new RecipeType<T>() {
            public String toString() {
                return pIdentifier;
            }
        });
    }

    public static <T extends Recipe<?>> SBRecipeType<T> simple(final ResourceLocation name) {
        final String toString = name.toString();
        return new SBRecipeType<T>() {
            @Override
            public String toString() {
                return toString;
            }
        };
    }
}
