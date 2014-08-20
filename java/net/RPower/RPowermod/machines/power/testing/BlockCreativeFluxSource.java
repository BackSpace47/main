package net.RPower.RPowermod.machines.power.testing;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockCreativeFluxSource extends Block {

	public BlockCreativeFluxSource(Material p_i45394_1_) {
		super(Material.cloth);
	}
	
	@Override
	public boolean hasTileEntity(int metadata) {
		return true;
	}
	
	@Override
	public TileEntity createTileEntity(World world, int metadata) {
		// TODO Auto-generated method stub
		return new TileEntityCreativeFluxSource();
	}

}
