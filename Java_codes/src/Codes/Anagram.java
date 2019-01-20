package Codes;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
//		String word1 = " Listen";
//		String word2 = "Silent";
//		//convert all to lower case
//		word1 = word1.toLowerCase().trim();
//		word2 = word2.toLowerCase().trim();
//		System.out.println(word1+" "+word2);
//		// Create a string array
//		String[] word11 = new String [word1.length()];
//		for(int i = 0; i <word1.length();i++) {
//			word11[i] = word1.substring(i, i+1);
//		}
//		Arrays.sort(word11);
//		
//		String[] word22 = new String[word2.length()];
//		for(int i = 0; i< word2.length(); i++) {
//			word22[i] = word2.substring(i, i+1);
//		}
//		Arrays.sort(word22);
		
//		System.out.println(Arrays.equals(word11, word22));
		/////////////////////////////////
		
		String word1 = " Listen";
		String word2 = "Silent";
		//convert all to lower case
		word1 = word1.toLowerCase().trim();
		word2 = word2.toLowerCase().trim();
		System.out.println(word1+" "+word2);
		// Create a string array
		char[] charArrayWord1 = word1.toCharArray();
		Arrays.sort(charArrayWord1);
		
		char[] charArrayWord2 = word2.toCharArray();
		Arrays.sort(charArrayWord2);
		
		System.out.println(Arrays.equals(charArrayWord1, charArrayWord2));
	}
}
