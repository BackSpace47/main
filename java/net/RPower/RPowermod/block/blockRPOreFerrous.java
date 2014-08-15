package net.RPower.RPowermod.block;

import java.util.Random;

import net.RPower.RPowermod.core.RPCore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class blockRPOreFerrous extends Block {

	public blockRPOreFerrous(Material p_i45394_1_) {
		super(p_i45394_1_);
	}
	
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return this == RPCore.oreFerrous ? RPCore.chunkFerrous : Item.getItemFromBlock(this);
    }

}
