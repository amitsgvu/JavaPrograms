package number;

public class ReverseNumber {

	public static int reverseNumber(int num) {

		// Variable to store the
		// resultant reverse number
		int rev_num = 0;

		// Traverse through the number digit by digit
		while (num > 0) {

			// Append the last digit of num
			// as the next digit of rev_num
			rev_num = rev_num * 10 + num % 10;

			// Remove the last digit from the num
			num = num / 10;
		}

		// Return the reversed number
		return rev_num;
	}

	// Driver code
	public static void main(String[] args) {

		// Check if length of args array is
		// greater than 0
	

			// Get the command line argument and
			// Convert it from string type to integer type
			int num = Integer.parseInt(args[0]);

			// Reverse the number and print it
			System.out.println(reverseNumber(num));
		
	}
}
