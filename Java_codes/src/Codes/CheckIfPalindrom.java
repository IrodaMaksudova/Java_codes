package Codes;

import java.util.Scanner;

public class CheckIfPalindrom {
	/*
	 * Program will accept a string, one word and tell if it is palindrom or not.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word to check if polindrom: ");
		String word = scan.next();
		
		String reversed = "";
		
		//reversed the word and assign to reversed
		
		for(int i = word.length()-1; i>=0; i--) {
			reversed = reversed + word.charAt(i);
		}
		
		System.out.println("reversed: "+reversed);
		
		if(word.equalsIgnoreCase(reversed)) {
			System.out.println(word+" is a palindrom.");
		}else {
			System.out.println(word+" is NOT a palindrom.");
		}
		
		
		
		
	}
}
