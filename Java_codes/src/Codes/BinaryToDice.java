package Codes;

public class BinaryToDice {
	public static void main(String[] args) {
		int number = 7;
		while(true) {
			System.out.print(number%2+", "); 
			number = number / 2 ;
			if(number == 1) {
				System.out.print(number%2); 
				break;
			}
		}
	}
}
