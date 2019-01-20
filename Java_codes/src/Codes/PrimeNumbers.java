package Codes;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		/*
		 * Q-5 Print all the prime numbers below 100
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println(2);
	
		for(int number=3; number < 100; number++) {
			
			for(int j=2; j < 100; j++) {
				if(number %j==0) 
					break;
				if(number-1 ==j)	
				System.out.println(number);
			}
		}
		
		
		
		
		
		
		
		
	}
}
