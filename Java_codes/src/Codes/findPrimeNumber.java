package Codes;

public class findPrimeNumber {
	//Given a number, find all the prime numbers up to that number
	public static void main(String[] args) {
		System.out.println(isPrime(13));
		System.out.println(countOfPrime(13));
		
	}
	//check if the number is prime
	static boolean isPrime(int givenNumber) {
		for(int i =2; i< givenNumber; i++) {
			if(givenNumber %i == 0) {
				return false;
			}
		}
		return true;
	}
	
	static int countOfPrime(int givenNumber) {
		int count = 0;
		for(int i =2; i<= givenNumber; i++) {
			if(isPrime(i)) {
				count++;
			}
		}
		
		return count;
	}

}
