import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.client.*;
import net.minecraft.client.audio.*;
import net.minecraft.client.entity.*;
import net.minecraft.client.gui.*;
import net.minecraft.client.gui.achievement.*;
import net.minecraft.client.gui.inventory.*;
import net.minecraft.client.model.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.client.particle.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.culling.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.renderer.tileentity.*;
import net.minecraft.client.settings.*;
import net.minecraft.command.*;
import net.minecraft.crash.*;
import net.minecraft.creativetab.*;
import net.minecraft.dispenser.*;
import net.minecraft.enchantment.*;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.boss.*;
import net.minecraft.entity.effect.*;
import net.minecraft.entity.item.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.projectile.*;
import net.minecraft.inventory.*;
import net.minecraft.item.*;
import net.minecraft.item.crafting.*;
import net.minecraft.nbt.*;
import net.minecraft.network.*;
import net.minecraft.network.rcon.*;
import net.minecraft.pathfinding.*;
import net.minecraft.potion.*;
import net.minecraft.profiler.*;
import net.minecraft.server.*;
import net.minecraft.server.dedicated.*;
import net.minecraft.server.gui.*;
import net.minecraft.server.integrated.*;
import net.minecraft.server.management.*;
import net.minecraft.src.*;
import net.minecraft.stats.*;
import net.minecraft.tileentity.*;
import net.minecraft.util.*;
import net.minecraft.village.*;
import net.minecraft.world.*;
import net.minecraft.world.biome.*;
import net.minecraft.world.chunk.*;
import net.minecraft.world.chunk.storage.*;
import net.minecraft.world.demo.*;
import net.minecraft.world.gen.*;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.layer.*;
import net.minecraft.world.gen.structure.*;
import net.minecraft.world.storage.*;
import net.minecraftforge.classloading.*;
import net.minecraftforge.client.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.client.event.sound.*;
import net.minecraftforge.common.*;
import net.minecraftforge.event.*;
import net.minecraftforge.event.entity.*;
import net.minecraftforge.event.entity.item.*;
import net.minecraftforge.event.entity.living.*;
import net.minecraftforge.event.entity.minecart.*;
import net.minecraftforge.event.entity.player.*;
import net.minecraftforge.event.terraingen.*;
import net.minecraftforge.event.world.*;
import net.minecraftforge.oredict.*;
import net.minecraftforge.transformers.*;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.registry.*;
import cpw.mods.fml.common.network.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;
import io.netty.buffer.ByteBuf;

import cpw.mods.fml.common.network.FMLIndexedMessageToMessageCodec;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import cpw.mods.fml.relauncher.*;

@Mod(modid = TestEnvironmentMod.MODID, version = TestEnvironmentMod.VERSION)
public class TestEnvironmentMod implements IFuelHandler, IWorldGenerator{

	public static final String MODID = "TestEnvironmentMod";
    public static final String VERSION = "1.0";

    //@SidedProxy(clientSide="net.minecraft.src.ClientProxyTestEnvironmentMod", serverSide="net.minecraft.src.CommonProxyTestEnvironmentMod")
    @SidedProxy(clientSide="ClientProxyTestEnvironmentMod", serverSide="CommonProxyTestEnvironmentMod")
    public static CommonProxyTestEnvironmentMod proxy;
	//public static EnumMap<Side, FMLEmbeddedChannel> channels = NetworkRegistry.INSTANCE.newChannel("MCRBUS", new ChannelHandlerTestEnvironmentMod());

	@Instance(MODID)
    public static TestEnvironmentMod instance;

	

@Override
public int getBurnTime(ItemStack fuel) {
return 0;
}

@Override
public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

chunkX = chunkX * 16;
chunkZ = chunkZ * 16;


}
@EventHandler
public void load(FMLInitializationEvent event) {

GameRegistry.registerFuelHandler(this);
GameRegistry.registerWorldGenerator(this, 1);
MinecraftForge.EVENT_BUS.register(new mcreator_GlobalEventsTestEnvironmentMod());
NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());


}
@EventHandler
public void serverLoad(FMLServerStartingEvent event){
}
@EventHandler
public void preInit(FMLPreInitializationEvent event){
proxy.registerRenderers(this);
}
public static class GuiHandler implements IGuiHandler {
@Override public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
return null;}
@Override public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
return null;}
}


}
