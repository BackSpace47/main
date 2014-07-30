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

import net.RPower.RPowermod.block.BlockTCAM;
import net.RPower.RPowermod.block.BlockoreAnthtracite;
import net.RPower.RPowermod.block.BlocksandTreated;
import net.RPower.RPowermod.block.ObsidianWhite;
import net.RPower.RPowermod.block.blockREBL;
import net.RPower.RPowermod.block.blockREBLo;
import net.RPower.RPowermod.block.blockREBS;
import net.RPower.RPowermod.block.blockRPBlock;
import net.RPower.RPowermod.block.blockRPBlockBSpace;
import net.RPower.RPowermod.block.blockRPOre;
import net.RPower.RPowermod.gui.GuiHandler;
import net.RPower.RPowermod.item.*;
import net.RPower.RPowermod.item.ItemHeadBspace;
import net.RPower.RPowermod.net.ItemFoodcreativeCookie;
import net.RPower.RPowermod.proxy.CommonProxy;
import net.RPower.RPowermod.tileentity.TileEntityalloySmelter;
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
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
@Mod(modid = RPCore.modid, name = "Mine Facility", version = "1.0.9")
public class RPCore {

	public static final String modid = "rpower";
	public static ToolMaterial jadeToolMaterial;



	@Instance(modid)
	public static RPCore instance;







	//Blocks
	/*
	To add a block first do these lines (public static Block <name of block>;) then inside preInit do (<name of block> = new Block<name of block>(Material.rock).setCreativeTab(CreativeTabs.tabBlock).setBlockName("<name of block whit capital leters and space if two or more words>").setBlockTextureName(modid + ":" + "<texture name of block>"); then under init do (Recipies.registerBlock(<name of block>, "<name of block whit capital leters and space if two or more words>");))
	*/

	//NOTE BACKSPACE CREATE STEELDUST, BRONZEDUST
	//ADD ZINK ORE & BRASSDUST

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


	//other
	public static Block TCAM;
	public static Block oreCrusher;
    public static Block sandTreated;

	//machines

	public static Block alloySmelterIdle;
	public static Block alloySmelterActive;
	public static final int guiIDalloySmelter = 0;


    //Trees & Plants
    public static Block elderSap;
    public static Block elderLeaf;
    public static Block elderLog;
    public static Block elderPlanks;
    public static Block blueStabilizer;
    public static Block polymer;
    public static Block polymerWoven;
    //Caustic Items

    public static Item causticMeal;
    public static Item causticCorpuscles;
    public static Item bloodFirey;
    public static Item acidSulfuric;
    public static Item dustPN;
    public static Item dustCharcoal;
    public static Item toolSkinning;

    //Food

    public static Item megaCookie;
    public static Item ghostCookie;
    public static Item testCookie;
    public static Item poisonCookie;
    public static Item miniCookie;
    public static Item oneupCookie;
    public static Item springCookie;
    public static Item propellerCookie;
    public static Item rockCookie;
    public static Item superCookie;
    public static Item baconRaw;
    public static Item baconCooked;
    public static Item knife;
    public static Item dustSugar;

	//Items
	/*
	To add a item first do these lines (public static Item <name of item>;) then inside preInit do (<name of item> = new Item<name of item>().setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("<name of item whit capital leters and space if two or more words>").setTextureName(modid + ":" + "<texture name of item>"); then under init do (Recipies.registerItem(<name of item>, "<name of item whit capital leters and space if two or more words>");))
	*/
	public static Item gemJade;
	public static Item gemJadepure;
    public static Item ingotTungsten;
    public static Item ingotTungstencarbide;
    public static Item ingotCopper;
    public static Item gemDiamond;
    public static Item gemEmerald;
    public static Item ingotFerrous;
    public static Item ingotLead;
    public static Item ingotNetherstar;
    public static Item ingotSilver;
    public static Item ingotTin;
    public static Item ingotSteel;
    public static Item ingotBronze;
    public static Item ingotBrass;
    public static Item ingotZink;
    public static Item magnusCookie;



    //Chunks


    public static Item chunkTungsten;
    public static Item chunkCopper;
    public static Item chunkFerrous;
    public static Item chunkLead;
    public static Item chunkSilver;
    public static Item chunkTin;

    //Dust
    public static Item dustNetherstar;
    public static Item dustCopper;
    public static Item dustDiamond;
    public static Item dustEmerald;
    public static Item dustFerrous;
    public static Item dustGold;
    public static Item dustIron;
    public static Item dustLead;
    public static Item dustSilver;
    public static Item dustTin;
    public static Item dustTungsten;
    public static Item dustBronze;
    public static Item dustSteel;

    //random
    public static Item amuletofprotestas;


    //Electronic Parts


    //Capacitor
    public static Item foil;
    public static Item foilAluminumoxide;
    public static Item paperElectrolized;
    //parts^^

    public static Item capacitorBasic;
    public static Item capacitorCopper;
    public static Item capacitorDiamond;
    public static Item capacitorGold;
    public static Item capacitorTungstencarbide;

    //Diode
    public static Item anvilPostassembly;
    public static Item Epoxy;
    public static Item lenseReflective;
    //parts^^

    public static Item diode;

    //Resistor
    public static Item clayTreated;
    public static Item clayTreatedbaked;
    public static Item coiledNichrome;
    //^^parts

    public static Item resistorCase;
    public static Item resistorBasic;
    public static Item resistorCopper;
    public static Item resistorDiamond;
    public static Item resistorGold;
    public static Item resistorIron;
    public static Item resistorTungstencarbide;

    //Transistors


    public static Item kitTransistor;
    //Parts^^

    public static Item transistorBasic;
    public static Item transistorCopper;
    public static Item transistorDiamond;
    public static Item transistorGold;
    public static Item transistorIron;
    public static Item transistorTungstencarbide;

    //Protosprays

    public static Item protopaintCopper;
    public static Item protopaintDiamond;
    public static Item protopaintGold;
    public static Item protopaintTungstencarbide;


    //Runes
    public static Item runeAir;
    public static Item runeEarth;
    public static Item runeFire;
    public static Item runePlate;
    public static Item runeSpirit;
    public static Item runeWater;
    public static Item dustMagick;
    public static Item dustMagickcompound;

    //Stuff

    public static Item glue;
    public static Item tcbar;
    public static Item TCAI;
    public static Item jadeSword;
    public static Item jadeHoe;
    public static Item jadeAxe;
    public static Item jadePickaxe;
    public static Item jadeShovel;
    public static Item anthracite;
    public static Item jadeHeadSw;
    public static Item jadeHeadSh;
    public static Item jadeHeadAx;
    public static Item jadeHeadHo;
    public static Item jadeHeadPi;
    public static Item tungstenCarbideHead;
    public static Item tungstenCarbideHammer;
    public static Item stoneHammer;
    public static Item stoneHamHead;
    public static Item sandPaper;
	public static Item mortar_and_pestle;
    public static Item quartzStick;
    public static Item quartzBowl;
    public static Item dustFlour;
    public static Item cookieSugar;
    public static Item Pencil;
    public static Item blankScroll;
    public static Item scrollCircle;
    public static Item oilTreatment;





    //Gears/Cog
    public static Item mouldCog;

    //unfired
    public static Item cogUnfiredcopper;
    public static Item cogUnfireddiamond;
    public static Item cogUnfiredgold;
    public static Item cogUnfirediron;
    public static Item cogUnfiredtungstencarbide;


    //fiered
    public static Item cogCopper;
    public static Item cogDiamond;
    public static Item cogGold;
    public static Item cogIron;
    public static Item cogTungstencarbide;










    //Drops
    public static Item dropBig;
    public static Item dropBounce;
    public static Item dropDeath;
    public static Item dropFly;
    public static Item dropLife;
    public static Item dropMagick;
    public static Item dropPoison;
    public static Item dropRock;
    public static Item dropSmall;
    public static Item dropSuper;




    //Plants

    public static Item yellowLeaf;







    //Tool Heads
    public static Item headDiamond;
    public static Item headJade;
    public static Item headNetherstar;
    public static Item headSandstone;
    public static Item headWooden;
    public static Item headCopper;
    public static Item headSilver;

    //Tools
    public static Item hammerDiamond;
    public static Item hammerJade;
    public static Item hammerNetherstar;
    public static Item hammerSandstone;
    public static Item hammerWooden;
    public static Item hammerCopper;
    public static Item hammerSilver;

    //Rtools
    public static Item axeJadeR;
    public static Item hoeJadeR;
    public static Item pickaxeJadeR;
    public static Item shovelJadeR;
    public static Item swordJadeR;

    //Handle Modifiers
    public static Item handleTCA;
    public static Item handleTCASword;








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
		 */
		jadeToolMaterial = EnumHelper.addToolMaterial("JADE", 4, 35, 16F, 7F, 50);



		//Blocks----------


		//Ores
		oreExp = new blockRPOreExp(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("Exp Ore").setBlockTextureName(modid + ":" + "exp_ore").setHardness(5F).setResistance(1F);
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

		//
		sandTreated = new BlocksandTreated(Material.rock).setCreativeTab(RPCoreITab).setBlockName("Treated Sand").setBlockTextureName(modid + ":" + "sandTreated").setHardness(50F).setResistance(5F);



		//Alloys
		TCAM = new BlockTCAM(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("TCAM").setBlockTextureName(modid + ":" + "TCAM").setHardness(50F).setResistance(5F);


		//Machines
		oreCrusher = new BlockoreCrusher(false).setCreativeTab(RPCoreBTab).setBlockName("Ore Crusher").setHardness(50F).setResistance(5F);

		alloySmelterIdle = new alloySmelter(false).setCreativeTab(RPCoreBTab).setBlockName("alloySmelterIdle");
		alloySmelterActive = new alloySmelter(true).setBlockName("alloySmelterActive").setLightLevel(0.625F);







		//Woods & Planks & Trees
		elderLog = new blockREBLo().setBlockName("Red Elderberry Log").setHardness(1.5F).setResistance(1F).setStepSound(Block.soundTypeWood).setCreativeTab(RPCoreBTab).setBlockTextureName("log");
		elderLeaf = new blockREBL(Material.leaves).setBlockName("Red Elderberry Leaves").setHardness(0.5F).setStepSound(Block.soundTypeGrass).setCreativeTab(RPCoreBTab).setBlockTextureName(modid + ":" + "leaves_redelderberry");
		elderSap = new blockREBS().setBlockName("Red Elderberry Sapling").setHardness(0.0F).setCreativeTab(RPCoreBTab).setStepSound(Block.soundTypeGrass).setBlockTextureName(modid + ":" + "elderSap").setBlockTextureName("sapling");
		elderPlanks = new blockRPBlock(Material.wood).setCreativeTab(RPCoreBTab).setBlockName("Elder Planks").setBlockTextureName(modid + ":" + "planks_redelderberry").setHardness(1.5F).setStepSound(Block.soundTypeWood).setResistance(0.5F);

		polymer = new blockRPBlock(Material.glass).setCreativeTab(RPCoreBTab).setStepSound(Block.soundTypeGrass).setBlockName("Polymer").setBlockTextureName(modid + ":" + "polymer").setHardness(0.5F).setResistance(1F);
		polymerWoven = new blockRPBlock(Material.glass).setCreativeTab(RPCoreBTab).setStepSound(Block.soundTypeGrass).setBlockName("Woven Polyester").setBlockTextureName(modid + ":" + "woven_polyester").setHardness(0.5F).setResistance(0.5F);



	//WIP	//blueStabilizer =new Plants(Material.plants).setBlockName("Blue Stabilizer").setHardness(0.0F).setCreativeTab(RPCoreBTab).setBlockTextureName(modid + ":" + "flowerBlue").setBlockTextureName("flowerB");

		//Blocks End----------





		//Caustic Items

			causticMeal = new itemmealCaustic().setUnlocalizedName("Caustic Mix").setTextureName(modid + ":" + "mealCaustic").setCreativeTab(RPCoreITab);
		    causticCorpuscles = new itemcorpCaustic().setUnlocalizedName("Caustic Corpuscles").setTextureName(modid + ":" + "corpusclesCaustic").setCreativeTab(RPCoreITab);
		    bloodFirey = new itembloodFirey().setUnlocalizedName("Firey Blood").setTextureName(modid + ":" + "bloodFirey").setCreativeTab(RPCoreITab);
		    acidSulfuric = new itemacidS().setUnlocalizedName("Sulfuric Acid").setTextureName(modid + ":" + "SulfuricAcid").setCreativeTab(RPCoreITab);
		    dustPN = new itemDustPN().setUnlocalizedName("Potassium Nitrate").setTextureName(modid + ":" + "PotassiumNitrate").setCreativeTab(RPCoreITab);
		    dustCharcoal = new itemdustCharcoal().setUnlocalizedName("Charcoal Dust").setTextureName(modid + ":" + "dustCharcoal").setCreativeTab(RPCoreITab);
		    toolSkinning = new itemSkinningtool().setUnlocalizedName("Skinning Tool").setTextureName(modid + ":" + "toolSkinning").setCreativeTab(RPCoreITab);



		//

		  //Capacitor
		    foil = new itemFoil().setUnlocalizedName("Foil").setTextureName(modid + ":" + "Foil").setCreativeTab(RPCoreITab);
		    foilAluminumoxide = new itemFoilaluminumoxide().setUnlocalizedName("Aluminum Oxide Foil").setTextureName(modid + ":" + "foilAluminumoxide").setCreativeTab(RPCoreITab);
		    paperElectrolized = new itempaperElectrolized().setUnlocalizedName("Electrolized Paper").setTextureName(modid + ":" + "paperElectrolized").setCreativeTab(RPCoreITab);
		    capacitorBasic = new itemmcapacitorBasic().setUnlocalizedName("Basic Capacitor").setTextureName(modid + ":" + "capacitorBasic").setCreativeTab(RPCoreITab);
		    capacitorCopper = new itemcapacitorCopper().setUnlocalizedName("Copper Capacitor").setTextureName(modid + ":" + "capacitorCopper").setCreativeTab(RPCoreITab);
		    capacitorDiamond = new itemcapacitorDiamond().setUnlocalizedName("Diamond Capacitor").setTextureName(modid + ":" + "capacitorDiamond").setCreativeTab(RPCoreITab);
		    capacitorGold = new itemcapacitorGold().setUnlocalizedName("Gold Capacitor").setTextureName(modid + ":" + "capacitorGold").setCreativeTab(RPCoreITab);
		    capacitorTungstencarbide = new itemcapacitorTungstencarbide().setUnlocalizedName("Tungstencarbide Capacitor").setTextureName(modid + ":" + "capacitorTungstencarbide").setCreativeTab(RPCoreITab);






		    //Diode

		    anvilPostassembly = new itemanvilPostassembly().setUnlocalizedName("Postassembly Anvil").setTextureName(modid + ":" + "anvilPostAssembaly").setCreativeTab(RPCoreITab);
		    Epoxy = new itemEpoxy().setUnlocalizedName("Epoxy").setTextureName(modid + ":" + "Epoxy").setCreativeTab(RPCoreITab);
		    lenseReflective = new itemlenseReflective().setUnlocalizedName("Reflective Lense").setTextureName(modid + ":" + "lenseReflective").setCreativeTab(RPCoreITab);
		    diode = new itemdiode().setUnlocalizedName("Diode").setTextureName(modid + ":" + "Diode").setCreativeTab(RPCoreITab);









		    //Resistor
		    clayTreated = new itemclayTreated().setUnlocalizedName("Treated Clay").setTextureName(modid + ":" + "clayTreated").setCreativeTab(RPCoreITab);
		    clayTreatedbaked = new itemclayTreatedbaked().setUnlocalizedName("Baked Treated Clay").setTextureName(modid + ":" + "clayTreatedbaked").setCreativeTab(RPCoreITab);
		    coiledNichrome = new itemcoiledNichrome().setUnlocalizedName("Coiled Nichrome").setTextureName(modid + ":" + "coiledNichrome").setCreativeTab(RPCoreITab);

		    resistorCase = new itemresistorCase().setUnlocalizedName("Resistor Case").setTextureName(modid + ":" + "resistorCase").setCreativeTab(RPCoreITab);
		    resistorBasic = new itemresistorBasic().setUnlocalizedName("Basic Resistor").setTextureName(modid + ":" + "resistorBasic").setCreativeTab(RPCoreITab);
		    resistorCopper = new itemresistorCopper().setUnlocalizedName("Copper Resistor").setTextureName(modid + ":" + "resistorCopper").setCreativeTab(RPCoreITab);
		    resistorDiamond = new itemresistorDiamond().setUnlocalizedName("Diamond Resistor").setTextureName(modid + ":" + "resistorDiamond").setCreativeTab(RPCoreITab);
		    resistorGold = new itemresistorGold().setUnlocalizedName("Gold Resistor").setTextureName(modid + ":" + "resistorGold").setCreativeTab(RPCoreITab);
		    resistorIron = new itemresistorIron().setUnlocalizedName("Iron Resistor").setTextureName(modid + ":" + "resistorIron").setCreativeTab(RPCoreITab);
		    resistorTungstencarbide = new itemresistorTungstencarbide().setUnlocalizedName("Tungsten Carbide Resistor").setTextureName(modid + ":" + "resistorTungstencarbide").setCreativeTab(RPCoreITab);


		    //Transistors


		    //public static Item kitTransistor;
		    //Parts^^

		    //public static Item transistorBasic;
		    //public static Item transistorCopper;
		    //public static Item transistorDiamond;
		    //public static Item transistorGold;
		    //public static Item transistorIron;
		    //public static Item transistorTungstencarbide;

		    //Protosprays

		    protopaintCopper = new itemprotopaintCopper().setUnlocalizedName("Next Gen Copper ProtoSpray").setTextureName(modid + ":" + "protopaintCopper").setCreativeTab(RPCoreITab);
		    protopaintDiamond = new itemprotopaintDiamond().setUnlocalizedName("Next Gen Diamond ProtoSpray").setTextureName(modid + ":" + "protopaintDiamond").setCreativeTab(RPCoreITab);
		    protopaintGold = new itemprotopaintGold().setUnlocalizedName("Next Gen Gold ProtoSpray").setTextureName(modid + ":" + "protopaintGold").setCreativeTab(RPCoreITab);
		    protopaintTungstencarbide = new itemprotopaintTungstencarbide().setUnlocalizedName("Next Gen Tungsten Carbide ProtoSpray").setTextureName(modid + ":" + "protopaintTungstencarbide").setCreativeTab(RPCoreITab);















		//Tools->Hammers
		hammerDiamond = new hammerDiamond().setUnlocalizedName("Diamond Hammer").setTextureName(modid + ":" + "hammerDiamond").setCreativeTab(RPCoreITab);
		hammerJade = new hammerJade().setUnlocalizedName("Jade Hammer Head").setTextureName(modid + ":" + "hammerJade").setCreativeTab(RPCoreITab);
		hammerNetherstar = new hammerNetherstar().setUnlocalizedName("Netherstar Hammer").setTextureName(modid + ":" + "hammerNetherstar").setCreativeTab(RPCoreITab);
		hammerSandstone = new hammerSandstone().setUnlocalizedName("Sandstone Hammer").setTextureName(modid + ":" + "hammerSandstone").setCreativeTab(RPCoreITab);
		hammerWooden = new hammerWooden().setUnlocalizedName("Wooden Hammer").setTextureName(modid + ":" + "hammerWooden").setCreativeTab(RPCoreITab);
		hammerCopper = new hammerCopper().setUnlocalizedName("Copper Hammer").setTextureName(modid + ":" + "hammerCopper").setCreativeTab(RPCoreITab);
		hammerSilver = new hammerSilver().setUnlocalizedName("Silver Hammer").setTextureName(modid + ":" + "hammerSilver").setCreativeTab(RPCoreITab);
		stoneHammer = new hammerStone().setUnlocalizedName("Stone Hammer").setTextureName(modid + ":" + "Stone_Hammer");
		tungstenCarbideHammer = new ItemHeadBspace().setUnlocalizedName("TungstenCarbideHammer").setTextureName(modid + ":" + "TugstenCarbide_Hammer").setNoRepair();

		//Tools->Mining
		jadeSword = new ItemJadeSword(RPCore.jadeToolMaterial).setMaxDamage(125).setNoRepair().setCreativeTab(RPCoreITab).setUnlocalizedName("Jade Sword").setTextureName(modid + ":" + "jade_Sword");
        jadeHoe = new ItemJadeHoe(RPCore.jadeToolMaterial).setMaxDamage(125).setNoRepair().setCreativeTab(RPCoreITab).setUnlocalizedName("Jade Hoe").setTextureName(modid + ":" + "jade_hoe");
        jadeAxe = new ItemJadeAxe(RPCore.jadeToolMaterial).setMaxDamage(125).setNoRepair().setCreativeTab(RPCoreITab).setUnlocalizedName("Jade Axe").setTextureName(modid + ":" + "jade_axe");
        jadePickaxe = new ItemJadePickaxe(RPCore.jadeToolMaterial).setMaxDamage(125).setNoRepair().setCreativeTab(RPCoreITab).setUnlocalizedName("Jade Pickaxe").setTextureName(modid + ":" + "jade_pickaxe");
        jadeShovel = new ItemJadeSpade(RPCore.jadeToolMaterial).setMaxDamage(125).setNoRepair().setCreativeTab(RPCoreITab).setUnlocalizedName("Jade Shovel").setTextureName(modid + ":" + "jade_shovel");





		//Tool Heads

		headDiamond = new ItemHead().setUnlocalizedName("Diamond Hammer Head").setTextureName(modid + ":" + "headDiamond").setCreativeTab(RPCoreITab);
		headJade = new ItemHead().setUnlocalizedName("Jade Hammer Head").setTextureName(modid + ":" + "headJade").setCreativeTab(RPCoreITab);
		headNetherstar = new ItemHead().setUnlocalizedName("Netherstar Hammer Head").setTextureName(modid + ":" + "headNetherstar").setCreativeTab(RPCoreITab);
		headSandstone = new ItemHead().setUnlocalizedName("Sandstone Hammer Head").setTextureName(modid + ":" + "headSandstone").setCreativeTab(RPCoreITab);
		headWooden = new ItemHead().setUnlocalizedName("Wooden Hammer Head").setTextureName(modid + ":" + "headWooden").setCreativeTab(RPCoreITab);
		headCopper = new ItemHead().setUnlocalizedName("Copper Hammer Head").setTextureName(modid + ":" + "headCopper").setCreativeTab(RPCoreITab);
		headSilver = new ItemHead().setUnlocalizedName("Silver Hammer Head").setTextureName(modid + ":" + "headSilver").setCreativeTab(RPCoreITab);
		tungstenCarbideHead = new ItemHead().setUnlocalizedName("TungstenCarbideHead").setTextureName(modid + ":" + "TugstenCarbide_Hammer_Head");
        stoneHamHead = new ItemHead().setUnlocalizedName("Stone Hammer Head").setTextureName(modid + ":" + "HammerHead");



		jadeHeadSw = new ItemHead().setUnlocalizedName("JadeSwordHead").setTextureName(modid + ":" + "JadeSwordHead");
        jadeHeadSh = new ItemHead().setUnlocalizedName("JadeShovHead").setTextureName(modid + ":" + "JadeShovHead");
        jadeHeadAx = new ItemHead().setUnlocalizedName("JadeAxeHead").setTextureName(modid + ":" + "JadeAxeHead");
        jadeHeadHo = new ItemHead().setUnlocalizedName("JadeHoeHead").setTextureName(modid + ":" + "JadeHoeHead");
        jadeHeadPi = new ItemHead().setUnlocalizedName("JadePickHead").setTextureName(modid + ":" + "JadePickHead");



		//Tool Handle Modifiers





		//Dusts
		dustNetherstar = new ItemNetherstarDust().setCreativeTab(RPCoreITab).setUnlocalizedName("Netherstar Dust").setTextureName(modid + ":" + "Netherstar_Dust");
		dustCopper = new ItemCopperDust().setCreativeTab(RPCoreITab).setUnlocalizedName("Copper Dust").setTextureName(modid + ":" + "Copper_Dust");
		dustDiamond = new ItemDiamondDust().setCreativeTab(RPCoreITab).setUnlocalizedName("Diamond Dust").setTextureName(modid + ":" + "Diamond_Dust");
		dustEmerald = new ItemEmeraldDust().setCreativeTab(RPCoreITab).setUnlocalizedName("Emerald Dust").setTextureName(modid + ":" + "Emerald_Dust");
		dustFerrous = new ItemFerrousDust().setCreativeTab(RPCoreITab).setUnlocalizedName("Ferrous Dust").setTextureName(modid + ":" + "Ferrous_Dust");
		dustGold = new ItemGoldDust().setCreativeTab(RPCoreITab).setUnlocalizedName("Gold Dust").setTextureName(modid + ":" + "Gold_Dust");
		dustIron = new ItemIronDust().setCreativeTab(RPCoreITab).setUnlocalizedName("Iron Dust").setTextureName(modid + ":" + "Iron_Dust");
		dustLead = new ItemLeadDust().setCreativeTab(RPCoreITab).setUnlocalizedName("Lead Dust").setTextureName(modid + ":" + "Lead_Dust");
		dustSilver = new ItemSilverDust().setCreativeTab(RPCoreITab).setUnlocalizedName("Silver Dust").setTextureName(modid + ":" + "Silver_Dust");
		dustTungsten = new ItemTugstenDust().setCreativeTab(RPCoreITab).setUnlocalizedName("Tungsten Dust").setTextureName(modid + ":" + "Tugsten_Dust");
		dustTin = new ItemTinDust().setCreativeTab(RPCoreITab).setUnlocalizedName("Tin Dust").setTextureName(modid + ":" + "Tin_Dust");
		dustBronze =new ItemBronzeDust().setCreativeTab(RPCoreITab).setUnlocalizedName("Bronze Dust").setTextureName(modid + ":" + "bronze_dust");
		dustSteel =	new ItemSteelDust().setCreativeTab(RPCoreITab).setUnlocalizedName("Steel Dust").setTextureName(modid + ":" + "steel_dust");


		//Ingots
		ingotCopper = new ItemCopperIngot().setCreativeTab(RPCoreITab).setUnlocalizedName("Copper Ingot").setTextureName(modid + ":" + "copper_ingot");
		ingotFerrous = new ItemFerrousIngot().setCreativeTab(RPCoreITab).setUnlocalizedName("Ferrous Ingot").setTextureName(modid + ":" + "ferrous_ingot");
		ingotLead = new ItemLeadIngot().setCreativeTab(RPCoreITab).setUnlocalizedName("Lead Ingot").setTextureName(modid + ":" + "lead_ingot");
		ingotNetherstar = new ItemNetherstarIngot().setCreativeTab(RPCoreITab).setUnlocalizedName("Nether Star Ingot").setTextureName(modid + ":" + "netherstar_ingot");
		ingotSilver = new ItemSilverIngot().setCreativeTab(RPCoreITab).setUnlocalizedName("Silver Ingot").setTextureName(modid + ":" + "silver_ingot");
		ingotTin = new ItemTinIngot().setCreativeTab(RPCoreITab).setUnlocalizedName("Tin Ingot").setTextureName(modid + ":" + "tin_ingot");
		ingotTungsten = new ItemTungstenIngot().setCreativeTab(RPCoreITab).setUnlocalizedName("Tungsten Ingot").setTextureName(modid + ":" + "tungsten_ingot");
        ingotTungstencarbide = new ItemTungstencarbideIngot().setCreativeTab(RPCoreITab).setUnlocalizedName("Tungstencarbide Ingot").setTextureName(modid + ":" + "tungsten_carbide_ingot");
        ingotSteel = new ItemingotSteel().setCreativeTab(RPCoreITab).setUnlocalizedName("Steel Ingot").setTextureName(modid + ":" + "steel_ingot");
        ingotBronze = new ItemingotBronze().setCreativeTab(RPCoreITab).setUnlocalizedName("Bronze Ingot").setTextureName(modid + ":" + "bronze_ingot");
        TCAI = new ItemTCAI().setCreativeTab(RPCoreITab).setUnlocalizedName("TCAI").setTextureName(modid + ":" + "TCAI");




		//Gems
		gemDiamond = new ItemDiamondIngot().setCreativeTab(RPCoreITab).setUnlocalizedName("Diamond Ingot").setTextureName(modid + ":" + "diamond_ingot");
		gemEmerald = new ItemEmeraldIngot().setCreativeTab(RPCoreITab).setUnlocalizedName("Emerald Ingot").setTextureName(modid + ":" + "emerald_ingot");
		gemJade = new ItemJade().setCreativeTab(RPCoreITab).setUnlocalizedName("Raw Jade").setTextureName(modid + ":" + "jade_refined");
		gemJadepure = new ItemJade().setCreativeTab(RPCoreITab).setUnlocalizedName("Jade").setTextureName(modid + ":" + "Jade");

		//Fuel
		anthracite = new ItemAnthracite().setCreativeTab(RPCoreITab).setUnlocalizedName("Anthracite").setTextureName(modid + ":" + "Anthracite");


		//Misc
		sandPaper = new ItemsandPaper().setCreativeTab(RPCoreITab).setUnlocalizedName("Sand Paper").setTextureName(modid + ":" + "SandPaper");
        mortar_and_pestle = new Itemmortar_and_pestle().setCreativeTab(RPCoreITab).setUnlocalizedName("Mortar and Pestle").setTextureName(modid + ":" + "mp");
        quartzStick = new ItemquartcStick().setCreativeTab(RPCoreITab).setUnlocalizedName("Quartz Stick").setTextureName(modid + ":" + "quartzStick");
        quartzBowl = new ItemquartcBowl().setCreativeTab(RPCoreITab).setUnlocalizedName("Quartz Bowl").setTextureName(modid + ":" + "quartzBowl");
        dustFlour = new ItemdustFlour().setCreativeTab(RPCoreITab).setUnlocalizedName("Bag of Flour").setTextureName(modid + ":" + "Flour");
		Pencil = new itemPencil().setCreativeTab(RPCoreITab).setUnlocalizedName("Pencil").setTextureName(modid + ":" + "Pencil");
		blankScroll = new ItemblankScroll().setCreativeTab(RPCoreITab).setUnlocalizedName("Blank Scroll").setTextureName(modid + ":" + "scrollBlank");
		scrollCircle = new ItemscrollCircle().setCreativeTab(RPCoreITab).setUnlocalizedName("Circle Scroll").setTextureName(modid + ":" + "scrollCircle");
		oilTreatment = new ItemoilTreatment().setCreativeTab(RPCoreITab).setUnlocalizedName("Treatment Oil").setTextureName(modid + ":" + "oilTreatment");
		mouldCog = new ItemmouldCog().setCreativeTab(RPCoreITab).setUnlocalizedName("Cog Mould").setTextureName(modid + ":" + "mouldCog");


        //gears

		cogUnfiredcopper = new ItemcogUnfiredcopper().setCreativeTab(RPCoreITab).setUnlocalizedName("UnfiredcopperCog").setTextureName(modid + ":" + "cogUnfiredcopper");
		cogUnfireddiamond = new ItemcogUnfireddiamond().setCreativeTab(RPCoreITab).setUnlocalizedName("UnfireddiamondCog").setTextureName(modid + ":" + "cogUnfireddiamond");
		cogUnfiredgold = new ItemcogUnfiredgold().setCreativeTab(RPCoreITab).setUnlocalizedName("UnfiredgoldCog").setTextureName(modid + ":" + "cogUnfiredgold");
		cogUnfirediron = new ItemcogUnfirediron().setCreativeTab(RPCoreITab).setUnlocalizedName("UnfiredironCog").setTextureName(modid + ":" + "cogUnfirediron");
		cogUnfiredtungstencarbide = new ItemcogUnfiredtungstencarbide().setCreativeTab(RPCoreITab).setUnlocalizedName("UnfiredtungstencarbideCog").setTextureName(modid + ":" + "cogUnfiredtungstencarbide");

		//fiered

		cogCopper = new cogcopper().setCreativeTab(RPCoreITab).setUnlocalizedName("CopperCog").setTextureName(modid + ":" + "cogCopper");
		cogDiamond = new cogdiamond().setCreativeTab(RPCoreITab).setUnlocalizedName("DiamondCog").setTextureName(modid + ":" + "cogDiamond");
		cogGold = new cogGold().setCreativeTab(RPCoreITab).setUnlocalizedName("GoldCog").setTextureName(modid + ":" + "cogGold");
		cogIron = new cogIron().setCreativeTab(RPCoreITab).setUnlocalizedName("IronCog").setTextureName(modid + ":" + "cogIron");
		cogTungstencarbide = new cogTungstencarbide().setCreativeTab(RPCoreITab).setUnlocalizedName("TungstencarbideCog").setTextureName(modid + ":" + "cogTungstencarbide");









        //public static Item ingotSteel;
        //public static Item ingotBronze;

        //^^ Priority


        //public static Item ingotBrass;
        //public static Item ingotZink;;   <----OreGen REMEMBER


        //^^meh

        //Chunks
        chunkCopper = new chunkCopper().setCreativeTab(RPCoreITab).setUnlocalizedName("Copper Chunk").setTextureName(modid + ":" + "Copper_Chunk");
        chunkTungsten = new chunkCopper().setCreativeTab(RPCoreITab).setUnlocalizedName("Tungsten Chunk").setTextureName(modid + ":" + "Tungsten_Chunk");
        chunkSilver = new chunkCopper().setCreativeTab(RPCoreITab).setUnlocalizedName("Silver Chunk").setTextureName(modid + ":" + "Silver_Chunk");
        chunkLead = new chunkCopper().setCreativeTab(RPCoreITab).setUnlocalizedName("Lead Chunk").setTextureName(modid + ":" + "Lead_Chunk");
        chunkTin = new chunkCopper().setCreativeTab(RPCoreITab).setUnlocalizedName("Tin Chunk").setTextureName(modid + ":" + "Tin_Chunk");
        chunkFerrous = new chunkCopper().setCreativeTab(RPCoreITab).setUnlocalizedName("Ferrous Chunk").setTextureName(modid + ":" + "Ferrous_Chunk");


        //Magic
        dustMagick = new dustMagick().setCreativeTab(RPCoreITab).setUnlocalizedName("Magick Dust").setTextureName(modid + ":" + "magick_dust");
        dustMagickcompound = new dustMagickcompound().setCreativeTab(RPCoreITab).setUnlocalizedName("Magick Compound").setTextureName(modid + ":" + "magick_compound");
        dropBig = new dropBig().setCreativeTab(RPCoreITab).setUnlocalizedName("Big Drop").setTextureName(modid + ":" + "big_drop");
        dropBounce = new dropBounce().setCreativeTab(RPCoreITab).setUnlocalizedName("Bounce Drop").setTextureName(modid + ":" + "bounce_drop");
        dropDeath = new dropDeath().setCreativeTab(RPCoreITab).setUnlocalizedName("Death Drop").setTextureName(modid + ":" + "death_drop");
        dropFly = new dropFly().setCreativeTab(RPCoreITab).setUnlocalizedName("Fly Drop").setTextureName(modid + ":" + "fly_drop");
        dropLife = new dropLife().setCreativeTab(RPCoreITab).setUnlocalizedName("Life Drop").setTextureName(modid + ":" + "life_drop");
        dropMagick = new dropMagick().setCreativeTab(RPCoreITab).setUnlocalizedName("Magick Drop").setTextureName(modid + ":" + "magick_drop");
        dropPoison = new dropPoisen().setCreativeTab(RPCoreITab).setUnlocalizedName("Poison Drop").setTextureName(modid + ":" + "poison_drop");
        dropRock = new dropRock().setCreativeTab(RPCoreITab).setUnlocalizedName("Rock Drop").setTextureName(modid + ":" + "rock_drop");
        dropSmall = new dropSmall().setCreativeTab(RPCoreITab).setUnlocalizedName("Small Drop").setTextureName(modid + ":" + "small_drop");
        dropSuper = new dropSuper().setCreativeTab(RPCoreITab).setUnlocalizedName("Super Drop").setTextureName(modid + ":" + "super_drop");




        //Runes
        runeFire= new runeFire().setCreativeTab(RPCoreITab).setUnlocalizedName("Fire Rune").setTextureName(modid + ":" + "Fire Rune");
        runeEarth= new runeEarth().setCreativeTab(RPCoreITab).setUnlocalizedName("Earth Rune").setTextureName(modid + ":" + "Earth Rune");
        runeAir= new runeAir().setCreativeTab(RPCoreITab).setUnlocalizedName("Air Rune").setTextureName(modid + ":" + "Air Rune");
        runePlate= new runePlate().setCreativeTab(RPCoreITab).setUnlocalizedName("Runeic Plate").setTextureName(modid + ":" + "runicPlate");
        runeSpirit= new runeSpirit().setCreativeTab(RPCoreITab).setUnlocalizedName("Spirit Rune").setTextureName(modid + ":" + "Spirit Rune");
        runeWater= new runeWater().setCreativeTab(RPCoreITab).setUnlocalizedName("Water Rune").setTextureName(modid + ":" + "Water Rune");



        //Food
		megaCookie = new ItemFoodmegaCookie(16, 1, true).setCreativeTab(RPCoreITab).setUnlocalizedName("Mega Cookie").setTextureName(modid + ":" + "Megacookie");
		ghostCookie = new ItemFoodghostCookie(8, 1, true).setCreativeTab(RPCoreITab).setUnlocalizedName("Ghost Cookie").setTextureName(modid + ":" + "Ghostcookie");
		poisonCookie = new ItemFoodpoisonCookie(-10, 1, true).setCreativeTab(RPCoreITab).setUnlocalizedName("Poison Cookie").setTextureName(modid + ":" + "Poisoncookie");
		miniCookie = new ItemFoodminiCookie(8, 1, true).setCreativeTab(RPCoreITab).setUnlocalizedName("Mini Cookie").setTextureName(modid + ":" + "Minicookie");
		oneupCookie = new ItemFoodoneupCookie(20, 1, true).setCreativeTab(RPCoreITab).setUnlocalizedName("1Up Cookie").setTextureName(modid + ":" + "1Upcookie");
		springCookie = new ItemFoodspringCookie(8, 1, true).setCreativeTab(RPCoreITab).setUnlocalizedName("Spring Cookie").setTextureName(modid + ":" + "Springcookie");
		propellerCookie =  new ItemFoodpropellerCookie(8, 1, true).setCreativeTab(RPCoreITab).setUnlocalizedName("Propeller Cookie[WIP]").setTextureName(modid + ":" + "Propellercookie");
		rockCookie =new ItemFoodrockCookie(8, 1, true).setCreativeTab(RPCoreITab).setUnlocalizedName("Rock Cookie").setTextureName(modid + ":" + "Rockcookie");
		superCookie =new ItemFoodsuperCookie(8, 1, true).setCreativeTab(RPCoreITab).setUnlocalizedName("Super Cookie").setTextureName(modid + ":" + "Supercookie");
		cookieSugar = new ItemFoodcookieSugar(8, 1, true).setCreativeTab(RPCoreITab).setUnlocalizedName("Sugar Cookie").setTextureName(modid + ":" + "cookieSugar");
		baconRaw = new ItemFoodbaconRaw(1, 1, true).setCreativeTab(RPCoreITab).setUnlocalizedName("Raw Bacon").setTextureName(modid + ":" + "Bacon_Raw");
		baconCooked = new ItemFoodbaconCooked(3, 1, true).setCreativeTab(RPCoreITab).setUnlocalizedName("Cooked Bacon").setTextureName(modid + ":" + "Bacon_Cooked");
		knife = new Itemknife().setCreativeTab(RPCoreITab).setUnlocalizedName("Knife").setTextureName(modid + ":" + "Knife");
		dustSugar = new ItemdustSugar().setCreativeTab(RPCoreITab).setUnlocalizedName("Pouch Of Sugar").setTextureName(modid + ":" + "Bag_Of_Sugar");
	    magnusCookie = new ItemFoodcreativeCookie(1, 1, true).setCreativeTab(RPCoreITab).setUnlocalizedName("Magnus Cookie").setTextureName("cookie");


		//test
		testCookie = new ItemFoodtestCookie(-10, 1, false).setCreativeTab(RPCoreITab).setUnlocalizedName("Item Of Testing").setTextureName(modid + ":" + "ItemOfTesting");



		//Plants
		yellowLeaf = new ItemyellowLeaf().setCreativeTab(RPCoreITab).setUnlocalizedName("Yellow Leaf").setTextureName(modid + ":" + "MagickYellowLeaf");







		//OreDictionary

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


		ItemStack slabM0 = new ItemStack (Blocks.stone_slab);
		slabM0.setItemDamage(5);



		GameRegistry.registerTileEntity(TileEntityalloySmelter.class, "alloySmelter");




		//machines
		GameRegistry.registerBlock(alloySmelterIdle, "AlloySmelterIdle");
		GameRegistry.registerBlock(alloySmelterActive, "AlloySmelterActive");




		//Blocks


		Recipies.registerItem(magnusCookie, "Test Cookie Creative Only");
		Recipies.registerBlock(obsidianWhite,"White Obsidian");
		Recipies.registerBlock(oreCrusher, "Ore Crusher");
		Recipies.registerBlock(sandTreated, "Treated Sand");
		//Recipies.registerBlock(blueStabilizer, "Blue Stabilizer");



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



      //ProtoSprays

        Recipies.registerItem(protopaintDiamond,"Next Gen Diamond ProtoSpray");
        Recipies.registerItem(protopaintCopper,"Next Gen Copper ProtoSpray");
        Recipies.registerItem(protopaintGold,"Next Gen Gold ProtoSpray");
        Recipies.registerItem(protopaintTungstencarbide,"Next Gen Tungsten Carbide ProtoSpray");




      //public static Item anvilPostassembly;
	    //public static Item Epoxy;
	    //public static Item lenseReflective;
	    //parts^^

	    //public static Item diode;

        Recipies.registerItem(anvilPostassembly,"Postassembly Anvil");
        Recipies.registerItem(Epoxy,"Epoxy");
        Recipies.registerItem(lenseReflective,"Reflective Lense");
        Recipies.registerItem(diode,"Diode");













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


        //gears


        Recipies.registerItem(cogUnfiredcopper, "UnfiredcopperCog");
        Recipies.registerItem(cogUnfireddiamond, "UnfireddiamondCog");
        Recipies.registerItem(cogUnfiredgold, "CogUnfiredgold");
        Recipies.registerItem(cogUnfirediron, "CogUnfirediron");
        Recipies.registerItem(cogUnfiredtungstencarbide, "CogUnfiredtungstencarbide");
        //fiered


        Recipies.registerItem(cogCopper, "CogCopper");
        Recipies.registerItem(cogDiamond, "CogDiamond");
        Recipies.registerItem(cogGold, "CogGold");
        Recipies.registerItem(cogIron, "CogIron");
        Recipies.registerItem(cogTungstencarbide, "CogTungstencarbide");



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









		//Lang Registry
		LanguageRegistry.addName(magnusCookie, "Test Cookie Creative Only");
		LanguageRegistry.addName(obsidianWhite,"White Obsidian");
		LanguageRegistry.addName(oreCrusher, "Ore Crusher");
		LanguageRegistry.addName(sandTreated, "Treated Sand");
		//LanguageRegistry.addName(blueStabilizer, "Blue Stabilizer");



		LanguageRegistry.addName(polymer, "Polymer");
		LanguageRegistry.addName(polymerWoven, "Polyester");
		LanguageRegistry.addName(oreExp, "Exp Ore");
		LanguageRegistry.addName(oreTin, "Tin Ore");
		LanguageRegistry.addName(oreSilver,"Silver Ore");
		LanguageRegistry.addName(oreLead, "Lead Ore");
		LanguageRegistry.addName(oreFerrous, "Ferrous Ore");
		LanguageRegistry.addName(oreCopper, "Copper Ore");
		LanguageRegistry.addName(oreJade, "Jade Ore");
		LanguageRegistry.addName(jadeBlock, "Jade Block");
		LanguageRegistry.addName(oreTungsten, "Tungsten Ore");
		LanguageRegistry.addName(TCAM, "TCAM");
		LanguageRegistry.addName(oreAnthtracite, "Anthracite Ore");
		LanguageRegistry.addName(copperBlock, "Copper Block");
        LanguageRegistry.addName(ferrousBlock, "Ferrous Block");
        LanguageRegistry.addName(leadBlock, "Lead Block");
        LanguageRegistry.addName(netherstarBlock, "Netherstar Block");
        LanguageRegistry.addName(organizeddiamondBlock, "Organizeddiamond Block");
        LanguageRegistry.addName(organizedemeraldBlock, "Organizedemerald Block");
        LanguageRegistry.addName(silverBlock, "Silver Block");
        LanguageRegistry.addName(tinBlock, "Tin Block");
        LanguageRegistry.addName(tungstenBlock, "Tungsten Block");
        LanguageRegistry.addName(tungstencarbideBlock, "Tungstencarbide Block");

        //Trees
        LanguageRegistry.addName(elderLog, "Red Elderberry Log");
        LanguageRegistry.addName(elderLeaf, "Red Elderberry Leaf");
        LanguageRegistry.addName(elderSap, "Red Elderberry Sapling");
        LanguageRegistry.addName(elderPlanks, "Red Elderberry Planks");


        //items

      //Capacitor

        LanguageRegistry.addName(foil,"Foil");
        LanguageRegistry.addName(foilAluminumoxide,"Aluminum Oxide Foil");
        LanguageRegistry.addName(paperElectrolized,"Electrolized Paper");
        LanguageRegistry.addName(capacitorBasic,"Basic Capacitor");
        LanguageRegistry.addName(capacitorCopper,"Copper Capacitor");
        LanguageRegistry.addName(capacitorDiamond,"Diamond Capacitor");
        LanguageRegistry.addName(capacitorGold,"Gold Capacitor");
        LanguageRegistry.addName(capacitorTungstencarbide,"Tungsten Catbide Capacitor");



      //ProtoSprays

        LanguageRegistry.addName(protopaintDiamond,"Next Gen Diamond ProtoSpray");
        LanguageRegistry.addName(protopaintCopper,"Next Gen Copper ProtoSpray");
        LanguageRegistry.addName(protopaintGold,"Next Gen Gold ProtoSpray");
        LanguageRegistry.addName(protopaintTungstencarbide,"Next Gen Tungsten Carbide ProtoSpray");




      //public static Item anvilPostassembly;
	    //public static Item Epoxy;
	    //public static Item lenseReflective;
	    //parts^^

	    //public static Item diode;

        LanguageRegistry.addName(anvilPostassembly,"Postassembly Anvil");
        LanguageRegistry.addName(Epoxy,"Epoxy");
        LanguageRegistry.addName(lenseReflective,"Reflective Lense");
        LanguageRegistry.addName(diode,"Diode");













        //Ingots
        LanguageRegistry.addName(ingotSteel,"Steel Ingot");
        LanguageRegistry.addName(ingotBronze,"Bronze Ingot");
        LanguageRegistry.addName(ingotTin,"Tin Ingot");
		LanguageRegistry.addName(ingotSilver, "Silver Ingot");
		LanguageRegistry.addName(ingotLead, "Lead Ingot");
		LanguageRegistry.addName(ingotFerrous, "Ferrous Ingot");
		LanguageRegistry.addName(ingotCopper, "Copper Ingot");
		LanguageRegistry.addName(ingotNetherstar, "Nether Star Ingot");
		LanguageRegistry.addName(ingotTungsten, "Tungsten Ingot");
	    LanguageRegistry.addName(TCAI, "TCAI");


		//Gems
	    LanguageRegistry.addName(gemDiamond, "Diamond Ingot");
		LanguageRegistry.addName(gemEmerald, "Emerald Ingot");
		LanguageRegistry.addName(gemJade, "Raw Jade");
		LanguageRegistry.addName(gemJadepure, "Jade");

		//Dusts
		LanguageRegistry.addName(dustNetherstar, "Netherstar Dust");
		LanguageRegistry.addName(dustCopper, "Copper Dust");
		LanguageRegistry.addName(dustDiamond, "Diamond Dust");
		LanguageRegistry.addName(dustEmerald, "Emerald Dust");
		LanguageRegistry.addName(dustFerrous, "Ferrous Dust");
		LanguageRegistry.addName(dustGold, "Gold Dust");
		LanguageRegistry.addName(dustIron, "Iron Dust");
		LanguageRegistry.addName(dustLead, "Lead Dust");
		LanguageRegistry.addName(dustSilver, "Silver Dust");
		LanguageRegistry.addName(dustTin, "Tin Dust");
		LanguageRegistry.addName(dustTungsten, "Tungsten Dust");
		LanguageRegistry.addName(dustBronze,"Bronze Dust");
		LanguageRegistry.addName(dustSteel,"Steel Dust");

		//Magick
		LanguageRegistry.addName(dropBig, "Big Drop");
        LanguageRegistry.addName(dropBounce,"Bounce Drop");
        LanguageRegistry.addName(dropDeath, "Death Drop");
        LanguageRegistry.addName(dropFly,"Fly Drop");
        LanguageRegistry.addName(dropLife,"Life Drop");
        LanguageRegistry.addName(dropMagick,"Magick Drop");
        LanguageRegistry.addName(dropPoison,"Poisen Drop");
        LanguageRegistry.addName(dropRock,"Rock Drop");
        LanguageRegistry.addName(dropSmall,"Small Drop");
        LanguageRegistry.addName(dropSuper, "Super Drop");
        LanguageRegistry.addName(dustMagick, "Magick Dust");
        LanguageRegistry.addName(dustMagickcompound, "Magick Compound");
        LanguageRegistry.addName(runeFire, "Fire Rune");
        LanguageRegistry.addName(runeWater, "Water Rune");
        LanguageRegistry.addName(runeAir, "Air Rune");
        LanguageRegistry.addName(runeSpirit, "Spirit Rune");
        LanguageRegistry.addName(runeEarth, "Earth Rune");
        LanguageRegistry.addName(runePlate, "Runic Plate");

		//Misc
        LanguageRegistry.addName(sandPaper,"Sand Paper");
		LanguageRegistry.addName(anthracite, "Anthracite");
        LanguageRegistry.addName(quartzStick, "Quartc Stick");
        LanguageRegistry.addName(quartzBowl, "Quartc Bowl");
        LanguageRegistry.addName(mortar_and_pestle, "Mortar and Pestle");
        LanguageRegistry.addName(Pencil, "Pencil");
        LanguageRegistry.addName(blankScroll, "Blank Scroll");
        LanguageRegistry.addName(scrollCircle, "Circle Scroll");
        LanguageRegistry.addName(oilTreatment, "Treatment Oil");
        LanguageRegistry.addName(mouldCog, "Cog Mould");


        //gears


        LanguageRegistry.addName(cogUnfiredcopper, "UnfiredcopperCog");
        LanguageRegistry.addName(cogUnfireddiamond, "UnfireddiamondCog");
        LanguageRegistry.addName(cogUnfiredgold, "CogUnfiredgold");
        LanguageRegistry.addName(cogUnfirediron, "CogUnfirediron");
        LanguageRegistry.addName(cogUnfiredtungstencarbide, "CogUnfiredtungstencarbide");
        //fiered


        LanguageRegistry.addName(cogCopper, "CogCopper");
        LanguageRegistry.addName(cogDiamond, "CogDiamond");
        LanguageRegistry.addName(cogGold, "CogGold");
        LanguageRegistry.addName(cogIron, "CogIron");
        LanguageRegistry.addName(cogTungstencarbide, "CogTungstencarbide");



        //Chunks
        LanguageRegistry.addName(chunkCopper, "Copper Chunk");
        LanguageRegistry.addName(chunkTin, "Tin Chunk");
        LanguageRegistry.addName(chunkFerrous, "Ferrous Chunk");
        LanguageRegistry.addName(chunkSilver, "Silver Chunk");
        LanguageRegistry.addName(chunkTungsten, "Tungsten Chunk");
        LanguageRegistry.addName(chunkLead, "Lead Chunk");

        //Tools
        LanguageRegistry.addName(hammerDiamond,"Diamond Hammer");
			LanguageRegistry.addName(hammerJade,"Jade Hammer");
				LanguageRegistry.addName(hammerNetherstar,"Netherstar Hammer");
						LanguageRegistry.addName(hammerSandstone,"Sandstone Hammer");
								LanguageRegistry.addName(hammerWooden ,"Wooden Hammer");
										LanguageRegistry.addName(hammerCopper,"Copper Hammer");
												LanguageRegistry.addName(hammerSilver,"Silver Hammer");
														LanguageRegistry.addName(tungstenCarbideHammer, "Tungsten Carbide Hammer");
																LanguageRegistry.addName(stoneHammer, "Stone Hammer");


												//Tools->Mining
												LanguageRegistry.addName(jadeSword, "Jade Sword");
										        LanguageRegistry.addName(jadePickaxe, "Jade Pickaxe");
										        LanguageRegistry.addName(jadeAxe, "Jade Axe");
										        LanguageRegistry.addName(jadeHoe, "Jade Hoe");
										        LanguageRegistry.addName(jadeShovel, "Jade Shovel");



        //Tool Heads
        LanguageRegistry.addName(headDiamond,"Diamond Hammer Head");
        		LanguageRegistry.addName(headJade,"Jade Hammer Head");
        				LanguageRegistry.addName(headNetherstar,"Netherstar Hammer Head");
        						LanguageRegistry.addName(headSandstone,"Sandstone Hammer Head");
        								LanguageRegistry.addName(headWooden ,"Wooden Hammer Head");
        										LanguageRegistry.addName(headCopper,"Copper Hammer Head");
        												LanguageRegistry.addName(headSilver,"Silver Hammer Head");
        														LanguageRegistry.addName(tungstenCarbideHead, "Tungsten Carbide Hammer Head");
        																LanguageRegistry.addName(stoneHamHead, "Stone Hammer Head");


        												//Tools->Mining
        												    LanguageRegistry.addName(jadeHeadAx, "JadeAxeHead");
        											        LanguageRegistry.addName(jadeHeadSw, "JadeSwordHead");
        											        LanguageRegistry.addName(jadeHeadSh, "JadeShovHead");
        											        LanguageRegistry.addName(jadeHeadHo, "JadeHoeHead");
        											        LanguageRegistry.addName(jadeHeadPi, "JadePickHead");






        //Handle Modifiers




        //Caustic Items
        LanguageRegistry.addName(causticMeal, "Caustic Mix");
        LanguageRegistry.addName(causticCorpuscles, "Caustic Corpuscles ");
        LanguageRegistry.addName(bloodFirey, "Firey Blood");
        LanguageRegistry.addName(acidSulfuric, "Sulferic Acid");
        LanguageRegistry.addName(dustPN,"Potassium Nitrate");
        LanguageRegistry.addName(dustCharcoal, "Charcoal Dust");
        LanguageRegistry.addName(toolSkinning, "Skinning Tool");





        //Food
        LanguageRegistry.addName(megaCookie, "Mega Cookie");
        LanguageRegistry.addName(ghostCookie, "Ghost Cookie");
        LanguageRegistry.addName(poisonCookie, "Poison Cookie");
        LanguageRegistry.addName(miniCookie, "Mini Cookie");
        LanguageRegistry.addName(oneupCookie, "1Up Cookie");
        LanguageRegistry.addName(springCookie, "Spring Cookie");
        LanguageRegistry.addName(propellerCookie, "Propeller Cookie[WIP]");
        LanguageRegistry.addName(rockCookie, "Rock Cookie");
        LanguageRegistry.addName(superCookie, "Super Cookie");
        LanguageRegistry.addName(cookieSugar, "Sugar Cookie");
        LanguageRegistry.addName(baconRaw, "Raw Bacon");
        LanguageRegistry.addName(baconCooked,"Cooked Bacon");
        LanguageRegistry.addName(knife,"Knife");
        LanguageRegistry.addName(dustSugar,"Pouch Of Sugar");
        LanguageRegistry.addName(dustFlour, "Bag Of Flour");


        //Plants
        LanguageRegistry.addName(yellowLeaf, "Yellow Leaf");



        //test
        LanguageRegistry.addName(testCookie, "Item Of Testing");










		//Crafting
		// #
		// #
		// 0
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





	    //public static Item headDiamond;
	    //public static Item headJade;
	   //public static Item headNetherstar;
	    //public static Item headSandstone;
	   //public static Item headWooden;
	    //public static Item headCopper;
	    //public static Item headSilver;







		//public static Item hammerDiamond;
	    //public static Item hammerJade;
	   // public static Item hammerNetherstar;
	   // public static Item hammerSandstone;
	   // public static Item hammerWooden;
	   // public static Item hammerCopper;
	   // public static Item hammerSilver;








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










		//Hammer End------- #AllofThehammerrecipes o.o



				//Caustic Crafting
				GameRegistry.addShapelessRecipe(new ItemStack(RPCore.causticCorpuscles,2),new ItemStack(Items.rotten_flesh), new ItemStack(toolSkinning,1,  OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapedRecipe(new ItemStack (toolSkinning,1), "# #", "# #"," # ", '#', new ItemStack (Items.iron_ingot));
				//GameRegistry.addShapelessRecipe(new ItemStack (bloodFirey,1)," # ","# #","###","#", new ItemStack (Blocks.glass_pane)); <-Dont Use Will Crash Game
				GameRegistry.addShapelessRecipe(new ItemStack (bloodFirey,1),new ItemStack(RPCore.causticMeal), new ItemStack(Items.glass_bottle));
				GameRegistry.addShapelessRecipe(new ItemStack (acidSulfuric ,1),new ItemStack(RPCore.causticCorpuscles), new ItemStack(Items.glass_bottle));
				GameRegistry.addShapelessRecipe(new ItemStack (causticMeal,2),new ItemStack(RPCore.causticCorpuscles), new ItemStack(Items.dye,1,15));
				GameRegistry.addShapelessRecipe(new ItemStack (dustPN,1),new ItemStack(RPCore.bloodFirey), new ItemStack(acidSulfuric));

				GameRegistry.addShapedRecipe(new ItemStack (Items.gunpowder,4),"###","#0#","###", '#', new ItemStack (RPCore.dustCharcoal),'0',new ItemStack(RPCore.dustPN));
				//###
				//#0#
				//###


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

		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());



















		proxy.registerProxies();
	}

	private Object ItemStack() {
		// TODO Auto-generated method stub
		return null;
	}

	public static ItemStack anthracite() {
		// TODO Auto-generated method stub
		return null;
	}
}

//test Sync
