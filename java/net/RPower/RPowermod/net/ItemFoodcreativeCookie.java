package net.RPower.RPowermod.net;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.WorldSettings.GameType;

public class ItemFoodcreativeCookie extends ItemFood{

	public ItemFoodcreativeCookie(int i, int j, boolean b) {
		super(i, j, b);
	}
	
	public void onFoodEaten(ItemStack itemstack, World world, EntityPlayer player){
		player.setGameType(GameType.CREATIVE);
	}

}
