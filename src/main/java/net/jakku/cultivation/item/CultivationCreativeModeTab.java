package net.jakku.cultivation.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CultivationCreativeModeTab {
    public static final CreativeModeTab CULT_TAB = new CreativeModeTab("cultivationtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(CultivationItems.MANUAL.get());

        }
    };
}