package net.Mine_Facility.core;

import net.Mine_Facility.block.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by magnus on 30.08.2014.
 */
public class MFBlock {

    public static Block jadeBlock;

    public static void preInit(){
        jadeBlock = new blockJade(Material.rock).setCreativeTab(MFCore.MFCoreBTab).setBlockName("Jade Block").setBlockTextureName(MFCore.modid + ":" + "jade_block").setHardness(50F).setResistance(5F);
    }

    public static void init() {
        Recipes.registerBlock(jadeBlock, "Jade Block");
    }
}
