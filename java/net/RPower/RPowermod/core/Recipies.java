package net.RPower.RPowermod.core;

import net.RPower.RPowermod.fluid.fluidRPdestabilizedOre;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipies {

	public static float pixel = 1F/16F;

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

	public static void registerBlock(fluidRPdestabilizedOre destabilizedOre,
			String name) {
		// TODO Auto-generated method stub

	}

}
