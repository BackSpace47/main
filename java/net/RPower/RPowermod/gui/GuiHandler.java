package net.RPower.RPowermod.gui;

import net.RPower.RPowermod.container.ContaineralloySmelter;
import net.RPower.RPowermod.core.RPCore;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.RPower.RPowermod.tileentity.TileEntityalloySmelter;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
TileEntity entity = world.getTileEntity(x, y, z);
		
		
		if(entity != null) {
			switch(ID){
			case RPCore.guiIDalloySmelter:
				if(entity instanceof TileEntityalloySmelter) {
					return new ContaineralloySmelter(player.inventory, (TileEntityalloySmelter) entity);
				}
				return null;
			}
		}
		
		return null;
	}
	

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
		
		if(entity != null) {
			switch(ID){
			case RPCore.guiIDalloySmelter:
				if(entity instanceof TileEntityalloySmelter) {
					return new GuialloySmelter(player.inventory, (TileEntityalloySmelter) entity);
				}
				return null;
			}
		}
		
		return null;
	}

}
