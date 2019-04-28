package array;

public class FindNumberDivideAll {
	 // function to find smallest num 
    static int findSmallest(int a[], int n) 
    { 
        // traverse for all elements 
        for (int i = 0; i < n; i++)  
        { 
              
            int j; 
            for (j = 0; j < n; j++)  
                if (a[j] % a[i]>=1)  
                    break; 
      
            // stores the minimum if 
            // it divides all 
            if (j == n) 
                return a[i]; 
        } 
      
        return -1; 
    } 
      
    // driver code 
    public static void main(String args[]) 
    { 
        int a[] = { 1,2,10,100 }; 
        int n = a.length; 
        System.out.println(findSmallest(a, n)); 
    }
}
