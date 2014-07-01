package net.RPower.RPowermod.event;

import net.RPower.RPowermod.block.blockREBS;
import net.RPower.RPowermod.core.RPCore;
import net.minecraftforge.event.entity.player.BonemealEvent;

public class BEvent {
	
    public void bonemealUsed(BonemealEvent event)
	    {
	  if(event.world.getBlock(event.x, event.y, event.z) == RPCore.elderSap)
	        {
	         ((blockREBS)RPCore.elderSap).fertilize(event.world, event.x, event.y, event.z);
	        }
	    }
	}
