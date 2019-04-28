package string;

import java.util.Arrays;

public class ReverseEachWord {
	public static void main(String[] args) {
		String string = "amit kumar sharma ravi";
	String[] s=	string.split("\\s");
	
	
		for(int i=0;i<s.length/2;i++) {
			String temp;
			temp=s[i];
			s[i]=s[s.length-i-1];
			s[s.length-i-1]=temp;
		}
		
		System.out.println(Arrays.toString(s));

	
	}
}
