package net.RPower.RPowermod.block;

import net.RPower.RPowermod.reference.Names;
import net.RPower.RPowermod.reference.Reference;
import net.RPower.RPowermod.util.texture.TextureLocation;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class enderCakeblock extends BlockFast {

	public static final String name = Names.Blocks.ENDER_CAKE_TOP_BLOCK;

	public enderCakeblock(){
		TextureLocation.setBlockTexture(this,name,Reference.MOD_ID);
	}

	@SideOnly(Side.CLIENT)
	private IIcon topIcon;

	@SideOnly(Side.CLIENT)
	private IIcon sideIcon;

	@SideOnly(Side.CLIENT)
	private IIcon bottomIcon;

	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int par2){
		// 0 = bottom, 1 = top, 2 = north, 3 = south, 4 = east, 5 = west (i think).
	   switch(side){
	   		case 0:
	   			return bottomIcon;
	   		case 1:
	   			return topIcon;
	   		case 2:
	   			return sideIcon;
	   		case 3:
	   			return sideIcon;
	   		case 4:
	   			return sideIcon;
	   		case 5:
	   			return sideIcon;
	   }

	   return sideIcon;
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		topIcon = iconRegister.registerIcon(Reference.MOD_ID + ":" + Names.Blocks.ENDER_CAKE_TOP_BLOCK_TOP);
		sideIcon = iconRegister.registerIcon(Reference.MOD_ID + ":" + Names.Blocks.ENDER_CAKE_TOP_BLOCK_SIDE);
		bottomIcon = iconRegister.registerIcon(Reference.MOD_ID + ":" + Names.Blocks.ENDER_CAKE_TOP_BLOCK_BOTTOM);
	}

}
