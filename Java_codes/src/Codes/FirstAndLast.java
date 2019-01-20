package Codes;

import java.util.Scanner;

public class FirstAndLast {
	public static void main(String[] args) {
		/*
		 * First and last
		 * Ask user to enter two words. Print the first letter of the first
		 * word and the last letter of the second word.
		 * Input:Bob system Output: Bm
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two words.");
		String word1 = scan.nextLine();
		String word2 = scan.nextLine();
		int lengthW2 = word2.length();
		
		System.out.println(word1.substring(0,1)+ word2.substring(lengthW2-1));
		
	}
}
