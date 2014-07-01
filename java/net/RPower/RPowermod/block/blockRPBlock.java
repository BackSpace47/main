package net.RPower.RPowermod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class blockRPBlock extends Block{

	public blockRPBlock(Material m) {
		super(m);
	}
	
	public void onUpdate(ItemStack itemstack, World world, Entity entity, int pint, boolean pboolean){
		if(itemstack.isItemEnchanted() == false){
			itemstack.addEnchantment(Enchantment.knockback, 20);
		}
	}

}
