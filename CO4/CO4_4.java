package CO4;
import java.util.*;

class validation extends Exception{
	String s;
	public validation(String s)
	{
		this.s=s;
	}
	public String toString (){
		return("Expection - "+s);
	}
}


public class CO4_4 {
    public static void main (String[] args){
    	int sum=0;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter the limit ");
    	int n =sc.nextInt();
    	System.out.println("enter the numbers ");
    	try{
    		for(int i=0;i<n;i++)
    	    {
    		int num =sc.nextInt();
	    		if (num<0)
	    		{
	    			System.out.println("enter positive numbers only");
	    			throw  new validation("error messege");
	    			
	    		}
	    		else
	    		{
	    			sum=sum+num;
	        		
	    		}
    	    }
    	}
    	catch(Exception e){
    		
    	}
    }
}
    		
    	   
 
     
    		
 
    	
    	
