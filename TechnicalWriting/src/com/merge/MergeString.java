/**
 * 
 */
package com.merge;

/**
 * @author Jobin 
 *
 */
public class MergeString {
	
	public static String merge(String firstWord, String secondWord){
		
		int length = secondWord.length();
		//Since in java string is immutable using StringBuilder to build the final String, used frequntly in the early stages of my Java interviews 
		StringBuilder output = new StringBuilder();
		
		//adding largest number to the length
		if(firstWord.length()>secondWord.length()) length = firstWord.length(); 
			
		
		//loop through the characters
		for(int i=0; i< length ; i++ ){
			
			if(i<firstWord.length())output.append(firstWord.charAt(i));
			if(i<secondWord.length())output.append(secondWord.charAt(i));
		}
		
		System.out.println("first word: " + firstWord);
		System.out.println("Second word: " + secondWord);
		System.out.println("merged word: " + output.toString());
		
		return output.toString();
		
	}

}
