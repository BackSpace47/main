package net.RPower.RPowermod.util;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntitySpawner {

	public static EntityItem spawnEntityItemInWorld(World world, double x, double y, double z, ItemStack itemToSpawn){
		EntityItem entity = new EntityItem(world, x, y, z, itemToSpawn);
		world.spawnEntityInWorld(entity);

		return entity;
	}
}
