package Codes;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		/*
		 * Q-6 Enter a word and check if it is palindrome 
		 * Output Enter a string: noon
		 * noon is a palindrome 
		 * Enter a string: moon 
		 * moon is not a palindrome
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word and check if it is palindrom:");
		String word= scan.next();
		
		for(int i = 0; i <word.length(); i++) {
			  //    first letter          last letter
			if(word.charAt(i) != word.charAt(word.length()-1-i)) {
				System.out.println(word+ " is not a palindrome.");
				System.exit(0);
			}
		}
		System.out.println(word+ " is a palindrome.");
	}
}
