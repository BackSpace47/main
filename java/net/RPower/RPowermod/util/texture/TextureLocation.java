package net.RPower.RPowermod.util.texture;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class TextureLocation {

	public static void setBlockTexture(Block block, String name, String modId){
		block.setBlockName(name);
		block.setBlockTextureName(modId + ":" + name);
	}

	public static void setItemTexture(Item item, String name, String modId){
		item.setUnlocalizedName(name);
		item.setTextureName(modId + ":" + name);
	}
}
