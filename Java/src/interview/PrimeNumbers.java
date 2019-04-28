package interview;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out
				.println("Enter a number greater than 2 which you want to check whether that number is prime or not: ");
		int p = in.nextInt();
		int i = 2;
		for (; i < 10; i++) {
			if (p % i == 0 && p != i) {
				System.out.println("Entered number " + p + " is not a prime number.");
				break;
			}
		}
		if(i==10){
			System.out.println("Entered number "+p+" is a prime number.");
			}		
		

	}
}
