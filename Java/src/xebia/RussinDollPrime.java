package xebia;

import java.util.Scanner;

public class RussinDollPrime {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number greater than 0 and smaaler than 4,200,000");

		int p = in.nextInt();

		if (p <= 2 || p > 4200000) {
			System.out.println("NO");
		}

		else {

			if (new RussinDollPrime().isPrime(p)) {
				if (new RussinDollPrime().checkNumber(p)) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			} else {
				System.out.println("NO");
			}

		}

	}

	private boolean checkNumber(int p) {
		// TODO Auto-generated method stub

		int i = 2;
		boolean flag = true;
		// check number prime or not
		while (p != 0) {
			int num = p / 10;
			flag = isPrime(num);

			if (flag == false || String.valueOf(num).length() == 1) {
				break;
			}

			p = num;

		}
		return flag;

	}

	private boolean isPrime(int number) {
		boolean flag = true;
		if (number <= 2) {
			flag = false;
		}

		int i = 2;

		// check number prime or not
		for (i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				// System.out.println("NO");
				flag = false;
				break;
			}
		}

		if (flag) {
			// System.out.println("YES");
		}
		return flag;

	}
}
