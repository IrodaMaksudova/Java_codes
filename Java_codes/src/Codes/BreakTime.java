package Codes;

import java.util.Scanner;

public class BreakTime {
	public static void main(String[] args) throws InterruptedException {
		Scanner  scan = new Scanner (System.in);
		System.out.println("Please enter the break time in minutes:");
		int breakTime = scan.nextInt();
		
		int totalSeconds =breakTime *60;
		
		int minutes = totalSeconds/60;
		int seconds = totalSeconds%60;
		
		while(totalSeconds > 0) {
			minutes = totalSeconds/60;
			seconds = totalSeconds%60;
			totalSeconds--;
			System.out.println("Remaining time is: "+minutes+ " : "+seconds);
			
			Thread.sleep(1000);
		}
		System.out.println("BREAK IS OVER.");
	}
}
