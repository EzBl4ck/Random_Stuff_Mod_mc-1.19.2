package net.bl4ck.randomstuff.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {
    public static final CreativeModeTab RANDOMSTUFF_TAB = new CreativeModeTab("randomstufftab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.STONE_STICK.get());
        }
    };
}
