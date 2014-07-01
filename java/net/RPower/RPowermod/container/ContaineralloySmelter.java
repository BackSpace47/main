package net.RPower.RPowermod.container;

import net.RPower.RPowermod.tileentity.TileEntityalloySmelter;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class ContaineralloySmelter extends Container{

	
	
	private TileEntityalloySmelter alloySmelter;
	
	
	public ContaineralloySmelter(InventoryPlayer inventory, TileEntityalloySmelter tileentity) {
		this.alloySmelter = tileentity;
		
	}
	
	
	
	@Override
	public boolean canInteractWith(EntityPlayer var1) {
		// TODO Auto-generated method stub
		return false;
	}

}
