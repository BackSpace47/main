package net.RPower.RPowermod.item;

import java.util.List;

import net.RPower.RPowermod.core.RPCore;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemMagic extends Item {
	
	private final String[] subNames = {
			"Magick Compound", "Magick Dust", "Big Drop", "Bounce Drop", "Death Drop", "Fly Drop", "Life Drop", "Magick Drop", "Poison Drop", "Rock Drop", "Small Drop", "Super Drop"
	};
	
	public ItemMagic(){
		super();
		this.setCreativeTab(RPCore.RPCoreITab);
		this.setHasSubtypes(true);
		this.setUnlocalizedName("Magic");
	}

	public int getMetadata(int damage) {
		return damage;
	}
	
	public String getUnlocalizedName(ItemStack item){
		return getUnlocalizedName() + "." + subNames[item.getItemDamage()];
	}

}
