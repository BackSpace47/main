package net.RPower.RPowermod.core;

import net.RPower.RPowermod.block.BlockJadeBomb;
import net.RPower.RPowermod.block.BlockTCAM;
import net.RPower.RPowermod.block.BlockoreCrusher;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RPMachinery {
    
	//other
		public static Block TCAM;
		public static Block oreCrusher;
	    
		//machines
			public static Block alloySmelterIdle;
			public static Block alloySmelterActive;
	
	//The Bombs Of Awesomeness
			public static Block blockJadeBomb;
			
			public static void initMachines(){
				//Alloys
				TCAM = new BlockTCAM(Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("TCAM").setBlockTextureName(RPCore.modid + ":" + "TCAM").setHardness(50F).setResistance(5F);
				//Machines
				oreCrusher = new BlockoreCrusher(false).setCreativeTab(RPCore.RPCoreBTab).setBlockName("Ore Crusher").setHardness(50F).setResistance(5F);
				//To Be Worked On
				//alloySmelterIdle = new BlockAlloySmelter().setCreativeTab(RPCoreBTab).setBlockName("alloySmelter");
				//alloySmelterActive = new BlockAlloySmelter().setBlockName("alloySmelter").setLightLevel(0.625F);
				blockJadeBomb = new BlockJadeBomb(Material.tnt).setCreativeTab(RPCore.RPCoreBTab).setStepSound(Block.soundTypeCloth).setBlockName("The Bomb Of Epic Jade").setBlockTextureName(RPCore.modid + ":" + "bombJade");
				//Blocks End----------
			}
    
		
		public static void registerBlocks(){
			initMachines();
			Recipies.registerBlock(TCAM, "TCAM");
			Recipies.registerBlock(blockJadeBomb, "Jade Bomb");
		}
		
		public static void registerTileEntities(){
			
		}


}
