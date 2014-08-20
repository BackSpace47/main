package net.RPower.RPowermod.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockContainerFast extends BlockContainer{

	public BlockContainerFast() {
		this(Material.rock);
	}

	public BlockContainerFast(Material material){
		super(material);

	}

	@Override
	public TileEntity createNewTileEntity(World world, int metadata) {
		return null;
	}
}
