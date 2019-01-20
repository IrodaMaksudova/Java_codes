package Codes;

import java.util.Scanner;

public class DescendingOrderNames {
	public static void main(String[] args) {
		/*
		 * Write a program asks the user to enter three names. Your program should
		 * display the names in descending order.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a name 1: ");
		String name1 = scan.next();
		System.out.print("Please enter a name 2: ");
		String name2 = scan.next();
		System.out.print("Please enter a name 3: ");
		String name3 = scan.next();
		String output = " ";
		if(name1.compareToIgnoreCase(name2)<0 && name1.compareToIgnoreCase(name3)<0 ) {
			output+= name1;
			if(name2.compareToIgnoreCase(name3)<0) {
				output+= name2;
				output+= name3;
			}else {
				output+=name3;
				output+=name2;
			}
		}
		if(name2.compareToIgnoreCase(name1)<0 && name2.compareToIgnoreCase(name3)<0 ) {
			output+=name2;	
			if(name1.compareToIgnoreCase(name3)<0) {
				output+= name1;
				output+=name3;
			}else {
				output+=name3;
				output+= name1;
			}
			System.out.println(output);
		}
		if(name3.compareToIgnoreCase(name1)<0 && name3.compareToIgnoreCase(name2)<0 ) {
			output+=name3;
			if(name1.compareToIgnoreCase(name2)<0) {
				output +=name1;
				output+=name2;
			}else {
				output += name2;
				output+= name1;
			}
		}
		
		
	
		
		
		
		
		
		
		
		
	}
}
