package net.aepherastudios.recipe;

import net.aepherastudios.starsbeyond.StarsBeyond;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SBRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, StarsBeyond.MOD_ID);

    public static final RegistryObject<RecipeSerializer<CokingOvenRecipe>>  COKING_OVEN_SERIALIZER =
            SERIALIZERS.register("coking_oven", ()-> CokingOvenRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
