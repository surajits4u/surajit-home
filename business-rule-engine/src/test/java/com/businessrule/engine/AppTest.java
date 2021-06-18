package com.businessrule.engine;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private ProductSelectionTest productSelectionTest = new ProductSelectionTest();
    
    @Test
    public void appTest()
    {
    	
    	productSelectionTest.selectProductForBookTest();
    	productSelectionTest.selectProductForMemebershipActiveTest();
        
    	productSelectionTest.selectProductForMemebershipUpgradeTest();
    }
}
