package pkggg1;

public class day3assign1 
{
	public day3assign1()
	{
		this(2, 4, 6);
		System.out.println("Default constructor" );
	}
	public day3assign1(int a)
	{
		this(2,3);
		
		System.out.println("One parameter constructor " );
	}
	public day3assign1(int a, int b)
	{
		this();
		
		System.out.println("Two parameter constructor " );
	}
	public day3assign1(int a, int b, int c)
	{
		
		System.out.println("Three parameter constructor " );
	}
	
	public static void main(String[] args)
	{
		day3assign1 d3 = new day3assign1(2);
		
	}

}
