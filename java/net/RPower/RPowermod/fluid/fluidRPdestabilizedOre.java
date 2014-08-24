package net.RPower.RPowermod.fluid;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDynamicLiquid;
import net.minecraft.block.BlockStaticLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class fluidRPdestabilizedOre {

public static Object instance;

public fluidRPdestabilizedOre(){}

public static Block block2 = new destabilizedOreStill().setBlockName("Destabilized Ore2");
public static Block block = new destabilizedOreFlowing().setBlockName("Destabilized Ore");

public void preInit(FMLPreInitializationEvent event){}

public void load(){
	GameRegistry.registerBlock(block2, "Destabilized Ore2");
	GameRegistry.registerBlock(block, "Destabilized Ore");

}

static{
	Block.blockRegistry.addObject(176, "Destabilized Ore", block);
	Block.blockRegistry.addObject(177, "Destabilized Ore2", block2);
}

public void generateNether(World world, Random random, int chunkX, int chunkZ){}
public void generateSurface(World world, Random random, int chunkX, int chunkZ){}
public int addFuel(ItemStack fuel){
	return 0;
}
public void registerRenderers(){}
public void serverLoad(FMLServerStartingEvent event){}

static class destabilizedOreFlowing extends BlockDynamicLiquid {

        public destabilizedOreFlowing() {
                super(Material.lava);
                this.blockHardness = 100.0F;
                this.setLightOpacity(3);
        }

	@SideOnly(Side.CLIENT)
    public int colorMultiplier(IBlockAccess par1IBlockAccess, int par2, int par3, int par4){
    	return 0x666600;
    }

}

static class destabilizedOreStill extends BlockStaticLiquid {

        public destabilizedOreStill() {
                super(Material.lava);
                this.blockHardness = 100.0F;
                this.setLightOpacity(3);
                this.disableStats();
        }

        	@SideOnly(Side.CLIENT)
		    public int colorMultiplier(IBlockAccess par1IBlockAccess, int par2, int par3, int par4){
		    	return 0x666600;
			}

}

}
