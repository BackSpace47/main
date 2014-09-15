package net.RPower.RPowermod.core;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class RPFuelHandler implements IFuelHandler{

	public int getBurnTime(ItemStack fuel) {
		Item var1 = fuel.getItem();
		if(var1 == RPCore.anthracite){
			return 6400;
		}
		else{
			return 0;
		}
		
	}

}






































