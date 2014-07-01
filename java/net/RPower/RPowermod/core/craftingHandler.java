package net.RPower.RPowermod.core;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public class craftingHandler implements ICrafting{
	public void onCrafting(EntityPlayer player, ItemStack item, IInventory inv) 
	{
	  	for(int i=0; i < inv.getSizeInventory(); i++)
		{        	
	    	if(inv.getStackInSlot(i) != null)
	    	{
	    		ItemStack j = inv.getStackInSlot(i);
	    	//	if(j.getItem() != null && j.getItem() == RPCore.tugstenCarbideHammer)
	    		{
	    		//	ItemStack k = new ItemStack(RPCore.tugstenCarbideHammer, 2, (j.getItemDamage() + 1));
	    	//		inv.setInventorySlotContents(i, k);
	    		}
	    	}  
		}
	}

	@Override
	public void sendContainerAndContentsToPlayer(Container var1, List var2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendSlotContents(Container var1, int var2, ItemStack var3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendProgressBarUpdate(Container var1, int var2, int var3) {
		// TODO Auto-generated method stub
		
	}

}
