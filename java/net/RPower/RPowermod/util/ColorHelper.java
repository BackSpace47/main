package net.RPower.RPowermod.util;

public class ColorHelper {

	/**
	 * @param r red part of color (up to 255)
	 * @param g green part of color (up to 255)
	 * @param b blue part of color (up to 255)
	 * @return a color integer value.
	 */

	public static int IntFromRGB(int r, int g, int b){

		/*
		 *  Blue = 	1 -> 255;		add 1		per 1 rgb;
		 * 	Green = 256 -> 65280; 	add 255		per 1 rgb;
		 * 	Red = 	16711680;		add 65535	per 1 rgb;
		 *
		 * 	Black = 0
		 * 	White = 16777215
		 */

		return r*256*256 + g*256 + b;
	}

}
