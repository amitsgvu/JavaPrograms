
public class PalindromeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r, sum = 0, temp;
		int n = 454;// It is the number variable to be checked for palindrome

		temp = n;
		int reversedigit;
		while (temp != 0) {

			int lastdigit = temp % 10;
			System.out.println("last digit is" + lastdigit);
			temp = temp / 10;
			sum = (sum * 10) + lastdigit;

		}
		
		System.out.println("reverse number is "+" "+sum);
	}

}
