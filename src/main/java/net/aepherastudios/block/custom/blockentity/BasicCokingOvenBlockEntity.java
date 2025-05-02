package net.aepherastudios.block.custom.blockentity;

import net.aepherastudios.block.custom.blockentity.abstractblockentity.AbstractCokingOvenBlockEntity;
import net.aepherastudios.recipe.CokingOvenRecipe;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class BasicCokingOvenBlockEntity extends AbstractCokingOvenBlockEntity {
    public BasicCokingOvenBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(SBBlockEntities.BASIC_COKING_OVEN_BE.get(), pPos, pBlockState, CokingOvenRecipe.Type.INSTANCE);
    }

    @Override
    public @NotNull Component getDisplayName() {
        return Component.literal("Basic Coking Oven");
    }
}
