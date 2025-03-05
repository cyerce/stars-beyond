package net.aepherastudios.screen;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.flag.FeatureElement;
import net.minecraft.world.flag.FeatureFlag;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.*;

public class SBMenuTypes<T extends AbstractContainerMenu> implements FeatureElement, net.minecraftforge.common.extensions.IForgeMenuType<T> {

    public static final MenuType<AdvancedCokingOvenMenu> ADVANCED_COKING_OVEN_MENU = register("advanced_coking_oven_menu", AdvancedCokingOvenMenu::new);


    private static <T extends AbstractContainerMenu> MenuType<T> register(String pKey, MenuType.MenuSupplier<T> pFactory) {
        return Registry.register(BuiltInRegistries.MENU, pKey, new MenuType<>(pFactory, FeatureFlags.VANILLA_SET));
    }

    private static <T extends AbstractContainerMenu> MenuType<T> register(String pKey, MenuType.MenuSupplier<T> pFactory, FeatureFlag... pRequiredFeatures) {
        return Registry.register(BuiltInRegistries.MENU, pKey, new MenuType<>(pFactory, FeatureFlags.REGISTRY.subset(pRequiredFeatures)));
    }

    @Override
    public FeatureFlagSet requiredFeatures() {
        return null;
    }

    @Override
    public T create(int windowId, Inventory playerInv, FriendlyByteBuf extraData) {
        return null;
    }

    public interface SBMenuSupplier<T extends AbstractContainerMenu> {
        T create(int pContainerId, Inventory pPlayerInventory);
    }
}