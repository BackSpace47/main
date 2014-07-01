package net.RPower.RPowermod.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.RPower.RPowermod.core.RPCore;
import net.minecraft.block.BlockLog;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

public class blockREBLo extends BlockLog {
	
	public static final String[] field_150168_M = new String[] {"redelderberry"};

	@SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        
		this.field_150167_a = new IIcon[field_150168_M.length];
        this.field_150166_b = new IIcon[field_150168_M.length];

        for (int i = 0; i < this.field_150167_a.length; ++i)
        {
            this.field_150167_a[i] = p_149651_1_.registerIcon(RPCore.modid + ":" + this.getTextureName() + "_" + field_150168_M[i]);
            this.field_150166_b[i] = p_149651_1_.registerIcon(RPCore.modid + ":" + this.getTextureName() + "_" + field_150168_M[i] + "_top");
        }
    }

}
