package CO4.graphics;
import java.util.*;

 class rectangle implements area{
	 int length,breadth;
	 rectangle(int length,int breadth)
	 {
		 this.length=length;
		 this.breadth=breadth;
	 }
	 public void area()
	 {
		    Scanner sc=new Scanner(System.in);
			System.out.println("enter the length of the rectangle");
			int l=sc.nextInt();
			System.out.println("enter the breadth of the rectangle");
			int b=sc.nextInt();
			double a=length*breadth;
			System.out.println("area of the rectangle is "+a);
			
			}
	 }
	


