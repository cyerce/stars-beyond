package net.aepherastudios.block.custom.blockentity;

import net.aepherastudios.block.custom.blockentity.abstractblockentity.AbstractCokingOvenBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class BasicCokingOvenBlockEntity extends AbstractCokingOvenBlockEntity {
    public BasicCokingOvenBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(SBBlockEntities.BASIC_COKING_OVEN_BE.get(), pPos, pBlockState, RecipeType.);
    }

    @Override
    public Component getDisplayName() {
        return Component.literal("Basic Coking Oven");
    }

    @Override
    public @Nullable AbstractContainerMenu createMenu(int i, Inventory inventory, Player player) {
        return null;
    }
}
