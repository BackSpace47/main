package net.RPower.RPowermod.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemFoodghostCookie extends ItemFood {

	public ItemFoodghostCookie(int p_i45339_1_, float p_i45339_2_,
			boolean p_i45339_3_) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
	}
	
	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer player){
		player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 1200, 0));
		
	}
}
