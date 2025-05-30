package net.aepherastudios.block;

import net.aepherastudios.block.custom.AdvancedCokingOvenBlock;
import net.aepherastudios.block.custom.BasicCokingOvenBlock;
import net.aepherastudios.item.SBItems;
import net.aepherastudios.starsbeyond.StarsBeyond;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class SBBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, StarsBeyond.MOD_ID);

    public static final RegistryObject<Block> ADVANCED_COKING_OVEN = registerBlock("advanced_coking_oven",
            () -> new AdvancedCokingOvenBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> BASIC_COKING_OVEN = registerBlock("basic_coking_oven",
            () -> new BasicCokingOvenBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return SBItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
