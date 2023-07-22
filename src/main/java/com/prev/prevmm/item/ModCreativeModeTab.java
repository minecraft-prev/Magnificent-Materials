package com.prev.prevmm.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab PREVMM_TAB_1 = new CreativeModeTab("prevmm_1") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MITHRIL_INGOT.get());
        }
    };
    public static final CreativeModeTab PREVMM_TAB_2 = new CreativeModeTab("prevmm_2") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MITHRIL_INGOT.get());
        }
    };
}

//§6Magnificent Materials 1