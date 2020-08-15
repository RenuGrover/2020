package pkggg1;

public class clsss1 {
	int a, b;
	
	public void display1()
	{
		System.out.println("Below is tha age");
	}
	
	public void display2()
	{
		System.out.println("Below is tha rollno");
	}
	public static void main(String[]args)
	{
		clsss1 renu=new clsss1();
		renu.display1();
		renu.a=28;
		renu.b=01;
		System.out.println(renu.a);
		System.out.println(renu.b);
		
		
		clsss1 rg=new clsss1();
		rg.display2();
		rg.a=29;
		rg.b=10;
		System.out.println(rg.a);
		System.out.println(rg.b);
	}
}
