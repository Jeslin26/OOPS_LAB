package CO1;
import java.util.Scanner;
public class SymmetricMatrix {

	public static void main(String[] args) {
		int a[][]=new int[10][10];
		int b[][]=new int[10][10];
		int count=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the limit of matrix");
		int n=sc.nextInt();
		System.out.println("Enter the elements in the matrix:");
		for(int i=0;i<n;i++)//reading values for matrix
		{
			for(int j=0;j<n;j++)
			{
				a[i][j] = sc.nextInt();  
			}
		}
		for(int i=0;i<n;i++)//printing values for matrix
		{
			for(int j=0;j<n;j++)
			{
				System.out.print( a[i][j]+" " );
			}
			System.out.println();
		}
		for(int i=0;i<n;i++)//transpose of matrix
		{
			for(int j=0;j<n;j++)
			{
				b[i][j] = a[j][i];  
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i][j]!=b[i][j])
				{
					count++;
					break;
				}
				else
				{
					count=0;
				}
			}
			
		}
		
		if(count==0)
		{
			System.out.println("Given matrix is symmetric");
		}
		else
		{
			System.out.println("Given matrix is non symmetric");
			
		}
	}

}
