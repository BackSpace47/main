package net.RPower.RPowermod.machines.power;

import java.util.Stack;

public class MFPacket {
	E_MFPacketType packetType;
	public Stack<Byte> packetOrigin;

	public MFPacket() {
		this(E_MFPacketType.PING);
	}

	public MFPacket(E_MFPacketType type) {
		packetType=type;
		
	}
}
