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
import net.RPower.RPowermod.block.blockRPBlockoreAluminum;
import net.RPower.RPowermod.block.blockRPBlockoreChromium;
import net.RPower.RPowermod.block.blockRPBlockoreLithium;
import net.RPower.RPowermod.block.blockRPBlockoreNi;
import net.RPower.RPowermod.block.blockRPBlockorePlatinum;
import net.RPower.RPowermod.block.blockRPBlockoreSilicon;
import net.RPower.RPowermod.block.blockRPBlockoreZink;
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

	//machine vars
	public static final int guiIDalloySmelter = 0;
    



    

    


    //thaum
    public static Item wand_cap_jade;


	



	public static final Block.SoundType soundTypePiston = new Block.SoundType("stone", 1.0F, 1.0F);
	private static final Object ItemStack = null;
	@SidedProxy(clientSide="net.RPower.RPowermod.proxy.ClientProxy", serverSide="net.RPower.RPowermod.proxy.CommonProxy")
	public static CommonProxy proxy;
	public static CreativeTabs RPCoreBTab = new CreativeTabs(modid) {
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return Item.getItemFromBlock(RPBlocks.jadeBlock);
	    }
	};
	public static CreativeTabs RPCoreITab = new CreativeTabs(modid) {
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return RPItems.TCAI;
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
		jadeToolMaterial = EnumHelper.addToolMaterial("JADE", 4, 35, 16F, 7F, 50);
		//Blocks----------
		
		wand_cap_jade = new itemwand_cap_jade().setUnlocalizedName("wand_cap_jade").setTextureName(modid + ":" + "wand_cap_jade").setCreativeTab(RPCoreITab);


		




		


		

		//Food Cakes Stuffs ^_^





		
		//Woods & Planks & Trees
		
		
		
		
	    
		
	}

	@EventHandler
	public void init(FMLInitializationEvent e)







	{



		proxy.registerKeyBindings();
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, proxy);
		ItemStack slabM0 = new ItemStack (Blocks.stone_slab);
		slabM0.setItemDamage(5);



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
		Recipies.registerItem(ingotBrass,"ingotBrass");
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





        Recipies.registerItem(dustMagick, "Magick Dust");
        Recipies.registerItem(dustMagickcompound, "Magick Compound");
        Recipies.registerItem(Fire_Rune, "Fire_Rune");
        Recipies.registerItem(Water_Rune, "Water_Rune");
        Recipies.registerItem(Air_Rune, "Air_Rune");
        Recipies.registerItem(Spirit_Rune, "Spirit_Rune");
        Recipies.registerItem(Earth_Rune, "Earth_Rune");
        Recipies.registerItem(runePlate, "Runic_Plate");


		//Jars
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

