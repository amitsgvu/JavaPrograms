package array;

import java.util.Arrays;

public class RemoveDuplicate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 2, 3, 3, 4, 5, 6, 7, 7, 8, 8 };

		Arrays.sort(a);
		int length = a.length;
		int copy[] = new int[length];
		int count=0;
		int copylength=copy.length;
		
		for (int i = 0; i < length - 1; i++) {
        
			if(a[i]!=a[i+1]) {
		
				copy[count++]=a[i];
				
				
			}
		}
		
		copy[count]=a[length-1];
		System.out.println("count value is"+count);
		copy=Arrays.copyOf(copy, count+1);
		
		Arrays.stream(copy).forEach(System.out::println);
	}

}
