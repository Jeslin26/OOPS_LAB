package CO3;
import java.util.*;
class Person{
	String name,gender,address;
	int age;
	Person(String name,String gender,String address,int age){
		this.name=name;
		this.gender=gender;
		this.address=address;
		this.age=age;
	}
}
class Employ extends Person{
	int emp_id;
	float salary;
	String cname,qual;
	Employ(String name,String gender,String address,int age,int emp_id,String cname,String qual,float salary){
	super(name,gender,address,age);
	this.emp_id=emp_id;
	this.cname=cname;
	this.qual=qual;
	this.salary=salary;
	}
}
class Teachers extends Employ{
	int tech_id;
	String subj,dept;
	Teachers(String name,String gender,String address,int age,int emp_id,String cname,String qual,float salary,String subj,String dept,int tech_id){
		super(name,gender,address,age,emp_id,cname,qual,salary);
		this.subj=subj;
		this.dept=dept;
		this.tech_id=tech_id;
	}
	void display(){
		System.out.println("name :"+name);
		System.out.println("gender :"+gender);
		System.out.println("address  :"+address);
		System.out.println("age :"+age);
		System.out.println("emp_id :"+emp_id);
		System.out.println("cname :"+cname);
		System.out.println("qualification  :"+qual);
		System.out.println("salary:"+salary);
		System.out.println("Subjects:"+subj);
		System.out.println("department :"+dept);	
	}
}
public class qn3 {
	public static void main(String args[]){
		int id,teid,age;
		float sal;
		String nam,gen,add,cn,qua,sub,dep;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the no of employees");
		int n=sc.nextInt();
		Teachers array[]=new Teachers[n];
		
		for(int i=0;i<n;i++){

			System.out.println("enter the emp_id");
			 id=sc.nextInt();
			System.out.println("enter the name ");
			 nam=sc.next();
			System.out.println("enter the gender");
			gen=sc.next();
			System.out.println("enter the salary");
			 sal=sc.nextFloat();
			System.out.println("enter the address");
			 add=sc.next();
			System.out.println("enter the department");
			dep=sc.next();
			System.out.println("enter the subjects taught");
		    sub=sc.next();
			System.out.println("enter the age ");
			age=sc.nextInt();
			System.out.println("enter the cname ");
			 cn=sc.next();
			System.out.println("enter the qualification");
			qua=sc.next();
			System.out.println("enter the teacher id");
			teid =sc.nextInt();
			
			array[i] = new Teachers(nam,gen,add,age,id,cn,qua,sal,sub,dep,teid);
			
			}
			
			for(int i=0;i<n;i++)
			{
				array[i].display();
			}
			
		}
}
