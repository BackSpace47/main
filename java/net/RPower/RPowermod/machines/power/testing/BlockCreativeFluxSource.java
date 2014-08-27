package net.RPower.RPowermod.machines.power.testing;

import RPower.api.power.block.I_MFSource;
import RPower.api.power.block.cable.I_MFCable;
import net.RPower.RPowermod.machines.power.cable.TileEntityFluxCable;
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
		return new TileEntityCreativeFluxSource();
	}
	
	@Override
	public void onBlockAdded(World world, int x, int y, int z) {
		((TileEntityCreativeFluxSource)world.getTileEntity(x, y, z)).checkConnections();
		super.onBlockAdded(world, x, y, z);
	}
	
	@Override
	public void breakBlock(World world, int x, int y, int z, Block block, int metaD) {
		((I_MFSource) world.getTileEntity(x, y, z)).breakAllConnections();
		super.breakBlock(world, x, y, z, block, metaD);
	}
}
