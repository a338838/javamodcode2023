package net.j3rrygmg.indicium.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {
    public static final CreativeModeTab INDICIUM_TAB = new CreativeModeTab("indiciummodtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.AIR_CRYSTAL.get());
        }
    };
}
