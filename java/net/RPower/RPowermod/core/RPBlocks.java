package net.RPower.RPowermod.core;

import net.RPower.RPowermod.block.BlockoreAnthtracite;
import net.RPower.RPowermod.block.BlocksandTreated;
import net.RPower.RPowermod.block.ObsidianWhite;
import net.RPower.RPowermod.block.blockRPBlock;
import net.RPower.RPowermod.block.blockRPBlockBSpace;
import net.RPower.RPowermod.block.blockRPBlockblockAluminum;
import net.RPower.RPowermod.block.blockRPBlockblockSilicon;
import net.RPower.RPowermod.block.blockRPBlockoreAluminum;
import net.RPower.RPowermod.block.blockRPBlockoreSilicon;
import net.RPower.RPowermod.block.blockRPOre;
import net.RPower.RPowermod.block.blockRPOreExp;
import net.RPower.RPowermod.block.blockRPOreFerrous;
import net.RPower.RPowermod.block.blockRPOreLead;
import net.RPower.RPowermod.block.blockRPOreSilver;
import net.RPower.RPowermod.block.blockRPOreTin;
import net.RPower.RPowermod.block.blockRPOreTungsten;
import net.RPower.RPowermod.block.blockRPOreZinc;
import net.RPower.RPowermod.block.blocktrollDiamond;
import net.RPower.RPowermod.block.blocktrollEmerald;
import net.RPower.RPowermod.block.blocktrollGold;
import net.RPower.RPowermod.block.blocktrollIron;
import net.RPower.RPowermod.item.itemtrollNugetGold;
import net.RPower.RPowermod.item.itemtrollNugetdiamond;
import net.RPower.RPowermod.item.itemtrollNugetemerald;
import net.RPower.RPowermod.item.itemtrollNugetiron;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RPBlocks {
	//Ores
		public static Block oreJade;
		public static Block oreCopper;
		public static Block oreFerrous;
		public static Block oreLead;
		public static Block oreSilver;
		public static Block oreTin;
		public static Block oreTungsten;
		public static Block oreExp;
		public static Block oreAnthtracite;
		public static Block obsidianWhite;
		public static Block oreZinc;
		public static Block oreSilicon;
		public static Block oreAluminum;
		//Troll Items
		public static Block trollGold;
		public static Block trollEmerald;
		public static Block trollDiamond;
		public static Block trollIron;
		//Blocks of items
		public static Block copperBlock;
		public static Block ferrousBlock;
		public static Block leadBlock;
		public static Block jadeBlock;
		public static Block netherstarBlock;
		public static Block organizeddiamondBlock;
		public static Block organizedemeraldBlock;
		public static Block silverBlock;
		public static Block tinBlock;
		public static Block tungstenBlock;
		public static Block tungstencarbideBlock;
		public static Block blockSilicon;
		public static Block blockAluminum;
		public static Block sandTreated;
		public static Block blueStabilizer;
	    public static Block polymer;
	    public static Block polymerWoven;
	  //Food
	    public static Block enderCake;
	    
	    
	    public static void initBlocks(){
	    	//Ores
			oreExp = new blockRPOreExp(Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("Exp Ore").setBlockTextureName(RPCore.modid + ":" + "exp_ore").setHardness(5F).setResistance(1F).setLightLevel(0.3F);
			oreTin = new blockRPOreTin(Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("Tin Ore").setBlockTextureName(RPCore.modid + ":" + "tin_ore").setHardness(1F).setResistance(0F);
			oreSilver = new blockRPOreSilver(Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("Silver Ore").setBlockTextureName(RPCore.modid + ":" + "silver_ore").setHardness(1F).setResistance(1F);
			oreJade = new blockRPOre(Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("Jade Ore").setBlockTextureName(RPCore.modid + ":" + "Jade Ore").setHardness(50F).setResistance(5F);
			oreCopper = new blockRPBlockBSpace(Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("Copper Ore").setBlockTextureName(RPCore.modid + ":" + "copper_ore").setHardness(1F).setResistance(1F);
			oreFerrous = new blockRPOreFerrous(Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("Ferrous Ore").setBlockTextureName(RPCore.modid + ":" + "ferrous_ore").setHardness(1F).setResistance(1F);
			oreLead = new blockRPOreLead (Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("Lead Ore").setBlockTextureName(RPCore.modid + ":" + "lead_ore").setHardness(1F).setResistance(1F);
			oreTungsten = new blockRPOreTungsten(Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("Tungsten Ore").setBlockTextureName(RPCore.modid + ":" + "tungstenore").setHardness(50F).setResistance(5F);
			oreAnthtracite = new BlockoreAnthtracite(Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("Anthracite Ore").setBlockTextureName(RPCore.modid + ":" + "anthracite_ore").setHardness(50F).setResistance(2000F);
			obsidianWhite = new ObsidianWhite(Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("White Obsidian").setBlockTextureName(RPCore.modid + ":" + "obsidianWhite").setHardness(50F).setResistance(10F);
			oreZinc = new blockRPOreZinc (Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("Zinc Ore").setBlockTextureName(RPCore.modid + ":" + "zinc").setHardness(1F).setResistance(1F);
			oreAluminum= new blockRPBlockoreAluminum(Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("oreAluminum").setBlockTextureName(RPCore.modid + ":" + "oreAluminum").setHardness(5F).setResistance(1F);
			oreSilicon= new blockRPBlockoreSilicon (Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("oreSilicon").setBlockTextureName(RPCore.modid + ":" + "oreSilicon").setHardness(5F).setResistance(1F);
			//Blocks Of items
			jadeBlock = new blockRPBlock(Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("Jade Block").setBlockTextureName(RPCore.modid + ":" + "jade_block").setHardness(50F).setResistance(5F);
			copperBlock = new blockRPBlock (Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("Copper Block").setBlockTextureName(RPCore.modid + ":" + "copper_block").setHardness(5F).setResistance(1F);
			ferrousBlock = new blockRPBlock(Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("Ferrous Block").setBlockTextureName(RPCore.modid + ":" + "ferrous_block").setHardness(5F).setResistance(1F);
			leadBlock = new blockRPBlock(Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("Lead Block").setBlockTextureName(RPCore.modid + ":" + "lead_block").setHardness(5F).setResistance(1F);
			netherstarBlock = new blockRPBlock(Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("Netherstar Block").setBlockTextureName(RPCore.modid + ":" + "netherstar_block").setHardness(5F).setResistance(1F);
			organizeddiamondBlock = new blockRPBlock(Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("Organizeddiamond Block").setBlockTextureName(RPCore.modid + ":" + "organizeddiamond_block").setHardness(5F).setResistance(1F);
			organizedemeraldBlock = new blockRPBlock(Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("Organizedemerald Block").setBlockTextureName(RPCore.modid + ":" + "organizedemerald_block").setHardness(5F).setResistance(1F);
			silverBlock = new blockRPBlock(Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("Silver Block").setBlockTextureName(RPCore.modid + ":" + "silver_block").setHardness(5F).setResistance(1F);
			tinBlock = new blockRPBlock(Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("Tin Block").setBlockTextureName(RPCore.modid + ":" + "tin_block").setHardness(5F).setResistance(1F);
			tungstenBlock = new blockRPBlock(Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("Tungsten Block").setBlockTextureName(RPCore.modid + ":" + "tungsten_block").setHardness(5F).setResistance(1F);
			tungstencarbideBlock = new blockRPBlock(Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("Tungstencarbide Block").setBlockTextureName(RPCore.modid + ":" + "tungstencarbide_block").setHardness(5F).setResistance(1F);
			blockSilicon= new blockRPBlockblockSilicon(Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("blockSilicon").setBlockTextureName(RPCore.modid + ":" + "blockSilicon").setHardness(5F).setResistance(1F);
			blockAluminum= new blockRPBlockblockAluminum(Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("blockAluminum").setBlockTextureName(RPCore.modid + ":" + "blockAluminum").setHardness(5F).setResistance(1F);

			//TrollBlocks
			trollDiamond = new blocktrollDiamond(Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("Troll Diamond").setBlockTextureName(RPCore.modid + ":" + "diamond_block").setHardness(50F).setResistance(5F);
			trollIron = new blocktrollIron(Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("Troll Iron").setBlockTextureName(RPCore.modid + ":" + "iron_block").setHardness(50F).setResistance(5F);
			trollEmerald = new blocktrollEmerald(Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("Troll Emerald").setBlockTextureName(RPCore.modid + ":" + "emerald_block").setHardness(50F).setResistance(5F);
			trollGold = new blocktrollGold(Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("Troll Gold").setBlockTextureName(RPCore.modid + ":" + "gold_block").setHardness(50F).setResistance(5F);
			
			sandTreated = new BlocksandTreated(Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("Treated Sand").setBlockTextureName(RPCore.modid + ":" + "sandTreated").setHardness(50F).setResistance(5F);
			polymer = new blockRPBlock(Material.glass).setCreativeTab(RPCore.RPCoreBTab).setStepSound(Block.soundTypeGrass).setBlockName("Polymer").setBlockTextureName(RPCore.modid + ":" + "polymer").setHardness(0.5F).setResistance(1F);
			polymerWoven = new blockRPBlock(Material.glass).setCreativeTab(RPCore.RPCoreBTab).setStepSound(Block.soundTypeGrass).setBlockName("Woven Polyester").setBlockTextureName(RPCore.modid + ":" + "woven_polyester").setHardness(0.5F).setResistance(0.5F);
			//WIP	//blueStabilizer =new Plants(Material.plants).setBlockName("Blue Stabilizer").setHardness(0.0F).setCreativeTab(RPCoreBTab).setBlockTextureName(modid + ":" + "flowerBlue").setBlockTextureName("flowerB");
	    }
		
		public static void registerBlocks(){
			initBlocks();

			//Recipies.registerItem(magnusCookie, "Test Cookie Creative Only");
			Recipies.registerBlock(obsidianWhite,"White Obsidian");
			//Recipies.registerBlock(oreCrusher, "Ore Crusher");
			Recipies.registerBlock(sandTreated, "Treated Sand");
			//WIP//Recipies.registerBlock(blueStabilizer, "Blue Stabilizer");

			//ores
			Recipies.registerBlock(oreExp, "Exp Ore");
			Recipies.registerBlock(oreTin, "Tin Ore");
			Recipies.registerBlock(oreSilver,"Silver Ore");
			Recipies.registerBlock(oreLead, "Lead Ore");
			Recipies.registerBlock(oreFerrous, "Ferrous Ore");
			Recipies.registerBlock(oreCopper, "Copper Ore");
			Recipies.registerBlock(oreJade, "Jade Ore");

			Recipies.registerBlock(oreZink,"oreZink");

			Recipies.registerBlock(oreLithium,"oreLithium");
			Recipies.registerBlock(oreChromium,"oreChromium");
			Recipies.registerBlock(oreTungsten, "Tungsten Ore");
			Recipies.registerBlock(oreSilicon,"oreSilicon");
			Recipies.registerBlock(oreNi,"oreNi");
			Recipies.registerBlock(orePlatinum,"orePlatinum");
			Recipies.registerBlock(oreAnthtracite, "Anthracite Ore");
			Recipies.registerBlock(oreAluminum,"oreAluminum");

			//Blocks
			Recipies.registerBlock(blockChromium,"blockChromium");
			Recipies.registerBlock(jadeBlock, "Jade Block");
	        Recipies.registerBlock(blockLithium,"blockLithium");

			Recipies.registerBlock(blockNi,"blockNi");

			Recipies.registerBlock(blockPlatinum,"blockPlatinum");

			Recipies.registerBlock(blockZink,"blockZink");
			Recipies.registerBlock(leadBlock, "Lead Block");
	        Recipies.registerBlock(netherstarBlock, "Netherstar Block");
	        Recipies.registerBlock(organizeddiamondBlock, "Organizeddiamond Block");
	        Recipies.registerBlock(organizedemeraldBlock, "Organizedemerald Block");
	        Recipies.registerBlock(silverBlock, "Silver Block");
	        Recipies.registerBlock(tinBlock, "Tin Block");
	        Recipies.registerBlock(tungstenBlock, "Tungsten Block");
	        Recipies.registerBlock(tungstencarbideBlock, "Tungstencarbide Block");
	        Recipies.registerBlock(blockSilicon,"blockSilicon");
	        Recipies.registerBlock(blockAluminum,"blockAluminum");
			Recipies.registerBlock(copperBlock, "Copper Block");
	        Recipies.registerBlock(ferrousBlock, "Ferrous Block");
	        Recipies.registerBlock(trollEmerald, "Emerald Block?");
			Recipies.registerBlock(trollDiamond, "Diamond Block?");
			Recipies.registerBlock(trollIron, "Iron Block?");
			Recipies.registerBlock(trollGold, "Gold Block?");
			
			Recipies.registerBlock(polymer, "Polymer");
			Recipies.registerBlock(polymerWoven, "Polyester");
			
		}

}
