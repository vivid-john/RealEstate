package com.words;

import java.util.Arrays;

public class WordCheck {
	
	/*
	 * method to check any letters are repeating
	 * return a boolean value based on the result
	*/
	
	public static boolean wordcheck(String word){
		
		//changing all to lower case
		word=word.toLowerCase();
		
		//converting word to a letter array
		char letterAry[] = word.toCharArray();
		
		//sorting the array
		Arrays.sort(letterAry);
		
		//looping through the words for duplicates
		for(int i=0; i<letterAry.length-1;i++){

			//checking for duplicates and alphabets
			if((letterAry[i]>='a' && letterAry[i]<='z') && (letterAry[i] == letterAry[i+1])){
				System.out.println("repeating letter : " + letterAry[i]);
				return false;
			}
			
		}
		System.out.println("nothing repeats");
		return true;
	}

}
