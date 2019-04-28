package thoughtworks;

public class ZZ {
public static void main(String[] args) {
	 String str1 =  "fizzez";
	 
	 for(int i=0;i<str1.length()-1;i++) {
		 
		 if(str1.charAt(i)=='z'&&str1.charAt(i+1)=='z') {
			 System.out.println("valid");
		 }
	 }
	
	
}
}
