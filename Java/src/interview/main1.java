package interview;

public class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str1 = "gibblegabbler";
		  System.out.println("The given string is: " + str1);
		char[] str=  str1.toCharArray();
		
		for(char c:str) {
			
			if(str1.indexOf(c)==str1.lastIndexOf(c)) {
				System.out.println(c);
				break;
			}
		}
	}

}
