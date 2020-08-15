package pkggg1;

public class methodoverriding extends methodoverloading
{
	public void arithematic(int a, int b)
	{
		int c;
		c = a-b;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		methodoverriding mo = new methodoverriding();
		mo.arithematic(2, 1);
	}
}
