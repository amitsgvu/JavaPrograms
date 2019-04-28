package xebia;

import java.util.Arrays;

public class FirstProblem {

	public static void main(String[] args) throws Exception {
		// Array having height of trees
		int[] tree = { 8, 2, 1, 5, 4, 3, 7 };

		new FirstProblem().calculateTree(tree);
	}

	public int[] calculateTree(int[] input) {
		int temp;

		for (int i = 0; i < input.length; i++) {

			for (int j = i + 1; j < input.length; j++) {

				if (input[i] > input[j]) {

					temp = input[i];
					input[i] = input[j];
					input[j] = temp;

				}

			}
		}

		// System.out.print("descending order "+Arrays.toString(my_array1));
		Arrays.stream(input).forEach(System.out::println);
		return input;

	}
}
