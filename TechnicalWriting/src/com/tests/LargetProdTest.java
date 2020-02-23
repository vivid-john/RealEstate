package com.tests;



import com.product.LargetProduct;

import junit.framework.TestCase;

public class LargetProdTest extends TestCase {
	
	public void testWords(){
		assertEquals(LargetProduct.largestNumber("1027839594", 3),405);
		assertEquals(LargetProduct.largestNumber("1027839594", 5),9720);
		

		
	}

}
