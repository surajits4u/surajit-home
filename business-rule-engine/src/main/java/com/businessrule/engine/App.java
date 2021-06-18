package com.businessrule.engine;


import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
           
        ProductSelection productSelection = new ProductSelection();
        
        List <String> itemlist = new ArrayList<String>();
        itemlist.add("PRODUCT");
        itemlist.add("BOOK");
        itemlist.add("MEMBERSHIP");
        itemlist.add("MEMBERSHIPUP");
        itemlist.add("VIDEO");
        
        for(String product : itemlist) {
        	boolean item = productSelection.selectProduct(product);
        	
        	System.out.println(item);
        	
        }
        
    }
}
