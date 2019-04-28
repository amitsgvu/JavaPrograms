package string;

public class MoveUpperCase {
	static public String move(String str) {
		// take length of given string
		int len = str.length();

		// low store lowercase alphabets
		String low = "";

		// upr store uppercase alphabets
		String upr = "";

		// traverse string forst char to last char
		char ch;
		for (int i = 0; i < len; i++) {
			ch = str.charAt(i);

			// check char is in uppercase or lower case
			if (ch >= 'A' && ch <= 'Z') {
				upr += ch;
			} else {
				low += ch;
			}
		}
		return low + upr;
	}

	public static void main(String args[]) {
		String str = "Geeksforgeeks A Computer Science Portal for Geeks!!";
		System.out.println("Before Operation:   " + str);
		System.out.println("After Operation:    " + move(str));
	}
}
