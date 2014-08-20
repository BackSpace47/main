package net.RPower.RPowermod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockFast extends Block{

	public BlockFast() {
		this(Material.rock);
	}

	public BlockFast(Material material){
		super(material);
			this.setHardness(2.0F);
	}

}
