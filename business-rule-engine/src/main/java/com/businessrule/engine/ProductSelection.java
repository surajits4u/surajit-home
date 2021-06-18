package com.businessrule.engine;

import com.businessrule.engine.bill.PackingSlip;
import com.businessrule.engine.bill.PackingSlipImpl;
import com.businessrule.engine.item.Item;
import com.businessrule.engine.member.MemberShip;
import com.businessrule.engine.member.Membershipimpl;
import com.businessrule.engine.payment.PaymentType;
import com.businessrule.engine.util.BusinessRuleEngineUtil;

public class ProductSelection {
	
	public boolean selectProduct(String product){ 
		
		boolean result=false;
if(product.equals(Item.BOOK.toString())){
	    	
	    	PackingSlip packingSlipImpl = new PackingSlipImpl();
	    	PaymentType paymentType = new PaymentType();
	    	paymentType.comissionPayment();
	    	packingSlipImpl.generateDupPackingSlip();
	    	result= true;
	    	
	    }else if(product.equals(Item.PRODUCT.toString())){
	    	
	    	PackingSlip packingSlipImpl = new PackingSlipImpl();
	    	packingSlipImpl.generatePackingSlip();
	    	result= true;
	    	
	    }else if(product.equals(Item.MEMBERSHIP.toString())){
	    	
	    	MemberShip membership = new Membershipimpl();
	    	membership.activateMembership();
	    	BusinessRuleEngineUtil.sendEmail();
	    	result= true;
	    	
	    }else if(product.equals(Item.MEMBERSHIPUP.toString())){
	    	
		    MemberShip membership = new Membershipimpl();
		    membership.upgradeMembership();
		    BusinessRuleEngineUtil.sendEmail();
		    
		    result= true;
		  
		    	
	    }else if(product.equals(Item.VIDEO.toString())){
	    	BusinessRuleEngineUtil.addVideo();
	    	result= true;
	    	
	    }else{
	        System.out.println("Error");
	      	        
	    }
	    




	   
	    return result;
	}

}
