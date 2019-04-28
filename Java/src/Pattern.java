import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Pattern {
/*
 *
J
J A
J A V
J A V A
J A V A J
J A V A J 2
J A V A J 2 E
J A V A J 2 E E
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
         
	        System.out.println("Enter the string :");
	         
	        String input = sc.nextLine();
	         
	        firstRepeatedNonRepeatedChar(input);
        
        
	}

private static void firstRepeatedNonRepeatedChar(String input) {
	// TODO Auto-generated method stub

	System.out.println(input.length());
	char[] arrey=input.toCharArray();
	for(int i=0;i<input.length();i++) {
		
		
		for(int j=0;j<=i;j++) {
			System.out.print(arrey[j]+" ");
		}
		System.out.println();
	}

	
}

}
