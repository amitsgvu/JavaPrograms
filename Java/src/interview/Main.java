package interview;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str1 = "w3resource";
		  System.out.println("The given string is: " + str1);
		  System.out.println("After removing duplicates characters the new string is: " + removeDuplicateChars(str1));
	}

	private static String removeDuplicateChars(String str1) {
		 char[] arr1 = str1.toCharArray();
		 String targetStr = "";
		 for (char value: arr1) {
			 if (targetStr.indexOf(value) == -1) {
				 targetStr += value;
			 }
		 }
		 
		return targetStr;
	}

	
	
}
