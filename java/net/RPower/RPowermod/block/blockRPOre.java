package net.RPower.RPowermod.block;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.RPower.RPowermod.core.RPCore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class blockRPOre extends Block {

	public blockRPOre(Material m) {
		super(m);
		this.setHarvestLevel("pickaxe", 3);
	}
	
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return this == RPCore.oreJade ? RPCore.gemJade : Item.getItemFromBlock(this);
    }
	
	public int quantityDropped(Random r)
    {
        return this == RPCore.oreJade ? 2 + r.nextInt(5) : 1;
    }

	

}


