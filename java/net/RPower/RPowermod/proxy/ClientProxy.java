package net.RPower.RPowermod.proxy;

import net.RPower.RPowermod.machines.power.cable.TileEntityFluxCable;
import net.RPower.RPowermod.renderers.block.TileEntityFluxCableRenderer;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ClientProxy extends CommonProxy{
	
	public void registerProxies() {
		 
	}
	
	
	@Override
	public void registerRenderers(){
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFluxCable.class, new TileEntityFluxCableRenderer());
	}

}
