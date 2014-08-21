package net.RPower.RPowermod.util;

public class StringHelper {

	public static int getNumbersInString(String string){
		for(int i = 0; i < string.length(); i++){
			boolean shouldRemove = true;
			for(int g = 0; g < 10; g++){
				if(("" + string.charAt(i)).equals(""+g)){
					shouldRemove = false;
				}
			}

			if(shouldRemove){
				string = string.replace(string.charAt(i),' ');
			}
		}

		string = string.trim();

		return Integer.parseInt(string);
	}

	public static int getIntFromStringInteval(String toCheck, String start, String end){
		if(toCheck.contains(start)){
			String index = toCheck.substring(toCheck.indexOf(start));
			if(index.contains(end)){
				index = index.substring(start.length(),index.indexOf(end));
				index = index.trim();
				return getNumbersInString(index);
			}
			else{
				return 0;
			}
		}
		else{
			return 0;
		}
	}
}
