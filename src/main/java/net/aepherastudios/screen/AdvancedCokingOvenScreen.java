package net.aepherastudios.screen;

import net.minecraft.client.gui.screens.inventory.AbstractFurnaceScreen;
import net.minecraft.client.gui.screens.inventory.FurnaceScreen;
import net.minecraft.client.gui.screens.recipebook.SmeltingRecipeBookComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.FurnaceMenu;

public class AdvancedCokingOvenScreen extends AbstractFurnaceScreen<AdvancedCokingOvenMenu> {
    private static final ResourceLocation TEXTURE = new ResourceLocation("textures/gui/container/advanced_coking_oven.png");

    public AdvancedCokingOvenScreen(AdvancedCokingOvenMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, new CokingRecipeBookComponent(), pPlayerInventory, pTitle, TEXTURE);
    }
}
