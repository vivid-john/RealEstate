/**
 * 
 */
package com.sum;

/**
 * @author Jobin
 *
 */
public class DigitSum {
	

	public int digitSum(int number){
		
		int sum = 0;
		
		//looping to add the numbers
		while(number != 0){
			sum += number % 10;
			number = number/10;
		}
		
		//a small debug step
		System.out.println("Sum :" + sum);

		//Checking for single digit, else repeat
		if(sum>9) sum = this.digitSum(sum);
		return sum;
		
	}

}
