package string;

public class FirstNonRepeating {
	/*
	 * public static void main(String[] args) { String str1 = "w3resource";
	 * //System.out.println("The given string is: " + str1);
	 * removeDuplicateChars(str1); //
	 * System.out.println("After removing duplicates characters the new string is: "
	 * + removeDuplicateChars(str1)); }
	 * 
	 * private static void removeDuplicateChars(String sourceStr) { char[] arr1 =
	 * sourceStr.toCharArray(); //String targetStr = ""; //char value = 0; for (char
	 * value1 : arr1) { System.out.println(sourceStr.indexOf(value1)); if
	 * (sourceStr.indexOf(value1) == sourceStr.indexOf(value1)) {
	 * System.out.println(value1); break; } }
	 * 
	 * //return value; }
	 *
	 * 
	 */

	public static void main(String[] args) {
		String str1 = "gibblegabbler";
		System.out.println("The given string is: " + str1);
		for (int i = 0; i < str1.length(); i++) {
			boolean unique = true;
			for (int j = 0; j < str1.length(); j++) {
				if (i != j && str1.charAt(i) == str1.charAt(j)) {
					unique = false;
					break;
				}
			}
			if (unique) {
				System.out.println("The first non repeated character in String is: " + str1.charAt(i));
				break;
			}
		}
	}

}
