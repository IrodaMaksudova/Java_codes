package Codes;

import java.util.Scanner;

public class FindMaxAndMin {
	public static void main(String[] args) {
		/*
		 * Write a program that prompts user to enter to enter the numbers till the user
		 * wants (by asking if user wants to continue) and at the end the program should
		 * display the largest and smallest numbers entered.
		 */
		Scanner scan = new Scanner(System.in);
		int largestNumber = 999999999;
		int smallestNumber= 0;
		int i =0;
		do {
		System.out.print("Please enter a number: ");
		int number = scan.nextInt();
			if(number > largestNumber) {
				largestNumber = number;
			}else if(number < smallestNumber) {
				smallestNumber = number;
			}
		System.out.print("Do you want to continue? ");
		String answer = scan.next();
		if(answer.equalsIgnoreCase("y")) {
			i=1;
		}else {
			i=0;
		}
		}while(i==1);
		
		System.out.println("The largest number is: "+largestNumber);
		System.out.println("The smallest number is: "+smallestNumber);
		
		
		
		
		
		
		
		
	}
}
