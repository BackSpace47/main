package net.RPower.RPowermod.gui;

import net.RPower.RPowermod.tileentity.TileEntityalloySmelter;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.tileentity.TileEntity;


public class GuialloySmelter extends GuiContainer{
	
	
	public TileEntityalloySmelter alloySmelter;

	public GuialloySmelter(InventoryPlayer inventoryPlayer, TileEntityalloySmelter entity) {
		super(ContaineralloySmelter(inventoryPlayer, entity));
		
		this.alloySmelter = entity;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
		// TODO Auto-generated method stub
		
	}

}
