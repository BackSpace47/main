package net.RPower.RPowermod.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemFoodrockCookie extends ItemFood {

	public ItemFoodrockCookie(int p_i45339_1_, float p_i45339_2_,
			boolean p_i45339_3_) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
	}
	
	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer player){
		player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 1200, 1));
		player.addPotionEffect(new PotionEffect(Potion.harm.id, 1, 0));
		player.addPotionEffect(new PotionEffect(Potion.resistance.id, 1200, 2));
	}
}
