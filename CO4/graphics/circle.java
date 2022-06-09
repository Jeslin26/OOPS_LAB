package CO4.graphics;
import java.util.*;
class circle implements area 
{
	int radius;
	circle(int radius)
	{
		this.radius=radius;
	}
	public void area(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius of the circle");
		int r=sc.nextInt();
		double  a=3.14*r*r;
		System.out.println("area of the circle:"+a);
		}
}
