//#######################
//##      ___           ___           ___           ___           ___           ___           ___                    ___           ___           ___           ___           ___           ___                    ___           ___           ___           ___
//##     /\  \         /\  \         /\  \         /\  \         /\  \         /\  \         |\__\                  /\  \         /\  \         /\  \         /\  \         /\  \         /\  \                  /\  \         /\  \         /\  \         /\__\
//##    /::\  \       /::\  \       /::\  \       /::\  \       /::\  \       /::\  \        |:|  |                /::\  \       /::\  \       /::\  \       /::\  \       /::\  \       /::\  \                 \:\  \       /::\  \       /::\  \       /::|  |
//##   /:/\:\  \     /:/\:\  \     /:/\:\  \     /:/\:\  \     /:/\:\  \     /:/\:\  \       |:|  |               /:/\:\  \     /:/\:\  \     /:/\:\  \     /:/\:\  \     /:/\:\  \     /:/\ \  \                 \:\  \     /:/\:\  \     /:/\:\  \     /:|:|  |
//##  /::\~\:\  \   /::\~\:\  \   /::\~\:\  \   /::\~\:\  \   /:/  \:\__\   /:/  \:\  \      |:|__|__            /:/  \:\  \   /:/  \:\  \   /:/  \:\__\   /::\~\:\  \   /::\~\:\  \   _\:\~\ \  \                /::\  \   /::\~\:\  \   /::\~\:\  \   /:/|:|__|__
//## /:/\:\ \:\__\ /:/\:\ \:\__\ /:/\:\ \:\__\ /:/\:\ \:\__\ /:/__/ \:|__| /:/__/ \:\__\ ____/::::\__\          /:/__/ \:\__\ /:/__/ \:\__\ /:/__/ \:|__| /:/\:\ \:\__\ /:/\:\ \:\__\ /\ \:\ \ \__\              /:/\:\__\ /:/\:\ \:\__\ /:/\:\ \:\__\ /:/ |::::\__\
//## \/__\:\/:/  / \/__\:\/:/  / \/_|::\/:/  / \/__\:\/:/  / \:\  \ /:|  | \:\  \ /:/  / \::::/~~/~             \:\  \  \/__/ \:\  \ /:/  / \:\  \ /:/  / \:\~\:\ \/__/ \/_|::\/:/  / \:\ \:\ \/__/             /:/  \/__/ \:\~\:\ \/__/ \/__\:\/:/  / \/__/~~/:/  /
//##      \::/  /       \::/  /     |:|::/  /       \::/  /   \:\  /:/  /   \:\  /:/  /   ~~|:|~~|               \:\  \        \:\  /:/  /   \:\  /:/  /   \:\ \:\__\      |:|::/  /   \:\ \:\__\              /:/  /       \:\ \:\__\        \::/  /        /:/  /
//##       \/__/        /:/  /      |:|\/__/        /:/  /     \:\/:/  /     \:\/:/  /      |:|  |                \:\  \        \:\/:/  /     \:\/:/  /     \:\ \/__/      |:|\/__/     \:\/:/  /              \/__/         \:\ \/__/        /:/  /        /:/  /
//##                   /:/  /       |:|  |         /:/  /       \__/__/       \::/  /       |:|  |                 \:\__\        \::/  /       \::/__/       \:\__\        |:|  |        \::/  /                              \:\__\         /:/  /        /:/  /
//##                   \/__/         \|__|         \/__/                       \/__/         \|__|                  \/__/         \/__/         ~~            \/__/         \|__|         \/__/                                \/__/         \/__/         \/__/
//##
//##
//##
//##
//##                          Mod Made Possible by Magnus,Backspace,Rebelricco & Chinthor
//##
//##
//##
//##
//##
//##
//#######################

package net.RPower.RPowermod.core;

import net.RPower.RPowermod.block.BlockJadeBomb;
import net.RPower.RPowermod.block.BlockTCAM;
import net.RPower.RPowermod.block.BlockoreAnthtracite;
import net.RPower.RPowermod.block.BlockoreCrusher;
import net.RPower.RPowermod.block.BlocksandTreated;
import net.RPower.RPowermod.block.ObsidianWhite;
import net.RPower.RPowermod.block.blockREBL;
import net.RPower.RPowermod.block.blockREBLo;
import net.RPower.RPowermod.block.blockREBS;
import net.RPower.RPowermod.block.blockRPBlock;
import net.RPower.RPowermod.block.blockRPBlockBSpace;
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
import net.RPower.RPowermod.block.blockwoodPetrified;
import net.RPower.RPowermod.item.*;
import net.RPower.RPowermod.machines.power.cable.BlockFluxCable;
import net.RPower.RPowermod.machines.power.cable.TileEntityFluxCable;
import net.RPower.RPowermod.net.ItemFoodcreativeCookie;
import net.RPower.RPowermod.proxy.CommonProxy;
import net.RPower.RPowermod.world.RPWorldGen;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAppleGold;
import net.minecraft.item.ItemCoal;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLLoadEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
@Mod(modid = RPCore.modid, name = "Mine Facility", version = "Beta 3.7.0")
public class RPCore {
	public static final String modid = "rpower";
	public static ToolMaterial jadeToolMaterial;
	@Instance(modid)
	public static RPCore instance;
	//Blocks
	/**
	 * Add Smelting of Steel Dust into ingots as well as bronze dust
	 *
	 *
	 */
	//ADD ZINK ORE & BRASSDUST
	//Ores

   
	//Other Stuff
	public static final Block.SoundType soundTypePiston = new Block.SoundType("stone", 1.0F, 1.0F);
	private static final Object ItemStack = null;
	@SidedProxy(clientSide="net.RPower.RPowermod.proxy.ClientProxy", serverSide="net.RPower.RPowermod.proxy.CommonProxy")
	public static CommonProxy proxy;
	public static CreativeTabs RPCoreBTab = new CreativeTabs(modid) {
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return Item.getItemFromBlock(jadeBlock);
	    }
	};
	public static CreativeTabs RPCoreITab = new CreativeTabs(modid) {
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return TCAI;
	    }
	};
	public static Block oreExp;
	public static Block oreTin;
	public static Block oreSilver;
	public static Block oreJade;
	public static Block oreCopper;
	public static Block oreFerrous;
	public static Block oreLead;
	public static Block oreTungsten;
	public static Block oreAnthtracite;
	public static Block obsidianWhite;
	public static Block oreZinc;
	public static Block oreSilicon;
	public static Block woodPetrified;
	public static Block jadeBlock;
	public static Block copperBlock;
	public static Block ferrousBlock;
	public static Block leadBlock;
	public static Block netherstarBlock;
	public static Block organizeddiamondBlock;
	public static Block organizedemeraldBlock;
	public static Block silverBlock;
	public static Block tinBlock;
	public static Block tungstenBlock;
	public static Block tungstencarbideBlock;
	public static Block trollDiamond;
	public static Block trollIron;
	public static Block trollEmerald;
	public static Block trollGold;
	public static Block sandTreated;
	public static Block TCAM;
	public static Block oreCrusher;
	public static Block fluxCableBasic;
	public static Block elderLeaf;
	public static Block elderSap;
	public static Block elderLog;
	public static Block elderPlanks;
	public static Block polymer;
	public static Block polymerWoven;
	public static Block blockJadeBomb;
	@EventHandler
	public void preInit(FMLPreInitializationEvent e){
		//ToolMaterial
		//To Create A Tool Material Do This ToolMaterialName = EnumHelper.addToolMaterial(name, harvestLevel, maxUses, efficiency, damage, enchantability)
		/*
		 * 0 = Wood/Gold
		 * 1 = Stone
		 * 2 = Iron
		 * 3 = Diamond
		 * 4 = Jade
		 * 5 = Reinforced Jade
		 */
		jadeToolMaterial = EnumHelper.addToolMaterial("JADE", 4, 35, 16F, 7F, 50);
		//Blocks----------
		//Ores
		oreExp = new blockRPOreExp(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("Exp Ore").setBlockTextureName(modid + ":" + "exp_ore").setHardness(5F).setResistance(1F).setLightLevel(0.3F);
		oreTin = new blockRPOreTin(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("Tin Ore").setBlockTextureName(modid + ":" + "tin_ore").setHardness(1F).setResistance(0F);
		oreSilver = new blockRPOreSilver(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("Silver Ore").setBlockTextureName(modid + ":" + "silver_ore").setHardness(1F).setResistance(1F);
		oreJade = new blockRPOre(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("Jade Ore").setBlockTextureName(modid + ":" + "Jade Ore").setHardness(50F).setResistance(5F);
		oreCopper = new blockRPBlockBSpace(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("Copper Ore").setBlockTextureName(modid + ":" + "copper_ore").setHardness(1F).setResistance(1F);
		oreFerrous = new blockRPOreFerrous(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("Ferrous Ore").setBlockTextureName(modid + ":" + "ferrous_ore").setHardness(1F).setResistance(1F);
		oreLead = new blockRPOreLead (Material.rock).setCreativeTab(RPCoreBTab).setBlockName("Lead Ore").setBlockTextureName(modid + ":" + "lead_ore").setHardness(1F).setResistance(1F);
		oreTungsten = new blockRPOreTungsten(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("Tungsten Ore").setBlockTextureName(modid + ":" + "tungstenore").setHardness(50F).setResistance(5F);
		oreAnthtracite = new BlockoreAnthtracite(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("Anthracite Ore").setBlockTextureName(modid + ":" + "anthracite_ore").setHardness(50F).setResistance(2000F);
		obsidianWhite = new ObsidianWhite(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("White Obsidian").setBlockTextureName(modid + ":" + "obsidianWhite").setHardness(50F).setResistance(10F);
		oreZinc = new blockRPOreZinc (Material.rock).setCreativeTab(RPCoreBTab).setBlockName("Zinc Ore").setBlockTextureName(modid + ":" + "zinc").setHardness(1F).setResistance(1F);




		oreSilicon= new blockRPBlockoreSilicon (Material.rock).setCreativeTab(RPCoreBTab).setBlockName("oreSilicon").setBlockTextureName(modid + ":" + "oreSilicon").setHardness(5F).setResistance(1F);




		woodPetrified = new blockwoodPetrified (Material.wood).setCreativeTab(RPCoreBTab).setBlockName("Petrified Wood").setBlockTextureName(modid + ":" + "woodPetrified").setHardness(0.5F).setResistance(0.5F).setStepSound(Block.soundTypeWood);
		//Blocks Of items
		jadeBlock = new blockRPBlock(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("Jade Block").setBlockTextureName(modid + ":" + "jade_block").setHardness(50F).setResistance(5F);
		copperBlock = new blockRPBlock (Material.rock).setCreativeTab(RPCoreBTab).setBlockName("Copper Block").setBlockTextureName(modid + ":" + "copper_block").setHardness(5F).setResistance(1F);
		ferrousBlock = new blockRPBlock(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("Ferrous Block").setBlockTextureName(modid + ":" + "ferrous_block").setHardness(5F).setResistance(1F);
		leadBlock = new blockRPBlock(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("Lead Block").setBlockTextureName(modid + ":" + "lead_block").setHardness(5F).setResistance(1F);
		netherstarBlock = new blockRPBlock(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("Netherstar Block").setBlockTextureName(modid + ":" + "netherstar_block").setHardness(5F).setResistance(1F);
		organizeddiamondBlock = new blockRPBlock(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("Organizeddiamond Block").setBlockTextureName(modid + ":" + "organizeddiamond_block").setHardness(5F).setResistance(1F);
		organizedemeraldBlock = new blockRPBlock(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("Organizedemerald Block").setBlockTextureName(modid + ":" + "organizedemerald_block").setHardness(5F).setResistance(1F);
		silverBlock = new blockRPBlock(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("Silver Block").setBlockTextureName(modid + ":" + "silver_block").setHardness(5F).setResistance(1F);
		tinBlock = new blockRPBlock(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("Tin Block").setBlockTextureName(modid + ":" + "tin_block").setHardness(5F).setResistance(1F);
		tungstenBlock = new blockRPBlock(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("Tungsten Block").setBlockTextureName(modid + ":" + "tungsten_block").setHardness(5F).setResistance(1F);
		tungstencarbideBlock = new blockRPBlock(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("Tungstencarbide Block").setBlockTextureName(modid + ":" + "tungstencarbide_block").setHardness(5F).setResistance(1F);
    	//TrollBlocks
		trollDiamond = new blocktrollDiamond(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("Troll Diamond").setBlockTextureName(modid + ":" + "diamond_block").setHardness(50F).setResistance(5F);
		trollIron = new blocktrollIron(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("Troll Iron").setBlockTextureName(modid + ":" + "iron_block").setHardness(50F).setResistance(5F);
		trollEmerald = new blocktrollEmerald(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("Troll Emerald").setBlockTextureName(modid + ":" + "emerald_block").setHardness(50F).setResistance(5F);
		trollGold = new blocktrollGold(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("Troll Gold").setBlockTextureName(modid + ":" + "gold_block").setHardness(50F).setResistance(5F);
		
		sandTreated = new BlocksandTreated(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("Treated Sand").setBlockTextureName(modid + ":" + "sandTreated").setHardness(50F).setResistance(5F);
		//Alloys
		TCAM = new BlockTCAM(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("TCAM").setBlockTextureName(modid + ":" + "TCAM").setHardness(50F).setResistance(5F);
		//Machines
		oreCrusher = new BlockoreCrusher(false).setCreativeTab(RPCoreBTab).setBlockName("Ore Crusher").setHardness(50F).setResistance(5F);
		//To Be Worked On
		//alloySmelterIdle = new BlockAlloySmelter().setCreativeTab(RPCoreBTab).setBlockName("alloySmelter");
		//alloySmelterActive = new BlockAlloySmelter().setBlockName("alloySmelter").setLightLevel(0.625F);
		
		fluxCableBasic = new BlockFluxCable(Material.iron).setCreativeTab(RPCoreBTab).setBlockName("Basic MagiFlux Rail").setBlockTextureName(modid + ":" + "fluxCable").setHardness(50F).setResistance(5F);
		
		//Woods & Planks & Trees
		elderLog = new blockREBLo().setBlockName("Red Elderberry Log").setHardness(1.5F).setResistance(1F).setStepSound(Block.soundTypeWood).setCreativeTab(RPCoreBTab).setBlockTextureName("log");
		elderLeaf = new blockREBL(Material.leaves).setBlockName("Red Elderberry Leaves").setHardness(0.5F).setStepSound(Block.soundTypeGrass).setCreativeTab(RPCoreBTab);
		elderSap = new blockREBS().setBlockName("Red Elderberry Sapling").setHardness(0.0F).setCreativeTab(RPCoreBTab).setStepSound(Block.soundTypeGrass).setBlockTextureName(modid + ":" + "elderSap").setBlockTextureName("sapling");
		elderPlanks = new blockRPBlock(Material.wood).setCreativeTab(RPCoreBTab).setBlockName("Elder Planks").setBlockTextureName(modid + ":" + "planks_redelderberry").setHardness(1.5F).setStepSound(Block.soundTypeWood).setResistance(0.5F);
		polymer = new blockRPBlock(Material.glass).setCreativeTab(RPCoreBTab).setStepSound(Block.soundTypeGrass).setBlockName("Polymer").setBlockTextureName(modid + ":" + "polymer").setHardness(0.5F).setResistance(1F);
		polymerWoven = new blockRPBlock(Material.glass).setCreativeTab(RPCoreBTab).setStepSound(Block.soundTypeGrass).setBlockName("Woven Polyester").setBlockTextureName(modid + ":" + "woven_polyester").setHardness(0.5F).setResistance(0.5F);
		//WIP	//blueStabilizer =new Plants(Material.plants).setBlockName("Blue Stabilizer").setHardness(0.0F).setCreativeTab(RPCoreBTab).setBlockTextureName(modid + ":" + "flowerBlue").setBlockTextureName("flowerB");
		blockJadeBomb = new BlockJadeBomb(Material.tnt).setCreativeTab(RPCoreBTab).setStepSound(Block.soundTypeCloth).setBlockName("The Bomb Of Epic Jade").setBlockTextureName(modid + ":" + "bombJade");
		//Blocks End----------
		
		//OreDictionary -Broken For Blocks
		OreDictionary.registerOre("ingotBronze",new ItemStack(ingotBronze));
		OreDictionary.registerOre("ingotSteel",new ItemStack(ingotSteel));
		OreDictionary.registerOre("dustBronze", new ItemStack(dustBronze));
		OreDictionary.registerOre("dustSteel",new ItemStack(dustSteel));
		OreDictionary.registerOre("dustSugar", Items.sugar);
		OreDictionary.registerOre("dustSugar", dustSugar);
		OreDictionary.registerOre("ingotCopper", ingotCopper);
		OreDictionary.registerOre("ingotFerrous", new ItemStack(ingotFerrous));
		OreDictionary.registerOre("ingotLead", new ItemStack(ingotLead));
		OreDictionary.registerOre("ingotSilver", new ItemStack(ingotSilver));
		OreDictionary.registerOre("ingotTin", new ItemStack(ingotTin));
		OreDictionary.registerOre("gemDiamond", new ItemStack(gemDiamond));
		OreDictionary.registerOre("gemEmerald", new ItemStack(gemEmerald));
		OreDictionary.registerOre("ingotTungsten", new ItemStack(ingotTungsten));
		OreDictionary.registerOre("ingotNetherstar", new ItemStack(ingotNetherstar));
		OreDictionary.registerOre("ingotTugstencarbide", new ItemStack(ingotTungstencarbide));
		OreDictionary.registerOre("dustCopper", new ItemStack (dustCopper));
		OreDictionary.registerOre("dustFerrous", new ItemStack(dustFerrous));
		OreDictionary.registerOre("dustLead", new ItemStack(dustLead));
		OreDictionary.registerOre("dustSilver", new ItemStack(dustSilver));
		OreDictionary.registerOre("dustTin", new ItemStack(dustTin));
		OreDictionary.registerOre("dustDiamond", new ItemStack(dustDiamond));
		OreDictionary.registerOre("dustEmerald", new ItemStack(dustEmerald));
		OreDictionary.registerOre("dustTungsten", new ItemStack(dustTungsten));
		OreDictionary.registerOre("dustNetherstar", new ItemStack(dustNetherstar));
		OreDictionary.registerOre("dustGold", new ItemStack(dustGold));
		OreDictionary.registerOre("oreCopper", new ItemStack(chunkCopper));
		OreDictionary.registerOre("oreTin", new ItemStack(chunkTin));
		OreDictionary.registerOre("oreFerrous", new ItemStack(chunkFerrous));
		OreDictionary.registerOre("oreLead", new ItemStack(chunkLead));
		OreDictionary.registerOre("oreSilver", new ItemStack(chunkSilver));
		OreDictionary.registerOre("oreTungsten", new ItemStack(chunkTungsten));
	}

	@EventHandler
	public void init(FMLInitializationEvent e){		
        proxy.registerKeyBindings();
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, proxy);
		ItemStack slabM0 = new ItemStack (Blocks.stone_slab);
		slabM0.setItemDamage(5);
		//machines
		
		//registering Tile Entities and Renderers
				proxy.registerRenderers();
				GameRegistry.registerTileEntity(TileEntityFluxCable.class, "tileEntityFluxCable");
		
		//To Be Worked On
		//Recipies.registerBlock(alloySmelterIdle, "AlloySmelterIdle");
		//Recipies.registerBlock(alloySmelterActive, "AlloySmelterActive");
		//Blocks
		//troll items & Blocks
		Recipies.registerBlock(trollEmerald, "Emerald Block?");
		Recipies.registerBlock(trollDiamond, "Diamond Block?");
		Recipies.registerBlock(trollIron, "Iron Block?");
		Recipies.registerBlock(trollGold, "Gold Block?");

		Recipies.registerItem(trollNugetiron, "Iron Nugget?");
		Recipies.registerItem(trollNugetGold, "Gold Nugget?");
		Recipies.registerItem(trollNugetdiamond, "Diamond Nugget?");
		Recipies.registerItem(trollNugetemerald, "Emerald Nugget?");
		Recipies.registerItem(magnusCookie, "Test Cookie Creative Only");
		Recipies.registerBlock(obsidianWhite,"White Obsidian");
		Recipies.registerBlock(oreCrusher, "Ore Crusher");
		Recipies.registerBlock(sandTreated, "Treated Sand");
		//WIP//Recipies.registerBlock(blueStabilizer, "Blue Stabilizer");
		Recipies.registerBlock(woodPetrified,"Petrified Wood");
		Recipies.registerBlock(polymer, "Polymer");
		Recipies.registerBlock(polymerWoven, "Polyester");
		Recipies.registerBlock(oreExp, "Exp Ore");
		Recipies.registerBlock(oreTin, "Tin Ore");
		Recipies.registerBlock(oreSilver,"Silver Ore");
		Recipies.registerBlock(oreLead, "Lead Ore");
		Recipies.registerBlock(oreFerrous, "Ferrous Ore");
		Recipies.registerBlock(oreCopper, "Copper Ore");
		Recipies.registerBlock(oreJade, "Jade Ore");
		Recipies.registerBlock(jadeBlock, "Jade Block");
		Recipies.registerBlock(oreTungsten, "Tungsten Ore");

		Recipies.registerBlock(oreSilicon,"oreSilicon");

		//Cabling
		Recipies.registerBlock(fluxCableBasic, "fluxCableBasic");
		

		Recipies.registerBlock(TCAM, "TCAM");
		Recipies.registerBlock(oreAnthtracite, "Anthracite Ore");
		Recipies.registerBlock(copperBlock, "Copper Block");
        Recipies.registerBlock(ferrousBlock, "Ferrous Block");
        Recipies.registerBlock(leadBlock, "Lead Block");
        Recipies.registerBlock(netherstarBlock, "Netherstar Block");
        Recipies.registerBlock(organizeddiamondBlock, "Organizeddiamond Block");
        Recipies.registerBlock(organizedemeraldBlock, "Organizedemerald Block");
        Recipies.registerBlock(silverBlock, "Silver Block");
        Recipies.registerBlock(tinBlock, "Tin Block");
        Recipies.registerBlock(tungstenBlock, "Tungsten Block");
        Recipies.registerBlock(tungstencarbideBlock, "Tungstencarbide Block");
        //Trees
        Recipies.registerBlock(elderLog, "Red Elderberry Log");
        Recipies.registerBlock(elderLeaf, "Red Elderberry Leaf");
        Recipies.registerBlock(elderSap, "Red Elderberry Sapling");
        Recipies.registerBlock(elderPlanks, "Red Elderberry Planks");
        Recipies.registerBlock(blockJadeBomb, "Jade Bomb");
        //items
        //Capacitor
        Recipies.registerItem(foil,"Foil");
        Recipies.registerItem(foilAluminumoxide,"Aluminum Oxide Foil");
        Recipies.registerItem(paperElectrolized,"Electrolized Paper");
        Recipies.registerItem(capacitorBasic,"Basic Capacitor");
        Recipies.registerItem(capacitorCopper,"Copper Capacitor");
        Recipies.registerItem(capacitorDiamond,"Diamond Capacitor");
        Recipies.registerItem(capacitorGold,"Gold Capacitor");
        Recipies.registerItem(capacitorTungstencarbide,"Tungsten Catbide Capacitor");
        //Resistors
        //Parts
        Recipies.registerItem(clayTreated,"Treated Clay");
        Recipies.registerItem(clayTreatedbaked,"Baked Treated Clay");
        Recipies.registerItem(coiledNichrome,"Coiled Nichrome");
        Recipies.registerItem(resistorCase,"Resistor Case");
        Recipies.registerItem(resistorBasic,"Basic Resistor");
        Recipies.registerItem(resistorCopper,"Copper Resistor");
        Recipies.registerItem(resistorDiamond,"Diamond Resistor");
        Recipies.registerItem(resistorGold,"Gold Resistor");
        Recipies.registerItem(resistorIron,"Iron Resistor");
        Recipies.registerItem(resistorTungstencarbide,"Tungsten Carbide Resistor");
        //chips
        //ProtoSprays
        Recipies.registerItem(protopaintDiamond,"Next Gen Diamond ProtoSpray");
        Recipies.registerItem(protopaintCopper,"Next Gen Copper ProtoSpray");
        Recipies.registerItem(protopaintGold,"Next Gen Gold ProtoSpray");
        Recipies.registerItem(protopaintTungstencarbide,"Next Gen Tungsten Carbide ProtoSpray");
        //lag
        Recipies.registerItem(lagUnit,"Unit Of Lag");
        Recipies.registerItem(anvilPostassembly,"Postassembly Anvil");
        Recipies.registerItem(Epoxy,"Epoxy");
        Recipies.registerItem(lenseReflective,"Reflective Lense");
        Recipies.registerItem(diode,"Diode");
        //transistors
        Recipies.registerItem(kitTransistor,"Transistor Kit");
        Recipies.registerItem(transistorBasic,"Basic Transistor");
        Recipies.registerItem(transistorCopper,"Copper Transistor");
        Recipies.registerItem(transistorDiamond,"Diamond Transistor");
        Recipies.registerItem(transistorGold,"Gold Transistor");
        Recipies.registerItem(transistorIron,"Iron Transistor");
        Recipies.registerItem(transistorTungstencarbide,"Tungsten Carbide Transistor");
        //chips
        Recipies.registerItem(chipAdvanced, "Advanced Chip");
        Recipies.registerItem(chipBasic, "Basic Chip");
        Recipies.registerItem(chipElite, "Elite Chip");
        Recipies.registerItem(chipLV, "Low-Voltage Chip");
        //Ingots
        Recipies.registerItem(ingotSteel,"Steel Ingot");
        Recipies.registerItem(ingotBronze,"Bronze Ingot");
        Recipies.registerItem(ingotTin,"Tin Ingot");
		Recipies.registerItem(ingotSilver, "Silver Ingot");
		Recipies.registerItem(ingotLead, "Lead Ingot");
		Recipies.registerItem(ingotFerrous, "Ferrous Ingot");
		Recipies.registerItem(ingotCopper, "Copper Ingot");
		Recipies.registerItem(ingotNetherstar, "Nether Star Ingot");
		Recipies.registerItem(ingotTungsten, "Tungsten Ingot");
	    Recipies.registerItem(TCAI, "TCAI");
		//Gems
	    Recipies.registerItem(gemDiamond, "Diamond Ingot");
		Recipies.registerItem(gemEmerald, "Emerald Ingot");
		Recipies.registerItem(gemJade, "Raw Jade");
		Recipies.registerItem(gemJadepure, "Jade");
		//Dusts
		Recipies.registerItem(dustNetherstar, "Netherstar Dust");
		Recipies.registerItem(dustCopper, "Copper Dust");
		Recipies.registerItem(dustDiamond, "Diamond Dust");
		Recipies.registerItem(dustEmerald, "Emerald Dust");
		Recipies.registerItem(dustFerrous, "Ferrous Dust");
		Recipies.registerItem(dustGold, "Gold Dust");
		Recipies.registerItem(dustIron, "Iron Dust");
		Recipies.registerItem(dustLead, "Lead Dust");
		Recipies.registerItem(dustSilver, "Silver Dust");
		Recipies.registerItem(dustTin, "Tin Dust");
		Recipies.registerItem(dustTungsten, "Tungsten Dust");
		Recipies.registerItem(dustBronze,"Bronze Dust");
		Recipies.registerItem(dustSteel,"Steel Dust");
		//Magick
		Recipies.registerItem(dropBig, "Big Drop");
        Recipies.registerItem(dropBounce,"Bounce Drop");
        Recipies.registerItem(dropDeath, "Death Drop");
        Recipies.registerItem(dropFly,"Fly Drop");
        Recipies.registerItem(dropLife,"Life Drop");
        Recipies.registerItem(dropMagick,"Magick Drop");
        Recipies.registerItem(dropPoison,"Poisen Drop");
        Recipies.registerItem(dropRock,"Rock Drop");
        Recipies.registerItem(dropSmall,"Small Drop");
        Recipies.registerItem(dropSuper, "Super Drop");
        Recipies.registerItem(dustMagick, "Magick Dust");
        Recipies.registerItem(dustMagickcompound, "Magick Compound");
        Recipies.registerItem(runeFire, "Fire Rune");
        Recipies.registerItem(runeWater, "Water Rune");
        Recipies.registerItem(runeAir, "Air Rune");
        Recipies.registerItem(runeSpirit, "Spirit Rune");
        Recipies.registerItem(runeEarth, "Earth Rune");
        Recipies.registerItem(runePlate, "Runic Plate");
		//Misc
        Recipies.registerItem(sandPaper,"Sand Paper");
		Recipies.registerItem(anthracite, "Anthracite");
        Recipies.registerItem(quartzStick, "Quartc Stick");
        Recipies.registerItem(quartzBowl, "Quartc Bowl");
        Recipies.registerItem(mortar_and_pestle, "Mortar and Pestle");
        Recipies.registerItem(Pencil, "Pencil");
        Recipies.registerItem(blankScroll, "Blank Scroll");
        Recipies.registerItem(scrollCircle, "Circle Scroll");
        Recipies.registerItem(oilTreatment, "Treatment Oil");
        Recipies.registerItem(mouldCog, "Cog Mould");
        Recipies.registerItem(mouldPlate, "Plate Mould");
        //gears
        Recipies.registerItem(cogUnfiredcopper, "Unfired Copper Cog");
        Recipies.registerItem(cogUnfireddiamond, "Unfired Diamond Cog");
        Recipies.registerItem(cogUnfiredgold, "Unfired Gold Cog");
        Recipies.registerItem(cogUnfirediron, "Unfired Iron Cog");
        Recipies.registerItem(cogUnfiredtungstencarbide, "Unfired Tungsten Carbide Cog");
        //fired
        Recipies.registerItem(cogCopper, "Copper Cog");
        Recipies.registerItem(cogDiamond, "Diamond Cog");
        Recipies.registerItem(cogGold, "Gold Cog");
        Recipies.registerItem(cogIron, "Iron Cog");
        Recipies.registerItem(cogTungstencarbide, "Tungsten Carbide Cog");
        //Plates
        //unfired
        Recipies.registerItem(plateUnfiredcopper, "Unfired Copper Plate");
        Recipies.registerItem(plateUnfireddiamond, "Unfired Diamond Plate");
        Recipies.registerItem(plateUnfiredgold, "Unfired Gold Plate");
        Recipies.registerItem(plateUnfirediron, "Unfired Iron Plate");
        Recipies.registerItem(plateUnfiredtungstencarbide, "Unfired Tungsten Carbide Plate");
        //fired
        Recipies.registerItem(plateCopper, "Copper Plate");
        Recipies.registerItem(plateDiamond, "Diamond Plate");
        Recipies.registerItem(plateGold, "Gold Plate");
        Recipies.registerItem(plateIron, "Iron Plate");
        Recipies.registerItem(plateTungstencarbide, "Tungsten Carbide Plate");
        //Chunks
        Recipies.registerItem(chunkCopper, "Copper Chunk");
        Recipies.registerItem(chunkTin, "Tin Chunk");
        Recipies.registerItem(chunkFerrous, "Ferrous Chunk");
        Recipies.registerItem(chunkSilver, "Silver Chunk");
        Recipies.registerItem(chunkTungsten, "Tungsten Chunk");
        Recipies.registerItem(chunkLead, "Lead Chunk");
        //Tools
        Recipies.registerItem(hammerDiamond,"Diamond Hammer");
		Recipies.registerItem(hammerJade,"Jade Hammer");
		Recipies.registerItem(hammerNetherstar,"Netherstar Hammer");
		Recipies.registerItem(hammerSandstone,"Sandstone Hammer");
		Recipies.registerItem(hammerWooden ,"Wooden Hammer");
		Recipies.registerItem(hammerCopper,"Copper Hammer");
		Recipies.registerItem(hammerSilver,"Silver Hammer");
		Recipies.registerItem(tungstenCarbideHammer, "Tungsten Carbide Hammer");
		Recipies.registerItem(stoneHammer, "Stone Hammer");
		//Tools->Mining
		Recipies.registerItem(jadeSword, "Jade Sword");
		Recipies.registerItem(jadePickaxe, "Jade Pickaxe");
		Recipies.registerItem(jadeAxe, "Jade Axe");
		Recipies.registerItem(jadeHoe, "Jade Hoe");
		Recipies.registerItem(jadeShovel, "Jade Shovel");
        //Tool Heads
        Recipies.registerItem(headDiamond,"Diamond Hammer Head");
        Recipies.registerItem(headJade,"Jade Hammer Head");
        Recipies.registerItem(headNetherstar,"Netherstar Hammer Head");
        Recipies.registerItem(headSandstone,"Sandstone Hammer Head");
        Recipies.registerItem(headWooden ,"Wooden Hammer Head");
        Recipies.registerItem(headCopper,"Copper Hammer Head");
        Recipies.registerItem(headSilver,"Silver Hammer Head");
        Recipies.registerItem(tungstenCarbideHead, "Tungsten Carbide Hammer Head");
        Recipies.registerItem(stoneHamHead, "Stone Hammer Head");
        //Tools->Mining
        Recipies.registerItem(jadeHeadAx, "JadeAxeHead");
        Recipies.registerItem(jadeHeadSw, "JadeSwordHead");
        Recipies.registerItem(jadeHeadSh, "JadeShovHead");
        Recipies.registerItem(jadeHeadHo, "JadeHoeHead");
        Recipies.registerItem(jadeHeadPi, "JadePickHead");
        //Handle Modifiers
        //Caustic Items
        Recipies.registerItem(causticMeal, "Caustic Mix");
        Recipies.registerItem(causticCorpuscles, "Caustic Corpuscles ");
        Recipies.registerItem(bloodFirey, "Firey Blood");
        Recipies.registerItem(acidSulfuric, "Sulferic Acid");
        Recipies.registerItem(dustPN,"Potassium Nitrate");
        Recipies.registerItem(dustCharcoal, "Charcoal Dust");
        Recipies.registerItem(toolSkinning, "Skinning Tool");
        //Food
        Recipies.registerItem(megaCookie, "Mega Cookie");
        Recipies.registerItem(ghostCookie, "Ghost Cookie");
        Recipies.registerItem(poisonCookie, "Poison Cookie");
        Recipies.registerItem(miniCookie, "Mini Cookie");
        Recipies.registerItem(oneupCookie, "1Up Cookie");
        Recipies.registerItem(springCookie, "Spring Cookie");
        Recipies.registerItem(propellerCookie, "Propeller Cookie[WIP]");
        Recipies.registerItem(rockCookie, "Rock Cookie");
        Recipies.registerItem(superCookie, "Super Cookie");
        Recipies.registerItem(cookieSugar, "Sugar Cookie");
        Recipies.registerItem(baconRaw, "Raw Bacon");
        Recipies.registerItem(baconCooked,"Cooked Bacon");
        Recipies.registerItem(knife,"Knife");
        Recipies.registerItem(dustSugar,"Pouch Of Sugar");
        Recipies.registerItem(dustFlour, "Bag Of Flour");
        //Plants
        Recipies.registerItem(yellowLeaf, "Yellow Leaf");
        //test
        Recipies.registerItem(testCookie, "Item Of Testing");
        //Smelting
        Recipies.registerSmeltingItemWUM(Items.redstone,testCookie,5F);
        //Smelting
        Recipies.registerSmeltingItemWUM(dustSteel,ingotSteel,5F);
        Recipies.registerSmeltingItemWUM(dustBronze,ingotBronze,5f);
        Recipies.registerSmeltingItemWUM(chunkCopper, ingotCopper,5F);
        Recipies.registerSmeltingItemWUM(chunkTin, ingotTin,5F);
        Recipies.registerSmeltingItemWUM(chunkFerrous, ingotFerrous,5F);
        Recipies.registerSmeltingItemWUM(chunkSilver, ingotSilver,5F);
        Recipies.registerSmeltingItemWUM(chunkTungsten, ingotTungsten,5F);
        Recipies.registerSmeltingItemWUM(chunkLead, ingotLead,5F);
        //gears
        Recipies.registerSmeltingItemWUM(cogUnfiredcopper, cogCopper,5F);
        Recipies.registerSmeltingItemWUM(cogUnfireddiamond, cogDiamond,5F);
        Recipies.registerSmeltingItemWUM(cogUnfiredgold, cogGold,5F);
        Recipies.registerSmeltingItemWUM(cogUnfirediron, cogIron,5F);
        Recipies.registerSmeltingItemWUM(cogUnfiredtungstencarbide, cogTungstencarbide,5F);
        //other
        Recipies.registerSmeltingItemWUM(dustFlour,Items.bread,5F);
        Recipies.registerSmeltingItemWUM(dustMagick,runePlate,5F);
        Recipies.registerSmeltingItemWUM(gemJade, gemJadepure, 5F);
        Recipies.registerSmeltingItemWUM(Items.nether_star,ingotNetherstar, 5F);
        Recipies.registerSmeltingItemWUM(Items.diamond,gemDiamond, 5F);
        Recipies.registerSmeltingItemWUM(Items.emerald,gemEmerald, 5F);
        Recipies.registerSmeltingItemWUM(Items.diamond_horse_armor,gemDiamond, 5F);
        Recipies.registerSmeltingItemWUM(Items.iron_horse_armor,Items.iron_ingot, 5F);
        Recipies.registerSmeltingItemWUM(Items.golden_horse_armor,Items.gold_ingot, 5F);
        Recipies.registerSmeltingItemWUM(Items.rotten_flesh,Items.leather, 5F);
        Recipies.registerSmeltingItemWUM(Items.poisonous_potato,Items.poisonous_potato, 5F);
        //Smelting Ores
        Recipies.registerSmeltingBlockToItemWUM(oreTungsten, ingotTungsten, 5F);
		Recipies.registerSmeltingBlockToItemWUM(oreCopper,ingotCopper,5f);
		Recipies.registerSmeltingBlockToItemWUM(oreFerrous,ingotFerrous,5f);
		Recipies.registerSmeltingBlockWUM(obsidianWhite,Blocks.obsidian,5f);
		Recipies.registerSmeltingBlockToItemWUM(oreLead,ingotLead,5f);
		Recipies.registerSmeltingBlockToItemWUM(oreSilver,ingotSilver,5f);
		Recipies.registerSmeltingBlockToItemWUM(oreTin,ingotTin,5f);
		//Smelting Dusts
		Recipies.registerSmeltingItemWUM(dustTin,ingotTin,5f);
		Recipies.registerSmeltingItemWUM(dustTungsten, ingotTungsten, 5F);
		Recipies.registerSmeltingItemWUM(dustCopper,ingotCopper,5f);
		Recipies.registerSmeltingItemWUM(dustFerrous,ingotFerrous,5f);
		Recipies.registerSmeltingItemWUM(dustLead,ingotLead,5f);
		Recipies.registerSmeltingItemWUM(dustSilver,ingotSilver,5f);
		Recipies.registerSmeltingItemWUM(dustTin,ingotTin,5f);
		Recipies.registerSmeltingItemWUM(dustDiamond,gemDiamond,5f);
		Recipies.registerSmeltingItemWUM(dustEmerald,gemEmerald,5f);
		Recipies.registerSmeltingItemWUM(dustIron,Items.iron_ingot,5f);
		Recipies.registerSmeltingItemWUM(dustGold,Items.gold_ingot,5f);
		Recipies.registerSmeltingItemWUM(dustNetherstar,ingotNetherstar,5f);
		Recipies.registerSmeltingItemWUM(baconRaw,baconCooked,5f);
		//Smelting Alloys # Will need to be changed when we get the alloy smelter going
        Recipies.registerSmeltingBlockToItemWUM(TCAM, TCAI, 5F);
        //Crafting recipes
        GameRegistry.addShapedRecipe(new ItemStack (knife), "   ", " x ", " 0 ", 'x',new ItemStack(Items.iron_ingot), '0',new ItemStack(Items.stick));
		GameRegistry.addShapedRecipe(new ItemStack (Blocks.stonebrick), "x", "x", 'x', slabM0);
		GameRegistry.addShapedRecipe(new ItemStack (dustSteel,4),"###","#0#","###", '#', new ItemStack (RPCore.dustCharcoal),'0',new ItemStack(Items.iron_ingot));
		GameRegistry.addShapedRecipe(new ItemStack (tungstenCarbideHead), "###", "# #", '#', new ItemStack (TCAI));
		GameRegistry.addShapedRecipe(new ItemStack (tungstenCarbideHammer), "#", "x", '#', new ItemStack (tungstenCarbideHead), 'x', new ItemStack(Items.stick));
		GameRegistry.addShapedRecipe(new ItemStack (jadeSword), "x", "z", 'x', new ItemStack (jadeHeadSw), 'z', new ItemStack (Items.stick));
		GameRegistry.addShapedRecipe(new ItemStack (jadeShovel), "x", "z", 'x', new ItemStack (jadeHeadSh), 'z', new ItemStack (Items.stick));
		GameRegistry.addShapedRecipe(new ItemStack (jadePickaxe), "x", "z", 'x', new ItemStack (jadeHeadPi), 'z', new ItemStack (Items.stick));
		GameRegistry.addShapedRecipe(new ItemStack (jadeAxe), "x", "z", 'x', new ItemStack (jadeHeadAx), 'z', new ItemStack (Items.stick));
		GameRegistry.addShapedRecipe(new ItemStack (jadeHoe), "x", "z", 'x', new ItemStack (jadeHeadHo), 'z', new ItemStack (Items.stick));
		GameRegistry.addShapedRecipe(new ItemStack (copperBlock), "xxx", "xxx", "xxx", 'x', new ItemStack (ingotCopper));
		GameRegistry.addShapedRecipe(new ItemStack (leadBlock), "xxx", "xxx", "xxx", 'x', new ItemStack (ingotLead));
		GameRegistry.addShapedRecipe(new ItemStack (ferrousBlock), "xxx", "xxx", "xxx", 'x', new ItemStack (ingotFerrous));
		GameRegistry.addShapedRecipe(new ItemStack (netherstarBlock), "xxx", "xxx", "xxx", 'x', new ItemStack (ingotNetherstar));
		GameRegistry.addShapedRecipe(new ItemStack (organizeddiamondBlock), "xxx", "xxx", "xxx", 'x', new ItemStack (gemDiamond));
		GameRegistry.addShapedRecipe(new ItemStack (organizedemeraldBlock), "xxx", "xxx", "xxx", 'x', new ItemStack (gemEmerald));
		GameRegistry.addShapedRecipe(new ItemStack (silverBlock), "xxx", "xxx", "xxx", 'x', new ItemStack (ingotSilver));
		GameRegistry.addShapedRecipe(new ItemStack (tinBlock), "xxx", "xxx", "xxx", 'x', new ItemStack (ingotTin));
		GameRegistry.addShapedRecipe(new ItemStack (tungstenBlock), "xxx", "xxx", "xxx", 'x', new ItemStack (ingotTungsten));
		GameRegistry.addShapedRecipe(new ItemStack (tungstencarbideBlock), "xxx", "xxx", "xxx", 'x', new ItemStack (TCAI));
		GameRegistry.addShapedRecipe(new ItemStack (jadeBlock), "xx", "xx", 'x', new ItemStack (gemJadepure));
		GameRegistry.addShapedRecipe(new ItemStack (yellowLeaf), "xxx", "xxx", "xxx", 'x', new ItemStack (elderLeaf));
		GameRegistry.addShapedRecipe(new ItemStack (quartzStick, 4), "  x", " x ", "xx ", 'x', new ItemStack (Items.quartz));
		GameRegistry.addShapedRecipe(new ItemStack (quartzBowl, 4), "x x", " x ", 'x', new ItemStack (Items.quartz));
		GameRegistry.addShapedRecipe(new ItemStack (mortar_and_pestle), "x", "#", 'x', new ItemStack (quartzStick), '#', new ItemStack(quartzBowl));
		GameRegistry.addShapedRecipe(new ItemStack (dustMagick, 8), "xxx", "x#x", "xxx", 'x', new ItemStack(yellowLeaf), '#', new ItemStack (mortar_and_pestle));
		GameRegistry.addShapedRecipe(new ItemStack (dustSugar, 1), "xxx", "xxx", "xxx", 'x', new ItemStack(Items.sugar));
		GameRegistry.addShapelessRecipe(new ItemStack (TCAM), new ItemStack (Blocks.coal_block), new ItemStack (ingotTungsten));
		GameRegistry.addShapelessRecipe(new ItemStack (dustBronze,2), new ItemStack (dustCopper,3), new ItemStack (dustTin,1));
		GameRegistry.addShapedRecipe(new ItemStack (Blocks.torch, 16), "x", "z", 'x', new ItemStack (anthracite), 'z', new ItemStack (Items.stick));
		GameRegistry.addShapedRecipe(new ItemStack (Pencil, 32), "xzx", "xzx", "xsx", 'x', new ItemStack(Blocks.planks), 'z', new ItemStack(Items.coal), 's', new ItemStack(ingotLead));
		GameRegistry.addShapelessRecipe(new ItemStack (blankScroll), new ItemStack(Items.paper), new ItemStack(oilTreatment));
		GameRegistry.addShapedRecipe(new ItemStack(scrollCircle), "xxx","xzx","xxx", 'x', new ItemStack(Pencil), 'z', new ItemStack(blankScroll));
		GameRegistry.addShapedRecipe(new ItemStack (sandTreated, 4), " z ", "zxz", " z ", 'z', new ItemStack(oilTreatment), 'x', new ItemStack(Blocks.sand));
		GameRegistry.addShapedRecipe(new ItemStack(mouldCog), " x ", "xzx", " x ", 'x', new ItemStack(sandTreated), 'z', new ItemStack(scrollCircle));
		//protosprays
		GameRegistry.addShapedRecipe(new ItemStack(protopaintDiamond), "yxy", "xzx", "yxy", 'x', new ItemStack(dustDiamond), 'z', new ItemStack(Blocks.glass), 'y', new ItemStack(ingotSteel));
		GameRegistry.addShapedRecipe(new ItemStack(protopaintCopper), "yxy", "xzx", "yxy", 'x', new ItemStack(dustCopper), 'z', new ItemStack(Blocks.glass), 'y', new ItemStack(ingotSteel));
		GameRegistry.addShapedRecipe(new ItemStack(protopaintGold), "yxy", "xzx", "yxy", 'x', new ItemStack(dustBronze), 'z', new ItemStack(Blocks.glass), 'y', new ItemStack(ingotSteel));
		GameRegistry.addShapedRecipe(new ItemStack(protopaintTungstencarbide), "yxy", "xzx", "yxy", 'x', new ItemStack(testCookie), 'z', new ItemStack(Blocks.glass), 'y', new ItemStack(ingotSteel));
		GameRegistry.addShapelessRecipe(new ItemStack (capacitorDiamond), new ItemStack (protopaintDiamond, 1,  OreDictionary.WILDCARD_VALUE), new ItemStack (capacitorBasic));
		//gears
		GameRegistry.addShapedRecipe(new ItemStack(cogUnfiredcopper), " x ", "xzx", " x ", 'x', new ItemStack(dustCopper), 'z', new ItemStack(mouldCog, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack(cogUnfireddiamond), " x ", "xzx", " x ", 'x', new ItemStack(dustDiamond), 'z', new ItemStack(mouldCog, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack(cogUnfiredgold), " x ", "xzx", " x ", 'x', new ItemStack(dustGold), 'z', new ItemStack(mouldCog, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack(cogUnfirediron), " x ", "xzx", " x ", 'x', new ItemStack(dustIron), 'z', new ItemStack(mouldCog, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack(cogUnfiredtungstencarbide), " x ", "xzx", " x ", 'x', new ItemStack(ingotCopper), 'z', new ItemStack(mouldCog, 1,  OreDictionary.WILDCARD_VALUE));
		//Plants
		GameRegistry.addShapedRecipe(new ItemStack (polymer,1),"###","###","###", '#', new ItemStack (Blocks.leaves));
		GameRegistry.addShapedRecipe(new ItemStack (polymerWoven,1),"###","###","###", '#', new ItemStack (polymer));
		GameRegistry.addShapedRecipe(new ItemStack (Blocks.wool,16),"###","###","###", '#', new ItemStack (polymerWoven));
		//Hammer Recipes
		//Stone
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadSw,1, OreDictionary.WILDCARD_VALUE), " x", " #", 'x', new ItemStack (jadeBlock), '#', new ItemStack (stoneHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadSh,1, OreDictionary.WILDCARD_VALUE), "#x", 'x', new ItemStack (jadeBlock), '#', new ItemStack (stoneHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (jadeHeadHo,1, OreDictionary.WILDCARD_VALUE), new ItemStack (jadeBlock), new ItemStack (stoneHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadAx,1, OreDictionary.WILDCARD_VALUE), " #", " x", 'x', new ItemStack (jadeBlock), '#', new ItemStack (stoneHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadPi,1, OreDictionary.WILDCARD_VALUE),  " x","# ", 'x', new ItemStack (jadeBlock), '#', new ItemStack (stoneHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2), new ItemStack (oreCopper), new ItemStack (stoneHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustLead,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreLead), new ItemStack (stoneHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustFerrous,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreFerrous), new ItemStack (stoneHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkCopper), new ItemStack (stoneHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustSilver,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreSilver), new ItemStack (stoneHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTin,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreTin), new ItemStack (stoneHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTungsten,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreTungsten), new ItemStack (stoneHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreCopper), new ItemStack (stoneHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(dustIron,2,OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.iron_ore), new ItemStack(stoneHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustFlour,4, OreDictionary.WILDCARD_VALUE),new ItemStack(stoneHammer, 1,  OreDictionary.WILDCARD_VALUE),new ItemStack(Items.wheat));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCharcoal,4, OreDictionary.WILDCARD_VALUE),new ItemStack(stoneHammer, 1,  OreDictionary.WILDCARD_VALUE),new ItemStack(Items.coal,1,1));
		GameRegistry.addShapelessRecipe(new ItemStack (dustLead,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkLead), new ItemStack (stoneHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustFerrous,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkFerrous), new ItemStack (stoneHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustSilver,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkSilver), new ItemStack (stoneHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTin,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkTin), new ItemStack (stoneHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTungsten,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkTungsten), new ItemStack (stoneHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkCopper), new ItemStack (stoneHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (Blocks.sand,2, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.cobblestone), new ItemStack (stoneHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustGold,2, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.gold_ore), new ItemStack (stoneHammer, 1,  OreDictionary.WILDCARD_VALUE));
		//Tugsten Carbide
		GameRegistry.addShapelessRecipe(new ItemStack (dustEmerald,2, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.emerald_ore), new ItemStack (tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(dustDiamond, 3, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.diamond_ore), new ItemStack(tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadSw,1, OreDictionary.WILDCARD_VALUE), " x", " #", 'x', new ItemStack (jadeBlock), '#', new ItemStack (tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadSh,1, OreDictionary.WILDCARD_VALUE), "#x", 'x', new ItemStack (jadeBlock), '#', new ItemStack (tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (jadeHeadHo,1, OreDictionary.WILDCARD_VALUE), new ItemStack (jadeBlock), new ItemStack (tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadAx,1, OreDictionary.WILDCARD_VALUE), " #", " x", 'x', new ItemStack (jadeBlock), '#', new ItemStack (tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadPi,1, OreDictionary.WILDCARD_VALUE),  " x","# ", 'x', new ItemStack (jadeBlock), '#', new ItemStack (tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2), new ItemStack (oreCopper), new ItemStack (tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustLead,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreLead), new ItemStack (tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustFerrous,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreFerrous), new ItemStack (tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkCopper), new ItemStack (tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustSilver,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreSilver), new ItemStack (tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTin,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreTin), new ItemStack (tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTungsten,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreTungsten), new ItemStack (tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreCopper), new ItemStack (tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(dustIron,2,OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.iron_ore), new ItemStack(tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustFlour,4, OreDictionary.WILDCARD_VALUE),new ItemStack(tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE),new ItemStack(Items.wheat));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCharcoal,4, OreDictionary.WILDCARD_VALUE),new ItemStack(tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE),new ItemStack(Items.coal,1,1));
		GameRegistry.addShapelessRecipe(new ItemStack (dustLead,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkLead), new ItemStack (tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustFerrous,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkFerrous), new ItemStack (tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustSilver,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkSilver), new ItemStack (tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTin,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkTin), new ItemStack (tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTungsten,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkTungsten), new ItemStack (tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkCopper), new ItemStack (tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (Blocks.sand,2, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.cobblestone), new ItemStack (tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustGold,2, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.gold_ore), new ItemStack (tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE));
		//Diamond
		GameRegistry.addShapelessRecipe(new ItemStack (dustEmerald,2, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.emerald_ore), new ItemStack (hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(dustDiamond, 3, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.diamond_ore), new ItemStack(hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadSw,1, OreDictionary.WILDCARD_VALUE), " x", " #", 'x', new ItemStack (jadeBlock), '#', new ItemStack (hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadSh,1, OreDictionary.WILDCARD_VALUE), "#x", 'x', new ItemStack (jadeBlock), '#', new ItemStack (hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (jadeHeadHo,1, OreDictionary.WILDCARD_VALUE), new ItemStack (jadeBlock), new ItemStack (hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadAx,1, OreDictionary.WILDCARD_VALUE), " #", " x", 'x', new ItemStack (jadeBlock), '#', new ItemStack (hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadPi,1, OreDictionary.WILDCARD_VALUE),  " x","# ", 'x', new ItemStack (jadeBlock), '#', new ItemStack (hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2), new ItemStack (oreCopper), new ItemStack (hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustLead,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreLead), new ItemStack (hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustFerrous,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreFerrous), new ItemStack (hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkCopper), new ItemStack (hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustSilver,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreSilver), new ItemStack (hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTin,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreTin), new ItemStack (hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTungsten,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreTungsten), new ItemStack (hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreCopper), new ItemStack (hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(dustIron,2,OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.iron_ore), new ItemStack(hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustFlour,4, OreDictionary.WILDCARD_VALUE),new ItemStack(hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE),new ItemStack(Items.wheat));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCharcoal,4, OreDictionary.WILDCARD_VALUE),new ItemStack(hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE),new ItemStack(Items.coal,1,1));
		GameRegistry.addShapelessRecipe(new ItemStack (dustLead,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkLead), new ItemStack (hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustFerrous,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkFerrous), new ItemStack (hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustSilver,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkSilver), new ItemStack (hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTin,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkTin), new ItemStack (hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTungsten,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkTungsten), new ItemStack (hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkCopper), new ItemStack (hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (Blocks.sand,2, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.cobblestone), new ItemStack (hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustGold,2, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.gold_ore), new ItemStack (hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE));
		//Jade
		GameRegistry.addShapelessRecipe(new ItemStack (dustEmerald,2, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.emerald_ore), new ItemStack (hammerJade, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(dustDiamond, 3, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.diamond_ore), new ItemStack(hammerJade, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadSw,1, OreDictionary.WILDCARD_VALUE), " x", " #", 'x', new ItemStack (jadeBlock), '#', new ItemStack (hammerJade, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadSh,1, OreDictionary.WILDCARD_VALUE), "#x", 'x', new ItemStack (jadeBlock), '#', new ItemStack (hammerJade, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (jadeHeadHo,1, OreDictionary.WILDCARD_VALUE), new ItemStack (jadeBlock), new ItemStack (hammerJade, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadAx,1, OreDictionary.WILDCARD_VALUE), " #", " x", 'x', new ItemStack (jadeBlock), '#', new ItemStack (hammerJade, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadPi,1, OreDictionary.WILDCARD_VALUE),  " x","# ", 'x', new ItemStack (jadeBlock), '#', new ItemStack (hammerJade, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2), new ItemStack (oreCopper), new ItemStack (hammerJade, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustLead,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreLead), new ItemStack (hammerJade, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustFerrous,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreFerrous), new ItemStack (hammerJade, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkCopper), new ItemStack (hammerJade, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustSilver,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreSilver), new ItemStack (hammerJade, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTin,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreTin), new ItemStack (hammerJade, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTungsten,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreTungsten), new ItemStack (hammerJade, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreCopper), new ItemStack (hammerJade, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(dustIron,2,OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.iron_ore), new ItemStack(hammerJade, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustFlour,4, OreDictionary.WILDCARD_VALUE),new ItemStack(hammerJade, 1,  OreDictionary.WILDCARD_VALUE),new ItemStack(Items.wheat));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCharcoal,4, OreDictionary.WILDCARD_VALUE),new ItemStack(hammerJade, 1,  OreDictionary.WILDCARD_VALUE),new ItemStack(Items.coal,1,1));
		GameRegistry.addShapelessRecipe(new ItemStack (dustLead,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkLead), new ItemStack (hammerJade, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustFerrous,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkFerrous), new ItemStack (hammerJade, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustSilver,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkSilver), new ItemStack (hammerJade, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTin,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkTin), new ItemStack (hammerJade, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTungsten,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkTungsten), new ItemStack (hammerJade, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkCopper), new ItemStack (hammerJade, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (Blocks.sand,2, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.cobblestone), new ItemStack (hammerJade, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustGold,2, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.gold_ore), new ItemStack (hammerJade, 1,  OreDictionary.WILDCARD_VALUE));
		//Netherstar
		GameRegistry.addShapelessRecipe(new ItemStack (dustEmerald,2, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.emerald_ore), new ItemStack (hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(dustDiamond, 3, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.diamond_ore), new ItemStack(hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadSw,1, OreDictionary.WILDCARD_VALUE), " x", " #", 'x', new ItemStack (jadeBlock), '#', new ItemStack (hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadSh,1, OreDictionary.WILDCARD_VALUE), "#x", 'x', new ItemStack (jadeBlock), '#', new ItemStack (hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (jadeHeadHo,1, OreDictionary.WILDCARD_VALUE), new ItemStack (jadeBlock), new ItemStack (hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadAx,1, OreDictionary.WILDCARD_VALUE), " #", " x", 'x', new ItemStack (jadeBlock), '#', new ItemStack (hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadPi,1, OreDictionary.WILDCARD_VALUE),  " x","# ", 'x', new ItemStack (jadeBlock), '#', new ItemStack (hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2), new ItemStack (oreCopper), new ItemStack (hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustLead,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreLead), new ItemStack (hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustFerrous,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreFerrous), new ItemStack (hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkCopper), new ItemStack (hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustSilver,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreSilver), new ItemStack (hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTin,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreTin), new ItemStack (hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTungsten,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreTungsten), new ItemStack (hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreCopper), new ItemStack (hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(dustIron,2,OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.iron_ore), new ItemStack(hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustFlour,4, OreDictionary.WILDCARD_VALUE),new ItemStack(hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE),new ItemStack(Items.wheat));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCharcoal,4, OreDictionary.WILDCARD_VALUE),new ItemStack(hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE),new ItemStack(Items.coal,1,1));
		GameRegistry.addShapelessRecipe(new ItemStack (dustLead,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkLead), new ItemStack (hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustFerrous,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkFerrous), new ItemStack (hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustSilver,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkSilver), new ItemStack (hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTin,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkTin), new ItemStack (hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTungsten,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkTungsten), new ItemStack (hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkCopper), new ItemStack (hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (Blocks.sand,2, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.cobblestone), new ItemStack (hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustGold,2, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.gold_ore), new ItemStack (hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE));
		//sandstone
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadSw,1, OreDictionary.WILDCARD_VALUE), " x", " #", 'x', new ItemStack (jadeBlock), '#', new ItemStack (hammerSandstone, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadSh,1, OreDictionary.WILDCARD_VALUE), "#x", 'x', new ItemStack (jadeBlock), '#', new ItemStack (hammerSandstone, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (jadeHeadHo,1, OreDictionary.WILDCARD_VALUE), new ItemStack (jadeBlock), new ItemStack (hammerSandstone, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadAx,1, OreDictionary.WILDCARD_VALUE), " #", " x", 'x', new ItemStack (jadeBlock), '#', new ItemStack (hammerSandstone, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadPi,1, OreDictionary.WILDCARD_VALUE),  " x","# ", 'x', new ItemStack (jadeBlock), '#', new ItemStack (hammerSandstone, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2), new ItemStack (oreCopper), new ItemStack (hammerSandstone, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustLead,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreLead), new ItemStack (hammerSandstone, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustFerrous,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreFerrous), new ItemStack (hammerSandstone, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkCopper), new ItemStack (hammerSandstone, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustSilver,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreSilver), new ItemStack (hammerSandstone, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTin,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreTin), new ItemStack (hammerSandstone, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTungsten,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreTungsten), new ItemStack (hammerSandstone, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreCopper), new ItemStack (hammerSandstone, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(dustIron,2,OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.iron_ore), new ItemStack(hammerSandstone, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustFlour,4, OreDictionary.WILDCARD_VALUE),new ItemStack(hammerSandstone, 1,  OreDictionary.WILDCARD_VALUE),new ItemStack(Items.wheat));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCharcoal,4, OreDictionary.WILDCARD_VALUE),new ItemStack(hammerSandstone, 1,  OreDictionary.WILDCARD_VALUE),new ItemStack(Items.coal,1,1));
		GameRegistry.addShapelessRecipe(new ItemStack (dustLead,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkLead), new ItemStack (hammerSandstone, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustFerrous,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkFerrous), new ItemStack (hammerSandstone, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustSilver,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkSilver), new ItemStack (hammerSandstone, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTin,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkTin), new ItemStack (hammerSandstone, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTungsten,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkTungsten), new ItemStack (hammerSandstone, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkCopper), new ItemStack (hammerSandstone, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (Blocks.sand,2, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.cobblestone), new ItemStack (hammerSandstone, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustGold,2, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.gold_ore), new ItemStack (hammerSandstone, 1,  OreDictionary.WILDCARD_VALUE));
		//wooden
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadSw,1, OreDictionary.WILDCARD_VALUE), " x", " #", 'x', new ItemStack (jadeBlock), '#', new ItemStack (hammerWooden, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadSh,1, OreDictionary.WILDCARD_VALUE), "#x", 'x', new ItemStack (jadeBlock), '#', new ItemStack (hammerWooden, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (jadeHeadHo,1, OreDictionary.WILDCARD_VALUE), new ItemStack (jadeBlock), new ItemStack (hammerWooden, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadAx,1, OreDictionary.WILDCARD_VALUE), " #", " x", 'x', new ItemStack (jadeBlock), '#', new ItemStack (hammerWooden, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadPi,1, OreDictionary.WILDCARD_VALUE),  " x","# ", 'x', new ItemStack (jadeBlock), '#', new ItemStack (hammerWooden, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2), new ItemStack (oreCopper), new ItemStack (hammerWooden, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustLead,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreLead), new ItemStack (hammerWooden, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustFerrous,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreFerrous), new ItemStack (hammerWooden, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkCopper), new ItemStack (hammerWooden, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustSilver,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreSilver), new ItemStack (hammerWooden, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTin,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreTin), new ItemStack (hammerWooden, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTungsten,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreTungsten), new ItemStack (hammerWooden, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreCopper), new ItemStack (hammerWooden, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(dustIron,2,OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.iron_ore), new ItemStack(hammerWooden, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustFlour,4, OreDictionary.WILDCARD_VALUE),new ItemStack(hammerWooden, 1,  OreDictionary.WILDCARD_VALUE),new ItemStack(Items.wheat));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCharcoal,4, OreDictionary.WILDCARD_VALUE),new ItemStack(hammerWooden, 1,  OreDictionary.WILDCARD_VALUE),new ItemStack(Items.coal,1,1));
		GameRegistry.addShapelessRecipe(new ItemStack (dustLead,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkLead), new ItemStack (hammerWooden, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustFerrous,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkFerrous), new ItemStack (hammerWooden, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustSilver,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkSilver), new ItemStack (hammerWooden, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTin,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkTin), new ItemStack (hammerWooden, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTungsten,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkTungsten), new ItemStack (hammerWooden, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkCopper), new ItemStack (hammerWooden, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (Blocks.sand,2, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.cobblestone), new ItemStack (hammerWooden, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustGold,2, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.gold_ore), new ItemStack (hammerWooden, 1,  OreDictionary.WILDCARD_VALUE));
		//Copper
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadSw,1, OreDictionary.WILDCARD_VALUE), " x", " #", 'x', new ItemStack (jadeBlock), '#', new ItemStack (hammerCopper, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadSh,1, OreDictionary.WILDCARD_VALUE), "#x", 'x', new ItemStack (jadeBlock), '#', new ItemStack (hammerCopper, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (jadeHeadHo,1, OreDictionary.WILDCARD_VALUE), new ItemStack (jadeBlock), new ItemStack (hammerCopper, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadAx,1, OreDictionary.WILDCARD_VALUE), " #", " x", 'x', new ItemStack (jadeBlock), '#', new ItemStack (hammerCopper, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadPi,1, OreDictionary.WILDCARD_VALUE),  " x","# ", 'x', new ItemStack (jadeBlock), '#', new ItemStack (hammerCopper, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2), new ItemStack (oreCopper), new ItemStack (hammerCopper, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustLead,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreLead), new ItemStack (hammerCopper, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustFerrous,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreFerrous), new ItemStack (hammerCopper, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustSilver,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreSilver), new ItemStack (hammerCopper, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTin,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreTin), new ItemStack (hammerCopper, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTungsten,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreTungsten), new ItemStack (hammerCopper, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreCopper), new ItemStack (hammerCopper, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(dustIron,2,OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.iron_ore), new ItemStack(hammerCopper, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustFlour,4, OreDictionary.WILDCARD_VALUE),new ItemStack(hammerCopper, 1,  OreDictionary.WILDCARD_VALUE),new ItemStack(Items.wheat));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCharcoal,4, OreDictionary.WILDCARD_VALUE),new ItemStack(hammerCopper, 1,  OreDictionary.WILDCARD_VALUE),new ItemStack(Items.coal,1,1));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkCopper), new ItemStack (hammerCopper, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustLead,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkLead), new ItemStack (hammerCopper, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustFerrous,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkFerrous), new ItemStack (hammerCopper, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustSilver,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkSilver), new ItemStack (hammerCopper, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTin,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkTin), new ItemStack (hammerCopper, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTungsten,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkTungsten), new ItemStack (hammerCopper, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkCopper), new ItemStack (hammerCopper, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (Blocks.sand,2, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.cobblestone), new ItemStack (hammerCopper, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustGold,2, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.gold_ore), new ItemStack (hammerCopper, 1,  OreDictionary.WILDCARD_VALUE));
		//silver
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadSw,1, OreDictionary.WILDCARD_VALUE), " x", " #", 'x', new ItemStack (jadeBlock), '#', new ItemStack (hammerSilver, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadSh,1, OreDictionary.WILDCARD_VALUE), "#x", 'x', new ItemStack (jadeBlock), '#', new ItemStack (hammerSilver, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (jadeHeadHo,1, OreDictionary.WILDCARD_VALUE), new ItemStack (jadeBlock), new ItemStack (hammerSilver, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadAx,1, OreDictionary.WILDCARD_VALUE), " #", " x", 'x', new ItemStack (jadeBlock), '#', new ItemStack (hammerSilver, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadPi,1, OreDictionary.WILDCARD_VALUE),  " x","# ", 'x', new ItemStack (jadeBlock), '#', new ItemStack (hammerSilver, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2), new ItemStack (oreCopper), new ItemStack (hammerSilver, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustLead,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreLead), new ItemStack (hammerSilver, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustFerrous,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreFerrous), new ItemStack (hammerSilver, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkCopper), new ItemStack (hammerSilver, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustSilver,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreSilver), new ItemStack (hammerSilver, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTin,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreTin), new ItemStack (hammerSilver, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTungsten,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreTungsten), new ItemStack (hammerSilver, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreCopper), new ItemStack (hammerSilver, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(dustIron,2,OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.iron_ore), new ItemStack(hammerSilver, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustFlour,4, OreDictionary.WILDCARD_VALUE),new ItemStack(hammerSilver, 1,  OreDictionary.WILDCARD_VALUE),new ItemStack(Items.wheat));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCharcoal,4, OreDictionary.WILDCARD_VALUE),new ItemStack(hammerSilver, 1,  OreDictionary.WILDCARD_VALUE),new ItemStack(Items.coal,1,1));
		GameRegistry.addShapelessRecipe(new ItemStack (dustLead,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkLead), new ItemStack (hammerSilver, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustFerrous,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkFerrous), new ItemStack (hammerSilver, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustSilver,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkSilver), new ItemStack (hammerSilver, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTin,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkTin), new ItemStack (hammerSilver, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTungsten,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkTungsten), new ItemStack (hammerSilver, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkCopper), new ItemStack (hammerSilver, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (Blocks.sand,2, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.cobblestone), new ItemStack (hammerSilver, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustGold,2, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.gold_ore), new ItemStack (hammerSilver, 1,  OreDictionary.WILDCARD_VALUE));
		//#addironhammer
		//Hammer Crafting
		GameRegistry.addShapelessRecipe(new ItemStack (stoneHammer), new ItemStack (stoneHamHead), new ItemStack (Items.stick));
		GameRegistry.addShapedRecipe(new ItemStack (stoneHamHead), "   ", "# #","###", '#', new ItemStack (Blocks.cobblestone));
    	GameRegistry.addShapelessRecipe(new ItemStack (hammerDiamond), new ItemStack (headDiamond), new ItemStack (Items.stick));
		GameRegistry.addShapedRecipe(new ItemStack (headDiamond), "   ", "# #","###", '#', new ItemStack (Items.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack (hammerJade), new ItemStack (headJade), new ItemStack (Items.stick));
		GameRegistry.addShapedRecipe(new ItemStack (headJade), "   ", "# #","###", '#', new ItemStack (RPCore.gemJadepure));
    	GameRegistry.addShapelessRecipe(new ItemStack (hammerNetherstar), new ItemStack (headNetherstar), new ItemStack (Items.stick));
		GameRegistry.addShapedRecipe(new ItemStack (headNetherstar), "   ", "# #","###", '#', new ItemStack (RPCore.ingotNetherstar));
		GameRegistry.addShapelessRecipe(new ItemStack (hammerSandstone), new ItemStack (headSandstone), new ItemStack (Items.stick));
		GameRegistry.addShapedRecipe(new ItemStack (headSandstone), "   ", "# #","###", '#', new ItemStack (Blocks.sandstone));
		GameRegistry.addShapelessRecipe(new ItemStack (hammerWooden), new ItemStack (headWooden), new ItemStack (Items.stick));
		GameRegistry.addShapedRecipe(new ItemStack (headWooden), "   ", "# #","###", '#', new ItemStack (Blocks.planks));
		GameRegistry.addShapelessRecipe(new ItemStack (hammerCopper), new ItemStack (headCopper), new ItemStack (Items.stick));
		GameRegistry.addShapedRecipe(new ItemStack (headCopper), "   ", "# #","###", '#', new ItemStack (RPCore.ingotCopper));
		GameRegistry.addShapelessRecipe(new ItemStack (hammerSilver), new ItemStack (headSilver), new ItemStack (Items.stick));
		GameRegistry.addShapedRecipe(new ItemStack (headSilver), "   ", "# #","###", '#', new ItemStack (RPCore.ingotSilver));
		//Hammer Crafting End
		//Caustic Crafting
		GameRegistry.addShapelessRecipe(new ItemStack(causticCorpuscles,2),new ItemStack(Items.rotten_flesh), new ItemStack(toolSkinning,1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack (toolSkinning,1), "# #", "# #"," # ", '#', new ItemStack (Items.iron_ingot));
		GameRegistry.addShapedRecipe(new ItemStack (bloodFirey,10),"f#f","#f#","f#f",'#', new ItemStack (Blocks.glass_pane), 'f', new ItemStack(causticMeal));
		GameRegistry.addShapelessRecipe(new ItemStack (acidSulfuric ,1),new ItemStack(causticCorpuscles), new ItemStack(Items.glass_bottle));
		GameRegistry.addShapelessRecipe(new ItemStack (causticMeal,2),new ItemStack(causticCorpuscles), new ItemStack(Items.dye,1,15));
		GameRegistry.addShapelessRecipe(new ItemStack (dustPN,1),new ItemStack(bloodFirey), new ItemStack(acidSulfuric));
		GameRegistry.addShapedRecipe(new ItemStack (Items.gunpowder,4),"###","#0#","###", '#', new ItemStack (RPCore.dustCharcoal),'0',new ItemStack(RPCore.dustPN));
		GameRegistry.addShapelessRecipe(new ItemStack (dustMagickcompound,2), new ItemStack(dustMagick), new ItemStack(Items.glowstone_dust), new ItemStack(Items.redstone));
		GameRegistry.addShapelessRecipe(new ItemStack(baconRaw,3, OreDictionary.WILDCARD_VALUE), new ItemStack (Items.porkchop), new ItemStack(knife, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (elderPlanks,5), new ItemStack (elderLog));
		GameRegistry.addShapelessRecipe(new ItemStack(dropMagick,4), new ItemStack (Items.water_bucket), new ItemStack (dustMagickcompound), new ItemStack(dustDiamond),new ItemStack (runePlate));
		GameRegistry.addShapelessRecipe(new ItemStack(dropBig,1), new ItemStack (dropMagick), new ItemStack(Items.dye,1,3));
		GameRegistry.addShapelessRecipe(new ItemStack(dropBounce,1),new ItemStack (dropMagick), new ItemStack(Items.dye,1,7));
		GameRegistry.addShapelessRecipe(new ItemStack(dropDeath,1),new ItemStack (dropMagick),new ItemStack(Items.dye));
		GameRegistry.addShapelessRecipe(new ItemStack(dropFly,1),new ItemStack (dropMagick),new ItemStack(Items.dye,1,11));
		GameRegistry.addShapelessRecipe(new ItemStack(dropLife,1),new ItemStack (dropMagick),new ItemStack(Items.dye,1,2));
		GameRegistry.addShapelessRecipe(new ItemStack(dropPoison,1),new ItemStack (dropMagick),new ItemStack(Items.dye,1,5));
		GameRegistry.addShapelessRecipe(new ItemStack(dropRock,1),new ItemStack (dropMagick),new ItemStack(Items.dye,1,8));
		GameRegistry.addShapelessRecipe(new ItemStack(dropSmall,1),new ItemStack (dropMagick),new ItemStack(Items.dye,1,5));
		GameRegistry.addShapelessRecipe(new ItemStack(dropSuper,1),new ItemStack (dropMagick),new ItemStack(Items.dye,1,9));
		GameRegistry.addShapelessRecipe(new ItemStack(megaCookie,4),new ItemStack(dropBig),new ItemStack(cookieSugar));
		GameRegistry.addShapelessRecipe(new ItemStack(ghostCookie,4),new ItemStack(dropDeath),new ItemStack(dropLife),new ItemStack(cookieSugar));
		GameRegistry.addShapelessRecipe(new ItemStack(poisonCookie,4),new ItemStack(dropDeath),new ItemStack(cookieSugar));
		GameRegistry.addShapelessRecipe(new ItemStack(miniCookie,4),new ItemStack(dropSmall),new ItemStack(cookieSugar));
		GameRegistry.addShapelessRecipe(new ItemStack(oneupCookie,4),new ItemStack(dropLife),new ItemStack(cookieSugar));
		GameRegistry.addShapelessRecipe(new ItemStack(springCookie,4),new ItemStack(dropBounce),new ItemStack(cookieSugar));
		GameRegistry.addShapelessRecipe(new ItemStack(propellerCookie,4),new ItemStack(dropFly),new ItemStack(cookieSugar));
		GameRegistry.addShapelessRecipe(new ItemStack(rockCookie,4),new ItemStack(dropRock),new ItemStack(cookieSugar));
		GameRegistry.addShapelessRecipe(new ItemStack(superCookie,4),new ItemStack(dropSuper),new ItemStack(cookieSugar));
		GameRegistry.addShapedRecipe(new ItemStack (cookieSugar,4),"   ","#0#","   ", '#', new ItemStack (RPCore.dustFlour),'0',new ItemStack(Items.sugar));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks), new ItemStack(elderPlanks));
		GameRegistry.addShapelessRecipe(new ItemStack(gemJadepure, 4), new ItemStack(jadeBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(ingotCopper, 9), new ItemStack(copperBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(ingotLead, 9), new ItemStack(leadBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(ingotFerrous, 9), new ItemStack(ferrousBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(ingotNetherstar, 9), new ItemStack(netherstarBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(gemDiamond, 9), new ItemStack(organizeddiamondBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(gemEmerald, 9), new ItemStack(organizedemeraldBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(ingotSilver, 9), new ItemStack(silverBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(ingotTin, 9), new ItemStack(tinBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(ingotTungsten, 9), new ItemStack(tungstenBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(TCAI, 9), new ItemStack(tungstencarbideBlock));

		GameRegistry.registerWorldGenerator(new RPWorldGen(), 1);

		GameRegistry.registerFuelHandler(new RPFuelHandler());

	}

}
