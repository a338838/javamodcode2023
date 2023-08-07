package net.j3rrygmg.indicium.block;

import net.j3rrygmg.indicium.Indicium;
import net.j3rrygmg.indicium.item.ModCreativeModTab;
import net.j3rrygmg.indicium.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Properties;
import java.util.function.Supplier;



public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Indicium.MOD_ID);

    //ELEMENTAL CRYSTALS =========================================================================================
    public static final RegistryObject<Block> AIR_CRYSTAL_BLOCK = registerBlock("air_crystal_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(3f, 10f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)), ModCreativeModTab.INDICIUM_TAB);
    public static final RegistryObject<Block> FIRE_CRYSTAL_BLOCK = registerBlock("fire_crystal_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(3f, 10f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)), ModCreativeModTab.INDICIUM_TAB);
    public static final RegistryObject<Block> WATER_CRYSTAL_BLOCK = registerBlock("water_crystal_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(3f, 10f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)), ModCreativeModTab.INDICIUM_TAB);
    public static final RegistryObject<Block> EARTH_CRYSTAL_BLOCK = registerBlock("earth_crystal_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(3f, 10f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)), ModCreativeModTab.INDICIUM_TAB);
    public static final RegistryObject<Block> ELECTRIC_CRYSTAL_BLOCK = registerBlock("electric_crystal_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(3f, 10f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)), ModCreativeModTab.INDICIUM_TAB);
    public static final RegistryObject<Block> ORDER_CRYSTAL_BLOCK = registerBlock("order_crystal_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(3f, 10f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)), ModCreativeModTab.INDICIUM_TAB);
    public static final RegistryObject<Block> CHAOS_CRYSTAL_BLOCK = registerBlock("chaos_crystal_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(3f, 10f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)), ModCreativeModTab.INDICIUM_TAB);


    //============================ END OF BLOCKS ===================================================================

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
