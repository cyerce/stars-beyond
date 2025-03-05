package net.aepherastudios.screen;

import net.aepherastudios.recipe.SBRecipeType;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.crafting.RecipeType;

public class AdvancedCokingOvenMenu extends AbstractFurnaceMenu {
    public AdvancedCokingOvenMenu(int pContainerId, Inventory pPlayerInventory) {
        super(SBMenuTypes.ADVANCED_COKING_OVEN_MENU, SBRecipeType.COKING, RecipeBookType.FURNACE, pContainerId, pPlayerInventory);
    }

    public AdvancedCokingOvenMenu(int pContainerId, Inventory pPlayerInventory, Container pAdvancedCokingOvenContainer, ContainerData pAdvancedCokingOvenData) {
        super(SBMenuTypes.ADVANCED_COKING_OVEN_MENU, SBRecipeType.COKING, RecipeBookType.FURNACE, pContainerId, pPlayerInventory, pAdvancedCokingOvenContainer, pAdvancedCokingOvenData);
    }
}
