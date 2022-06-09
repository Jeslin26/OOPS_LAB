package CO1;

import java.util.*;

public class complex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the real part of first number");
		int r=sc.nextInt();
		System.out.println("Enter the imaginary part of first number");
		int im=sc.nextInt();
		System.out.println(r+"+"+im+"i");
		
		System.out.println("Enter the real part of second  number");
		int r2=sc.nextInt();
		System.out.println("Enter the imaginary part of second  number");
		int im2=sc.nextInt();
		System.out.println(r2+"+"+im2+"i");
		// TODO Auto-generated method stub
		System.out.println("the resultant number :");
		System.out.println(r+r2+"+"+(im+im2)+"i");
		
		

	}

}
 