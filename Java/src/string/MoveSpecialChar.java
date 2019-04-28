package string;

public class MoveSpecialChar {

	static String moveAllSC(String str) {
		// Take length of string
		int len = str.length();

		// regular expression for check char is special
		// or not.
		String regx = "[a-zA-Z0-9\\s+]";

		// traverse string
		String res1 = "", res2 = "";
		for (int i = 0; i < len; i++) {

			char c = str.charAt(i);

			// check char at index i is a special char
			if (String.valueOf(c).matches(regx))
				res1 = res1 + c;
			else
				res2 = res2 + c;
		}
		return res1 + res2;
	}

	public static void main(String args[]) {
		String str = "Geeksf!@orgeek@s A#$ c%o^mputer" + " s****cience p#o@rtal fo@r ge%eks";
		System.out.println(moveAllSC(str));
	}
}
