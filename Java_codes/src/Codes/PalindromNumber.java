package Codes;

import java.util.Scanner;

public class PalindromNumber {
	public static void main(String[] args) {
		/*
		 * Write a Java program which accepts a number from user and check if the number
		 * is palindrome or not? A palindrome number is a number which remains the same
		 * when it is reversed.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int original = scan.nextInt();
	
		int copy = original;
		int reversed = 0;
		
		while(copy >0) {
			reversed = reversed *10;
			reversed = reversed + copy %10;
			copy = copy/10;
			}
		if(original == reversed) {
			System.out.println("Palindrom");
		}else {
			System.out.println("Not Palindrom");
		}
		/*
		 *  while( num != 0 ){
	           remainder = num % 10;
	           reversedInteger = reversedInteger * 10 + remainder;
	           num  /= 10;
		 */
		// 2nd way
//		System.out.println("Enter a number: ");
//		String number = scan.next();
//		String reversed= "";
//		for(int i = number.length()-1; i >= 0; i--) {
//			reversed = reversed+ number.charAt(i);
//			}
//		System.out.println(reversed);
//		if(number.equalsIgnoreCase(reversed)){
//			System.out.println("Palindrom");
//		}else {
//			System.out.println("Not Palindrom");
//		}
	}
}
