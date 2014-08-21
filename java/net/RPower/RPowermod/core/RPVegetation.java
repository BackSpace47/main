package net.RPower.RPowermod.core;

import net.RPower.RPowermod.block.blockREBL;
import net.RPower.RPowermod.block.blockREBLo;
import net.RPower.RPowermod.block.blockREBS;
import net.RPower.RPowermod.block.blockRPBlock;
import net.RPower.RPowermod.block.blockwoodPetrified;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RPVegetation {
	//Trees & Plants
    public static Block elderSap;
    public static Block elderLeaf;
    public static Block elderLog;
    public static Block elderPlanks;
    public static Block woodPetrified;
		
    
    public static void initVegetation(){
    	elderLog = new blockREBLo().setBlockName("Red Elderberry Log").setHardness(1.5F).setResistance(1F).setStepSound(Block.soundTypeWood).setCreativeTab(RPCore.RPCoreBTab).setBlockTextureName("log");
		elderLeaf = new blockREBL(Material.leaves).setBlockName("Red Elderberry Leaves").setHardness(0.5F).setStepSound(Block.soundTypeGrass).setCreativeTab(RPCore.RPCoreBTab);
		elderSap = new blockREBS().setBlockName("Red Elderberry Sapling").setHardness(0.0F).setCreativeTab(RPCore.RPCoreBTab).setStepSound(Block.soundTypeGrass).setBlockTextureName(RPCore.modid + ":" + "elderSap").setBlockTextureName("sapling");
		elderPlanks = new blockRPBlock(Material.wood).setCreativeTab(RPCore.RPCoreBTab).setBlockName("Elder Planks").setBlockTextureName(RPCore.modid + ":" + "planks_redelderberry").setHardness(1.5F).setStepSound(Block.soundTypeWood).setResistance(0.5F);
		woodPetrified = new blockwoodPetrified (Material.wood).setCreativeTab(RPCore.RPCoreBTab).setBlockName("Petrified Wood").setBlockTextureName(RPCore.modid + ":" + "woodPetrified").setHardness(0.5F).setResistance(0.5F).setStepSound(Block.soundTypeWood);
    }
		public static void registerBlocks(){
			initVegetation();
			
			//Trees
	        Recipies.registerBlock(elderLog, "Red Elderberry Log");
	        Recipies.registerBlock(elderLeaf, "Red Elderberry Leaf");
	        Recipies.registerBlock(elderSap, "Red Elderberry Sapling");
	        Recipies.registerBlock(elderPlanks, "Red Elderberry Planks");
	        Recipies.registerBlock(woodPetrified,"Petrified Wood");
		}
		
		public static void registerTileEntities(){
			
		}


}
