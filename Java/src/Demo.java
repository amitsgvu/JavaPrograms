import java.util.ArrayList;

public class Demo {

	// Reverse String program
	public static void main(String[] args) {

		String str = "MyJava";
		char[] strArray = str.toCharArray();
		String value = "";

		for (int i = strArray.length - 1; i >= 0; i--) {

			value = value + strArray[i];

		}
		System.out.println(value);
	}

}
