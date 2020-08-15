package pkggg1;

public class day3assign3
{
	final int a = 2;
	int b=45;
	
	public void method1(final int b)
	{
		this.b=b;
	}
	
	public static void main(String[] args)
	{
		day3assign3 d3 = new day3assign3();
		d3.method1(34);
		System.out.println(d3.b);
	}
}
