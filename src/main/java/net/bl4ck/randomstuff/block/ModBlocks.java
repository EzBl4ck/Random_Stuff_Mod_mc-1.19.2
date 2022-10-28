package net.bl4ck.randomstuff.block;

import net.bl4ck.randomstuff.RandomStuff;
import net.bl4ck.randomstuff.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, RandomStuff.MOD_ID);

    /*      Sample Block named PIPPO
    public static final RegistryObject<Block> PIPPO = registerBlock("blockid",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModTab.RANDOMSTUFF_TAB);


             blockstates/blockid.json:
             {
                "variants": {
                    "": { "model": "randomstuff:block/blockid" }
                }
             }

             model(block)/blockid.json:
             {
                "parent": "block/cube_all",
                "textures": {
                    "all": "randomstuff:block/blockid"
                }
             }

             model(item)/blockid.json:
             {
                "parent": "randomstuff:block/blockid"
             }

             lang:
             "block.randomstuff.blockid": "name"

    */





    private static <T extends Block> RegistryObject<T>
        registerBlock(String name, Supplier<T> block, CreativeModeTab tab){

        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item>
        registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){

        return ModItems.ITEMS.register(name,
                () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void registry(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
