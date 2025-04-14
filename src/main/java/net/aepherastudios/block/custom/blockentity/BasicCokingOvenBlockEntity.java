package net.aepherastudios.block.custom.blockentity;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BasicCokingOvenBlockEntity extends BlockEntity implements MenuProvider {
    public BasicCokingOvenBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(SBBlockEntities.BASIC_COKING_OVEN_BE.get(), pPos, pBlockState);
    }
    private final ItemStackHandler itemHandler = new ItemStackHandler(6){
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }

        @Override
        public boolean isItemValid(int slot, @NotNull ItemStack stack) {
            return switch(slot){

                default -> super.isItemValid(slot, stack);
            };
        }
    };

    public static final int ITEM_SLOT = 0;
    public static final int FUEL_IN_SLOT = 1;
    public static final int MAIN_OUT_SLOT = 2;
    public static final int SECONDARY_OUT_SLOT = 3;
    public static final int BUCKET_IN_SLOT = 4;
    public static final int BUCKET_OUT_SLOT = 5;
    public static final int FlUED_SLOT = 7;

    @Override
    public Component getDisplayName() {
        return Component.literal("Basic Coking Oven");
    }

    @Override
    public @Nullable AbstractContainerMenu createMenu(int i, Inventory inventory, Player player) {
        return null;
    }
}
