package array;

public class moveZero {
	/*
	 * public static void main(String[] args) throws Exception { int[] array_nums =
	 * { 0, 0, 1, 0, 3, 0, 5, 0, 6 }; int i = 0;
	 * System.out.print("\nOriginal array: \n"); for (int n : array_nums)
	 * System.out.print(n + "  ");
	 * 
	 * for (int j = 0; j<array_nums.length; j++) { if (array_nums[j] != 0) {
	 * array_nums[i]=array_nums[j]; i++; }
	 * 
	 * } while (i < array_nums.length) array_nums[i++] = 0;
	 * 
	 * System.out.print("\nAfter moving 0's to the end of the array: \n"); for (int
	 * n : array_nums) System.out.print(n + "  "); System.out.print("\n"); }
	 */

	/*
	 * public static void main(String[] args) throws Exception { int[] array_nums =
	 * { 0, 7, 1, 5, 3, 0, 5, 11, 6 }; int i = array_nums.length-1;
	 * System.out.print("\nOriginal array: \n"); for (int n : array_nums)
	 * System.out.print(n + "  ");
	 * 
	 * for (int j=array_nums.length-1;j>=0 ;j--) {
	 * 
	 * if (array_nums[j] != 0) { array_nums[i]=array_nums[j]; i--; }
	 * 
	 * } while (i >= 0) array_nums[i--] = 0;
	 * 
	 * System.out.print("\nAfter moving 0's to the end of the array: \n"); for (int
	 * n : array_nums) System.out.print(n + "  "); System.out.print("\n"); }
	 */
	public static void main(String[] args) throws Exception {
		int[] array_nums = { 4, 87, 0, 0, 8, 5, 0, 0, 5, 11, 6, 0 };
		int i = array_nums.length - 1;
		System.out.print("\nOriginal array: \n");
		for (int n : array_nums)
			System.out.print(n + "  ");
		boolean flag = false;
		for (int j = array_nums.length - 1; j >= 0; j--) {

			if (array_nums[j] == 0) {

				for (int k = j - 1; k >= 0; k--) {
					if (array_nums[k] != 0) {

						int temp = array_nums[k];
						array_nums[k] = array_nums[j];
						array_nums[j] = temp;
						if (k == 0) {
							flag = true;
							break;
						}
						break;

					}
				}
				if (flag)
					break;

			}

		}
		// while (i >= 0)
		// array_nums[i--] = 0;

		System.out.print("\nAfter moving 0's to the end of the array: \n");
		for (int n : array_nums)
			System.out.print(n + "  ");
		System.out.print("\n");
	}

}
