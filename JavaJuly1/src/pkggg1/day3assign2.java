package pkggg1;

public class day3assign2 
{
	int a;
	public void method1(int a)
	{
		this.a=a;
	}
	
	public static void main(String[] args)
	{
		day3assign2 d3= new day3assign2();
		d3.method1(2);
		System.out.println(d3.a);
	}

}
