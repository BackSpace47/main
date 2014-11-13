package net.RPower.RPowermod.core

public class MFBlocks {
  //Items
	/*
	To add a item first do these lines (public static Item <name of item>;) then inside preInit do (<name of item> = new Item<name of item>().setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("<name of item whit capital leters and space if two or more words>").setTextureName(modid + ":" + "<texture name of item>"); then under init do (Recipies.registerItem(<name of item>, "<name of item whit capital leters and space if two or more words>");))
	*/
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
  public static Item knife;
  public static Item dustSugar;
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
  //MFtools
  public static Item axeJadeR;
  public static Item hoeJadeR;
  public static Item pickaxeJadeR;
  public static Item shovelJadeR;
  public static Item swordJadeR;
  //Handle Modifiers
  public static Item handleTCA;
  public static Item handleTCASword;
  
  public static void preInt(bollean en){
    if(en == true) {
      //TrollItems
      trollNugetdiamond = new itemtrollNugetdiamond().setUnlocalizedName("Diamond Troll Nugget").setTextureName(modid + ":" + "nuggetDiamond").setCreativeTab(RPCoreITab);
      trollNugetiron = new itemtrollNugetiron().setUnlocalizedName("Iron Troll Nugget").setTextureName(modid + ":" + "nuggetIron").setCreativeTab(RPCoreITab);
      trollNugetemerald = new itemtrollNugetemerald().setUnlocalizedName("Emerald Troll Nugget").setTextureName(modid + ":" + "nuggetEmerald").setCreativeTab(RPCoreITab);
      trollNugetGold = new itemtrollNugetGold().setUnlocalizedName("Gold Troll Nugget").setTextureName(modid + ":" + "nuggetGold").setCreativeTab(RPCoreITab);
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
      runeFire= new ItemRune().setUnlocalizedName("Fire Rune").setTextureName(modid + ":" + "Fire Rune");
      runeEarth= new ItemRune().setUnlocalizedName("Earth Rune").setTextureName(modid + ":" + "Earth Rune");
      runeAir= new ItemRune().setUnlocalizedName("Air Rune").setTextureName(modid + ":" + "Air Rune");
      runePlate= new ItemRune().setUnlocalizedName("Runeic Plate").setTextureName(modid + ":" + "runicPlate");
      runeSpirit= new ItemRune().setUnlocalizedName("Spirit Rune").setTextureName(modid + ":" + "Spirit Rune");
      runeWater= new ItemRune().setUnlocalizedName("Water Rune").setTextureName(modid + ":" + "Water Rune");
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
		}
		
		public static void int(bollean en)
	}
}
