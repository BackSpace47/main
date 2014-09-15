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
import net.RPower.RPowermod.block.blockRPBlockblockAluminum;
import net.RPower.RPowermod.block.blockRPBlockblockChromium;
import net.RPower.RPowermod.block.blockRPBlockblockLithium;
import net.RPower.RPowermod.block.blockRPBlockblockNi;
import net.RPower.RPowermod.block.blockRPBlockblockPlatinum;
import net.RPower.RPowermod.block.blockRPBlockblockSilicon;
import net.RPower.RPowermod.block.blockRPBlockblockZink;
import net.RPower.RPowermod.block.ModelJar;
import net.RPower.RPowermod.block.blockRPBlockoreAluminum;
import net.RPower.RPowermod.block.blockRPBlockoreChromium;
import net.RPower.RPowermod.block.blockRPBlockoreLithium;
import net.RPower.RPowermod.block.blockRPBlockoreNi;
import net.RPower.RPowermod.block.blockRPBlockorePlatinum;
import net.RPower.RPowermod.block.blockRPBlockoreSilicon;
import net.RPower.RPowermod.block.blockRPBlockoreZink;
import net.RPower.RPowermod.block.blockRPBlockpjDarkblue;
import net.RPower.RPowermod.block.blockRPBlockpjDarkgrey;
import net.RPower.RPowermod.block.blockRPBlockpjDarkred;
import net.RPower.RPowermod.block.blockRPBlockpjEmpty;
import net.RPower.RPowermod.block.blockRPBlockpjGreen;
import net.RPower.RPowermod.block.blockRPBlockpjGrey;
import net.RPower.RPowermod.block.blockRPBlockpjLightblue;
import net.RPower.RPowermod.block.blockRPBlockpjLimegreen;
import net.RPower.RPowermod.block.blockRPBlockpjOrange;
import net.RPower.RPowermod.block.blockRPBlockpjPink;
import net.RPower.RPowermod.block.blockRPBlockpjRed;
import net.RPower.RPowermod.block.blockRPBlockpjWater;
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
import net.RPower.RPowermod.fluid.fluidRPdestabilizedOre;
import net.RPower.RPowermod.item.*;
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
import net.minecraftforge.fluids.Fluid;
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

	//liquids

            public static fluidRPdestabilizedOre destabilizedOre;


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

	//Jars NEW DONT DELETE THIS CODE THIS IS THE REFINED VERSION THE ITEMS NEED REMOVED THOUGH

	//public static Block moderJar;



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
    public static Block woodPetrified;



    //Food
    public static Block enderCake;
    //The Bombs Of Awsomnes
    public static Block blockJadeBomb;

    //Jars

    public static Block pjDarkblue;
    public static Block pjDarkgrey;
    public static Block pjDarkred;
    public static Block pjEmpty;
    public static Block pjGreen;
    public static Block pjGrey;
    public static Block pjLightblue;
    public static Block pjLimegreen;
    public static Block pjOrange;
    public static Block pjPink;
    public static Block pjRed;
    public static Block pjWater;



    //Caustic Items
    public static Item causticMeal;
    public static Item causticCorpuscles;
    public static Item bloodFirey;
    public static Item acidSulfuric;
    public static Item dustPN;
    public static Item dustCharcoal;
    public static Item toolSkinning;
    public static Item lagUnit;
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

//Wrench

    public static Item cyberWrench;






    //CAKE!!!!! >:-(

    public static Item enderCakefresh;


    public static Item dustSugar;


    //thaum
    public static Item wand_cap_jade;


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


    //public static Item ingotBrass;
    public static Item ingotZink;
    public static Item magnusCookie;
    //Chunks
    public static Item chunkTungsten;
    public static Item chunkCopper;
    public static Item chunkFerrous;
    public static Item chunkLead;
    public static Item chunkSilver;
    public static Item chunkTin;
    public static Item chunkSilicon;

    //mess

    public static Item chunkAluminum;
    public static Item dustAluminumoxide;
    public static Item chunkChromium;
    public static Item dustChromium;
    public static Item chunkLithium;
    public static Item dustLithium;
    public static Item chunkNi;
    public static Item dustNi;
    public static Item chunkPlatinum;
    public static Item dustPlatinum;
    public static Item dustZink;
    public static Item chunkZink;
    public static Item ingotzink;
    public static Block oreChromium;
    public static Block blockChromium;
    public static Block oreLithium;
    public static Block blockLithium;
    public static Block oreNi;
    public static Block blockNi;
    public static Block orePlatinum;
    public static Block blockPlatinum;
    public static Block oreZink;
    public static Block blockZink;
    public static Item dustTungstencarbide;
    public static Item ingotSilicon;
    public static Item ingotAluminium ;
    public static Item ingotChromium;
    public static Item ingotLithium;
    public static Item ingotNikel;
    public static Item ingotPlatinum;

/*
 *
 *
 *
 * Que for deletion - Note these are now "Placable Jars" The model rendering is giving me a hassle though :/
    public static Item pjDarkblue;
    public static Item pjDarkgrey;
    public static Item pjDarkred;
    public static Item pjEmpty;
    public static Item pjGreen;
    public static Item pjGrey;
    public static Item pjLightblue;
    public static Item pjLimegreen;
    public static Item pjOrange;
    public static Item pjPink;
    public static Item pjRed;
    public static Item pjWater;

*/


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
    public static Item dustSilicon;
    public static Item dustAluminum;





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
    //chips
    public static Item chipAdvanced;
    public static Item chipBasic;
    public static Item chipElite;
    public static Item chipLV;
    //Protosprays
    public static Item protopaintCopper;
    public static Item protopaintDiamond;
    public static Item protopaintGold;
    public static Item protopaintTungstencarbide;
    //Troll Items
    public static Item trollNugetdiamond;
    public static Item trollNugetiron;
    public static Item trollNugetemerald;
    public static Item trollNugetGold;
    //Runes
    public static Item Air_Rune;
    public static Item Earth_Rune;
    public static Item Fire_Rune;
    public static Item runePlate;
    public static Item Spirit_Rune;
    public static Item Water_Rune;
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
    //Gears/Cogs
    public static Item mouldCog;
    //unfired
    public static Item cogUnfiredcopper;
    public static Item cogUnfireddiamond;
    public static Item cogUnfiredgold;
    public static Item cogUnfirediron;
    public static Item cogUnfiredtungstencarbide;
    //fired
    public static Item cogCopper;
    public static Item cogDiamond;
    public static Item cogGold;
    public static Item cogIron;
    public static Item cogTungstencarbide;
    //Plates
    public static Item mouldPlate;
    //unfired
    public static Item plateUnfiredcopper;
    public static Item plateUnfireddiamond;
    public static Item plateUnfiredgold;
    public static Item plateUnfirediron;
    public static Item plateUnfiredtungstencarbide;
    //fired
    public static Item plateCopper;
    public static Item plateDiamond;
    public static Item plateGold;
    public static Item plateIron;
    public static Item plateTungstencarbide;

    public static Item scrollSquare;


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
    public static Item hammerIron;
    //MFtools
    public static Item axeJadeR;
    public static Item hoeJadeR;
    public static Item pickaxeJadeR;
    public static Item shovelJadeR;
    public static Item swordJadeR;
    //Handle Modifiers
    public static Item handleTCA;
    public static Item handleTCASword;
	//Other Stuff
  //random
    public static Item amuletofprotestas;


    public static Item knife;




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
		 * 5 = Reinforced Jade
		 */
		//Fluid

        destabilizedOre =new fluidRPdestabilizedOre();


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
		oreAluminum= new blockRPBlockoreAluminum(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("oreAluminum").setBlockTextureName(modid + ":" + "oreAluminum").setHardness(5F).setResistance(1F);
		wand_cap_jade = new itemwand_cap_jade().setUnlocalizedName("wand_cap_jade").setTextureName(modid + ":" + "wand_cap_jade").setCreativeTab(RPCoreITab);



		oreSilicon= new blockRPBlockoreSilicon (Material.rock).setCreativeTab(RPCoreBTab).setBlockName("oreSilicon").setBlockTextureName(modid + ":" + "oreSilicon").setHardness(5F).setResistance(1F);
//jars
		pjDarkblue = new blockRPBlockpjDarkblue(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("pjDarkblue").setBlockTextureName(modid + ":" + "pjDarkblue").setHardness(5F).setResistance(1F);
		pjDarkgrey = new blockRPBlockpjDarkgrey(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("pjDarkgrey").setBlockTextureName(modid + ":" + "pjDarkgrey").setHardness(5F).setResistance(1F);
		pjDarkred = new blockRPBlockpjDarkred(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("pjDarkred").setBlockTextureName(modid + ":" + "pjDarkred").setHardness(5F).setResistance(1F);
		pjEmpty = new blockRPBlockpjEmpty(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("pjEmpty").setBlockTextureName(modid + ":" + "pjEmpty").setHardness(5F).setResistance(1F);
		pjGreen = new blockRPBlockpjGreen(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("pjGreen").setBlockTextureName(modid + ":" + "pjGreen").setHardness(5F).setResistance(1F);
		pjGrey = new blockRPBlockpjGrey(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("pjGrey").setBlockTextureName(modid + ":" + "pjGrey").setHardness(5F).setResistance(1F);
		pjLightblue = new blockRPBlockpjLightblue(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("pjLightblue").setBlockTextureName(modid + ":" + "pjLightblue").setHardness(5F).setResistance(1F);
		pjLimegreen = new blockRPBlockpjLimegreen(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("pjLimegreen").setBlockTextureName(modid + ":" + "pjLimegreen").setHardness(5F).setResistance(1F);
		pjOrange = new blockRPBlockpjOrange(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("pjOrange").setBlockTextureName(modid + ":" + "pjOrange").setHardness(5F).setResistance(1F);
		pjPink = new blockRPBlockpjPink(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("pjPink").setBlockTextureName(modid + ":" + "pjPink").setHardness(5F).setResistance(1F);
		pjRed = new blockRPBlockpjRed(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("pjRed").setBlockTextureName(modid + ":" + "pjRed").setHardness(5F).setResistance(1F);
		pjWater = new blockRPBlockpjWater(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("pjWater").setBlockTextureName(modid + ":" + "pjWater").setHardness(5F).setResistance(1F);




		//moderJar = new ModelJar (Material.wood).setCreativeTab(RPCoreBTab).setBlockName("Petrified Wood").setBlockTextureName(modid + ":" + "woodPetrified").setHardness(0.5F).setResistance(0.5F).setStepSound(Block.soundTypeGlass);


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
		blockSilicon= new blockRPBlockblockSilicon(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("blockSilicon").setBlockTextureName(modid + ":" + "blockSilicon").setHardness(5F).setResistance(1F);
		blockAluminum= new blockRPBlockblockAluminum(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("blockAluminum").setBlockTextureName(modid + ":" + "blockAluminum").setHardness(5F).setResistance(1F);

		//TrollBlocks
		trollDiamond = new blocktrollDiamond(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("Troll Diamond").setBlockTextureName(modid + ":" + "diamond_block").setHardness(50F).setResistance(5F);
		trollIron = new blocktrollIron(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("Troll Iron").setBlockTextureName(modid + ":" + "iron_block").setHardness(50F).setResistance(5F);
		trollEmerald = new blocktrollEmerald(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("Troll Emerald").setBlockTextureName(modid + ":" + "emerald_block").setHardness(50F).setResistance(5F);
		trollGold = new blocktrollGold(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("Troll Gold").setBlockTextureName(modid + ":" + "gold_block").setHardness(50F).setResistance(5F);
		//TrollItems
		trollNugetdiamond = new itemtrollNugetdiamond().setUnlocalizedName("Diamond Troll Nugget").setTextureName(modid + ":" + "nuggetDiamond").setCreativeTab(RPCoreITab);
		trollNugetiron = new itemtrollNugetiron().setUnlocalizedName("Iron Troll Nugget").setTextureName(modid + ":" + "nuggetIron").setCreativeTab(RPCoreITab);
		trollNugetemerald = new itemtrollNugetemerald().setUnlocalizedName("Emerald Troll Nugget").setTextureName(modid + ":" + "nuggetEmerald").setCreativeTab(RPCoreITab);
		trollNugetGold = new itemtrollNugetGold().setUnlocalizedName("Gold Troll Nugget").setTextureName(modid + ":" + "nuggetGold").setCreativeTab(RPCoreITab);

		sandTreated = new BlocksandTreated(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("Treated Sand").setBlockTextureName(modid + ":" + "sandTreated").setHardness(50F).setResistance(5F);


		//Food Cakes Stuffs ^_^


//Wrench

		cyberWrench = new itemcyberWrench().setUnlocalizedName("cyberWrench").setTextureName(modid + ":" + "cyberWrench").setCreativeTab(RPCoreITab);


		//Alloys
		TCAM = new BlockTCAM(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("TCAM").setBlockTextureName(modid + ":" + "TCAM").setHardness(50F).setResistance(5F);
		//Machines
		oreCrusher = new BlockoreCrusher(false).setCreativeTab(RPCoreBTab).setBlockName("Ore Crusher").setHardness(50F).setResistance(5F);
		//To Be Worked On
		//alloySmelterIdle = new BlockAlloySmelter().setCreativeTab(RPCoreBTab).setBlockName("alloySmelter");
		//alloySmelterActive = new BlockAlloySmelter().setBlockName("alloySmelter").setLightLevel(0.625F);
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
	    kitTransistor = new itemkitTransistor().setUnlocalizedName("Transistor Kit").setTextureName(modid + ":" + "kitTransistor").setCreativeTab(RPCoreITab);
	    transistorBasic = new itemtransistorBasic().setUnlocalizedName("Basic Transistor").setTextureName(modid + ":" + "transistorBasic").setCreativeTab(RPCoreITab);
	    transistorCopper = new itemransistorCopper().setUnlocalizedName("Copper Transistor").setTextureName(modid + ":" + "transistorCopper").setCreativeTab(RPCoreITab);
	    transistorDiamond = new itemtransistorDiamond().setUnlocalizedName("Diamond Transistor").setTextureName(modid + ":" + "transistorDiamond").setCreativeTab(RPCoreITab);
	    transistorGold = new itemtransistorGold().setUnlocalizedName("Gold Transistor").setTextureName(modid + ":" + "transistorGold").setCreativeTab(RPCoreITab);
	    transistorIron = new itemtransistorIron().setUnlocalizedName("Iron Transistor").setTextureName(modid + ":" + "transistorIron").setCreativeTab(RPCoreITab);
	    transistorTungstencarbide = new itemtransistorTungstencarbide().setUnlocalizedName("Tungsten Carbide Transistor").setTextureName(modid + ":" + "transistorTungstencarbide").setCreativeTab(RPCoreITab);
	   //mess
	    chunkAluminum = new itemchunkAluminum().setUnlocalizedName("chunkAluminum").setTextureName(modid + ":" + "chunkAluminum").setCreativeTab(RPCoreITab);
	    dustAluminumoxide = new itemdustAluminumoxide().setUnlocalizedName("dustAluminumoxide").setTextureName(modid + ":" + "dustAluminumoxide").setCreativeTab(RPCoreITab);
	    chunkChromium = new itemchunkChromium().setUnlocalizedName("chunkChromium").setTextureName(modid + ":" + "chunkChromium").setCreativeTab(RPCoreITab);
	    dustChromium = new itemdustChromium().setUnlocalizedName("dustChromium").setTextureName(modid + ":" + "dustChromium").setCreativeTab(RPCoreITab);
	    chunkLithium = new itemchunkLithium().setUnlocalizedName("chunkLithium").setTextureName(modid + ":" + "chunkLithium").setCreativeTab(RPCoreITab);
	    dustLithium = new itemdustLithium().setUnlocalizedName("dustLithium").setTextureName(modid + ":" + "dustLithium").setCreativeTab(RPCoreITab);
	    chunkNi = new itemchunkNi().setUnlocalizedName("chunkNi").setTextureName(modid + ":" + "chunkNi").setCreativeTab(RPCoreITab);
	    dustNi = new itemdustNi().setUnlocalizedName("dustNi").setTextureName(modid + ":" + "dustNi").setCreativeTab(RPCoreITab);
	    chunkPlatinum = new itemchunkPlatinum().setUnlocalizedName("chunkPlatinum").setTextureName(modid + ":" + "chunkPlatinum").setCreativeTab(RPCoreITab);
	    dustPlatinum = new itemdustPlatinum().setUnlocalizedName("dustPlatinum").setTextureName(modid + ":" + "dustPlatinum").setCreativeTab(RPCoreITab);
	    dustZink = new itemdustZink().setUnlocalizedName("dustZink").setTextureName(modid + ":" + "dustZink").setCreativeTab(RPCoreITab);
	    chunkZink = new itemchunkZink().setUnlocalizedName("chunkZink").setTextureName(modid + ":" + "chunkZink").setCreativeTab(RPCoreITab);
	    ingotzink = new itemingotzink().setUnlocalizedName("ingotzink").setTextureName(modid + ":" + "ingotzink").setCreativeTab(RPCoreITab);
	    oreChromium = new blockRPBlockoreChromium(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("oreChromium").setBlockTextureName(modid + ":" + "oreChromium").setHardness(5F).setResistance(1F);
	    blockChromium = new blockRPBlockblockChromium(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("blockChromium").setBlockTextureName(modid + ":" + "blockChromium").setHardness(5F).setResistance(1F);
	    oreLithium = new blockRPBlockoreLithium(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("oreLithium").setBlockTextureName(modid + ":" + "oreLithium").setHardness(5F).setResistance(1F);
	    blockLithium = new blockRPBlockblockLithium(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("blockLithium").setBlockTextureName(modid + ":" + "blockLithium").setHardness(5F).setResistance(1F);
	    oreNi = new blockRPBlockoreNi(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("oreNi").setBlockTextureName(modid + ":" + "oreNi").setHardness(5F).setResistance(1F);
	    blockNi = new blockRPBlockblockNi(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("blockNi").setBlockTextureName(modid + ":" + "blockNi").setHardness(5F).setResistance(1F);
	    orePlatinum = new blockRPBlockorePlatinum(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("orePlatinum").setBlockTextureName(modid + ":" + "orePlatinum").setHardness(5F).setResistance(1F);
	    blockPlatinum = new blockRPBlockblockPlatinum(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("blockPlatinum").setBlockTextureName(modid + ":" + "blockPlatinum").setHardness(5F).setResistance(1F);
	    oreZink = new blockRPBlockoreZink(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("oreZink").setBlockTextureName(modid + ":" + "oreZink").setHardness(5F).setResistance(1F);
	    blockZink = new blockRPBlockblockZink(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("blockZink").setBlockTextureName(modid + ":" + "blockZink").setHardness(5F).setResistance(1F);
	    dustTungstencarbide = new itemdustTungstencarbide().setUnlocalizedName("dustTungstencarbide").setTextureName(modid + ":" + "dustTungstencarbide").setCreativeTab(RPCoreITab);
	    ingotSilicon = new itemingotSilicon().setUnlocalizedName("ingotSilicon").setTextureName(modid + ":" + "ingotSilicon").setCreativeTab(RPCoreITab);
	    ingotAluminium  = new itemingotAluminium ().setUnlocalizedName("ingotAluminium").setTextureName(modid + ":" + "ingotAluminium").setCreativeTab(RPCoreITab);
	    ingotChromium = new itemingotChromium().setUnlocalizedName("ingotChromium").setTextureName(modid + ":" + "ingotChromium").setCreativeTab(RPCoreITab);
	    ingotLithium = new itemingotLithium().setUnlocalizedName("ingotLithium").setTextureName(modid + ":" + "ingotLithium").setCreativeTab(RPCoreITab);
	    ingotNikel = new itemingotNikel().setUnlocalizedName("ingotNikel").setTextureName(modid + ":" + "ingotNikel").setCreativeTab(RPCoreITab);
	    ingotPlatinum = new itemingotPlatinum().setUnlocalizedName("ingotPlatinum").setTextureName(modid + ":" + "ingotPlatinum").setCreativeTab(RPCoreITab);
	    chunkSilicon = new itemchunkSilicon().setUnlocalizedName("chunkSilicon").setTextureName(modid + ":" + "chunkSilicon").setCreativeTab(RPCoreITab);


/*Que For deletion - These are now rendered Jars that can be placed - note the rendering is giving me a bit of a hassle :/ - Backspace

	    pjDarkblue = new itempjDarkblue().setUnlocalizedName("pjDarkblue").setTextureName(modid + ":" + "pjDarkblue").setCreativeTab(RPCoreITab);
	    pjDarkgrey = new itempjDarkgrey().setUnlocalizedName("pjDarkgrey").setTextureName(modid + ":" + "pjDarkgrey").setCreativeTab(RPCoreITab);
	    pjDarkred = new itempjDarkred().setUnlocalizedName("pjDarkred").setTextureName(modid + ":" + "pjDarkred").setCreativeTab(RPCoreITab);
	    pjEmpty = new itempjEmpty().setUnlocalizedName("pjEmpty").setTextureName(modid + ":" + "pjEmpty").setCreativeTab(RPCoreITab);
	    pjGreen = new itempjGreen().setUnlocalizedName("pjGreen").setTextureName(modid + ":" + "pjGreen").setCreativeTab(RPCoreITab);
	    pjGrey = new itempjGrey().setUnlocalizedName("pjGrey").setTextureName(modid + ":" + "pjGrey").setCreativeTab(RPCoreITab);
	    pjLightblue = new itempjLightblue().setUnlocalizedName("pjLightblue").setTextureName(modid + ":" + "pjLightblue").setCreativeTab(RPCoreITab);
	    pjLimegreen = new itempjLimegreen().setUnlocalizedName("pjLimegreen").setTextureName(modid + ":" + "pjLimegreen").setCreativeTab(RPCoreITab);
	    pjOrange = new itempjOrange().setUnlocalizedName("pjOrange").setTextureName(modid + ":" + "pjOrange").setCreativeTab(RPCoreITab);
	    pjPink = new itempjPink().setUnlocalizedName("pjPink").setTextureName(modid + ":" + "pjPink").setCreativeTab(RPCoreITab);
	    pjRed = new itempjRed().setUnlocalizedName("pjRed").setTextureName(modid + ":" + "pjRed").setCreativeTab(RPCoreITab);
	    pjWater = new itempjWater().setUnlocalizedName("pjWater").setTextureName(modid + ":" + "pjWater").setCreativeTab(RPCoreITab);
	    ingotBrass = new itemingotBrass().setUnlocalizedName("ingotBrass").setTextureName(modid + ":" + "ingotBrass").setCreativeTab(RPCoreITab);
*/


// motha-friggin CAKE!!!! >:-(

	    //enderCakefresh = new enderCakefresh().setUnlocalizedName("enderCakefresh").setTextureName(modid + ":" + "enderCakefresh").setCreativeTab(RPCoreITab); Dont touch the cake is a lie o.o unless u wanna fix it lol



	    //chips
	    chipAdvanced = new itemchipAdvanced().setUnlocalizedName("Advanced Chip").setTextureName(modid + ":" + "chipAdvanced").setCreativeTab(RPCoreITab);
	    chipBasic = new itemchipBasic().setUnlocalizedName("Basic Chip").setTextureName(modid + ":" + "chipBasic").setCreativeTab(RPCoreITab);
	    chipElite = new itemchipElite().setUnlocalizedName("Elite Chip").setTextureName(modid + ":" + "chipElite").setCreativeTab(RPCoreITab);
	    chipLV = new itemchipLV().setUnlocalizedName("Low-Voltage Chip").setTextureName(modid + ":" + "chipLV").setCreativeTab(RPCoreITab);
	    //Protosprays
	    protopaintCopper = new itemprotopaintCopper().setUnlocalizedName("Next Gen Copper ProtoSpray").setTextureName(modid + ":" + "protopaintCopper").setCreativeTab(RPCoreITab);
	    protopaintDiamond = new itemprotopaintDiamond().setUnlocalizedName("Next Gen Diamond ProtoSpray").setTextureName(modid + ":" + "protopaintDiamond").setCreativeTab(RPCoreITab);
	    protopaintGold = new itemprotopaintGold().setUnlocalizedName("Next Gen Gold ProtoSpray").setTextureName(modid + ":" + "protopaintGold").setCreativeTab(RPCoreITab);
	    protopaintTungstencarbide = new itemprotopaintTungstencarbide().setUnlocalizedName("Next Gen Tungsten Carbide ProtoSpray").setTextureName(modid + ":" + "protopaintTungstencarbide").setCreativeTab(RPCoreITab);
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
	    kitTransistor = new itemkitTransistor().setUnlocalizedName("Transistor Kit").setTextureName(modid + ":" + "kitTransistor").setCreativeTab(RPCoreITab);
		transistorBasic = new itemtransistorBasic().setUnlocalizedName("Basic Transistor").setTextureName(modid + ":" + "transistorBasic").setCreativeTab(RPCoreITab);
	    transistorCopper = new itemransistorCopper().setUnlocalizedName("Copper Transistor").setTextureName(modid + ":" + "transistorCopper").setCreativeTab(RPCoreITab);
	    transistorDiamond = new itemtransistorDiamond().setUnlocalizedName("Diamond Transistor").setTextureName(modid + ":" + "transistorDiamond").setCreativeTab(RPCoreITab);
	    transistorGold = new itemtransistorGold().setUnlocalizedName("Gold Transistor").setTextureName(modid + ":" + "transistorGold").setCreativeTab(RPCoreITab);
	    transistorIron = new itemtransistorIron().setUnlocalizedName("Iron Transistor").setTextureName(modid + ":" + "transistorIron").setCreativeTab(RPCoreITab);
	    transistorTungstencarbide = new itemtransistorTungstencarbide().setUnlocalizedName("Tungsten Carbide Transistor").setTextureName(modid + ":" + "transistorTungstencarbide").setCreativeTab(RPCoreITab);
	    //chips
	    chipAdvanced = new itemchipAdvanced().setUnlocalizedName("Advanced Chip").setTextureName(modid + ":" + "chipAdvanced").setCreativeTab(RPCoreITab);
	    chipBasic = new itemchipBasic().setUnlocalizedName("Basic Chip").setTextureName(modid + ":" + "chipBasic").setCreativeTab(RPCoreITab);
	    chipElite = new itemchipElite().setUnlocalizedName("Elite Chip").setTextureName(modid + ":" + "chipElite").setCreativeTab(RPCoreITab);
	    chipLV = new itemchipLV().setUnlocalizedName("Low-Voltage Chip").setTextureName(modid + ":" + "chipLV").setCreativeTab(RPCoreITab);
	    //Protosprays
	    protopaintCopper = new itemprotopaintCopper().setUnlocalizedName("Next Gen Copper ProtoSpray").setTextureName(modid + ":" + "protopaintCopper").setCreativeTab(RPCoreITab);
	    protopaintDiamond = new itemprotopaintDiamond().setUnlocalizedName("Next Gen Diamond ProtoSpray").setTextureName(modid + ":" + "protopaintDiamond").setCreativeTab(RPCoreITab);
	    protopaintGold = new itemprotopaintGold().setUnlocalizedName("Next Gen Gold ProtoSpray").setTextureName(modid + ":" + "protopaintGold").setCreativeTab(RPCoreITab);
	    protopaintTungstencarbide = new itemprotopaintTungstencarbide().setUnlocalizedName("Next Gen Tungsten Carbide ProtoSpray").setTextureName(modid + ":" + "protopaintTungstencarbide").setCreativeTab(RPCoreITab);
	    //Lag
		lagUnit = new itemplagUnit().setUnlocalizedName("Unit Of Lag").setTextureName(modid + ":" + "33021_64").setCreativeTab(RPCoreITab);
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
		hammerIron = new itemhammerIron().setUnlocalizedName("hammerIron").setTextureName(modid + ":" + "hammerIron").setCreativeTab(RPCoreITab);
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
		dustSilicon = new itemdustSilicon().setUnlocalizedName("dustSilicon").setTextureName(modid + ":" + "dustSilicon").setCreativeTab(RPCoreITab);
		dustAluminum = new itemdustAluminum().setUnlocalizedName("dustAluminum").setTextureName(modid + ":" + "dustAluminum").setCreativeTab(RPCoreITab);




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
		mouldPlate = new ItemmouldPlate().setCreativeTab(RPCoreITab).setUnlocalizedName("Plate Mould").setTextureName(modid + ":" + "plateMould");
		// plateMould.png or mouldCog.png should be renamed. Pick one.
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
		//gears
		plateUnfiredcopper = new plateUnfiredcopper().setCreativeTab(RPCoreITab).setUnlocalizedName("UnfiredCopperplate").setTextureName(modid + ":" + "plateUnfiredCopper");
		plateUnfireddiamond = new plateUnfiredDiamond().setCreativeTab(RPCoreITab).setUnlocalizedName("UnfiredDiamondplate").setTextureName(modid + ":" + "plateUnfiredDiamond");
		plateUnfiredgold = new plateUnfiredgold().setCreativeTab(RPCoreITab).setUnlocalizedName("UnfiredGoldplate").setTextureName(modid + ":" + "plateUnfiredGold");
		plateUnfirediron = new plateUnfirediron().setCreativeTab(RPCoreITab).setUnlocalizedName("UnfiredIronplate").setTextureName(modid + ":" + "plateUnfiredIron");
		plateUnfiredtungstencarbide = new plateUnfiredtungstencarbide().setCreativeTab(RPCoreITab).setUnlocalizedName("UnfiredTungstencarbideplate").setTextureName(modid + ":" + "plateUnfiredTungstencarbide");
		//fired
		plateCopper = new plateCopper().setCreativeTab(RPCoreITab).setUnlocalizedName("Copperplate").setTextureName(modid + ":" + "plateCopper");
		plateDiamond = new plateDiamond().setCreativeTab(RPCoreITab).setUnlocalizedName("Diamondplate").setTextureName(modid + ":" + "plateDiamond");
		plateGold = new plateGold().setCreativeTab(RPCoreITab).setUnlocalizedName("Goldplate").setTextureName(modid + ":" + "plateGold");
		plateIron = new plateIron().setCreativeTab(RPCoreITab).setUnlocalizedName("Ironplate").setTextureName(modid + ":" + "plateIron");
		plateTungstencarbide = new plateTungstencarbide().setCreativeTab(RPCoreITab).setUnlocalizedName("Tungstencarbideplate").setTextureName(modid + ":" + "plateTungstencarbide");
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
        dustMagickcompound = new ItemMagic().setUnlocalizedName("Magick Compound").setTextureName(modid + ":" + "magick_compound");
        dustMagick = new ItemMagic().setUnlocalizedName("Magick Dust").setTextureName(modid + ":" + "magick_dust");
        dropBig = new ItemMagic().setUnlocalizedName("Big Drop").setTextureName(modid + ":" + "big_drop");
        dropBounce = new ItemMagic().setUnlocalizedName("Bounce Drop").setTextureName(modid + ":" + "bounce_drop");
        dropDeath = new ItemMagic().setUnlocalizedName("Death Drop").setTextureName(modid + ":" + "death_drop");
        dropFly = new ItemMagic().setUnlocalizedName("Fly Drop").setTextureName(modid + ":" + "fly_drop");
        dropLife = new ItemMagic().setUnlocalizedName("Life Drop").setTextureName(modid + ":" + "life_drop");
        dropMagick = new ItemMagic().setUnlocalizedName("Magick Drop").setTextureName(modid + ":" + "magick_drop");
        dropPoison = new ItemMagic().setUnlocalizedName("Poison Drop").setTextureName(modid + ":" + "poison_drop");
        dropRock = new ItemMagic().setUnlocalizedName("Rock Drop").setTextureName(modid + ":" + "rock_drop");
        dropSmall = new ItemMagic().setUnlocalizedName("Small Drop").setTextureName(modid + ":" + "small_drop");
        dropSuper = new ItemMagic().setUnlocalizedName("Super Drop").setTextureName(modid + ":" + "super_drop");
        //Runes
        Fire_Rune= new ItemFire_Rune().setUnlocalizedName("Fire Rune").setTextureName(modid + ":" + "Fire_Rune");
        Earth_Rune= new ItemEarth_Rune().setUnlocalizedName("Earth Rune").setTextureName(modid + ":" + "Earth_Rune");
        Air_Rune= new ItemAir_Rune().setUnlocalizedName("Air Rune").setTextureName(modid + ":" + "Air_Rune");
        runePlate= new ItemRune().setUnlocalizedName("Runeic Plate").setTextureName(modid + ":" + "runicPlate");
        Spirit_Rune= new ItemSpirit_Rune().setUnlocalizedName("Spirit Rune").setTextureName(modid + ":" + "Spirit_Rune");
        Water_Rune= new ItemWater_Rune().setUnlocalizedName("Water Rune").setTextureName(modid + ":" + "Water_Rune");
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
		testCookie = new ItemFoodtestCookie(0, 0, false).setCreativeTab(RPCoreITab).setUnlocalizedName("Item Of Testing").setTextureName(modid + ":" + "ItemOfTesting");
		//Plants
		yellowLeaf = new ItemyellowLeaf().setCreativeTab(RPCoreITab).setUnlocalizedName("Yellow Leaf").setTextureName(modid + ":" + "MagickYellowLeaf");
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
	public void init(FMLInitializationEvent e)







	{



		proxy.registerKeyBindings();
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, proxy);
		ItemStack slabM0 = new ItemStack (Blocks.stone_slab);
		slabM0.setItemDamage(5);


//fluid



		//Recipies.registerItem(magnusCookie, "Test Cookie Creative Only");
		Recipies.registerBlock(obsidianWhite,"White Obsidian");
		//Recipies.registerBlock(oreCrusher, "Ore Crusher");
		Recipies.registerBlock(sandTreated, "Treated Sand");
		//WIP//Recipies.registerBlock(blueStabilizer, "Blue Stabilizer");




		//jars

		//Recipies.registerBlock(moderJar,"moderJar");

		//Note Needs REAL JAR RENDERING

		//If using the minecraft model creator the jar needs to be a 4x4x4 with a lid of 1 thick.
		//This job is for anyone to finish. NOTE: this needs to be fixed before first release.

		Recipies.registerBlock(pjDarkblue,"pjDarkblue");
		Recipies.registerBlock(pjDarkgrey,"pjDarkgrey");
		Recipies.registerBlock(pjDarkred,"pjDarkred");
		Recipies.registerBlock(pjEmpty,"pjEmpty");
		Recipies.registerBlock(pjGreen,"pjGreen");
		Recipies.registerBlock(pjGrey,"pjGrey");
		Recipies.registerBlock(pjLightblue,"pjLightblue");
		Recipies.registerBlock(pjLimegreen,"pjLimegreen");
		Recipies.registerBlock(pjOrange,"pjOrange");
		Recipies.registerBlock(pjPink,"pjPink");
		Recipies.registerBlock(pjRed,"pjRed");
		Recipies.registerBlock(pjWater,"pjWater");

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
        Recipies.registerBlock(TCAM, "TCAM");
		Recipies.registerBlock(blockJadeBomb, "Jade Bomb");



		//cakes ^_^




        //Trees
        Recipies.registerBlock(elderLog, "Red Elderberry Log");
        Recipies.registerBlock(elderLeaf, "Red Elderberry Leaf");
        Recipies.registerBlock(elderSap, "Red Elderberry Sapling");
        Recipies.registerBlock(elderPlanks, "Red Elderberry Planks");
        Recipies.registerBlock(woodPetrified,"Petrified Wood");
		Recipies.registerBlock(polymer, "Polymer");
		Recipies.registerBlock(polymerWoven, "Polyester");

		//ITEMS BELOW THIS LINE -----------------------------------------------

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
	    Recipies.registerItem(ingotSilicon,"ingotSilicon");
		Recipies.registerItem(ingotAluminium ,"ingotAluminium ");
		Recipies.registerItem(ingotChromium,"ingotChromium");
		Recipies.registerItem(ingotLithium,"ingotLithium");
		Recipies.registerItem(ingotNikel,"ingotNikel");
		Recipies.registerItem(ingotPlatinum,"ingotPlatinum");
		//Recipies.registerItem(ingotBrass,"ingotBrass");
		Recipies.registerItem(ingotzink,"ingotzink");
		//Gems
	    Recipies.registerItem(gemDiamond, "Diamond Ingot");
		Recipies.registerItem(gemEmerald, "Emerald Ingot");
		Recipies.registerItem(gemJade, "Raw Jade");
		Recipies.registerItem(gemJadepure, "Jade");
		Recipies.registerItem(anthracite, "Anthracite");

		//Chunks
		Recipies.registerItem(chunkCopper, "Copper Chunk");
        Recipies.registerItem(chunkTin, "Tin Chunk");
        Recipies.registerItem(chunkFerrous, "Ferrous Chunk");
        Recipies.registerItem(chunkSilver, "Silver Chunk");
        Recipies.registerItem(chunkTungsten, "Tungsten Chunk");
        Recipies.registerItem(chunkLead, "Lead Chunk");
		Recipies.registerItem(chunkAluminum,"chunkAluminum");
		 Recipies.registerItem(chunkChromium,"chunkChromium");
		 Recipies.registerItem(chunkLithium,"chunkLithium");
		 Recipies.registerItem(chunkNi,"chunkNi");
		 Recipies.registerItem(chunkPlatinum,"chunkPlatinum");
		  Recipies.registerItem(chunkZink,"chunkZink");


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
			Recipies.registerItem(dustAluminum,"dustAluminum");
			 Recipies.registerItem(dustAluminumoxide,"dustAluminumoxide");

		        Recipies.registerItem(dustChromium,"dustChromium");

		        Recipies.registerItem(dustLithium,"dustLithium");

		        Recipies.registerItem(dustNi,"dustNi");

		        Recipies.registerItem(dustPlatinum,"dustPlatinum");
		        Recipies.registerItem(dustZink,"dustZink");

		        Recipies.registerItem(dustTungstencarbide,"dustTungstencarbide");
		        Recipies.registerItem(dustSilicon,"dustSilicon");






		      //ProtoSprays
		        Recipies.registerItem(protopaintDiamond,"Next Gen Diamond ProtoSpray");
		        Recipies.registerItem(protopaintCopper,"Next Gen Copper ProtoSpray");
		        Recipies.registerItem(protopaintGold,"Next Gen Gold ProtoSpray");
		        Recipies.registerItem(protopaintTungstencarbide,"Next Gen Tungsten Carbide ProtoSpray");
		      //Moulds

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
		      //chips
		        Recipies.registerItem(chipAdvanced, "Advanced Chip");
		        Recipies.registerItem(chipBasic, "Basic Chip");
		        Recipies.registerItem(chipElite, "Elite Chip");
		        Recipies.registerItem(chipLV, "Low-Voltage Chip");
        //Capacitor
        Recipies.registerItem(capacitorBasic,"Basic Capacitor");
        Recipies.registerItem(capacitorCopper,"Copper Capacitor");
        Recipies.registerItem(capacitorDiamond,"Diamond Capacitor");
        Recipies.registerItem(capacitorGold,"Gold Capacitor");
        Recipies.registerItem(capacitorTungstencarbide,"Tungsten Catbide Capacitor");
        //Resistors
        Recipies.registerItem(resistorCase,"Resistor Case");
        Recipies.registerItem(resistorBasic,"Basic Resistor");
        Recipies.registerItem(resistorCopper,"Copper Resistor");
        Recipies.registerItem(resistorDiamond,"Diamond Resistor");
        Recipies.registerItem(resistorGold,"Gold Resistor");
       // Recipies.registerItem(resistorIron,"Iron Resistor"); Phased Out <3 BackSpace47
        Recipies.registerItem(resistorTungstencarbide,"Tungsten Carbide Resistor");
        //transistors
        Recipies.registerItem(transistorBasic,"Basic Transistor");
        Recipies.registerItem(transistorCopper,"Copper Transistor");
        Recipies.registerItem(transistorDiamond,"Diamond Transistor");
        Recipies.registerItem(transistorGold,"Gold Transistor");
       // Recipies.registerItem(transistorIron,"Iron Transistor"); Phased Out <3 BackSpace47
        Recipies.registerItem(transistorTungstencarbide,"Tungsten Carbide Transistor");
       //diode
        Recipies.registerItem(diode,"Diode");
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

        Recipies.registerItem(dustSugar,"Pouch Of Sugar");
        Recipies.registerItem(dustFlour, "Bag Of Flour");
        Recipies.registerItem(chunkSilicon,"chunkSilicon");


//wrench

        Recipies.registerItem(cyberWrench,"cyberWrench");


        Recipies.registerItem(dustMagick, "Magick Dust");
        Recipies.registerItem(dustMagickcompound, "Magick Compound");
        Recipies.registerItem(Fire_Rune, "Fire_Rune");
        Recipies.registerItem(Water_Rune, "Water_Rune");
        Recipies.registerItem(Air_Rune, "Air_Rune");
        Recipies.registerItem(Spirit_Rune, "Spirit_Rune");
        Recipies.registerItem(Earth_Rune, "Earth_Rune");
        Recipies.registerItem(runePlate, "Runic_Plate");


		//Jars

        /*
         *
         * Phased Out These are old and need to be completely removed from code class files and all
        Recipies.registerItem(pjDarkblue,"pjDarkblue");
		Recipies.registerItem(pjDarkgrey,"pjDarkgrey");
		Recipies.registerItem(pjDarkred,"pjDarkred");
		Recipies.registerItem(pjEmpty,"pjEmpty");
		Recipies.registerItem(pjGreen,"pjGreen");
		Recipies.registerItem(pjGrey,"pjGrey");
		Recipies.registerItem(pjLightblue,"pjLightblue");
		Recipies.registerItem(pjLimegreen,"pjLimegreen");
		Recipies.registerItem(pjOrange,"pjOrange");
		Recipies.registerItem(pjPink,"pjPink");
		Recipies.registerItem(pjRed,"pjRed");
		Recipies.registerItem(pjWater,"pjWater");
*/


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
		Recipies.registerItem(hammerIron,"hammerIron");
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






        //Plants
        Recipies.registerItem(yellowLeaf, "Yellow Leaf");



      //Capacitor Components
        Recipies.registerItem(foil,"Foil");
        Recipies.registerItem(foilAluminumoxide,"Aluminum Oxide Foil");
        Recipies.registerItem(paperElectrolized,"Electrolized Paper");



        //Resister Components
        Recipies.registerItem(clayTreated,"Treated Clay");
        Recipies.registerItem(clayTreatedbaked,"Baked Treated Clay");
        Recipies.registerItem(coiledNichrome,"Coiled Nichrome");

        //Diode Components
        Recipies.registerItem(anvilPostassembly,"Postassembly Anvil");
        Recipies.registerItem(Epoxy,"Epoxy");
        Recipies.registerItem(lenseReflective,"Reflective Lense");

      //transistors Components
        Recipies.registerItem(kitTransistor,"Transistor Kit");



        //Misc
        Recipies.registerItem(quartzStick, "Quartc Stick");
        Recipies.registerItem(quartzBowl, "Quartc Bowl");
        Recipies.registerItem(mortar_and_pestle, "Mortar and Pestle");
        Recipies.registerItem(Pencil, "Pencil");
        Recipies.registerItem(blankScroll, "Blank Scroll");
        Recipies.registerItem(scrollCircle, "Circle Scroll");
        Recipies.registerItem(oilTreatment, "Treatment Oil");
        Recipies.registerItem(sandPaper,"Sand Paper");




        //test
        Recipies.registerItem(testCookie, "Item Of Testing");





      //Caustic Items
        Recipies.registerItem(causticMeal, "Caustic Mix");
        Recipies.registerItem(causticCorpuscles, "Caustic Corpuscles ");
        Recipies.registerItem(bloodFirey, "Firey Blood");
        Recipies.registerItem(acidSulfuric, "Sulferic Acid");
        Recipies.registerItem(dustPN,"Potassium Nitrate");
        Recipies.registerItem(dustCharcoal, "Charcoal Dust");
        Recipies.registerItem(toolSkinning, "Skinning Tool");

        Recipies.registerItem(knife,"Knife");


        //Recipies.registerItem(wand_cap_jade,"wand_cap_jade"); To Be Entered
        Recipies.registerBlock(trollEmerald, "Emerald Block?");
		Recipies.registerBlock(trollDiamond, "Diamond Block?");
		Recipies.registerBlock(trollIron, "Iron Block?");
		Recipies.registerBlock(trollGold, "Gold Block?");

		Recipies.registerItem(trollNugetiron, "Iron Nugget?");
		Recipies.registerItem(trollNugetGold, "Gold Nugget?");
		Recipies.registerItem(trollNugetdiamond, "Diamond Nugget?");
		Recipies.registerItem(trollNugetemerald, "Emerald Nugget?");




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
        Recipies.registerSmeltingBlockToItemWUM(oreSilicon,ingotSilicon,5F);
        Recipies.registerSmeltingBlockToItemWUM(oreAluminum,ingotAluminium,5F);
        Recipies.registerSmeltingBlockToItemWUM(oreChromium,ingotChromium,5F);
        Recipies.registerSmeltingBlockToItemWUM(oreLithium,ingotLithium,5F);
        Recipies.registerSmeltingBlockToItemWUM(oreNi,ingotNikel,5F);
        Recipies.registerSmeltingBlockToItemWUM(orePlatinum,ingotPlatinum,5F);
        Recipies.registerSmeltingBlockToItemWUM(oreZink,ingotZink,5F);
        Recipies.registerSmeltingItemWUM(chunkAluminum,ingotAluminium,5F);
        Recipies.registerSmeltingItemWUM(chunkChromium,ingotChromium,5F);
        Recipies.registerSmeltingItemWUM(chunkLithium,ingotLithium,5F);
        Recipies.registerSmeltingItemWUM(chunkNi,ingotNikel,5F);
        Recipies.registerSmeltingItemWUM(chunkPlatinum,ingotPlatinum,5F);
        Recipies.registerSmeltingItemWUM(chunkZink,ingotZink,5F);
        Recipies.registerSmeltingItemWUM(dustAluminum,ingotAluminium,5F);
        Recipies.registerSmeltingItemWUM(dustChromium,ingotChromium,5F);
        Recipies.registerSmeltingItemWUM(dustLithium,ingotLithium,5F);
        Recipies.registerSmeltingItemWUM(dustNi,ingotNikel,5F);
        Recipies.registerSmeltingItemWUM(dustPlatinum,ingotPlatinum,5F);
        Recipies.registerSmeltingItemWUM(dustZink,ingotZink,5F);
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
		Recipies.registerSmeltingItemWUM(dustSilicon,ingotSilicon,5f);
		Recipies.registerSmeltingItemWUM(chunkSilicon,ingotSilicon,5f);
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
		GameRegistry.addShapelessRecipe(new ItemStack (dustSilicon,4, OreDictionary.WILDCARD_VALUE), new ItemStack (oreSilicon), new ItemStack (stoneHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustSilicon,4, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkSilicon), new ItemStack (stoneHammer, 1,  OreDictionary.WILDCARD_VALUE));

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
		GameRegistry.addShapelessRecipe(new ItemStack (dustSilicon,4, OreDictionary.WILDCARD_VALUE), new ItemStack (oreSilicon), new ItemStack (tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustSilicon,4, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkSilicon), new ItemStack (tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE));

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
		GameRegistry.addShapelessRecipe(new ItemStack (dustSilicon,4, OreDictionary.WILDCARD_VALUE), new ItemStack (oreSilicon), new ItemStack (hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustSilicon,4, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkSilicon), new ItemStack (hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE));

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
		GameRegistry.addShapelessRecipe(new ItemStack (dustSilicon,4, OreDictionary.WILDCARD_VALUE), new ItemStack (oreSilicon), new ItemStack (hammerJade, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustSilicon,4, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkSilicon), new ItemStack (hammerJade, 1,  OreDictionary.WILDCARD_VALUE));

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




		GameRegistry.addShapelessRecipe(new ItemStack (dustSilicon,4, OreDictionary.WILDCARD_VALUE), new ItemStack (oreSilicon), new ItemStack (hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustSilicon,4, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkSilicon), new ItemStack (hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE));
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





		GameRegistry.addShapelessRecipe(new ItemStack (dustSilicon,4, OreDictionary.WILDCARD_VALUE), new ItemStack (oreSilicon), new ItemStack (hammerSandstone, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustSilicon,4, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkSilicon), new ItemStack (hammerSandstone, 1,  OreDictionary.WILDCARD_VALUE));
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




		GameRegistry.addShapelessRecipe(new ItemStack (dustSilicon,4, OreDictionary.WILDCARD_VALUE), new ItemStack (oreSilicon), new ItemStack (hammerWooden, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustSilicon,4, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkSilicon), new ItemStack (hammerWooden, 1,  OreDictionary.WILDCARD_VALUE));
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





		GameRegistry.addShapelessRecipe(new ItemStack (dustSilicon,4, OreDictionary.WILDCARD_VALUE), new ItemStack (oreSilicon), new ItemStack (hammerCopper, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustSilicon,4, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkSilicon), new ItemStack (hammerCopper, 1,  OreDictionary.WILDCARD_VALUE));






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




		GameRegistry.addShapelessRecipe(new ItemStack (dustSilicon,4, OreDictionary.WILDCARD_VALUE), new ItemStack (oreSilicon), new ItemStack (hammerSilver, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustSilicon,4, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkSilicon), new ItemStack (hammerSilver, 1,  OreDictionary.WILDCARD_VALUE));
		//#addironhammer
		GameRegistry.addShapelessRecipe(new ItemStack (dustEmerald,2, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.emerald_ore), new ItemStack (hammerIron, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(dustDiamond, 3, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.diamond_ore), new ItemStack(hammerIron, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadSw,1, OreDictionary.WILDCARD_VALUE), " x", " #", 'x', new ItemStack (jadeBlock), '#', new ItemStack (hammerIron, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadSh,1, OreDictionary.WILDCARD_VALUE), "#x", 'x', new ItemStack (jadeBlock), '#', new ItemStack (hammerIron, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (jadeHeadHo,1, OreDictionary.WILDCARD_VALUE), new ItemStack (jadeBlock), new ItemStack (hammerIron, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadAx,1, OreDictionary.WILDCARD_VALUE), " #", " x", 'x', new ItemStack (jadeBlock), '#', new ItemStack (hammerIron, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack (jadeHeadPi,1, OreDictionary.WILDCARD_VALUE),  " x","# ", 'x', new ItemStack (jadeBlock), '#', new ItemStack (hammerIron, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2), new ItemStack (oreCopper), new ItemStack (hammerIron, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustLead,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreLead), new ItemStack (hammerIron, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustFerrous,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreFerrous), new ItemStack (hammerIron, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkCopper), new ItemStack (hammerIron, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustSilver,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreSilver), new ItemStack (hammerIron, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTin,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreTin), new ItemStack (hammerIron, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTungsten,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreTungsten), new ItemStack (hammerIron, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2, OreDictionary.WILDCARD_VALUE), new ItemStack (oreCopper), new ItemStack (hammerIron, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(dustIron,2,OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.iron_ore), new ItemStack(hammerIron, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustFlour,4, OreDictionary.WILDCARD_VALUE),new ItemStack(hammerIron, 1,  OreDictionary.WILDCARD_VALUE),new ItemStack(Items.wheat));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCharcoal,4, OreDictionary.WILDCARD_VALUE),new ItemStack(hammerIron, 1,  OreDictionary.WILDCARD_VALUE),new ItemStack(Items.coal,1,1));
		GameRegistry.addShapelessRecipe(new ItemStack (dustLead,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkLead), new ItemStack (hammerIron, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustFerrous,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkFerrous), new ItemStack (hammerIron, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustSilver,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkSilver), new ItemStack (hammerIron, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTin,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkTin), new ItemStack (hammerIron, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTungsten,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkTungsten), new ItemStack (hammerIron, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustCopper,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkCopper), new ItemStack (hammerIron, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (Blocks.sand,2, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.cobblestone), new ItemStack (hammerIron, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustGold,2, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.gold_ore), new ItemStack (hammerIron, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustSilicon,4, OreDictionary.WILDCARD_VALUE), new ItemStack (oreSilicon), new ItemStack (hammerIron, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustSilicon,4, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkSilicon), new ItemStack (hammerIron, 1,  OreDictionary.WILDCARD_VALUE));

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




		//troll Crafting

		GameRegistry.addShapedRecipe(new ItemStack(gemDiamond,1), "aaa", "aaa", "aba", 'a', new ItemStack(trollNugetdiamond), 'b', new ItemStack(oilTreatment));
		GameRegistry.addShapedRecipe(new ItemStack(Items.gold_ingot,1), "aaa", "aaa", "aba", 'a', new ItemStack(trollNugetGold), 'b', new ItemStack(oilTreatment));
		GameRegistry.addShapedRecipe(new ItemStack(Items.iron_ingot,1), "aaa", "aaa", "aba", 'a', new ItemStack(trollNugetiron), 'b', new ItemStack(oilTreatment));
		GameRegistry.addShapedRecipe(new ItemStack(gemEmerald,1), "aaa", "aaa", "aba", 'a', new ItemStack(trollNugetemerald), 'b', new ItemStack(oilTreatment));



		//Mixed Hammers Needs Sorting #Sorry
		GameRegistry.addShapelessRecipe(new ItemStack (dustAluminum,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkAluminum), new ItemStack (stoneHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustAluminum,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkAluminum), new ItemStack (tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustAluminum,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkAluminum), new ItemStack (hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustAluminum,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkAluminum), new ItemStack (hammerJade, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustAluminum,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkAluminum), new ItemStack (hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustAluminum,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkAluminum), new ItemStack (hammerSandstone, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustAluminum,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkAluminum), new ItemStack (hammerWooden, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustAluminum,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkAluminum), new ItemStack (hammerCopper, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustAluminum,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkAluminum), new ItemStack (hammerSilver, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustAluminum,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkAluminum), new ItemStack (hammerIron, 1,  OreDictionary.WILDCARD_VALUE));

		GameRegistry.addShapelessRecipe(new ItemStack (dustChromium,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkChromium), new ItemStack (stoneHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustChromium,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkChromium), new ItemStack (tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustChromium,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkChromium), new ItemStack (hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustChromium,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkChromium), new ItemStack (hammerJade, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustChromium,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkChromium), new ItemStack (hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustChromium,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkChromium), new ItemStack (hammerSandstone, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustChromium,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkChromium), new ItemStack (hammerWooden, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustChromium,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkChromium), new ItemStack (hammerCopper, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustChromium,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkChromium), new ItemStack (hammerSilver, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustChromium,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkChromium), new ItemStack (hammerIron, 1,  OreDictionary.WILDCARD_VALUE));

		GameRegistry.addShapelessRecipe(new ItemStack (dustLithium,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkLithium), new ItemStack (stoneHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustLithium,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkLithium), new ItemStack (tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustLithium,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkLithium), new ItemStack (hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustLithium,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkLithium), new ItemStack (hammerJade, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustLithium,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkLithium), new ItemStack (hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustLithium,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkLithium), new ItemStack (hammerSandstone, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustLithium,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkLithium), new ItemStack (hammerWooden, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustLithium,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkLithium), new ItemStack (hammerCopper, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustLithium,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkLithium), new ItemStack (hammerSilver, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustLithium,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkLithium), new ItemStack (hammerIron, 1,  OreDictionary.WILDCARD_VALUE));


		GameRegistry.addShapelessRecipe(new ItemStack (dustNi,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkNi), new ItemStack (stoneHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustNi,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkNi), new ItemStack (tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustNi,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkNi), new ItemStack (hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustNi,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkNi), new ItemStack (hammerJade, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustNi,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkNi), new ItemStack (hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustNi,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkNi), new ItemStack (hammerSandstone, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustNi,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkNi), new ItemStack (hammerWooden, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustNi,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkNi), new ItemStack (hammerCopper, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustNi,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkNi), new ItemStack (hammerSilver, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustNi,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkNi), new ItemStack (hammerIron, 1,  OreDictionary.WILDCARD_VALUE));

		GameRegistry.addShapelessRecipe(new ItemStack (dustPlatinum,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkPlatinum), new ItemStack (stoneHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustPlatinum,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkPlatinum), new ItemStack (tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustPlatinum,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkPlatinum), new ItemStack (hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustPlatinum,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkPlatinum), new ItemStack (hammerJade, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustPlatinum,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkPlatinum), new ItemStack (hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustPlatinum,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkPlatinum), new ItemStack (hammerSandstone, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustPlatinum,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkPlatinum), new ItemStack (hammerWooden, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustPlatinum,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkPlatinum), new ItemStack (hammerCopper, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustPlatinum,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkPlatinum), new ItemStack (hammerSilver, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustPlatinum,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkPlatinum), new ItemStack (hammerIron, 1,  OreDictionary.WILDCARD_VALUE));

		GameRegistry.addShapelessRecipe(new ItemStack (dustZink,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkZink), new ItemStack (stoneHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustZink,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkZink), new ItemStack (tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustZink,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkZink), new ItemStack (hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustZink,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkZink), new ItemStack (hammerJade, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustZink,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkZink), new ItemStack (hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustZink,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkZink), new ItemStack (hammerSandstone, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustZink,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkZink), new ItemStack (hammerWooden, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustZink,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkZink), new ItemStack (hammerCopper, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustZink,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkZink), new ItemStack (hammerSilver, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustZink,2, OreDictionary.WILDCARD_VALUE), new ItemStack (chunkZink), new ItemStack (hammerIron, 1,  OreDictionary.WILDCARD_VALUE));


		GameRegistry.addShapelessRecipe(new ItemStack (dustTungstencarbide,2, OreDictionary.WILDCARD_VALUE), new ItemStack (TCAM), new ItemStack (stoneHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTungstencarbide,2, OreDictionary.WILDCARD_VALUE), new ItemStack (TCAM), new ItemStack (tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTungstencarbide,2, OreDictionary.WILDCARD_VALUE), new ItemStack (TCAM), new ItemStack (hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTungstencarbide,2, OreDictionary.WILDCARD_VALUE), new ItemStack (TCAM), new ItemStack (hammerJade, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTungstencarbide,2, OreDictionary.WILDCARD_VALUE), new ItemStack (TCAM), new ItemStack (hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTungstencarbide,2, OreDictionary.WILDCARD_VALUE), new ItemStack (TCAM), new ItemStack (hammerSandstone, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTungstencarbide,2, OreDictionary.WILDCARD_VALUE), new ItemStack (TCAM), new ItemStack (hammerWooden, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTungstencarbide,2, OreDictionary.WILDCARD_VALUE), new ItemStack (TCAM), new ItemStack (hammerCopper, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTungstencarbide,2, OreDictionary.WILDCARD_VALUE), new ItemStack (TCAM), new ItemStack (hammerSilver, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (dustTungstencarbide,2, OreDictionary.WILDCARD_VALUE), new ItemStack (TCAM), new ItemStack (hammerIron, 1,  OreDictionary.WILDCARD_VALUE));

		GameRegistry.addShapelessRecipe(new ItemStack (foil,2, OreDictionary.WILDCARD_VALUE), new ItemStack (ingotAluminium), new ItemStack (stoneHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (foil,2, OreDictionary.WILDCARD_VALUE), new ItemStack (ingotAluminium), new ItemStack (tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (foil,2, OreDictionary.WILDCARD_VALUE), new ItemStack (ingotAluminium), new ItemStack (hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (foil,2, OreDictionary.WILDCARD_VALUE), new ItemStack (ingotAluminium), new ItemStack (hammerJade, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (foil,2, OreDictionary.WILDCARD_VALUE), new ItemStack (ingotAluminium), new ItemStack (hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (foil,2, OreDictionary.WILDCARD_VALUE), new ItemStack (ingotAluminium), new ItemStack (hammerSandstone, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (foil,2, OreDictionary.WILDCARD_VALUE), new ItemStack (ingotAluminium), new ItemStack (hammerWooden, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (foil,2, OreDictionary.WILDCARD_VALUE), new ItemStack (ingotAluminium), new ItemStack (hammerCopper, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (foil,2, OreDictionary.WILDCARD_VALUE), new ItemStack (ingotAluminium), new ItemStack (hammerSilver, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (foil,2, OreDictionary.WILDCARD_VALUE), new ItemStack (ingotAluminium), new ItemStack (hammerIron, 1,  OreDictionary.WILDCARD_VALUE));





		GameRegistry.addShapedRecipe(new ItemStack(chipBasic,1), "cbc", "dad", "cbc", 'a', new ItemStack(plateIron), 'b', new ItemStack(transistorCopper), 'c', new ItemStack(resistorCopper), 'd', new ItemStack(capacitorGold));
		GameRegistry.addShapedRecipe(new ItemStack(chipLV,1), "bcb", "dad", "bcb", 'a', new ItemStack(plateGold), 'b', new ItemStack(capacitorCopper), 'c', new ItemStack(resistorGold), 'd', new ItemStack(transistorGold));
		GameRegistry.addShapedRecipe(new ItemStack(chipAdvanced,1), "aba", "cec", "ada", 'a', new ItemStack(capacitorDiamond), 'b', new ItemStack(resistorDiamond), 'c', new ItemStack(transistorDiamond), 'd', new ItemStack(diode), 'e', new ItemStack(plateDiamond));
		GameRegistry.addShapedRecipe(new ItemStack(chipElite,1), "bcb", "aea", "bcb", 'a', new ItemStack(diode), 'b', new ItemStack(transistorDiamond), 'c', new ItemStack(capacitorTungstencarbide), 'd', new ItemStack(transistorTungstencarbide), 'e', new ItemStack(plateTungstencarbide));




		GameRegistry.addShapelessRecipe(new ItemStack (anvilPostassembly,32, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.anvil), new ItemStack (stoneHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (anvilPostassembly,32, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.anvil), new ItemStack (tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (anvilPostassembly,32, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.anvil), new ItemStack (hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (anvilPostassembly,32, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.anvil), new ItemStack (hammerJade, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (anvilPostassembly,32, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.anvil), new ItemStack (hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (anvilPostassembly,32, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.anvil), new ItemStack (hammerSandstone, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (anvilPostassembly,32, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.anvil), new ItemStack (hammerWooden, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (anvilPostassembly,32, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.anvil), new ItemStack (hammerCopper, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (anvilPostassembly,32, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.anvil), new ItemStack (hammerSilver, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (anvilPostassembly,32, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.anvil), new ItemStack (hammerIron, 1,  OreDictionary.WILDCARD_VALUE));



		GameRegistry.addShapelessRecipe(new ItemStack (foilAluminumoxide,4), new ItemStack (dustAluminumoxide), new ItemStack (foil), new ItemStack(Items.water_bucket));

		GameRegistry.addShapelessRecipe(new ItemStack (dustAluminumoxide,1), new ItemStack (dustAluminum), new ItemStack(Items.water_bucket));


		GameRegistry.addShapelessRecipe(new ItemStack (paperElectrolized,4), new ItemStack (Items.paper), new ItemStack (bloodFirey));


		GameRegistry.addShapelessRecipe(new ItemStack (capacitorBasic,1), new ItemStack (foil), new ItemStack (foilAluminumoxide), new ItemStack(paperElectrolized));



		GameRegistry.addShapelessRecipe(new ItemStack (resistorCase,2, OreDictionary.WILDCARD_VALUE), new ItemStack (clayTreatedbaked), new ItemStack (stoneHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (resistorCase,2, OreDictionary.WILDCARD_VALUE), new ItemStack (clayTreatedbaked), new ItemStack (tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (resistorCase,2, OreDictionary.WILDCARD_VALUE), new ItemStack (clayTreatedbaked), new ItemStack (hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (resistorCase,2, OreDictionary.WILDCARD_VALUE), new ItemStack (clayTreatedbaked), new ItemStack (hammerJade, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (resistorCase,2, OreDictionary.WILDCARD_VALUE), new ItemStack (clayTreatedbaked), new ItemStack (hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (resistorCase,2, OreDictionary.WILDCARD_VALUE), new ItemStack (clayTreatedbaked), new ItemStack (hammerSandstone, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (resistorCase,2, OreDictionary.WILDCARD_VALUE), new ItemStack (clayTreatedbaked), new ItemStack (hammerWooden, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (resistorCase,2, OreDictionary.WILDCARD_VALUE), new ItemStack (clayTreatedbaked), new ItemStack (hammerCopper, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (resistorCase,2, OreDictionary.WILDCARD_VALUE), new ItemStack (clayTreatedbaked), new ItemStack (hammerSilver, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (resistorCase,2, OreDictionary.WILDCARD_VALUE), new ItemStack (clayTreatedbaked), new ItemStack (hammerIron, 1,  OreDictionary.WILDCARD_VALUE));



		GameRegistry.addShapedRecipe(new ItemStack(blockSilicon,1), "aaa", "aaa", "aaa", 'a', new ItemStack(ingotSilicon));
		GameRegistry.addShapelessRecipe(new ItemStack (ingotSilicon,9), new ItemStack (blockSilicon));
		GameRegistry.addShapedRecipe(new ItemStack(blockAluminum,1), "aaa", "aaa", "aaa", 'a', new ItemStack(ingotAluminium));
		GameRegistry.addShapelessRecipe(new ItemStack (ingotAluminium,9), new ItemStack (blockAluminum));
		GameRegistry.addShapedRecipe(new ItemStack(blockChromium,1), "aaa", "aaa", "aaa", 'a', new ItemStack(ingotChromium));
		GameRegistry.addShapelessRecipe(new ItemStack (ingotChromium,9), new ItemStack (blockChromium));
		GameRegistry.addShapedRecipe(new ItemStack(blockLithium,1), "aaa", "aaa", "aaa", 'a', new ItemStack(ingotLithium));
		GameRegistry.addShapelessRecipe(new ItemStack (ingotLithium,9), new ItemStack (blockLithium));
		GameRegistry.addShapedRecipe(new ItemStack(blockNi,1), "aaa", "aaa", "aaa", 'a', new ItemStack(ingotNikel));
		GameRegistry.addShapelessRecipe(new ItemStack (ingotNikel,9), new ItemStack (blockNi));
		GameRegistry.addShapedRecipe(new ItemStack(blockPlatinum,1), "aaa", "aaa", "aaa", 'a', new ItemStack(ingotPlatinum));
		GameRegistry.addShapelessRecipe(new ItemStack (ingotPlatinum,9), new ItemStack (blockPlatinum));
		GameRegistry.addShapedRecipe(new ItemStack(blockZink,1), "aaa", "aaa", "aaa", 'a', new ItemStack(ingotZink));
		GameRegistry.addShapelessRecipe(new ItemStack (ingotZink,9), new ItemStack (blockZink));


		GameRegistry.addShapelessRecipe(new ItemStack (coiledNichrome,2, OreDictionary.WILDCARD_VALUE), new ItemStack (ingotChromium), new ItemStack (stoneHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (coiledNichrome,2, OreDictionary.WILDCARD_VALUE), new ItemStack (ingotChromium), new ItemStack (tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (coiledNichrome,2, OreDictionary.WILDCARD_VALUE), new ItemStack (ingotChromium), new ItemStack (hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (coiledNichrome,2, OreDictionary.WILDCARD_VALUE), new ItemStack (ingotChromium), new ItemStack (hammerJade, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (coiledNichrome,2, OreDictionary.WILDCARD_VALUE), new ItemStack (ingotChromium), new ItemStack (hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (coiledNichrome,2, OreDictionary.WILDCARD_VALUE), new ItemStack (ingotChromium), new ItemStack (hammerSandstone, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (coiledNichrome,2, OreDictionary.WILDCARD_VALUE), new ItemStack (ingotChromium), new ItemStack (hammerWooden, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (coiledNichrome,2, OreDictionary.WILDCARD_VALUE), new ItemStack (ingotChromium), new ItemStack (hammerCopper, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (coiledNichrome,2, OreDictionary.WILDCARD_VALUE), new ItemStack (ingotChromium), new ItemStack (hammerSilver, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (coiledNichrome,2, OreDictionary.WILDCARD_VALUE), new ItemStack (ingotChromium), new ItemStack (hammerIron, 1,  OreDictionary.WILDCARD_VALUE));



		GameRegistry.addShapelessRecipe(new ItemStack (lenseReflective,2, OreDictionary.WILDCARD_VALUE), new ItemStack (Items.glass_bottle), new ItemStack (stoneHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (lenseReflective,2, OreDictionary.WILDCARD_VALUE), new ItemStack (Items.glass_bottle), new ItemStack (tungstenCarbideHammer, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (lenseReflective,2, OreDictionary.WILDCARD_VALUE), new ItemStack (Items.glass_bottle), new ItemStack (hammerDiamond, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (lenseReflective,2, OreDictionary.WILDCARD_VALUE), new ItemStack (Items.glass_bottle), new ItemStack (hammerJade, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (lenseReflective,2, OreDictionary.WILDCARD_VALUE), new ItemStack (Items.glass_bottle), new ItemStack (hammerNetherstar, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (lenseReflective,2, OreDictionary.WILDCARD_VALUE), new ItemStack (Items.glass_bottle), new ItemStack (hammerSandstone, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (lenseReflective,2, OreDictionary.WILDCARD_VALUE), new ItemStack (Items.glass_bottle), new ItemStack (hammerWooden, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (lenseReflective,2, OreDictionary.WILDCARD_VALUE), new ItemStack (Items.glass_bottle), new ItemStack (hammerCopper, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (lenseReflective,2, OreDictionary.WILDCARD_VALUE), new ItemStack (Items.glass_bottle), new ItemStack (hammerSilver, 1,  OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack (lenseReflective,2, OreDictionary.WILDCARD_VALUE), new ItemStack (Items.glass_bottle), new ItemStack (hammerIron, 1,  OreDictionary.WILDCARD_VALUE));



		GameRegistry.addShapelessRecipe(new ItemStack (resistorBasic,1), new ItemStack (resistorCase), new ItemStack (coiledNichrome));




		GameRegistry.addShapelessRecipe(new ItemStack (Epoxy,4), new ItemStack (polymer), new ItemStack (acidSulfuric));

		GameRegistry.addShapelessRecipe(new ItemStack (diode,2), new ItemStack (anvilPostassembly), new ItemStack (Epoxy), new ItemStack (lenseReflective));
		GameRegistry.addShapelessRecipe(new ItemStack (kitTransistor,1), new ItemStack (Items.redstone), new ItemStack (Blocks.redstone_torch));


		GameRegistry.addShapelessRecipe(new ItemStack (transistorBasic,1), new ItemStack (kitTransistor), new ItemStack (kitTransistor), new ItemStack (kitTransistor), new ItemStack (kitTransistor));





		//protosprays
				GameRegistry.addShapedRecipe(new ItemStack(protopaintDiamond), "yxy", "xzx", "yxy", 'x', new ItemStack(dustDiamond), 'z', new ItemStack(Blocks.glass), 'y', new ItemStack(ingotSteel));
				GameRegistry.addShapedRecipe(new ItemStack(protopaintCopper), "yxy", "xzx", "yxy", 'x', new ItemStack(dustCopper), 'z', new ItemStack(Blocks.glass), 'y', new ItemStack(ingotSteel));
				GameRegistry.addShapedRecipe(new ItemStack(protopaintGold), "yxy", "xzx", "yxy", 'x', new ItemStack(dustBronze), 'z', new ItemStack(Blocks.glass), 'y', new ItemStack(ingotSteel));
				GameRegistry.addShapedRecipe(new ItemStack(protopaintTungstencarbide), "yxy", "xzx", "yxy", 'x', new ItemStack(dustTungstencarbide), 'z', new ItemStack(Blocks.glass), 'y', new ItemStack(ingotSteel));
				GameRegistry.addShapelessRecipe(new ItemStack (capacitorDiamond), new ItemStack (protopaintDiamond, 1,  OreDictionary.WILDCARD_VALUE), new ItemStack (capacitorBasic));



				GameRegistry.addShapelessRecipe(new ItemStack (capacitorDiamond), new ItemStack (protopaintDiamond, 1,  OreDictionary.WILDCARD_VALUE), new ItemStack (capacitorBasic));

				GameRegistry.addShapelessRecipe(new ItemStack (capacitorCopper), new ItemStack (protopaintCopper, 1,  OreDictionary.WILDCARD_VALUE), new ItemStack (capacitorBasic));

				GameRegistry.addShapelessRecipe(new ItemStack (capacitorGold), new ItemStack (protopaintGold, 1,  OreDictionary.WILDCARD_VALUE), new ItemStack (capacitorBasic));

				GameRegistry.addShapelessRecipe(new ItemStack (capacitorTungstencarbide), new ItemStack (protopaintTungstencarbide, 1,  OreDictionary.WILDCARD_VALUE), new ItemStack (capacitorBasic));

				GameRegistry.addShapelessRecipe(new ItemStack (resistorDiamond), new ItemStack (protopaintDiamond, 1,  OreDictionary.WILDCARD_VALUE), new ItemStack (resistorBasic));

				GameRegistry.addShapelessRecipe(new ItemStack (resistorCopper), new ItemStack (protopaintCopper, 1,  OreDictionary.WILDCARD_VALUE), new ItemStack (resistorBasic));

				GameRegistry.addShapelessRecipe(new ItemStack (resistorGold), new ItemStack (protopaintGold, 1,  OreDictionary.WILDCARD_VALUE), new ItemStack (resistorBasic));

				GameRegistry.addShapelessRecipe(new ItemStack (resistorTungstencarbide), new ItemStack (protopaintTungstencarbide, 1,  OreDictionary.WILDCARD_VALUE), new ItemStack (resistorBasic));

				GameRegistry.addShapelessRecipe(new ItemStack (transistorGold), new ItemStack (protopaintGold, 1,  OreDictionary.WILDCARD_VALUE), new ItemStack (transistorBasic));

				GameRegistry.addShapelessRecipe(new ItemStack (transistorDiamond), new ItemStack (protopaintCopper, 1,  OreDictionary.WILDCARD_VALUE), new ItemStack (transistorBasic));

				GameRegistry.addShapelessRecipe(new ItemStack (transistorCopper), new ItemStack (protopaintGold, 1,  OreDictionary.WILDCARD_VALUE), new ItemStack (transistorBasic));

				GameRegistry.addShapelessRecipe(new ItemStack (transistorTungstencarbide), new ItemStack (protopaintTungstencarbide, 1,  OreDictionary.WILDCARD_VALUE), new ItemStack (transistorBasic));




		GameRegistry.addShapelessRecipe(new ItemStack (oilTreatment,16), new ItemStack (bloodFirey), new ItemStack (Items.glass_bottle), new ItemStack(dustPN), new ItemStack(dropMagick));
		GameRegistry.registerWorldGenerator(new RPWorldGen(), 1);

		GameRegistry.registerFuelHandler(new RPFuelHandler());
	}
}

