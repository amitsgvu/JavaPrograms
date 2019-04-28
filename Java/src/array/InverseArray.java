package array;

public class InverseArray {
	// Function that returns true if 
    // the array is mirror-inverse 
    static boolean isMirrorInverse(int arr[]) 
    { 
        for (int i = 0; i < arr.length; i++) { 
  int x=arr[i];
  int y=arr[arr[i]];
            // If condition fails for any element 
            if (y != i) 
                return false; 
        } 
  
        // Given array is mirror-inverse 
        return true; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int arr[] = { 3,4,2,0,1 }; 
        if (isMirrorInverse(arr)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 

}
