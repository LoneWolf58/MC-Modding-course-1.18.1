package com.marshall.mccourse.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab COURSE_BLOCK_TAB = new CreativeModeTab("coursemodblocktab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.COBALT_INGOT.get());
        }
    };
        public static final CreativeModeTab COURSE_ITEM_TAB = new CreativeModeTab("coursemoditemtab") {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(ModItems.COBALT_NUGGET.get());
    }
  };
}


