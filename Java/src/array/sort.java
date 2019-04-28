package array;

import java.util.Arrays;

public class sort {
	public static void main(String[] args) throws Exception {
		int[] my_array1 = {
	            1789, 1789, 1899, 1456, 2013,1458, 2458, 1254, 1472, 2365,1456, 2165, 1457, 1};
		int temp;
		
		for(int i=0;i<my_array1.length;i++) {
			
			for(int j=i+1;j<my_array1.length;j++) {
			
				if(my_array1[i]>my_array1[j]) {
					
		         		temp=	my_array1[i];
		         		my_array1[i]=my_array1[j];
		         		my_array1[j]=temp;
					
				}
				
				
			}
		}
		
		//System.out.print("descending order "+Arrays.toString(my_array1));
		Arrays.stream(my_array1).forEach(System.out::println);
    }
}

