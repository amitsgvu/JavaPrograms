package string;

public class MaxCharFrequency {
	
	public static void main(String[] args) {
		
		 String str1 = "amit ka amit itt";
		 
		 int count=0;
		 char c = 0;
		 
		 for(int i=0;i<str1.length();i++) {
			 int track=0;
			 for(int j=0;j<str1.length();j++) {
				 
				 if ( str1.charAt(i) == str1.charAt(j)) {
					 track++;
				 }
				 
			 }
			 
			if(track>count) {
				 count=track;
				 c=str1.charAt(i);
		
			 }
		 }
		 
			 System.out.println("char is "+c+"count"+count);
	}

}
