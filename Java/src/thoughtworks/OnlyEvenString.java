package thoughtworks;

public class OnlyEvenString {
	
	public static void main(String[] args) {
		 String str1 =  "w3resource.com";
		 String output="";
		 
		 
		 for(int i=0;i<str1.length();i++) {
			 
			 if(i%2==0) {
				output=output+ Character.toString(str1.charAt(i));
				
			 }
		 }
		 System.out.println(output);
	}

}
