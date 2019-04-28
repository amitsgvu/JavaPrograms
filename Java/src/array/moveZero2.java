package array;

import java.util.Arrays;

public class moveZero2 {
	
	/*	public static void main(String[] args) {
	int arr[]= {0,23,0,1,0,2,5};
	int len=arr.length;
	
	int count=0;
	
	for(int i=0;i<len;i++) {
		
		
		if(arr[i]!=0) {
			
			arr[count]=arr[i];
			count++;
		}
		//System.out.println("swaping"+Arrays.toString(arr));
	}
	
	while(count<len) {
		arr[count++]=0;
	}
	
	
	System.out.println(Arrays.toString(arr));
	
	}*/
	/*public static void main(String[] args) {
		int arr[]= {0,1,0,1,0,1,0};
		int len=arr.length;
		
		int count=0;
		
		for(int i=0;i<len;i++) {
			
			
			if(arr[i]==1) {
				
				arr[count]=1;
				count++;
			}
			System.out.println("swaping"+Arrays.toString(arr));
		}
		
		while(count<len) {
			arr[count++]=0;
		}
		
		
		System.out.println(Arrays.toString(arr));
		
		}*/
	
	
	/*public static void main(String[] args) {
		int arr[]= {0,1,0,1,0,1,0};
		int len=arr.length;
		
		int count=0;
		
		for(int i=0;i<len;i++) {
			
			
			if(arr[i]==0) {
				
				arr[count]=0;
				count++;
			}
		//	System.out.println("swaping"+Arrays.toString(arr));
		}
		
		while(count<len) {
			arr[count++]=1;
		}
		
		
		System.out.println(Arrays.toString(arr));
		
		}*/
	
	
	public static void main(String[] args) {
		int arr[]= {0,4,0,23,0,1,0,2,5,0};
		int len=arr.length;
		
		int count=len-1;
		//{0,23,0,1,0,2,5}
		for(int i=len-1;i>=0;i--) {
			
			
			if(arr[i]!=0) {
				
				arr[count]=arr[i];
				count--;
			}
//			System.out.println("swaping"+Arrays.toString(arr));
		}
		
		while(count>=0) {
			arr[count--]=0;
			//System.out.println("swaping"+Arrays.toString(arr));
		}
		
		
		System.out.println(Arrays.toString(arr));
		
		}
	
	

}
