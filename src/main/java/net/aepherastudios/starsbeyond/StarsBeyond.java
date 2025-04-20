package net.aepherastudios.starsbeyond;

import com.mojang.logging.LogUtils;
import net.aepherastudios.block.SBBlocks;
import net.aepherastudios.block.custom.blockentity.SBBlockEntities;
import net.aepherastudios.item.SBCreativeModeTabs;
import net.aepherastudios.item.SBItems;
import net.aepherastudios.recipe.SBRecipes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(StarsBeyond.MOD_ID)
public class StarsBeyond {
    public static final String MOD_ID = "starsbeyond";
    private static final Logger LOGGER = LogUtils.getLogger();

    public StarsBeyond() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);

        SBItems.register(modEventBus);
        SBBlocks.register(modEventBus);

        SBCreativeModeTabs.register(modEventBus);

        SBBlockEntities.register(modEventBus);
        SBRecipes.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
