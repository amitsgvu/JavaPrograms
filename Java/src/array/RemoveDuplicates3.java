package array;

import java.util.Arrays;

public class RemoveDuplicates3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 2, 3, 3, 4, 5, 6, 7, 7, 8, 8 };

		int temp[] = new int[a.length];

		int k = 1;

		boolean flag = false;

		temp[0] = a[0];

		for (int i = 1; i < a.length; i++) {
			flag = false;

			for (int j = 0; j < k; j++) {

				if (temp[j] == a[i]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				;
				temp[k++] = a[i];

			}

		}
		temp = Arrays.copyOf(temp, k);
		System.out.println("after removing duplicate array" + Arrays.toString(temp));
	}

}
