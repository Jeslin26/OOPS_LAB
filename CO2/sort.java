package CO2;
import java.util.*;
public class sort {

	public static void main(String[] args) {
		String temp;
		
		System.out.println("enter the no of strings");
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		String array[] =new String [10];
		System.out.println("enter  strings");
		for(int i=0;i<n;i++)
		{
			
		    Scanner sc1=new Scanner (System.in);
			array[i]=sc1.nextLine();
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(array[i]);
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if (array[i].compareTo (array[j])<0)
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
			
		}
		System.out.println("Sorted array is ");
		for(int i=0;i<n;i++)
		{
			
			System.out.println(array[i]);
		}
	}

}
