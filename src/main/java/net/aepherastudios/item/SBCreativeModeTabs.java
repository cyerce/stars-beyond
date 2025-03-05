package net.aepherastudios.item;

import net.aepherastudios.starsbeyond.StarsBeyond;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class SBCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StarsBeyond.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SB_RESOURCES = CREATIVE_MODE_TABS.register("sb_resources",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(SBItems.ALUMINUM_INGOT.get()))
                    .title(Component.translatable("creativetab.sb_resources"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(SBItems.ALUMINUM_INGOT.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
