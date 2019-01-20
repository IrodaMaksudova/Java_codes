package Codes;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		/*
		 * Write a Java program which accepts a number from user and check if the number
		 * is prime or not? A prime number is a number is divisible by itself and 1
		 * only.
		 * 
		 * 1 2 3 4 5 -> to check if 5 prime number we need to check if 5 divisible by
		 * any number between 2 and 4 (inclusive); if divisible it is not a prime
		 * number. 
		 * Step 1- get all the numbers between 1 and given number and divide the
		 * given number by them one by one if any of those numbers can divide the given
		 * number (without remainder), then number is not prime but if none of those
		 * numbers can divide the given number then number is prime.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scan.nextInt();

		for (int i = 2; i < number; i++) {
			int remainder = number % i;
			if (remainder == 0) {
				System.out.println(number + " is not a Prime number.");
				break;
			}else {
				System.out.println(number+" is a Prime number.");
				break;
			}
		}
		
		
//		//2nd way
//		boolean isPrime=true;
//		
//		for(int n=2; n<=number/2; n++) {
//			if(number%n == 0) {
//				isPrime =false;
//				break;
//			}
//		}
//		if(isPrime) {
//			System.out.println(number+" is Prime.");
//		}else {
//			System.out.println(number+" is NOT Prime.");
//		}
	}
}
