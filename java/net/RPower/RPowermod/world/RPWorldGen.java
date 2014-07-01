package net.RPower.RPowermod.world;

import java.util.Random;

import net.RPower.RPowermod.core.RPCore;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class RPWorldGen implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
			case 0: generateSurface(random, chunkX*16, chunkZ*16, world); break;
			case 1: generateEnd(random, chunkX*16, chunkZ*16, world); break;
			case -1: generateNether(random, chunkX*16, chunkZ*16, world); break;
		}
	}
	
	public void generateSurface(Random random, int cx, int cz, World world){
		addOreSpawnS(RPCore.oreJade, world, random, cx, cz, 1, 6, 5, 4, 10);
		addOreSpawnS(RPCore.oreTungsten, world, random, cx, cz, 2, 8, 10, 1, 32);
		addOreSpawnS(RPCore.oreAnthtracite, world, random, cx, cz, 5, 6, 5, 1, 40);
		addOreSpawnS(RPCore.oreCopper, world, random, cx, cz, 5, 6, 5, 1, 80 );
		addOreSpawnS(RPCore.oreExp, world, random, cx, cz, 1, 6, 5, 4, 10 );
		addOreSpawnS(RPCore.oreFerrous, world, random, cx, cz, 5, 6, 5, 1, 80 );
		addOreSpawnS(RPCore.oreLead, world, random, cx, cz, 5, 6, 5, 1, 80 );
		addOreSpawnS(RPCore.oreSilver, world, random, cx, cz, 5, 6, 5, 1, 80 );
		addOreSpawnS(RPCore.oreTin, world, random, cx, cz, 5, 6, 5, 1, 80 );
		
		for(int t = 0; t<15; t++){
			int par3 = cx + random.nextInt(16);
			int par4 = random.nextInt(90);
			int par5 = cz + random.nextInt(16);
			
			(new RPREBTree(false, 7, 0, 0, false)).generate(world, random, par3, par4, par5);	
	    }
		
		
	}
	
	public void generateEnd(Random random, int cx, int cz, World world){
		
	}

	public void generateNether(Random random, int cx, int cz, World world){
	
	}
	
	public void addOreSpawnS(Block block, World world, Random random, int bxPos, int bzPos, int minVainSize, int maxVainSize, int CTS, int minY, int maxY ){
		for(int i = 0; i<CTS; i++){
			int posX = bxPos + random.nextInt(16);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = bzPos + random.nextInt(16);
			new WorldGenMinable(block, (minVainSize + random.nextInt(maxVainSize - minVainSize)), Blocks.stone).generate(world, random, posX, posY, posZ);
		}
	}

}
