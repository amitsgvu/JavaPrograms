package interview;

import javax.swing.plaf.BorderUIResource.CompoundBorderUIResource;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str1 = "abcdefghijklmnopqrstuvwxy";
		  int split_number = 5;
		  splitString(str1, split_number);
	}

	private static void splitString(String str1, int split_number) {
		// TODO Auto-generated method stub
		
		 int str_size = str1.length();
		  int part_size;
		  if (str_size%split_number!= 0) {
			  System.out.println("The size of the given string is not divisible by " + split_number);
			   return;
		  }
		  else {
			  System.out.println("The given string is: " + str1);
			   System.out.println("The string divided into " + split_number + " parts and they are: ");
			   part_size = str_size / split_number;
			   int counter=5;
			   for (int i = 0;i<str1.length()-1;i=i+5) {
				    System.out.println(str1.substring(i, counter));
				counter=counter+5;
				
			   }
			   
			   
		  }
		  
		
	}
	

}
