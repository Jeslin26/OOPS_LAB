package CO3;
import java.util.Scanner;
class Publisher{
	String pub_name;
	Publisher(String pub_name)
	{
		this.pub_name=pub_name;
	}
	
}
class Book extends Publisher{
	String name,author;
	Book(String pub_name,String name,String author){
		super(pub_name);
		this.name=name;
		this.author=author;	
	}
}
class Literature extends Book{
	int isbn;
	Literature(String pub_name,String name,String author){
		super(pub_name,name,author);
		}
	void display() {
		System.out.println("literature........");
		System.out.println("publisher name:"+pub_name+"\nBook name "+name+"\nAuthor name"+author);
}
}
class Fiction extends Book{
	Fiction(String pub_name,String name,String author){
		super(pub_name,name,author);
	}
	void display() {
		System.out.println("Fiction........");
		System.out.println("publisher name:"+pub_name+"\nBook name "+name+"\nAuthor name"+author);
}
}

public class qn4{
	public static void main(String[] args) {
		String gen;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Publisher name:");
		String pub_name=sc.nextLine();
		System.out.println("enter the Book name:");
		String name=sc.nextLine();
		System.out.println("enter the Author name:");
		String author=sc.nextLine();
		//System.out.println("enter the Book number:");
		//int isbn=sc.nextInt();
		System.out.println("enter the genere:");
		gen=sc.nextLine();
		if(gen.equals("Literature"))
		{
			Literature obj=new Literature(pub_name,name,author);
			obj.display();
		}
		else
		{
			Fiction objs=new Fiction(pub_name,name,author);
			objs.display();
		}

	}
}
