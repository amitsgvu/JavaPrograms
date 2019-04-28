package interview;

import java.util.Arrays;

public class InitializeBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boolean[] array = new Boolean[4];
		  //initially all values will be null
		  for (int i = 0; i < array.length; i++) {
		   System.out.println(array[i]);
		  }
		  Arrays.fill(array, Boolean.FALSE);
		  for (int i = 0; i < array.length; i++) {
			   System.out.println(array[i]);
			  }
	}
	

}
