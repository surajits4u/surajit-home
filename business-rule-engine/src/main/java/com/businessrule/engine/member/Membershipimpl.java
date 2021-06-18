package com.businessrule.engine.member;

public class Membershipimpl implements MemberShip{

	@Override
	public void activateMembership() {
		System.out.print("membership activated");
		
	}

	@Override
	public void upgradeMembership() {
		System.out.print("membership upgraded");
		
	}

}
