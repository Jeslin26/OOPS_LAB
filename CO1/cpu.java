package CO1;
public class cpu {
	int price;
	class processor
	{
		int no_of_pages;
		String  manufacturer;
		processor( int pages,String manufacture)
		{
			no_of_pages=pages;
			manufacturer=manufacture;
			System.out.println("no of pages  "+ no_of_pages);
			System.out.println("manufacturer  is "+manufacturer);
			
		}
	}
	static class ram
	{
		int memory;
		String manufacturer;
		ram(int memo,String manufacture)
		{
			memory=memo;
			manufacturer=manufacture;
			System.out.println("memory is "+memory);
			System.out.println("manufacturer is "+manufacturer);
		}
	}
	public static void main(String[] args)
	{
		
	    cpu obj=new cpu();
		cpu.processor obj2 = obj.new processor(2,"intel");
        cpu.ram obj1 = new cpu.ram(123,"crucial");

	}

}
