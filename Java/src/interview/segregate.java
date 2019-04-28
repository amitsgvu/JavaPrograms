package interview;

public class segregate {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		segregate seg = new segregate(); 
	        int arr[] = new int[]{0, 1, 0, 1, 1, 0,1}; 
	        int i, arr_size = arr.length; 
	  
	        seg.segregate0and1(arr, arr_size); 
	  
	        System.out.print("Array after segregation is "); 
	        for (i = 0; i < 6; i++) 
	            System.out.print(arr[i] + " "); 
	    }

	void segregate0and1(int arr[], int size)  
    { 
        /* Initialize left and right indexes */
        int left = 0, right = size - 1; 
  
        while (left < right)  
        { 
            /* Increment left index while we see 0 at left */
            while (arr[left] == 1 ) 
               left++; 
  //{0, 1, 0, 1, 1, 1}; 
            /* Decrement right index while we see 1 at right */
            while (arr[right] == 0 ) 
                right--; 
  
            /* If left is smaller than right then there is a 1 at left 
               and a 0 at right.  Exchange arr[left] and arr[right]*/
            if (left < right)  
            { 
                arr[left] = 1; 
                arr[right] = 0; 
                left++; 
                right--; 
            } 
        } 
	}

}
