package CO3;
import java.util.*;
class overload{
	void area(int x){
		System.out.println("Area of the square is "+(x*x));
	}
	void area(float x,float y){
		System.out.println("Area of the rectangle is "+(x*y) );	
	}
	void area(float  x){
		double y=3.14*x*x;
		System.out.println("Area of the circle is "+y);
	}

}
public class area {
	public static void main(String args[]){
		int l,b,sq;
		float r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length ");
		l=sc.nextInt();
		System.out.println("Enter the breadth ");
		b=sc.nextInt();
		System.out.println("Enter the radius ");
		r=sc.nextFloat();
		System.out.println("Enter the side length ");
		sq=sc.nextInt();
		overload obj=new overload();
		obj.area(sq);
		obj.area(l,b);
		obj.area(r);
	}
}
