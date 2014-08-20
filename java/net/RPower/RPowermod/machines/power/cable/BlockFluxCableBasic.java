package net.RPower.RPowermod.machines.power.cable;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockFluxCableBasic extends Block{
	
	public BlockFluxCableBasic(Material p_i45394_1_) {
		super(p_i45394_1_);

	}
	
	@Override
	public TileEntity createTileEntity(World world, int metadata) {
		return (TileEntity) new TileEntityFluxCable((byte)32);
	}

}
