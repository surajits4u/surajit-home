package com.businessrule.engine;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class ProductSelectionTest {

	private ProductSelection classUnderTest = new ProductSelection();
    
	 @Before
	    public void setup() {
	        classUnderTest = new ProductSelection();
	      
	    }
	 
	 	
		@Test
		public void selectProductForBookTest(){
			assertEquals(true,classUnderTest.selectProduct("BOOK"));
					
		}

		@Test
		public void selectProductForProductTest(){
			assertEquals(true,classUnderTest.selectProduct("PRODUCT"));
					
		}
		
		@Test
		public void selectProductForMemebershipUpgradeTest(){
			assertEquals(true,classUnderTest.selectProduct("MEMBERSHIPUP"));
					
		}
		
		@Test
		public void selectProductForMemebershipActiveTest(){
			assertEquals(true,classUnderTest.selectProduct("MEMBERSHIP"));
					
		}
		
		@Test
		public void selectProductForVideoTest(){
			assertEquals(true,classUnderTest.selectProduct("VIDEO"));
					
		}
		
		@Test
		public void selectProductForNoMatchTest(){
			assertEquals(false,classUnderTest.selectProduct("NA"));
					
		}

	
}
