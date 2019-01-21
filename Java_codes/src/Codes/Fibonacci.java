package Codes;

public class Fibonacci {
	public static void main(String[] args) {
		//adding two previous number to find next number
		int firstNum = 0;
		int secondNum = 1;
		int fibNum = 0;
		int numOfTerm = 8;
		
		for(int i=1; i<numOfTerm-1; i++) {
			if(i==1) {
			System.out.print(firstNum+" "+secondNum);
			}
			fibNum = firstNum+secondNum;
			secondNum = fibNum;
			firstNum = secondNum;
			System.out.print(" "+fibNum);
		}
		
		//////////////////////////
		int firstNumber=0, secondNumber=1;
		int fibNumber=0;
		int numberOfTerm=8;	
		for (int i=1;i<numberOfTerm-1;i++) {
			if(i==1) {
			System.out.print(firstNumber+","+secondNumber);
			}
			fibNumber=firstNumber+secondNumber;
			firstNumber=secondNumber;
			secondNumber=fibNumber;
			System.out.print("," +fibNumber);
		}
		
		
	}

}
