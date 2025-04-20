package net.aepherastudios.block;

import net.aepherastudios.block.custom.AdvancedCokingOvenBlock;
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

    public static final RegistryObject<Block> BLUEPRINT_CRAFTER = registerBlock("blueprint_crafter",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> STEEL_BLAST_FURNACE = registerBlock("steel_blast_furnace",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> COKING_OVEN = registerBlock("coking_oven",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> ADVANCED_STEEL_BLAST_FURNACE_CONTROLLER = registerBlock("advanced_steel_blast_furnace_controller",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> ADVANCED_COKING_OVEN_CONTROLLER = registerBlock("advanced_coking_oven_controller",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> ELECTRIC_COKING_OVEN = registerBlock("electric_coking_oven",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> ELECTRIC_BLAST_FURNACE = registerBlock("electric_blast_furnace",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> ELECTRIC_PRESS = registerBlock("electric_press",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> ELECTRIC_MIXER = registerBlock("electric_mixer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> ELECTRIC_CRUSHER = registerBlock("electric_crusher",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> ELECTRIC_MILLER = registerBlock("electric_miller",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> ELECTRIC_CRAFTER = registerBlock("electric_crafter",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> ADVANCED_ELECTRIC_COKING_OVEN_CONTROLLER = registerBlock("advanced_electric_coking_oven_controller",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> ADVANCED_ELECTRIC_BLAST_FURNACE_CONTROLLER = registerBlock("advanced_electric_blast_furnace_controller",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> ADVANCED_ELECTRIC_PRESS_CONTROLLER = registerBlock("advanced_electric_press_controller",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> ADVANCED_ELECTRIC_MIXER_CONTROLLER = registerBlock("advanced_electric_mixer_controller",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> ADVANCED_ELECTRIC_CRUSHER_CONTROLLER = registerBlock("advanced_electric_crusher_controller",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> ADVANCED_ELECTRIC_MILLER_CONTROLLER = registerBlock("advanced_electric_miller_controller",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> ADVANCED_ELECTRIC_CRAFTER_CONTROLLER = registerBlock("advanced_electric_crafter_controller",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> RESEARCH_STATION = registerBlock("research_station",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CIRCUIT_BUILDER = registerBlock("circuit_builder",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> REFACTORY_CLAY_BLOCK = registerBlock("refactory_clay_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> REFACTORY_BRICKS = registerBlock("refactory_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> CONVENTIONAL_ICBM = registerBlock("conventional_icbm",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONVENTIONAL_MRBM = registerBlock("conventional_mrbm",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONVENTIONAL_SRBM = registerBlock("conventional_srbm",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONVENTIONAL_MIRV = registerBlock("conventional_mirv",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONVENTIONAL_TBM = registerBlock("conventional_tbm",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> NUCLEAR_ICBM = registerBlock("nuclear_icbm",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> NUCLEAR_MRBM = registerBlock("nuclear_mrbm",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> NUCLEAR_SRBM = registerBlock("nuclear_srbm",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> NUCLEAR_MIRV = registerBlock("nuclear_mirv",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> NUCLEAR_TBM = registerBlock("nuclear_tbm",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> THERMONUCLEAR_ICBM = registerBlock("thermonuclear_icbm",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> THERMONUCLEAR_MRBM = registerBlock("thermonuclear_mrbm",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> THERMONUCLEAR_SRBM = registerBlock("thermonuclear_srbm",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> THERMONUCLEAR_MIRV = registerBlock("thermonuclear_mirv",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> THERMONUCLEAR_TBM = registerBlock("thermonuclear_tbm",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> INCENDIARY_MIRV = registerBlock("incendiary_mirv",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> INCENDIARY_TBM = registerBlock("incendiary_tbm",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHEMICAL_MIRV = registerBlock("chemical_mirv",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHEMICAL_TBM = registerBlock("chemical_tbm",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> BRONZE_PIPE = registerBlock("bronze_pipe",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> ITEM_PIPE = registerBlock("item_pipe",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> ALNICO_BLOCK = registerBlock("alnico_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> ALUMINUM_BLOCK = registerBlock("aluminum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> AMERICIUM_BLOCK = registerBlock("americium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> BERYLLIUM_BLOCK = registerBlock("beryllium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> BARIUM_BLOCK = registerBlock("barium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> BISMUTH_BLOCK = registerBlock("bismuth_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CADMIUM_BLOCK = registerBlock("cadmium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CAESIUM_BLOCK = registerBlock("caesium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CALCIUM_BLOCK = registerBlock("calcium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHROMIUM_BLOCK = registerBlock("chromium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CERIUM_BLOCK = registerBlock("cerium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBALT_BLOCK = registerBlock("cobalt_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONSTANTAN_BLOCK = registerBlock("constantan_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CUPRONICKEL_BLOCK = registerBlock("cupronickel_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> DYSPROSIUM_BLOCK = registerBlock("dysprosium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> ELECTRUM_BLOCK = registerBlock("electrum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> EUROPIUM_BLOCK = registerBlock("europium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> INVAR_BLOCK = registerBlock("invar_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> IRIDIUM_BLOCK = registerBlock("iridium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> LEAD_BLOCK = registerBlock("lead_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> LITHIUM_BLOCK = registerBlock("lithium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> LITHIUM_6_BLOCK = registerBlock("lithium_6_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> LITHIUM_7_BLOCK = registerBlock("lithium_7_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> MAGNESIUM_BLOCK = registerBlock("magnesium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOLYBDENUM_BLOCK = registerBlock("molybdenum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> NEPTUNIUM_BLOCK = registerBlock("neptunium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> NEODYMIUM_BLOCK = registerBlock("neodymium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> NICKEL_BLOCK = registerBlock("nickel_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> NIOBIUM_BLOCK = registerBlock("niobium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> OSMIUM_BLOCK = registerBlock("osmium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> PALLADIUM_BLOCK = registerBlock("palladium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> PLATINUM_BLOCK = registerBlock("platinum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> PLUTONIUM_238_BLOCK = registerBlock("plutonium_238_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> PLUTONIUM_239_BLOCK = registerBlock("plutonium_239_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> POTASSIUM_BLOCK = registerBlock("potassium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> ROSE_GOLD_BLOCK = registerBlock("rose_gold_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> RUBIDIUM_BLOCK = registerBlock("rubidium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> STABALLOY_BLOCK = registerBlock("staballoy_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> STAINLESS_STEEL_BLOCK = registerBlock("stainless_steel_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("steel_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> TANTALUM_BLOCK = registerBlock("tantalum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> THALLIUM_BLOCK = registerBlock("thallium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> THORIUM_BLOCK = registerBlock("thorium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> TITANIUM_BLOCK = registerBlock("titanium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> TUNGSTEN_BLOCK = registerBlock("tungsten_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> URANIUM_BLOCK = registerBlock("uranium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> URANIUM_235_BLOCK = registerBlock("uranium_235_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> URANIUM_238_BLOCK = registerBlock("uranium_238_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> URANIUM_233_BLOCK = registerBlock("uranium_233_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> URANIUM_239_BLOCK = registerBlock("uranium_239_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> FUEL_GRADE_URANIUM = registerBlock("fuel_grade_uranium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> WEAPONS_GRADE_URANIUM = registerBlock("weapons_grade_uranium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> VANADIUM_BLOCK = registerBlock("vanadium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> ZINC_BLOCK = registerBlock("zinc_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));


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
