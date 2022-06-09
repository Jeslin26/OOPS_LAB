package CO3;
import java.util.*;
class employee1
{
	int emp_id;
	String name;
	float salary;
	String address;
	employee1(int emp_id,String name,float salary,String address){
		this.emp_id=emp_id;
		this.name=name;
		this.salary=salary;
		this.address=address;
	}	
}
class Teacher extends employee1
{
	String dept, subj;
	Teacher(int emp_id,String name,float salary,String address,String dept,String subj){
		super(emp_id,name,salary,address);
		this.dept=dept;
		this.subj=subj;
		}
		
		void display()
	{
		System.out.println(emp_id+"\t\t"+name+"\t\t"+salary+"\t\t"+address+"\t\t"+dept+"\t\t"+subj);
	}
}


public class employee {

	public static void main(String args[]) {
		int emp_id;
		float salary;
		String name,address,dept,subj;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of employees");
		int n=sc.nextInt();
		Teacher arr[]=new Teacher[n];
		for(int i=0;i<n;i++)
		{
			
		
		System.out.println("enter the emp_id");
		int id=sc.nextInt();
		System.out.println("enter the name ");
		String nam=sc.next();
		System.out.println("enter the salary");
		float sal=sc.nextFloat();
		System.out.println("enter the address");
		String  add=sc.next();
		System.out.println("enter the department");
		String dep=sc.next();
		System.out.println("enter the subjects taught");
		String sub=sc.next();
		arr[i] = new Teacher(id,nam,sal,add,dep,sub);
		
		}
		for(int i=0;i<n;i++)
		{
		arr[i].display();
			
		}
		
		
	
		// TODO Auto-generated method stub

	}

}
