package net.RPower.RPowermod.proxy;

import net.RPower.RPowermod.core.RPCore;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class CommonProxy implements IGuiHandler {

    public void registerKeyBindings () {}

    @Override
    public Object getServerGuiElement ( int ID, EntityPlayer player, World world, int x, int y, int z ) {
        return null;
    }

    @Override
    public Object getClientGuiElement ( int ID, EntityPlayer player, World world, int x, int y, int z ) {
    	return null;
    }

}
