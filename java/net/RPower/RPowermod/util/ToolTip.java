package net.RPower.RPowermod.util;

import java.util.List;

import net.minecraft.util.StatCollector;

public class ToolTip {
	public static void tooltip(List list, String name){
		list.add(StatCollector.translateToLocal("tooltip." + name));
	}
}
