package Codes;

import java.util.Scanner;

public class NumberToWordVersion2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number between 0 and 1000.");
		int number = scan.nextInt();
		
		if(number < 0 || number > 1000) {
			System.out.println("Invalid entery.");
			System.exit(0);
		}else if( number == 1000) {
			System.out.println("thousand");
		}
		int num1 = (number %100) %10;
		int num2 = (number % 100)/10;
		int num3 = number / 100;
		
		String word1 = "", word2 = "", word3 = "";
		
		switch(num1) {
		case 0:
			word1 = "zero";
			break;
		case 1:
			word1 = "one";
			break;
		case 2:
			word1 = "two";
			break;
		case 3:
			word1 = "three";
			break;
		case 4:
			word1 = "four";
			break;
		case 5:
			word1 = "five";
			break;
		case 6:
			word1 = "six";
			break;
		case 7:
			word1 = "seven";
			break;
		case 8:
			word1 = "eigth";
			break;
		case 9:
			word1 = "nine";
			break;
		case 10:
				word1 = "ten";
				break;
		case 11:
			word1 = "eleven";
			break;
		case 12:
			word1 = "twelve";
			break;
		case 13:
			word1 = "thirteen";
			break;
		case 14:
			word1 = "fourteen";
			break;
		case 15:
			word1 = "fifteen";
			break;
		case 16:
			word1 = "sixteen";
			break;
		case 17:
			word1 = "seventeen";
			break;
		case 18:
			word1 = "eighteen";
			break;
		case 19:
			word1 = "ninteen";
			break;
		}
		switch (num2) {

		case 2:
			word2 = "twenty";
			break;
		case 3:
			word2 = "thirty";
			break;
		case 4:
			word2 = "fourty";
			break;
		case 5:
			word2 = "fifty";
			break;
		case 6:
			word2 = "sixty";
			break;
		case 7:
			word2 = "seventy";
			break;
		case 8:
			word2 = "eighty";
			break;
		case 9:
			word2 = "ninety";
			break;
		}
		switch (num3) {

		case 1:
			word3 = "one hundred";
			break;
		case 2:
			word3 = "two hundred";
			break;
		case 4:
			word3 = "four hundred";
			break;
		case 5:
			word3 = "five hundred";
			break;
		case 6:
			word3 = "six hundred";
			break;
		case 7:
			word3 = "seven hundred";
			break;
		case 8:
			word3 = "eight hundred";
			break;
		case 9:
			word3 = "nine hundred";
			break;
		}

				
		System.out.println((word3+ " " +word2+ " " +word1).trim());
		
		
		
		
		
		
		
		
		
		
	}
}
