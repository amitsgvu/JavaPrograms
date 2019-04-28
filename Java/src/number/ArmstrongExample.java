package number;

public class ArmstrongExample {
	 public static void main(String[] args)  {  
		    int c=0,a,temp;  
		    int n=153;//It is the number to check armstrong  
		    temp=n;  
		    int l;int sum=0;
		    l=String.valueOf(temp).length();
		    while(n>0)  
		    {  
		    a=n%10;  
		    n=n/10;  
		
		    int total=1;
		    for (int j = 0; j < l; j++) {
		    	total=total*a;  	
			}
		    sum=sum+total;
		    
		    }  
		    if(temp==sum)  
		    System.out.println("armstrong number");   
		    else  
		        System.out.println("Not armstrong number");   
		   }  
}
