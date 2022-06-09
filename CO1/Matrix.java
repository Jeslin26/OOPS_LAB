package CO1;
import java.util.*;

public class Matrix {
	public static void main(String[] args) {
    	int a[][] =new int[10][10];
    	int b[][] =new int[10][10];
    	int c[][] =new int[10][10];
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of first matrix");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)//reading values for matrix 1
		{
			for(int j=0;j<n;j++)
			{
				a[i][j] = sc.nextInt();  
			}
		}
		
		System.out.println("Matrix 1:");
        for(int i=0;i<n;i++)//printing  values for matrix 1
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
      
		System.out.println("Enter the size of the Second matrix:");
		n=sc.nextInt();
		for(int i=0;i<n;i++)//reading values for matrix 2
		{
			for(int j=0;j<n;j++)
			{
				b[i][j] = sc.nextInt();  
			}
		}
		System.out.println("Matrix 2:");

		for(int i=0;i<n;i++)//printing  values of matrix 2
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<n;i++)//addition
		{
			for(int j=0;j<n;j++)
			{
		       c[i][j]=a[i][j]+b[i][j];
			}
			
		}
		
		System.out.println("Addition matrix is ");
		for(int i=0;i<n;i++)//printing  values of addition matrix
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
