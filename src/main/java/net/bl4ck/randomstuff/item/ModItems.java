package net.bl4ck.randomstuff.item;

import net.bl4ck.randomstuff.RandomStuff;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RandomStuff.MOD_ID);

    public static final RegistryObject<Item> STONE_STICK = ITEMS.register("stone_stick",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.RANDOMSTUFF_TAB)));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
