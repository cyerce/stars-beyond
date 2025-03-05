package net.aepherastudios.block.custom.blockentity;

import net.aepherastudios.screen.AdvancedCokingOvenMenu;
import net.aepherastudios.screen.AdvancedCokingOvenScreen;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.FurnaceMenu;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.FurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class AdvancedCokingOvenBlockEntity extends AbstractFurnaceBlockEntity {
    public AdvancedCokingOvenBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(BlockEntityType.FURNACE, pPos, pBlockState, RecipeType.SMELTING);
    }

    protected Component getDefaultName() {
        return Component.translatable("container.coking_oven");
    }

    protected AbstractContainerMenu createMenu(int pId, Inventory pPlayer) {
        return new AdvancedCokingOvenMenu(pId, pPlayer, this, this.dataAccess);
    }
}