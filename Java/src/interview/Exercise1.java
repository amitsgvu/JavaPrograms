package interview;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java Exercises!";
        System.out.println("Original String = " + str);
        // Get the character at positions 0 and 10.
        char index1 = str.charAt(0);
        char index2 = str.charAt(10);

        // Print out the results.
        System.out.println("The character at position 0 is " +
            index1);
        System.out.println("The character at position 10 is " +
            index2);
	}

}
