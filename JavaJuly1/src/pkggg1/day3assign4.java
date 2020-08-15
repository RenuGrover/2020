package pkggg1;

public class day3assign4
{
	public void method1(int a)
	{
		this.method3(2, 4, 6);
		System.out.println("One parameter constructor" );
	}
	public void method2(int a, int b)
	{
		this.method4(1, 2, 3,4);
		
		System.out.println("Two parameter constructor " );
	}
	public void method3(int a, int b, int c)
	{		
		System.out.println("Three parameter constructor " );
	}
	public void method4(int a,int b,int c, int d)
	{ 
		this.method1(8);
		
		System.out.println("Four parameter constructor " );
	}
	
	public static void main(String[] args)
	{
		day3assign4 d3 = new day3assign4();
		d3.method2(2, 3);
		
		
	}

}
