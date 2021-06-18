package com.businessrule.engine.bill;

public class PackingSlipImpl implements PackingSlip{

	@Override
	public void generatePackingSlip() {

		System.out.print("generate a packingslip for shipping");
		
	}

	@Override
	public void generateDupPackingSlip() {

		System.out.print("create a duplicate packing slip for the royaltydepartment.");
		
	}

}
