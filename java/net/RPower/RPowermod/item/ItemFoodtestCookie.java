package net.RPower.RPowermod.item;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerUseItemEvent;

public class ItemFoodtestCookie extends ItemFood{
	
	public ItemFoodtestCookie(int i, int j, boolean b) {
		super(i, j, b);
		setPotionEffect(17, 5, 128, 1F);
	}

}

