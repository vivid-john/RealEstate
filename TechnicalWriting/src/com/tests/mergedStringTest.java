/**
 * 
 */
package com.tests;

import com.merge.MergeString;
import com.product.LargetProduct;

import junit.framework.TestCase;

/**
 * @author Jobin John
 *
 */
public class mergedStringTest extends TestCase {
	
	public void testMerge(){
	
		assertEquals(MergeString.merge("MICHAEL","JORDAN"),"MJIOCRHDAAENL");
	}
}
