package net.RPower.RPowermod.block;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import javax.swing.Icon;

import org.lwjgl.opengl.GL11;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

public abstract class blockTungstenore   
extends Block
  implements ISimpleBlockRenderingHandler
{
  protected blockTungstenore(Material m) {
      super(m);
  }
public void renderInventoryBlock(Block block, int meta, int modelID, RenderBlocks renderer)
  {
      
    GL11.glColor3f(1.0F, 1.0F, 0.0F);
    
    GL11.glColor3f(1.0F, 1.0F, 1.0F);
  }
  
  private void DrawFaces(RenderBlocks renderer, Block block, Icon bgIcon,
		boolean b) {
}
  

	}
	
	



    

