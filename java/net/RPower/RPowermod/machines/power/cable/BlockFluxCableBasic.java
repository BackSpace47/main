package net.RPower.RPowermod.machines.power.cable;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
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
	public void onNeighborBlockChange(World world, int x,int y, int z, Block block) {
		
	}
	
	@Override
	public int onBlockPlaced(World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ, int metaD)
	{
		if((world.getBlock(x, y, z).hasTileEntity(0)&&(world.getTileEntity(x, y, z)instanceof TileEntityFluxCable)))
			((TileEntityFluxCable)world.getTileEntity(x, y, z)).connections[side]=true;
			
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
