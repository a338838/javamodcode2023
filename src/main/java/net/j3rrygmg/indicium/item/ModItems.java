package net.j3rrygmg.indicium.item;

import net.j3rrygmg.indicium.Indicium;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Indicium.MOD_ID);

    public static final RegistryObject<Item> AIR_CRYSTAL = ITEMS.register("air_crystal", () -> new Item(new Item.Properties().tab(ModCreativeModTab.INDICIUM_TAB)));

    public static final RegistryObject<Item> FIRE_CRYSTAL = ITEMS.register("fire_crystal", () -> new Item(new Item.Properties().tab(ModCreativeModTab.INDICIUM_TAB)));

    public static final RegistryObject<Item> WATER_CRYSTAL = ITEMS.register("water_crystal", () -> new Item(new Item.Properties().tab(ModCreativeModTab.INDICIUM_TAB)));

    public static final RegistryObject<Item> EARTH_CRYSTAL = ITEMS.register("earth_crystal", () -> new Item(new Item.Properties().tab(ModCreativeModTab.INDICIUM_TAB)));

    public static final RegistryObject<Item> ELECTRIC_CRYSTAL = ITEMS.register("electric_crystal", () -> new Item(new Item.Properties().tab(ModCreativeModTab.INDICIUM_TAB)));

    public static final RegistryObject<Item> CHAOS_CRYSTAL = ITEMS.register("chaos_crystal", () -> new Item(new Item.Properties().tab(ModCreativeModTab.INDICIUM_TAB)));

    public static final RegistryObject<Item> ORDER_CRYSTAL = ITEMS.register("order_crystal", () -> new Item(new Item.Properties().tab(ModCreativeModTab.INDICIUM_TAB)));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
