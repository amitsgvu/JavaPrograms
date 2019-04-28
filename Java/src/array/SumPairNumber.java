package array;

public class SumPairNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 2, 7, 4, -5, 11, 5, 20 };

		int number = 15;

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] + a[j] == number) {
					System.out.println("pair is " + a[i] + " and " + a[j]);
				}
			}
		}
	}

}
