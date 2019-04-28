package interview;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number which you want to check whether that is armstrong or not: ");
		int n = in.nextInt();
		
		int a = n, r=0, s=0;
		while (a!=0) {
			
			r=a%10;
			a = a/10;
			 int lastDigitToThePowerOfNoOfDigits = 1;
			//System.out.println(String.valueOf(n).length());
			for(int i=1;i<=String.valueOf(n).length();i++) {
				 lastDigitToThePowerOfNoOfDigits = lastDigitToThePowerOfNoOfDigits * r;
		
			}
		    s = s + lastDigitToThePowerOfNoOfDigits;
		}
		System.out.println(s);
		
		if(s==n){
			System.out.println("Number "+n+" is an armstrong number.");
			}else{
			System.out.println("Number "+n+" is not an armstrong number.");
			}
			
	}

}
