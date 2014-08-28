package net.RPower.RPowermod.renderers.block;

import org.lwjgl.opengl.GL11;

import RPower.api.power.block.cable.I_PipeDirection;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.RPower.RPowermod.machines.power.cable.TileEntityFluxCable;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.shader.TesselatorVertexState;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

/**
 * 
 * @author Minothor, Flenix
 *Renders the card Decks in the world
 *Adapted from Flenix's Tutorial at:
 *http://www.minecraftforge.net/wiki/Rendering_a_Techne_Model_as_a_Block
 */

//TODO: Cancel rendering if not visible
//Current Idea: Player.yaw/pitch trigonometry && sky light
public class TileEntityFluxCableRenderer extends TileEntitySpecialRenderer {
	private final ResourceLocation texture;
	public static int blockRenderId;
	public static final float pixel = 1.0F/16; 
	public Tessellator tessellator;
	
	public TileEntityFluxCableRenderer() {
		tessellator = Tessellator.instance;
		blockRenderId = RenderingRegistry.getNextAvailableRenderId();
		texture = new ResourceLocation(net.RPower.RPowermod.core.RPCore.modid+":textures/blocks/fluxCable.png");
		
	}



	@Override
	public void renderTileEntityAt(TileEntity entity, double x, double y, double z, float scale) {
		//binding the textures
        Minecraft.getMinecraft().renderEngine.bindTexture(texture);
		GL11.glPushMatrix();
		//initial location (what's up with the 0.5 and 1.5 difference I wonder)
		GL11.glTranslatef((float) x + 0.5F, (float) y + 0.5F, (float) z + 0.5F);
		GL11.glDisable(GL11.GL_CULL_FACE);
		drawHub();
	
         //let LWGL know we're doing more matixy manipulation stuff
         
         //rotate to avoid model rendering upside down
         for (I_PipeDirection connection : ((TileEntityFluxCable)entity).connections) {
        	 int[] target = connection.getTarget();
        	 float[] angles = {0,0,0};
        	 float yMod = (target[0]==0&&target[2]==0)?90F:45F;
        	 
        	 
        	 float xMod=0;
        	 float xDir=0;
        	 
        	 float zDir=0;
        	 float zMod=0;
        	 if(target[1]==0)
        		 xMod=-90F;
        	 if(target[0]==0)
        	 {
        		xDir=target[2];
        		xMod=-90F;
        		
        		
        	 }
        	 if(target[2]==0)
        	 {
        		xDir=target[0];
        		xMod=180F;
        		if(xDir>0)
        		{
        			xMod=0F;
        			
        		}
        	 }
        	 if(target[0]!=0&&target[2]!=0)
        	 {
        		 if(target[2]>0)
        		 {
        			 xDir=1;
        			 xMod=-135;
        			 if(target[0]>0)
        			 {
        				 xDir*=-1;
        				 xMod=45F;
        				 yMod-=10;
        				 
        			 }
        		 } else if(target[0]<0)
    			 {
    				 zDir=1;
    				 xDir=-1;
    				 zMod=360F;
    				 xMod=225F;
    				 yMod-=10;
    			 } else if(target[0]>0)
				 {
    				 if(target[2]<0)
    				 {
    					 xDir=1;
    					 xMod=45;
    					 yMod-=10;
    				 }
				 }
        		 if(target[0]<0&&target[2]>0)
        		 {
        			 if(target[1]<0)
        			 yMod=35F;
        			 if(target[1]>0)
        				 yMod=35F;
        		 }
        		 
        	 }
        	 
        	 angles[0]=zDir*zMod;
        	 angles[1]=xDir*xMod;
    		 angles[2]=target[1]*yMod;
    		 
        	 
        	 
			drawConnector(angles, target);
		}
        
         //pop both sections off the render stack
         
         GL11.glPopMatrix();
         //System.out.println("FOV : "+Minecraft.getMinecraft().gameSettings.fovSetting);
         GL11.glEnable(GL11.GL_CULL_FACE);
	}
	 private void drawHub() {
		
		tessellator.startDrawingQuads();
		tessellator.addVertexWithUV(2*pixel, 2*pixel, 2*pixel, 4*pixel,1);
		tessellator.addVertexWithUV(-2*pixel, 2*pixel, 2*pixel, 0,1);
		tessellator.addVertexWithUV(-2*pixel, -2*pixel, 2*pixel, 0,12*pixel);
		tessellator.addVertexWithUV(2*pixel, -2*pixel, 2*pixel, 4*pixel,12*pixel);
		tessellator.draw();
		GL11.glRotatef(90, 1, 0, 0); //90x
		tessellator.startDrawingQuads();
		tessellator.addVertexWithUV(2*pixel, 2*pixel, 2*pixel, 4*pixel,1);
		tessellator.addVertexWithUV(-2*pixel, 2*pixel, 2*pixel, 0,1);
		tessellator.addVertexWithUV(-2*pixel, -2*pixel, 2*pixel, 0,12*pixel);
		tessellator.addVertexWithUV(2*pixel, -2*pixel, 2*pixel, 4*pixel,12*pixel);
		tessellator.draw();
		GL11.glRotatef(90, 1, 0, 0); //180x
		tessellator.startDrawingQuads();
		tessellator.addVertexWithUV(2*pixel, 2*pixel, 2*pixel, 4*pixel,1);
		tessellator.addVertexWithUV(-2*pixel, 2*pixel, 2*pixel, 0,1);
		tessellator.addVertexWithUV(-2*pixel, -2*pixel, 2*pixel, 0,12*pixel);
		tessellator.addVertexWithUV(2*pixel, -2*pixel, 2*pixel, 4*pixel,12*pixel);
		tessellator.draw();
		GL11.glRotatef(90, 1, 0, 0); //270x
		tessellator.startDrawingQuads();
		tessellator.addVertexWithUV(2*pixel, 2*pixel, 2*pixel, 4*pixel,1);
		tessellator.addVertexWithUV(-2*pixel, 2*pixel, 2*pixel, 0,1);
		tessellator.addVertexWithUV(-2*pixel, -2*pixel, 2*pixel, 0,12*pixel);
		tessellator.addVertexWithUV(2*pixel, -2*pixel, 2*pixel, 4*pixel,12*pixel);
		tessellator.draw();
		GL11.glRotatef(90, 1, 0, 0);
		GL11.glRotatef(90, 0, 1, 0); 
		tessellator.startDrawingQuads();
		tessellator.addVertexWithUV(2*pixel, 2*pixel, 2*pixel, 4*pixel,1);
		tessellator.addVertexWithUV(-2*pixel, 2*pixel, 2*pixel, 0,1);
		tessellator.addVertexWithUV(-2*pixel, -2*pixel, 2*pixel, 0,12*pixel);
		tessellator.addVertexWithUV(2*pixel, -2*pixel, 2*pixel, 4*pixel,12*pixel);
		tessellator.draw();
		GL11.glRotatef(180, 0, 1, 0); 
		tessellator.startDrawingQuads();
		tessellator.addVertexWithUV(2*pixel, 2*pixel, 2*pixel, 4*pixel,1);
		tessellator.addVertexWithUV(-2*pixel, 2*pixel, 2*pixel, 0,1);
		tessellator.addVertexWithUV(-2*pixel, -2*pixel, 2*pixel, 0,12*pixel);
		tessellator.addVertexWithUV(2*pixel, -2*pixel, 2*pixel, 4*pixel,12*pixel);
		tessellator.draw();
		GL11.glRotatef(90, 0, 1, 0);
		
	}

	 private void drawRails(float size)
	 {
		 
		 GL11.glPushMatrix();
		 GL11.glRotatef(45, 1, 0, 0);
		 Tessellator tessellator = Tessellator.instance;
		 drawRail(size, tessellator,45);
		 GL11.glRotatef(90, 1, 0, 0);
		 drawRail(size, tessellator, 90);
		 GL11.glRotatef(90, 1, 0, 0);
		 drawRail(size, tessellator,90);
		 GL11.glRotatef(90, 1, 0, 0);
		 drawRail(size, tessellator,90);
		 GL11.glRotatef(90, 1, 0, 0);
		 GL11.glRotatef(-45, 1, 0, 0);
		 GL11.glPopMatrix();
	 }



	private void drawRail(float size, Tessellator tessellator, float angle) {
		float offset=27.4F;
		GL11.glRotatef(45F-offset, 1, 0, 0);
		GL11.glRotatef(-offset, 1, 0, 0);
		tessellator.startDrawingQuads();
		 tessellator.addVertexWithUV(0, 0.5*pixel, -2*pixel, (int)size*pixel, 1*pixel);
		 tessellator.addVertexWithUV(size*pixel, 0.5*pixel, -2*pixel, 0*pixel, 0*pixel);
		 tessellator.addVertexWithUV(size*pixel, -0.5*pixel, -2*pixel, 0*pixel, 0*pixel);
		 tessellator.addVertexWithUV(0, -0.5*pixel, -2*pixel, (int)size*pixel, 1*pixel);
		 tessellator.setNormal(-angle/2, -angle/2, -angle/2);
		 tessellator.draw();
		 GL11.glRotatef(offset, 1, 0, 0);
		 tessellator.startDrawingQuads();
		 tessellator.addVertexWithUV(0, 0.5*pixel, -2*pixel, (int)size*pixel, 2*pixel);
		 tessellator.addVertexWithUV(size*pixel, 0.5*pixel, -2*pixel, 0*pixel, 1*pixel);
		 tessellator.addVertexWithUV(size*pixel, -0.5*pixel, -2*pixel, 0*pixel, 1*pixel);
		 tessellator.addVertexWithUV(0, -0.5*pixel, -2*pixel, (int)size*pixel, 2*pixel);
		 tessellator.setNormal(-angle/2, -angle/2, -angle/2);
		 tessellator.draw();
		 GL11.glRotatef(-45F+offset, 1, 0, 0);
	}
	 
	 private void drawCore(float size)
	 {
		 GL11.glPushMatrix();
		
		 
		 tessellator.startDrawingQuads();
		 tessellator.addVertexWithUV(0, 1*pixel, 0, (int)size*pixel, 8*pixel);
		 tessellator.addVertexWithUV(size*pixel, 1*pixel, 0, 0*pixel, 8*pixel);
		 tessellator.addVertexWithUV(size*pixel, -1*pixel, 0, 0*pixel, 6*pixel);
		 tessellator.addVertexWithUV(0, -1*pixel, 0, (int)size*pixel, 6*pixel);
		 tessellator.draw();
		 GL11.glRotatef(90, 1, 0, 0);
		 tessellator.startDrawingQuads();
		 tessellator.addVertexWithUV(0, 1*pixel, 0, (int)size*pixel, 8*pixel);
		 tessellator.addVertexWithUV(size*pixel, 1*pixel, 0, 0*pixel, 8*pixel);
		 tessellator.addVertexWithUV(size*pixel, -1*pixel, 0, 0*pixel, 6*pixel);
		 tessellator.addVertexWithUV(0, -1*pixel, 0, (int)size*pixel, 6*pixel);
		 tessellator.draw();
		 GL11.glRotatef(90, -1, 0, 0);
		 GL11.glPopMatrix();
	 }
	 
	 

	private void drawConnector(float[] angle, int[] target) {
		float size = 8;
		
		boolean horiDiag = false, vertDiag = false;
		
		if(target[0]!=0&&target[2]!=0)
			horiDiag=true;
		
		if(target[1]!=0&&(target[0]!=0||target[2]!=0))
			vertDiag=true;
		
		if(vertDiag&&!horiDiag)
			size+=0.72;
		
		if(horiDiag)
			size+=3.3;
		if(vertDiag)
			size+=2.6;
		
		GL11.glRotatef(angle[0], 1, 0, 0);
		GL11.glRotatef(angle[1], 0, 1, 0);
		GL11.glRotatef(angle[2], 0, 0, 1);
		
		 drawCore(size);
		 drawRails(size);
		
		 GL11.glRotatef(-angle[2], 0, 0, 1);
		 GL11.glRotatef(-angle[1], 0, 1, 0);
		 GL11.glRotatef(-angle[0], 1, 0, 0);
	}



	private void adjustLightFixture(World world, int x, int y, int z, Block block) {
         
         float brightness = block.getLightValue(world, x, y, z);
         int skyLight = world.getLightBrightnessForSkyBlocks(x, y, z, 0);
         int modulousModifier = skyLight % 65536;
         int divModifier = skyLight / 65536;
         tessellator.setColorOpaque_F(brightness, brightness, brightness);
         OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit,  modulousModifier,  divModifier);
 }

}