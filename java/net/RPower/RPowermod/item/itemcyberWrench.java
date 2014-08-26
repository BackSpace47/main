package net.RPower.RPowermod.item;

import RPower.api.power.MFHelper;
import RPower.api.power.cable.I_MFCable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class itemcyberWrench extends Item{

	@Override
	public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int metaD, float hitX, float hitY, float hitZ) {
		if(world.getBlock(x, y, z).hasTileEntity(metaD))
		{
			TileEntity targetEntity = world.getTileEntity(x, y, z);

			if(targetEntity instanceof I_MFCable)
			{
				System.out.println("it's an MF cable");
			}



		}
		return super.onItemUse(itemStack, player, world, x, y, z, metaD, hitX, hitY, hitZ);
	}

}
