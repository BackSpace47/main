package RPower.api.power.core;

import java.util.LinkedList;
import java.util.List;

public enum E_MFPacketType {
	RESPOND,REQUEST;
	
	public List<E_MFPacketType> getPermitted(E_MFPacketType type)
	{
		List<E_MFPacketType> result = new LinkedList<E_MFPacketType>();
		switch(type)
		{
		case RESPOND:
			result.add(RESPOND);
		default:
			result.add(REQUEST);
		}
		return result;
	}
}
