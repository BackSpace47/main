package net.RPower.RPowermod.util;

import net.minecraft.item.Item;
import net.minecraft.stats.Achievement;
import net.minecraft.util.StatCollector;

public class AchievementHelper {
	/**
	 *
	 */
	public static Achievement EasyAchivement(String name, int x, int y, Item item, Achievement achievement){
		return new Achievement(StatCollector.translateToLocal("achivement." + name + ".unlock_message"),name,x,y,item,achievement).registerStat();
	}
}
