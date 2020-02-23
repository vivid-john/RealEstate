package com.product;

/*
 * Create a function that takes a string of digits, a number n and returns the largest product for n adjacent digits.
 */
public class LargetProduct {
	
	/*
	 * returns the largest product
	 * takes the number in String and digits in int
	 * returns and intiger value of the result.
	 */
	public static int largestNumber(String number, int digits){
		
		int largestProduct = 1;
		int multiply = 1;
		
		//loop through the number
		for(int i=0;i < number.length() - digits; i++ ){
			
			multiply = 1;
			
			System.out.print("Subset starting at position:" + i + ":");
			//iterate through the subset based on the digits
			for(int j=i; j < i+ digits; j++){
				System.out.print(number.substring(j,j+1) );
				multiply = multiply * Integer.parseInt(number.substring(j,j+1));
			}
			System.out.println();
			//replace the largest product
			if(multiply > largestProduct) {
				largestProduct = multiply;
				System.out.println("starting at " + i + "Product =" + largestProduct );
			}
		}
		
		return largestProduct;
		
	}

}
