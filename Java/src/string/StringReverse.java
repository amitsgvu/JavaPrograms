package string;

public class StringReverse {

	/*
	 * public static void main(String[] args) {
	 * 
	 * String str = "amit kumar sharma"; String reverse = ""; char[] value =
	 * str.toCharArray(); for (int i = value.length - 1; i >= 0; i--) { reverse =
	 * reverse + value[i];
	 * 
	 * }
	 * 
	 * System.out.println("reverse of string is " + reverse); }
	 */
	/*
	 * public static void main(String[] args) {
	 * 
	 * String str = "amit kumar sharma";
	 * 
	 * char[] value = str.toCharArray();
	 * 
	 * 
	 * 
	 * for (int i = 0; i <value.length/2; i++) {
	 * 
	 * char temp=value[i]; value[i]=value[value.length-i-1];
	 * value[value.length-i-1]=temp;
	 * 
	 * 
	 * }
	 * 
	 * for(char c:value) { System.out.println(c); } }
	 */

	/*
	 * Function to reverse arr[] from start to end
	 */
	/*
	 * static void rvereseArray(int arr[], int start, int end) { int temp;
	 * 
	 * while (start < end) { temp = arr[start]; arr[start] = arr[end]; arr[end] =
	 * temp; start++; end--; } }
	 * 
	 * Utility that prints out an array on a line static void printArray(int arr[],
	 * int size) { for (int i = 0; i < size; i++) System.out.print(arr[i] + " ");
	 * 
	 * System.out.println(); }
	 * 
	 * // Driver code public static void main(String args[]) {
	 * 
	 * int arr[] = {1, 2, 3, 4, 5, 6}; printArray(arr, 6);
	 * 
	 * rvereseArray(arr, 0, 5); System.out.print("Reversed array is \n");
	 * printArray(arr, 6);
	 * 
	 * }
	 */

	public static void main(String[] args) {
		/*
		 * String s = "Hello World!"; for (int i = 0; i < s.length(); i++) { s =
		 * s.substring(1, s.length() - i) + s.charAt(0) + s.substring(s.length() - i);
		 * System.out.println(s); } // !dlroW olleH
		 */

		String str = "The quick brown fox jumps over the lazy dog";

		int len = str.length();
		
		for (int i = (len - 1); i >= 0; --i)
			str += str.charAt(i);
		
		
		str = str.substring(len);
		
		System.out.println(str);
	}

}
