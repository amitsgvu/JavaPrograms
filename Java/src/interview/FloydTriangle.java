package interview;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows which you want in your Floyd Triangle: ");
		int r = in.nextInt();
		int n=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(n+" ");
				n++;
			}
		
			
			System.out.println();
		}
	}

}
