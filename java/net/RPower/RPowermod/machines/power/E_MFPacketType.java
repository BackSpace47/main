package net.RPower.RPowermod.machines.power;

import java.util.LinkedList;
import java.util.List;

public enum E_MFPacketType {
	PING,REQUEST,RESPOND;
	
	public List<E_MFPacketType> getPermitted(E_MFPacketType type)
	{
		List<E_MFPacketType> result = new LinkedList<E_MFPacketType>();
		switch(type)
		{
		case RESPOND:
			result.add(RESPOND);
		case REQUEST:
			result.add(REQUEST);
		default:
			result.add(PING);
		}
		return result;
	}
}
