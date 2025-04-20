package net.aepherastudios.block.custom.blockentity;

import net.aepherastudios.block.SBBlocks;
import net.aepherastudios.starsbeyond.StarsBeyond;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SBBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, StarsBeyond.MOD_ID);


    public static final RegistryObject<BlockEntityType<BasicCokingOvenBlockEntity>> BASIC_COKING_OVEN_BE =
            BLOCK_ENTITIES.register("basic_coking_oven_block_entity", () ->
                    BlockEntityType.Builder.of(BasicCokingOvenBlockEntity::new,
                            SBBlocks.BASIC_COKING_OVEN.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
