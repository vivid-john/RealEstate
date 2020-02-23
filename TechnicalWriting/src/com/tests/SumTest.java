package com.tests;

import com.merge.MergeString;
import com.sum.DigitSum;

import junit.framework.TestCase;

public class SumTest extends TestCase {
	
	public void testSum(){
		
		assertEquals(new DigitSum().digitSum(4),4);
		assertEquals(new DigitSum().digitSum(18),9);
		assertEquals(new DigitSum().digitSum(258),6);
	}

}
