package net.RPower.RPowermod.machines.power.cable;

import RPower.api.power.E_MFPacketType;
import RPower.api.power.MFPacket;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.RPower.RPowermod.machines.power.MFHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockFluxCableBasic extends BlockContainer{

	public BlockFluxCableBasic(Material p_i45394_1_) {
		super(p_i45394_1_);

	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int metaD,  float hitX, float hitY, float hitZ)
	{
		MFPacket temp = new MFPacket(E_MFPacketType.REQUEST);
		((TileEntityFluxCable)world.getTileEntity(x, y, z)).takePacket(temp);

		return false;
	}

	@Override
	public void onNeighborBlockChange(World world, int x,int y, int z, Block block) {
		if((world.getBlock(x, y, z).hasTileEntity(0) && MFHelper.checkConnectable(world.getTileEntity(x, y, z))))
		{
			((TileEntityFluxCable)world.getTileEntity(x, y, z)).checkConnections();
		}
	}

	@Override
	public int onBlockPlaced(World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ, int metaD)
	{
		if((world.getBlock(x, y, z).hasTileEntity(0) && MFHelper.checkConnectable(world.getTileEntity(x, y, z))))
			((TileEntityFluxCable)world.getTileEntity(x, y, z)).connections[(5-side)]=true;
		System.out.println("set block at ["+x+","+y+","+z+"] to: "+side);

		return super.onBlockPlaced(world, x, y, z,side, hitX, hitY, hitZ, metaD);
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
