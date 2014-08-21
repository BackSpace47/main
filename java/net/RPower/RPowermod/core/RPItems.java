package net.RPower.RPowermod.core;

import net.RPower.RPowermod.block.blockRPBlockblockChromium;
import net.RPower.RPowermod.block.blockRPBlockblockLithium;
import net.RPower.RPowermod.block.blockRPBlockblockNi;
import net.RPower.RPowermod.block.blockRPBlockblockPlatinum;
import net.RPower.RPowermod.block.blockRPBlockblockZink;
import net.RPower.RPowermod.block.blockRPBlockoreChromium;
import net.RPower.RPowermod.block.blockRPBlockoreLithium;
import net.RPower.RPowermod.block.blockRPBlockoreNi;
import net.RPower.RPowermod.block.blockRPBlockorePlatinum;
import net.RPower.RPowermod.block.blockRPBlockoreZink;
import net.RPower.RPowermod.item.*;
import net.RPower.RPowermod.net.ItemFoodcreativeCookie;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class RPItems {
	
	//Items
    
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



	    //CAKE!!!!! >:-(

	    public static Item enderCakefresh;


	    public static Item dustSugar;
	    
	    
		/*
		To add a item first do these lines (public static Item <name of item>;) then inside preInit do (<name of item> = new Item<name of item>().setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("<name of item whit capital leters and space if two or more words>").setTextureName(RPCore.modid + ":" + "<texture name of item>"); then under init do (Recipies.registerItem(<name of item>, "<name of item whit capital leters and space if two or more words>");))
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


	    public static void initItems(){
	    	//TrollItems
			trollNugetdiamond = new itemtrollNugetdiamond().setUnlocalizedName("Diamond Troll Nugget").setTextureName(RPCore.modid + ":" + "nuggetDiamond").setCreativeTab(RPCore.RPCoreITab);
			trollNugetiron = new itemtrollNugetiron().setUnlocalizedName("Iron Troll Nugget").setTextureName(RPCore.modid + ":" + "nuggetIron").setCreativeTab(RPCore.RPCoreITab);
			trollNugetemerald = new itemtrollNugetemerald().setUnlocalizedName("Emerald Troll Nugget").setTextureName(RPCore.modid + ":" + "nuggetEmerald").setCreativeTab(RPCore.RPCoreITab);
			trollNugetGold = new itemtrollNugetGold().setUnlocalizedName("Gold Troll Nugget").setTextureName(RPCore.modid + ":" + "nuggetGold").setCreativeTab(RPCore.RPCoreITab);
			//Caustic Items
			causticMeal = new itemmealCaustic().setUnlocalizedName("Caustic Mix").setTextureName(RPCore.modid + ":" + "mealCaustic").setCreativeTab(RPCore.RPCoreITab);
		    causticCorpuscles = new itemcorpCaustic().setUnlocalizedName("Caustic Corpuscles").setTextureName(RPCore.modid + ":" + "corpusclesCaustic").setCreativeTab(RPCore.RPCoreITab);
		    bloodFirey = new itembloodFirey().setUnlocalizedName("Firey Blood").setTextureName(RPCore.modid + ":" + "bloodFirey").setCreativeTab(RPCore.RPCoreITab);
		    acidSulfuric = new itemacidS().setUnlocalizedName("Sulfuric Acid").setTextureName(RPCore.modid + ":" + "SulfuricAcid").setCreativeTab(RPCore.RPCoreITab);
		    dustPN = new itemDustPN().setUnlocalizedName("Potassium Nitrate").setTextureName(RPCore.modid + ":" + "PotassiumNitrate").setCreativeTab(RPCore.RPCoreITab);
		    dustCharcoal = new itemdustCharcoal().setUnlocalizedName("Charcoal Dust").setTextureName(RPCore.modid + ":" + "dustCharcoal").setCreativeTab(RPCore.RPCoreITab);
		    toolSkinning = new itemSkinningtool().setUnlocalizedName("Skinning Tool").setTextureName(RPCore.modid + ":" + "toolSkinning").setCreativeTab(RPCore.RPCoreITab);
			//
		    //Capacitor
		    foil = new itemFoil().setUnlocalizedName("Foil").setTextureName(RPCore.modid + ":" + "Foil").setCreativeTab(RPCore.RPCoreITab);
		    foilAluminumoxide = new itemFoilaluminumoxide().setUnlocalizedName("Aluminum Oxide Foil").setTextureName(RPCore.modid + ":" + "foilAluminumoxide").setCreativeTab(RPCore.RPCoreITab);
		    paperElectrolized = new itempaperElectrolized().setUnlocalizedName("Electrolized Paper").setTextureName(RPCore.modid + ":" + "paperElectrolized").setCreativeTab(RPCore.RPCoreITab);
		    capacitorBasic = new itemmcapacitorBasic().setUnlocalizedName("Basic Capacitor").setTextureName(RPCore.modid + ":" + "capacitorBasic").setCreativeTab(RPCore.RPCoreITab);
		    capacitorCopper = new itemcapacitorCopper().setUnlocalizedName("Copper Capacitor").setTextureName(RPCore.modid + ":" + "capacitorCopper").setCreativeTab(RPCore.RPCoreITab);
		    capacitorDiamond = new itemcapacitorDiamond().setUnlocalizedName("Diamond Capacitor").setTextureName(RPCore.modid + ":" + "capacitorDiamond").setCreativeTab(RPCore.RPCoreITab);
		    capacitorGold = new itemcapacitorGold().setUnlocalizedName("Gold Capacitor").setTextureName(RPCore.modid + ":" + "capacitorGold").setCreativeTab(RPCore.RPCoreITab);
		    capacitorTungstencarbide = new itemcapacitorTungstencarbide().setUnlocalizedName("Tungstencarbide Capacitor").setTextureName(RPCore.modid + ":" + "capacitorTungstencarbide").setCreativeTab(RPCore.RPCoreITab);
		    //Diode
		    anvilPostassembly = new itemanvilPostassembly().setUnlocalizedName("Postassembly Anvil").setTextureName(RPCore.modid + ":" + "anvilPostAssembaly").setCreativeTab(RPCore.RPCoreITab);
		    Epoxy = new itemEpoxy().setUnlocalizedName("Epoxy").setTextureName(RPCore.modid + ":" + "Epoxy").setCreativeTab(RPCore.RPCoreITab);
		    lenseReflective = new itemlenseReflective().setUnlocalizedName("Reflective Lense").setTextureName(RPCore.modid + ":" + "lenseReflective").setCreativeTab(RPCore.RPCoreITab);
		    diode = new itemdiode().setUnlocalizedName("Diode").setTextureName(RPCore.modid + ":" + "Diode").setCreativeTab(RPCore.RPCoreITab);
		    //Resistor
		    clayTreated = new itemclayTreated().setUnlocalizedName("Treated Clay").setTextureName(RPCore.modid + ":" + "clayTreated").setCreativeTab(RPCore.RPCoreITab);
		    clayTreatedbaked = new itemclayTreatedbaked().setUnlocalizedName("Baked Treated Clay").setTextureName(RPCore.modid + ":" + "clayTreatedbaked").setCreativeTab(RPCore.RPCoreITab);
		    coiledNichrome = new itemcoiledNichrome().setUnlocalizedName("Coiled Nichrome").setTextureName(RPCore.modid + ":" + "coiledNichrome").setCreativeTab(RPCore.RPCoreITab);
		    resistorCase = new itemresistorCase().setUnlocalizedName("Resistor Case").setTextureName(RPCore.modid + ":" + "resistorCase").setCreativeTab(RPCore.RPCoreITab);
		    resistorBasic = new itemresistorBasic().setUnlocalizedName("Basic Resistor").setTextureName(RPCore.modid + ":" + "resistorBasic").setCreativeTab(RPCore.RPCoreITab);
		    resistorCopper = new itemresistorCopper().setUnlocalizedName("Copper Resistor").setTextureName(RPCore.modid + ":" + "resistorCopper").setCreativeTab(RPCore.RPCoreITab);
		    resistorDiamond = new itemresistorDiamond().setUnlocalizedName("Diamond Resistor").setTextureName(RPCore.modid + ":" + "resistorDiamond").setCreativeTab(RPCore.RPCoreITab);
		    resistorGold = new itemresistorGold().setUnlocalizedName("Gold Resistor").setTextureName(RPCore.modid + ":" + "resistorGold").setCreativeTab(RPCore.RPCoreITab);
		    resistorIron = new itemresistorIron().setUnlocalizedName("Iron Resistor").setTextureName(RPCore.modid + ":" + "resistorIron").setCreativeTab(RPCore.RPCoreITab);
		    resistorTungstencarbide = new itemresistorTungstencarbide().setUnlocalizedName("Tungsten Carbide Resistor").setTextureName(RPCore.modid + ":" + "resistorTungstencarbide").setCreativeTab(RPCore.RPCoreITab);
		    //Transistors
		    kitTransistor = new itemkitTransistor().setUnlocalizedName("Transistor Kit").setTextureName(RPCore.modid + ":" + "kitTransistor").setCreativeTab(RPCore.RPCoreITab);
		    transistorBasic = new itemtransistorBasic().setUnlocalizedName("Basic Transistor").setTextureName(RPCore.modid + ":" + "transistorBasic").setCreativeTab(RPCore.RPCoreITab);
		    transistorCopper = new itemransistorCopper().setUnlocalizedName("Copper Transistor").setTextureName(RPCore.modid + ":" + "transistorCopper").setCreativeTab(RPCore.RPCoreITab);
		    transistorDiamond = new itemtransistorDiamond().setUnlocalizedName("Diamond Transistor").setTextureName(RPCore.modid + ":" + "transistorDiamond").setCreativeTab(RPCore.RPCoreITab);
		    transistorGold = new itemtransistorGold().setUnlocalizedName("Gold Transistor").setTextureName(RPCore.modid + ":" + "transistorGold").setCreativeTab(RPCore.RPCoreITab);
		    transistorIron = new itemtransistorIron().setUnlocalizedName("Iron Transistor").setTextureName(RPCore.modid + ":" + "transistorIron").setCreativeTab(RPCore.RPCoreITab);
		    transistorTungstencarbide = new itemtransistorTungstencarbide().setUnlocalizedName("Tungsten Carbide Transistor").setTextureName(RPCore.modid + ":" + "transistorTungstencarbide").setCreativeTab(RPCore.RPCoreITab);
		   //mess
		    chunkAluminum = new itemchunkAluminum().setUnlocalizedName("chunkAluminum").setTextureName(RPCore.modid + ":" + "chunkAluminum").setCreativeTab(RPCore.RPCoreITab);
		    dustAluminumoxide = new itemdustAluminumoxide().setUnlocalizedName("dustAluminumoxide").setTextureName(RPCore.modid + ":" + "dustAluminumoxide").setCreativeTab(RPCore.RPCoreITab);
		    chunkChromium = new itemchunkChromium().setUnlocalizedName("chunkChromium").setTextureName(RPCore.modid + ":" + "chunkChromium").setCreativeTab(RPCore.RPCoreITab);
		    dustChromium = new itemdustChromium().setUnlocalizedName("dustChromium").setTextureName(RPCore.modid + ":" + "dustChromium").setCreativeTab(RPCore.RPCoreITab);
		    chunkLithium = new itemchunkLithium().setUnlocalizedName("chunkLithium").setTextureName(RPCore.modid + ":" + "chunkLithium").setCreativeTab(RPCore.RPCoreITab);
		    dustLithium = new itemdustLithium().setUnlocalizedName("dustLithium").setTextureName(RPCore.modid + ":" + "dustLithium").setCreativeTab(RPCore.RPCoreITab);
		    chunkNi = new itemchunkNi().setUnlocalizedName("chunkNi").setTextureName(RPCore.modid + ":" + "chunkNi").setCreativeTab(RPCore.RPCoreITab);
		    dustNi = new itemdustNi().setUnlocalizedName("dustNi").setTextureName(RPCore.modid + ":" + "dustNi").setCreativeTab(RPCore.RPCoreITab);
		    chunkPlatinum = new itemchunkPlatinum().setUnlocalizedName("chunkPlatinum").setTextureName(RPCore.modid + ":" + "chunkPlatinum").setCreativeTab(RPCore.RPCoreITab);
		    dustPlatinum = new itemdustPlatinum().setUnlocalizedName("dustPlatinum").setTextureName(RPCore.modid + ":" + "dustPlatinum").setCreativeTab(RPCore.RPCoreITab);
		    dustZink = new itemdustZink().setUnlocalizedName("dustZink").setTextureName(RPCore.modid + ":" + "dustZink").setCreativeTab(RPCore.RPCoreITab);
		    chunkZink = new itemchunkZink().setUnlocalizedName("chunkZink").setTextureName(RPCore.modid + ":" + "chunkZink").setCreativeTab(RPCore.RPCoreITab);
		    ingotzink = new itemingotzink().setUnlocalizedName("ingotzink").setTextureName(RPCore.modid + ":" + "ingotzink").setCreativeTab(RPCore.RPCoreITab);
		    oreChromium = new blockRPBlockoreChromium(Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("oreChromium").setBlockTextureName(RPCore.modid + ":" + "oreChromium").setHardness(5F).setResistance(1F);
		    blockChromium = new blockRPBlockblockChromium(Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("blockChromium").setBlockTextureName(RPCore.modid + ":" + "blockChromium").setHardness(5F).setResistance(1F);
		    oreLithium = new blockRPBlockoreLithium(Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("oreLithium").setBlockTextureName(RPCore.modid + ":" + "oreLithium").setHardness(5F).setResistance(1F);
		    blockLithium = new blockRPBlockblockLithium(Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("blockLithium").setBlockTextureName(RPCore.modid + ":" + "blockLithium").setHardness(5F).setResistance(1F);
		    oreNi = new blockRPBlockoreNi(Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("oreNi").setBlockTextureName(RPCore.modid + ":" + "oreNi").setHardness(5F).setResistance(1F);
		    blockNi = new blockRPBlockblockNi(Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("blockNi").setBlockTextureName(RPCore.modid + ":" + "blockNi").setHardness(5F).setResistance(1F);
		    orePlatinum = new blockRPBlockorePlatinum(Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("orePlatinum").setBlockTextureName(RPCore.modid + ":" + "orePlatinum").setHardness(5F).setResistance(1F);
		    blockPlatinum = new blockRPBlockblockPlatinum(Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("blockPlatinum").setBlockTextureName(RPCore.modid + ":" + "blockPlatinum").setHardness(5F).setResistance(1F);
		    oreZink = new blockRPBlockoreZink(Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("oreZink").setBlockTextureName(RPCore.modid + ":" + "oreZink").setHardness(5F).setResistance(1F);
		    blockZink = new blockRPBlockblockZink(Material.rock).setCreativeTab(RPCore.RPCoreBTab).setBlockName("blockZink").setBlockTextureName(RPCore.modid + ":" + "blockZink").setHardness(5F).setResistance(1F);
		    dustTungstencarbide = new itemdustTungstencarbide().setUnlocalizedName("dustTungstencarbide").setTextureName(RPCore.modid + ":" + "dustTungstencarbide").setCreativeTab(RPCore.RPCoreITab);
		    ingotSilicon = new itemingotSilicon().setUnlocalizedName("ingotSilicon").setTextureName(RPCore.modid + ":" + "ingotSilicon").setCreativeTab(RPCore.RPCoreITab);
		    ingotAluminium  = new itemingotAluminium ().setUnlocalizedName("ingotAluminium").setTextureName(RPCore.modid + ":" + "ingotAluminium").setCreativeTab(RPCore.RPCoreITab);
		    ingotChromium = new itemingotChromium().setUnlocalizedName("ingotChromium").setTextureName(RPCore.modid + ":" + "ingotChromium").setCreativeTab(RPCore.RPCoreITab);
		    ingotLithium = new itemingotLithium().setUnlocalizedName("ingotLithium").setTextureName(RPCore.modid + ":" + "ingotLithium").setCreativeTab(RPCore.RPCoreITab);
		    ingotNikel = new itemingotNikel().setUnlocalizedName("ingotNikel").setTextureName(RPCore.modid + ":" + "ingotNikel").setCreativeTab(RPCore.RPCoreITab);
		    ingotPlatinum = new itemingotPlatinum().setUnlocalizedName("ingotPlatinum").setTextureName(RPCore.modid + ":" + "ingotPlatinum").setCreativeTab(RPCore.RPCoreITab);
		    chunkSilicon = new itemchunkSilicon().setUnlocalizedName("chunkSilicon").setTextureName(RPCore.modid + ":" + "chunkSilicon").setCreativeTab(RPCore.RPCoreITab);




		    pjDarkblue = new itempjDarkblue().setUnlocalizedName("pjDarkblue").setTextureName(RPCore.modid + ":" + "pjDarkblue").setCreativeTab(RPCore.RPCoreITab);
		    pjDarkgrey = new itempjDarkgrey().setUnlocalizedName("pjDarkgrey").setTextureName(RPCore.modid + ":" + "pjDarkgrey").setCreativeTab(RPCore.RPCoreITab);
		    pjDarkred = new itempjDarkred().setUnlocalizedName("pjDarkred").setTextureName(RPCore.modid + ":" + "pjDarkred").setCreativeTab(RPCore.RPCoreITab);
		    pjEmpty = new itempjEmpty().setUnlocalizedName("pjEmpty").setTextureName(RPCore.modid + ":" + "pjEmpty").setCreativeTab(RPCore.RPCoreITab);
		    pjGreen = new itempjGreen().setUnlocalizedName("pjGreen").setTextureName(RPCore.modid + ":" + "pjGreen").setCreativeTab(RPCore.RPCoreITab);
		    pjGrey = new itempjGrey().setUnlocalizedName("pjGrey").setTextureName(RPCore.modid + ":" + "pjGrey").setCreativeTab(RPCore.RPCoreITab);
		    pjLightblue = new itempjLightblue().setUnlocalizedName("pjLightblue").setTextureName(RPCore.modid + ":" + "pjLightblue").setCreativeTab(RPCore.RPCoreITab);
		    pjLimegreen = new itempjLimegreen().setUnlocalizedName("pjLimegreen").setTextureName(RPCore.modid + ":" + "pjLimegreen").setCreativeTab(RPCore.RPCoreITab);
		    pjOrange = new itempjOrange().setUnlocalizedName("pjOrange").setTextureName(RPCore.modid + ":" + "pjOrange").setCreativeTab(RPCore.RPCoreITab);
		    pjPink = new itempjPink().setUnlocalizedName("pjPink").setTextureName(RPCore.modid + ":" + "pjPink").setCreativeTab(RPCore.RPCoreITab);
		    pjRed = new itempjRed().setUnlocalizedName("pjRed").setTextureName(RPCore.modid + ":" + "pjRed").setCreativeTab(RPCore.RPCoreITab);
		    pjWater = new itempjWater().setUnlocalizedName("pjWater").setTextureName(RPCore.modid + ":" + "pjWater").setCreativeTab(RPCore.RPCoreITab);
		    ingotBrass = new itemingotBrass().setUnlocalizedName("ingotBrass").setTextureName(RPCore.modid + ":" + "ingotBrass").setCreativeTab(RPCore.RPCoreITab);



	// motha-friggin CAKE!!!! >:-(

		    //enderCakefresh = new enderCakefresh().setUnlocalizedName("enderCakefresh").setTextureName(RPCore.modid + ":" + "enderCakefresh").setCreativeTab(RPCore.RPCoreITab); Dont touch the cake is a lie o.o unless u wanna fix it lol



		    //chips
		    chipAdvanced = new itemchipAdvanced().setUnlocalizedName("Advanced Chip").setTextureName(RPCore.modid + ":" + "chipAdvanced").setCreativeTab(RPCore.RPCoreITab);
		    chipBasic = new itemchipBasic().setUnlocalizedName("Basic Chip").setTextureName(RPCore.modid + ":" + "chipBasic").setCreativeTab(RPCore.RPCoreITab);
		    chipElite = new itemchipElite().setUnlocalizedName("Elite Chip").setTextureName(RPCore.modid + ":" + "chipElite").setCreativeTab(RPCore.RPCoreITab);
		    chipLV = new itemchipLV().setUnlocalizedName("Low-Voltage Chip").setTextureName(RPCore.modid + ":" + "chipLV").setCreativeTab(RPCore.RPCoreITab);
		    //Protosprays
		    protopaintCopper = new itemprotopaintCopper().setUnlocalizedName("Next Gen Copper ProtoSpray").setTextureName(RPCore.modid + ":" + "protopaintCopper").setCreativeTab(RPCore.RPCoreITab);
		    protopaintDiamond = new itemprotopaintDiamond().setUnlocalizedName("Next Gen Diamond ProtoSpray").setTextureName(RPCore.modid + ":" + "protopaintDiamond").setCreativeTab(RPCore.RPCoreITab);
		    protopaintGold = new itemprotopaintGold().setUnlocalizedName("Next Gen Gold ProtoSpray").setTextureName(RPCore.modid + ":" + "protopaintGold").setCreativeTab(RPCore.RPCoreITab);
		    protopaintTungstencarbide = new itemprotopaintTungstencarbide().setUnlocalizedName("Next Gen Tungsten Carbide ProtoSpray").setTextureName(RPCore.modid + ":" + "protopaintTungstencarbide").setCreativeTab(RPCore.RPCoreITab);
		    //Capacitor
		    foil = new itemFoil().setUnlocalizedName("Foil").setTextureName(RPCore.modid + ":" + "Foil").setCreativeTab(RPCore.RPCoreITab);
		    foilAluminumoxide = new itemFoilaluminumoxide().setUnlocalizedName("Aluminum Oxide Foil").setTextureName(RPCore.modid + ":" + "foilAluminumoxide").setCreativeTab(RPCore.RPCoreITab);
		    paperElectrolized = new itempaperElectrolized().setUnlocalizedName("Electrolized Paper").setTextureName(RPCore.modid + ":" + "paperElectrolized").setCreativeTab(RPCore.RPCoreITab);
		    capacitorBasic = new itemmcapacitorBasic().setUnlocalizedName("Basic Capacitor").setTextureName(RPCore.modid + ":" + "capacitorBasic").setCreativeTab(RPCore.RPCoreITab);
		    capacitorCopper = new itemcapacitorCopper().setUnlocalizedName("Copper Capacitor").setTextureName(RPCore.modid + ":" + "capacitorCopper").setCreativeTab(RPCore.RPCoreITab);
		    capacitorDiamond = new itemcapacitorDiamond().setUnlocalizedName("Diamond Capacitor").setTextureName(RPCore.modid + ":" + "capacitorDiamond").setCreativeTab(RPCore.RPCoreITab);
		    capacitorGold = new itemcapacitorGold().setUnlocalizedName("Gold Capacitor").setTextureName(RPCore.modid + ":" + "capacitorGold").setCreativeTab(RPCore.RPCoreITab);
		    capacitorTungstencarbide = new itemcapacitorTungstencarbide().setUnlocalizedName("Tungstencarbide Capacitor").setTextureName(RPCore.modid + ":" + "capacitorTungstencarbide").setCreativeTab(RPCore.RPCoreITab);
		    //Diode
		    anvilPostassembly = new itemanvilPostassembly().setUnlocalizedName("Postassembly Anvil").setTextureName(RPCore.modid + ":" + "anvilPostAssembaly").setCreativeTab(RPCore.RPCoreITab);
		    Epoxy = new itemEpoxy().setUnlocalizedName("Epoxy").setTextureName(RPCore.modid + ":" + "Epoxy").setCreativeTab(RPCore.RPCoreITab);
		    lenseReflective = new itemlenseReflective().setUnlocalizedName("Reflective Lense").setTextureName(RPCore.modid + ":" + "lenseReflective").setCreativeTab(RPCore.RPCoreITab);
		    diode = new itemdiode().setUnlocalizedName("Diode").setTextureName(RPCore.modid + ":" + "Diode").setCreativeTab(RPCore.RPCoreITab);
		    
		  //Resistor
		    clayTreated = new itemclayTreated().setUnlocalizedName("Treated Clay").setTextureName(RPCore.modid + ":" + "clayTreated").setCreativeTab(RPCore.RPCoreITab);
		    clayTreatedbaked = new itemclayTreatedbaked().setUnlocalizedName("Baked Treated Clay").setTextureName(RPCore.modid + ":" + "clayTreatedbaked").setCreativeTab(RPCore.RPCoreITab);
		    coiledNichrome = new itemcoiledNichrome().setUnlocalizedName("Coiled Nichrome").setTextureName(RPCore.modid + ":" + "coiledNichrome").setCreativeTab(RPCore.RPCoreITab);
		    resistorCase = new itemresistorCase().setUnlocalizedName("Resistor Case").setTextureName(RPCore.modid + ":" + "resistorCase").setCreativeTab(RPCore.RPCoreITab);
		    resistorBasic = new itemresistorBasic().setUnlocalizedName("Basic Resistor").setTextureName(RPCore.modid + ":" + "resistorBasic").setCreativeTab(RPCore.RPCoreITab);
		    resistorCopper = new itemresistorCopper().setUnlocalizedName("Copper Resistor").setTextureName(RPCore.modid + ":" + "resistorCopper").setCreativeTab(RPCore.RPCoreITab);
		    resistorDiamond = new itemresistorDiamond().setUnlocalizedName("Diamond Resistor").setTextureName(RPCore.modid + ":" + "resistorDiamond").setCreativeTab(RPCore.RPCoreITab);
		    resistorGold = new itemresistorGold().setUnlocalizedName("Gold Resistor").setTextureName(RPCore.modid + ":" + "resistorGold").setCreativeTab(RPCore.RPCoreITab);
		    resistorIron = new itemresistorIron().setUnlocalizedName("Iron Resistor").setTextureName(RPCore.modid + ":" + "resistorIron").setCreativeTab(RPCore.RPCoreITab);
		    resistorTungstencarbide = new itemresistorTungstencarbide().setUnlocalizedName("Tungsten Carbide Resistor").setTextureName(RPCore.modid + ":" + "resistorTungstencarbide").setCreativeTab(RPCore.RPCoreITab);
		    //Transistors
		    kitTransistor = new itemkitTransistor().setUnlocalizedName("Transistor Kit").setTextureName(RPCore.modid + ":" + "kitTransistor").setCreativeTab(RPCore.RPCoreITab);
			transistorBasic = new itemtransistorBasic().setUnlocalizedName("Basic Transistor").setTextureName(RPCore.modid + ":" + "transistorBasic").setCreativeTab(RPCore.RPCoreITab);
		    transistorCopper = new itemransistorCopper().setUnlocalizedName("Copper Transistor").setTextureName(RPCore.modid + ":" + "transistorCopper").setCreativeTab(RPCore.RPCoreITab);
		    transistorDiamond = new itemtransistorDiamond().setUnlocalizedName("Diamond Transistor").setTextureName(RPCore.modid + ":" + "transistorDiamond").setCreativeTab(RPCore.RPCoreITab);
		    transistorGold = new itemtransistorGold().setUnlocalizedName("Gold Transistor").setTextureName(RPCore.modid + ":" + "transistorGold").setCreativeTab(RPCore.RPCoreITab);
		    transistorIron = new itemtransistorIron().setUnlocalizedName("Iron Transistor").setTextureName(RPCore.modid + ":" + "transistorIron").setCreativeTab(RPCore.RPCoreITab);
		    transistorTungstencarbide = new itemtransistorTungstencarbide().setUnlocalizedName("Tungsten Carbide Transistor").setTextureName(RPCore.modid + ":" + "transistorTungstencarbide").setCreativeTab(RPCore.RPCoreITab);
		    //chips
		    chipAdvanced = new itemchipAdvanced().setUnlocalizedName("Advanced Chip").setTextureName(RPCore.modid + ":" + "chipAdvanced").setCreativeTab(RPCore.RPCoreITab);
		    chipBasic = new itemchipBasic().setUnlocalizedName("Basic Chip").setTextureName(RPCore.modid + ":" + "chipBasic").setCreativeTab(RPCore.RPCoreITab);
		    chipElite = new itemchipElite().setUnlocalizedName("Elite Chip").setTextureName(RPCore.modid + ":" + "chipElite").setCreativeTab(RPCore.RPCoreITab);
		    chipLV = new itemchipLV().setUnlocalizedName("Low-Voltage Chip").setTextureName(RPCore.modid + ":" + "chipLV").setCreativeTab(RPCore.RPCoreITab);
		    //Protosprays
		    protopaintCopper = new itemprotopaintCopper().setUnlocalizedName("Next Gen Copper ProtoSpray").setTextureName(RPCore.modid + ":" + "protopaintCopper").setCreativeTab(RPCore.RPCoreITab);
		    protopaintDiamond = new itemprotopaintDiamond().setUnlocalizedName("Next Gen Diamond ProtoSpray").setTextureName(RPCore.modid + ":" + "protopaintDiamond").setCreativeTab(RPCore.RPCoreITab);
		    protopaintGold = new itemprotopaintGold().setUnlocalizedName("Next Gen Gold ProtoSpray").setTextureName(RPCore.modid + ":" + "protopaintGold").setCreativeTab(RPCore.RPCoreITab);
		    protopaintTungstencarbide = new itemprotopaintTungstencarbide().setUnlocalizedName("Next Gen Tungsten Carbide ProtoSpray").setTextureName(RPCore.modid + ":" + "protopaintTungstencarbide").setCreativeTab(RPCore.RPCoreITab);
		    //Lag
			lagUnit = new itemplagUnit().setUnlocalizedName("Unit Of Lag").setTextureName(RPCore.modid + ":" + "33021_64").setCreativeTab(RPCore.RPCoreITab);
			//Tools->Hammers
			hammerDiamond = new hammerDiamond().setUnlocalizedName("Diamond Hammer").setTextureName(RPCore.modid + ":" + "hammerDiamond").setCreativeTab(RPCore.RPCoreITab);
			hammerJade = new hammerJade().setUnlocalizedName("Jade Hammer Head").setTextureName(RPCore.modid + ":" + "hammerJade").setCreativeTab(RPCore.RPCoreITab);
			hammerNetherstar = new hammerNetherstar().setUnlocalizedName("Netherstar Hammer").setTextureName(RPCore.modid + ":" + "hammerNetherstar").setCreativeTab(RPCore.RPCoreITab);
			hammerSandstone = new hammerSandstone().setUnlocalizedName("Sandstone Hammer").setTextureName(RPCore.modid + ":" + "hammerSandstone").setCreativeTab(RPCore.RPCoreITab);
			hammerWooden = new hammerWooden().setUnlocalizedName("Wooden Hammer").setTextureName(RPCore.modid + ":" + "hammerWooden").setCreativeTab(RPCore.RPCoreITab);
			hammerCopper = new hammerCopper().setUnlocalizedName("Copper Hammer").setTextureName(RPCore.modid + ":" + "hammerCopper").setCreativeTab(RPCore.RPCoreITab);
			hammerSilver = new hammerSilver().setUnlocalizedName("Silver Hammer").setTextureName(RPCore.modid + ":" + "hammerSilver").setCreativeTab(RPCore.RPCoreITab);
			stoneHammer = new hammerStone().setUnlocalizedName("Stone Hammer").setTextureName(RPCore.modid + ":" + "Stone_Hammer");
			tungstenCarbideHammer = new ItemHeadBspace().setUnlocalizedName("TungstenCarbideHammer").setTextureName(RPCore.modid + ":" + "TugstenCarbide_Hammer").setNoRepair();
			hammerIron = new itemhammerIron().setUnlocalizedName("hammerIron").setTextureName(RPCore.modid + ":" + "hammerIron").setCreativeTab(RPCore.RPCoreITab);
			//Tools->Mining
			jadeSword = new ItemJadeSword(RPCore.jadeToolMaterial).setMaxDamage(125).setNoRepair().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Jade Sword").setTextureName(RPCore.modid + ":" + "jade_Sword");
	        jadeHoe = new ItemJadeHoe(RPCore.jadeToolMaterial).setMaxDamage(125).setNoRepair().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Jade Hoe").setTextureName(RPCore.modid + ":" + "jade_hoe");
	        jadeAxe = new ItemJadeAxe(RPCore.jadeToolMaterial).setMaxDamage(125).setNoRepair().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Jade Axe").setTextureName(RPCore.modid + ":" + "jade_axe");
	        jadePickaxe = new ItemJadePickaxe(RPCore.jadeToolMaterial).setMaxDamage(125).setNoRepair().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Jade Pickaxe").setTextureName(RPCore.modid + ":" + "jade_pickaxe");
	        jadeShovel = new ItemJadeSpade(RPCore.jadeToolMaterial).setMaxDamage(125).setNoRepair().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Jade Shovel").setTextureName(RPCore.modid + ":" + "jade_shovel");
			//Tool Heads
			headDiamond = new ItemHead().setUnlocalizedName("Diamond Hammer Head").setTextureName(RPCore.modid + ":" + "headDiamond").setCreativeTab(RPCore.RPCoreITab);
			headJade = new ItemHead().setUnlocalizedName("Jade Hammer Head").setTextureName(RPCore.modid + ":" + "headJade").setCreativeTab(RPCore.RPCoreITab);
			headNetherstar = new ItemHead().setUnlocalizedName("Netherstar Hammer Head").setTextureName(RPCore.modid + ":" + "headNetherstar").setCreativeTab(RPCore.RPCoreITab);
			headSandstone = new ItemHead().setUnlocalizedName("Sandstone Hammer Head").setTextureName(RPCore.modid + ":" + "headSandstone").setCreativeTab(RPCore.RPCoreITab);
			headWooden = new ItemHead().setUnlocalizedName("Wooden Hammer Head").setTextureName(RPCore.modid + ":" + "headWooden").setCreativeTab(RPCore.RPCoreITab);
			headCopper = new ItemHead().setUnlocalizedName("Copper Hammer Head").setTextureName(RPCore.modid + ":" + "headCopper").setCreativeTab(RPCore.RPCoreITab);
			headSilver = new ItemHead().setUnlocalizedName("Silver Hammer Head").setTextureName(RPCore.modid + ":" + "headSilver").setCreativeTab(RPCore.RPCoreITab);
			tungstenCarbideHead = new ItemHead().setUnlocalizedName("TungstenCarbideHead").setTextureName(RPCore.modid + ":" + "TugstenCarbide_Hammer_Head");
	        stoneHamHead = new ItemHead().setUnlocalizedName("Stone Hammer Head").setTextureName(RPCore.modid + ":" + "HammerHead");
			jadeHeadSw = new ItemHead().setUnlocalizedName("JadeSwordHead").setTextureName(RPCore.modid + ":" + "JadeSwordHead");
	        jadeHeadSh = new ItemHead().setUnlocalizedName("JadeShovHead").setTextureName(RPCore.modid + ":" + "JadeShovHead");
	        jadeHeadAx = new ItemHead().setUnlocalizedName("JadeAxeHead").setTextureName(RPCore.modid + ":" + "JadeAxeHead");
	        jadeHeadHo = new ItemHead().setUnlocalizedName("JadeHoeHead").setTextureName(RPCore.modid + ":" + "JadeHoeHead");
	        jadeHeadPi = new ItemHead().setUnlocalizedName("JadePickHead").setTextureName(RPCore.modid + ":" + "JadePickHead");
			//Tool Handle Modifiers
			//Dusts
			dustNetherstar = new ItemNetherstarDust().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Netherstar Dust").setTextureName(RPCore.modid + ":" + "Netherstar_Dust");
			dustCopper = new ItemCopperDust().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Copper Dust").setTextureName(RPCore.modid + ":" + "Copper_Dust");
			dustDiamond = new ItemDiamondDust().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Diamond Dust").setTextureName(RPCore.modid + ":" + "Diamond_Dust");
			dustEmerald = new ItemEmeraldDust().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Emerald Dust").setTextureName(RPCore.modid + ":" + "Emerald_Dust");
			dustFerrous = new ItemFerrousDust().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Ferrous Dust").setTextureName(RPCore.modid + ":" + "Ferrous_Dust");
			dustGold = new ItemGoldDust().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Gold Dust").setTextureName(RPCore.modid + ":" + "Gold_Dust");
			dustIron = new ItemIronDust().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Iron Dust").setTextureName(RPCore.modid + ":" + "Iron_Dust");
			dustLead = new ItemLeadDust().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Lead Dust").setTextureName(RPCore.modid + ":" + "Lead_Dust");
			dustSilver = new ItemSilverDust().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Silver Dust").setTextureName(RPCore.modid + ":" + "Silver_Dust");
			dustTungsten = new ItemTugstenDust().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Tungsten Dust").setTextureName(RPCore.modid + ":" + "Tugsten_Dust");
			dustTin = new ItemTinDust().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Tin Dust").setTextureName(RPCore.modid + ":" + "Tin_Dust");
			dustBronze =new ItemBronzeDust().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Bronze Dust").setTextureName(RPCore.modid + ":" + "bronze_dust");
			dustSteel =	new ItemSteelDust().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Steel Dust").setTextureName(RPCore.modid + ":" + "steel_dust");
			dustSilicon = new itemdustSilicon().setUnlocalizedName("dustSilicon").setTextureName(RPCore.modid + ":" + "dustSilicon").setCreativeTab(RPCore.RPCoreITab);
			dustAluminum = new itemdustAluminum().setUnlocalizedName("dustAluminum").setTextureName(RPCore.modid + ":" + "dustAluminum").setCreativeTab(RPCore.RPCoreITab);




			//Ingots
			ingotCopper = new ItemCopperIngot().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Copper Ingot").setTextureName(RPCore.modid + ":" + "copper_ingot");
			ingotFerrous = new ItemFerrousIngot().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Ferrous Ingot").setTextureName(RPCore.modid + ":" + "ferrous_ingot");
			ingotLead = new ItemLeadIngot().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Lead Ingot").setTextureName(RPCore.modid + ":" + "lead_ingot");
			ingotNetherstar = new ItemNetherstarIngot().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Nether Star Ingot").setTextureName(RPCore.modid + ":" + "netherstar_ingot");
			ingotSilver = new ItemSilverIngot().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Silver Ingot").setTextureName(RPCore.modid + ":" + "silver_ingot");
			ingotTin = new ItemTinIngot().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Tin Ingot").setTextureName(RPCore.modid + ":" + "tin_ingot");
			ingotTungsten = new ItemTungstenIngot().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Tungsten Ingot").setTextureName(RPCore.modid + ":" + "tungsten_ingot");
	        ingotTungstencarbide = new ItemTungstencarbideIngot().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Tungstencarbide Ingot").setTextureName(RPCore.modid + ":" + "tungsten_carbide_ingot");
	        ingotSteel = new ItemingotSteel().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Steel Ingot").setTextureName(RPCore.modid + ":" + "steel_ingot");
	        ingotBronze = new ItemingotBronze().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Bronze Ingot").setTextureName(RPCore.modid + ":" + "bronze_ingot");
	        TCAI = new ItemTCAI().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("TCAI").setTextureName(RPCore.modid + ":" + "TCAI");
			//Gems
			gemDiamond = new ItemDiamondIngot().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Diamond Ingot").setTextureName(RPCore.modid + ":" + "diamond_ingot");
			gemEmerald = new ItemEmeraldIngot().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Emerald Ingot").setTextureName(RPCore.modid + ":" + "emerald_ingot");
			gemJade = new ItemJade().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Raw Jade").setTextureName(RPCore.modid + ":" + "jade_refined");
			gemJadepure = new ItemJade().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Jade").setTextureName(RPCore.modid + ":" + "Jade");
			//Fuel
			anthracite = new ItemAnthracite().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Anthracite").setTextureName(RPCore.modid + ":" + "Anthracite");
			//Misc
			sandPaper = new ItemsandPaper().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Sand Paper").setTextureName(RPCore.modid + ":" + "SandPaper");
	        mortar_and_pestle = new Itemmortar_and_pestle().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Mortar and Pestle").setTextureName(RPCore.modid + ":" + "mp");
	        quartzStick = new ItemquartcStick().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Quartz Stick").setTextureName(RPCore.modid + ":" + "quartzStick");
	        quartzBowl = new ItemquartcBowl().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Quartz Bowl").setTextureName(RPCore.modid + ":" + "quartzBowl");
	        dustFlour = new ItemdustFlour().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Bag of Flour").setTextureName(RPCore.modid + ":" + "Flour");
			Pencil = new itemPencil().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Pencil").setTextureName(RPCore.modid + ":" + "Pencil");
			blankScroll = new ItemblankScroll().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Blank Scroll").setTextureName(RPCore.modid + ":" + "scrollBlank");
			scrollCircle = new ItemscrollCircle().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Circle Scroll").setTextureName(RPCore.modid + ":" + "scrollCircle");
			oilTreatment = new ItemoilTreatment().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Treatment Oil").setTextureName(RPCore.modid + ":" + "oilTreatment");
			mouldCog = new ItemmouldCog().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Cog Mould").setTextureName(RPCore.modid + ":" + "mouldCog");
			mouldPlate = new ItemmouldPlate().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Plate Mould").setTextureName(RPCore.modid + ":" + "plateMould");
			// plateMould.png or mouldCog.png should be renamed. Pick one.
	        //gears
			cogUnfiredcopper = new ItemcogUnfiredcopper().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("UnfiredcopperCog").setTextureName(RPCore.modid + ":" + "cogUnfiredcopper");
			cogUnfireddiamond = new ItemcogUnfireddiamond().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("UnfireddiamondCog").setTextureName(RPCore.modid + ":" + "cogUnfireddiamond");
			cogUnfiredgold = new ItemcogUnfiredgold().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("UnfiredgoldCog").setTextureName(RPCore.modid + ":" + "cogUnfiredgold");
			cogUnfirediron = new ItemcogUnfirediron().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("UnfiredironCog").setTextureName(RPCore.modid + ":" + "cogUnfirediron");
			cogUnfiredtungstencarbide = new ItemcogUnfiredtungstencarbide().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("UnfiredtungstencarbideCog").setTextureName(RPCore.modid + ":" + "cogUnfiredtungstencarbide");
			//fiered
			cogCopper = new cogcopper().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("CopperCog").setTextureName(RPCore.modid + ":" + "cogCopper");
			cogDiamond = new cogdiamond().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("DiamondCog").setTextureName(RPCore.modid + ":" + "cogDiamond");
			cogGold = new cogGold().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("GoldCog").setTextureName(RPCore.modid + ":" + "cogGold");
			cogIron = new cogIron().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("IronCog").setTextureName(RPCore.modid + ":" + "cogIron");
			cogTungstencarbide = new cogTungstencarbide().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("TungstencarbideCog").setTextureName(RPCore.modid + ":" + "cogTungstencarbide");
			//gears
			plateUnfiredcopper = new plateUnfiredcopper().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("UnfiredCopperplate").setTextureName(RPCore.modid + ":" + "plateUnfiredCopper");
			plateUnfireddiamond = new plateUnfiredDiamond().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("UnfiredDiamondplate").setTextureName(RPCore.modid + ":" + "plateUnfiredDiamond");
			plateUnfiredgold = new plateUnfiredgold().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("UnfiredGoldplate").setTextureName(RPCore.modid + ":" + "plateUnfiredGold");
			plateUnfirediron = new plateUnfirediron().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("UnfiredIronplate").setTextureName(RPCore.modid + ":" + "plateUnfiredIron");
			plateUnfiredtungstencarbide = new plateUnfiredtungstencarbide().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("UnfiredTungstencarbideplate").setTextureName(RPCore.modid + ":" + "plateUnfiredTungstencarbide");
			//fired
			plateCopper = new plateCopper().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Copperplate").setTextureName(RPCore.modid + ":" + "plateCopper");
			plateDiamond = new plateDiamond().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Diamondplate").setTextureName(RPCore.modid + ":" + "plateDiamond");
			plateGold = new plateGold().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Goldplate").setTextureName(RPCore.modid + ":" + "plateGold");
			plateIron = new plateIron().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Ironplate").setTextureName(RPCore.modid + ":" + "plateIron");
			plateTungstencarbide = new plateTungstencarbide().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Tungstencarbideplate").setTextureName(RPCore.modid + ":" + "plateTungstencarbide");
	        //public static Item ingotBrass;
	        //public static Item ingotZink;;   <----OreGen REMEMBER
	        //^^meh
	        //Chunks
	        chunkCopper = new chunkCopper().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Copper Chunk").setTextureName(RPCore.modid + ":" + "Copper_Chunk");
	        chunkTungsten = new chunkCopper().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Tungsten Chunk").setTextureName(RPCore.modid + ":" + "Tungsten_Chunk");
	        chunkSilver = new chunkCopper().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Silver Chunk").setTextureName(RPCore.modid + ":" + "Silver_Chunk");
	        chunkLead = new chunkCopper().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Lead Chunk").setTextureName(RPCore.modid + ":" + "Lead_Chunk");
	        chunkTin = new chunkCopper().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Tin Chunk").setTextureName(RPCore.modid + ":" + "Tin_Chunk");
	        chunkFerrous = new chunkCopper().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Ferrous Chunk").setTextureName(RPCore.modid + ":" + "Ferrous_Chunk");

	        //Magic
	        dustMagickcompound = new ItemMagic().setUnlocalizedName("Magick Compound").setTextureName(RPCore.modid + ":" + "magick_compound");
	        dustMagick = new ItemMagic().setUnlocalizedName("Magick Dust").setTextureName(RPCore.modid + ":" + "magick_dust");
	        dropBig = new ItemMagic().setUnlocalizedName("Big Drop").setTextureName(RPCore.modid + ":" + "big_drop");
	        dropBounce = new ItemMagic().setUnlocalizedName("Bounce Drop").setTextureName(RPCore.modid + ":" + "bounce_drop");
	        dropDeath = new ItemMagic().setUnlocalizedName("Death Drop").setTextureName(RPCore.modid + ":" + "death_drop");
	        dropFly = new ItemMagic().setUnlocalizedName("Fly Drop").setTextureName(RPCore.modid + ":" + "fly_drop");
	        dropLife = new ItemMagic().setUnlocalizedName("Life Drop").setTextureName(RPCore.modid + ":" + "life_drop");
	        dropMagick = new ItemMagic().setUnlocalizedName("Magick Drop").setTextureName(RPCore.modid + ":" + "magick_drop");
	        dropPoison = new ItemMagic().setUnlocalizedName("Poison Drop").setTextureName(RPCore.modid + ":" + "poison_drop");
	        dropRock = new ItemMagic().setUnlocalizedName("Rock Drop").setTextureName(RPCore.modid + ":" + "rock_drop");
	        dropSmall = new ItemMagic().setUnlocalizedName("Small Drop").setTextureName(RPCore.modid + ":" + "small_drop");
	        dropSuper = new ItemMagic().setUnlocalizedName("Super Drop").setTextureName(RPCore.modid + ":" + "super_drop");
	        //Runes
	        Fire_Rune= new ItemFire_Rune().setUnlocalizedName("Fire Rune").setTextureName(RPCore.modid + ":" + "Fire_Rune");
	        Earth_Rune= new ItemEarth_Rune().setUnlocalizedName("Earth Rune").setTextureName(RPCore.modid + ":" + "Earth_Rune");
	        Air_Rune= new ItemAir_Rune().setUnlocalizedName("Air Rune").setTextureName(RPCore.modid + ":" + "Air_Rune");
	        runePlate= new ItemRune().setUnlocalizedName("Runeic Plate").setTextureName(RPCore.modid + ":" + "runicPlate");
	        Spirit_Rune= new ItemSpirit_Rune().setUnlocalizedName("Spirit Rune").setTextureName(RPCore.modid + ":" + "Spirit_Rune");
	        Water_Rune= new ItemWater_Rune().setUnlocalizedName("Water Rune").setTextureName(RPCore.modid + ":" + "Water_Rune");
	        //Food
			megaCookie = new ItemFoodmegaCookie(16, 1, true).setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Mega Cookie").setTextureName(RPCore.modid + ":" + "Megacookie");
			ghostCookie = new ItemFoodghostCookie(8, 1, true).setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Ghost Cookie").setTextureName(RPCore.modid + ":" + "Ghostcookie");
			poisonCookie = new ItemFoodpoisonCookie(-10, 1, true).setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Poison Cookie").setTextureName(RPCore.modid + ":" + "Poisoncookie");
			miniCookie = new ItemFoodminiCookie(8, 1, true).setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Mini Cookie").setTextureName(RPCore.modid + ":" + "Minicookie");
			oneupCookie = new ItemFoodoneupCookie(20, 1, true).setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("1Up Cookie").setTextureName(RPCore.modid + ":" + "1Upcookie");
			springCookie = new ItemFoodspringCookie(8, 1, true).setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Spring Cookie").setTextureName(RPCore.modid + ":" + "Springcookie");
			propellerCookie =  new ItemFoodpropellerCookie(8, 1, true).setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Propeller Cookie[WIP]").setTextureName(RPCore.modid + ":" + "Propellercookie");
			rockCookie =new ItemFoodrockCookie(8, 1, true).setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Rock Cookie").setTextureName(RPCore.modid + ":" + "Rockcookie");
			superCookie =new ItemFoodsuperCookie(8, 1, true).setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Super Cookie").setTextureName(RPCore.modid + ":" + "Supercookie");
			cookieSugar = new ItemFoodcookieSugar(8, 1, true).setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Sugar Cookie").setTextureName(RPCore.modid + ":" + "cookieSugar");
			baconRaw = new ItemFoodbaconRaw(1, 1, true).setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Raw Bacon").setTextureName(RPCore.modid + ":" + "Bacon_Raw");
			baconCooked = new ItemFoodbaconCooked(3, 1, true).setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Cooked Bacon").setTextureName(RPCore.modid + ":" + "Bacon_Cooked");
			knife = new Itemknife().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Knife").setTextureName(RPCore.modid + ":" + "Knife");
			dustSugar = new ItemdustSugar().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Pouch Of Sugar").setTextureName(RPCore.modid + ":" + "Bag_Of_Sugar");
		    magnusCookie = new ItemFoodcreativeCookie(1, 1, true).setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Magnus Cookie").setTextureName("cookie");
			//test
			testCookie = new ItemFoodtestCookie(0, 0, false).setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Item Of Testing").setTextureName(RPCore.modid + ":" + "ItemOfTesting");
			//Plants
			yellowLeaf = new ItemyellowLeaf().setCreativeTab(RPCore.RPCoreITab).setUnlocalizedName("Yellow Leaf").setTextureName(RPCore.modid + ":" + "MagickYellowLeaf");
		    
	    }
	    
	public static void registerItems(){
		
	}
	
	private static void registerOres(){
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
}
