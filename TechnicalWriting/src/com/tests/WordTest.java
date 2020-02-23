package com.tests;

import com.words.WordCheck;

import junit.framework.TestCase;

public class WordTest extends TestCase {
	
	public void testWords(){
		assertEquals(WordCheck.wordcheck("documentarily"),true);
		assertEquals(WordCheck.wordcheck("aftershock"),true);
		assertEquals(WordCheck.wordcheck("countryside"),true);
		assertEquals(WordCheck.wordcheck("six-year-old"),true);
		assertEquals(WordCheck.wordcheck("Double-down"),false);
		assertEquals(WordCheck.wordcheck("Euclidean"),false);
		assertEquals(WordCheck.wordcheck("epidemic"),false);
		
	}
}
