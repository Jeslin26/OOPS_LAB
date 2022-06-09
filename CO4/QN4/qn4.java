package CO4;
import java.util.*;

class validation extends Exception{
	String s;
	public validation(String s)
	{
	super(s);
	}
}
public class CO4_4 {
    public static void main (String[] args){
    	int i=0,sum=0;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter the limit ");
    	int n =sc.nextInt();
    	System.out.println("enter the numbers ");
    
    		while(i<n)
    	    {
    		int num =sc.nextInt();
    		try{
	    		if (num<0)
	    		{
	    			//System.out.println("enter positive numbers only\n");
	    			throw  new validation("error messege");
	    		}
	    		else
	    		{
	    			i++;
	    			sum=sum+num;
	        	}
    		}
    	
	    	catch(Exception e)
    	    {
    		System.out.println("enter positive numbers only"+e);
    		}
    		
    	}
    		System.out.println("sum of numbers : "+sum);
    		System.out.println("avg is :"+(sum/n));
   }
}
