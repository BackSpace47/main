package net.RPower.RPowermod.renderers.block;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.RPower.RPowermod.model.block.ModelFluxCableBasic;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
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
	private final ModelFluxCableBasic model;
	private final ResourceLocation texture;
	public static int blockRenderId;
	
	public TileEntityFluxCableRenderer() {
		model = new ModelFluxCableBasic();
		blockRenderId = RenderingRegistry.getNextAvailableRenderId();
		texture = new ResourceLocation(net.RPower.RPowermod.core.RPCore.modid+":textures/blocks/fluxCable.png");
		
	}



	@Override
	public void renderTileEntityAt(TileEntity entity, double x, double y, double z, float scale) {
		//binding the textures
        Minecraft.getMinecraft().renderEngine.bindTexture(texture);
		GL11.glPushMatrix();
		//initial location (what's up with the 0.5 and 1.5 difference I wonder)
		 GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
		
         //let LWGL know we're doing more matixy manipulation stuff
         GL11.glPushMatrix();
         //rotate to avoid model rendering upside down
         GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
         this.model.render((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
         //pop both sections off the render stack
         GL11.glPopMatrix();
         GL11.glPopMatrix();
         //System.out.println("FOV : "+Minecraft.getMinecraft().gameSettings.fovSetting);
	}
	 private void adjustLightFixture(World world, int x, int y, int z, Block block) {
         Tessellator tess = Tessellator.instance;
         float brightness = block.getLightValue(world, x, y, z);
         int skyLight = world.getLightBrightnessForSkyBlocks(x, y, z, 0);
         int modulousModifier = skyLight % 65536;
         int divModifier = skyLight / 65536;
         tess.setColorOpaque_F(brightness, brightness, brightness);
         OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit,  modulousModifier,  divModifier);
 }

}