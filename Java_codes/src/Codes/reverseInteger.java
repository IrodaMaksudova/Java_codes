package Codes;

public class reverseInteger {
	public static void main(String[] args) {
		int number = -345678;
		System.out.println(reversedInt(number));
	}

	static int reversedInt(int number) {
		// 345678
		// To get 8 -> 345678%10 -> gives me 8
		// To get 7 -> I need 34567 -> To get 34567, I need to divide 345678/10 -->34567
		// 34567%10 -> gives me 7
		// To get 6 -> 3456%10 -> gives me 6
		int reversed = 0;
		if (number > 0) {
			while (number > 0) {
				reversed = number % 10 + reversed * 10;// reversed*10 -> to shift value to left every time
				number = number / 10;
			}
		} else {// if the number less then 0
			while (number < 0) {
				reversed = number % 10 + reversed * 10;// reversed*10 -> to shift value to left every time
				number = number / 10;
			}
		}
		return reversed;
	}
}
