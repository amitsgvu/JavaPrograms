
public class ReecursiveString {
static String reverse="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recursiveMethod("MyJava");
	System.out.println(reverse);
	}
	static String recursiveMethod(String str)
	{
	     if ((null == str) || (str.length() <= 1))
	     {
	            return str;
	     }
	 reverse=recursiveMethod(str.substring(1))+str.charAt(0);
	     return reverse;
	}
}
