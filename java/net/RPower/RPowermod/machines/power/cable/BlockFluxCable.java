package net.RPower.RPowermod.machines.power.cable;

import RPower.api.power.E_MFPacketType;
import RPower.api.power.MFHelper;
import RPower.api.power.MFPacket;
import RPower.api.power.cable.I_MFCable;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockFluxCable extends BlockContainer{

	public BlockFluxCable(Material p_i45394_1_) {
		super(p_i45394_1_);

	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int metaD,  float hitX, float hitY, float hitZ)
	{
		MFPacket temp = new MFPacket(E_MFPacketType.REQUEST);
		((TileEntityFluxCable)world.getTileEntity(x, y, z)).takePacket(temp);
		
		System.err.println("This pipe has "+((TileEntityFluxCable)world.getTileEntity(x, y, z)).getConnections().size()+" connections.");
		//System.out.println(((TileEntityFluxCable)world.getTileEntity(x, y, z)).toJSON());
		return false;
	}
	
	@Override
	public void onBlockAdded(World world, int x, int y, int z) {
		((TileEntityFluxCable)world.getTileEntity(x, y, z)).checkConnections();
		super.onBlockAdded(world, x, y, z);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int metadata) {
		TileEntity cable = new TileEntityFluxCable(32);
		return cable;
	}

	@Override
	public boolean isAir(IBlockAccess world, int x, int y, int z) {
		return false;
	}
	
	@Override
	public void breakBlock(World world, int x, int y, int z, Block block, int metaD) {
		((I_MFCable) world.getTileEntity(x, y, z)).breakAllConnections();
		super.breakBlock(world, x, y, z, block, metaD);
	}
	

	@Override
	protected boolean canSilkHarvest() {
		return false;
	};

	@Override
	public boolean canSilkHarvest(World world, EntityPlayer player, int x, int y, int z, int metadata) {
		return false;
	};

	@Override
	public boolean canBeReplacedByLeaves(IBlockAccess world, int x, int y, int z) {
		return false;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(IBlockAccess blockAccess, int x, int y, int z, int side) {
		return false;
	};

	@SideOnly(Side.CLIENT)
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	@Override
	public int getRenderType() {
		return -1;
	}



}
