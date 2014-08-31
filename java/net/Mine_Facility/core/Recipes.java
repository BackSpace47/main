package net.Mine_Facility.core;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by magnus on 31.08.2014.
 */
public class Recipes {

    public static void registerBlock(Block block, String name){
        GameRegistry.registerBlock(block, name);
    }

    public static void registerItem(Item item, String name){
        GameRegistry.registerItem(item, name);
    }

    public static void registerSmeltingBlockWUM(Block inputItem, Block result, float exp){
        GameRegistry.addSmelting(inputItem, new ItemStack(result), exp);
    }

    public static void registerSmeltingItemWUM(Item inputItem, Item result, float exp){
        GameRegistry.addSmelting(inputItem, new ItemStack(result), exp);
    }

    public static void registerSmeltingBlockToItemWUM(Block inputItem, Item result, float exp){
        GameRegistry.addSmelting(inputItem, new ItemStack(result), exp);
    }

    public static void registerSmeltingItemToBlockWUM(Item inputItem, Block result, float exp){
        GameRegistry.addSmelting(inputItem, new ItemStack(result), exp);
    }

}
