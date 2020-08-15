package pkggg1;

public class day4assign1 
{
	public day4assign1() 
	{
		this(1,2,3);
		System.out.println("Super Default");
	}
	public day4assign1(int a) 
	{
		this();
		System.out.println("Super one");
	}
	public day4assign1(int a, int b) 
	{
		this(3);
		System.out.println("Super Two");
	}
	public day4assign1(int a, int b, int c) 
	{
		
		System.out.println("Super Three ");
	}
	
	public static void main(String[] args)
	{
		day4assign1 d4 = new day4assign1(1, 2);
		
	}
}
