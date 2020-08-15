package pkggg1;

public class day2 
{
public int sum(int a, int b)
{
	int c;
	c= a+b;
	System.out.println("Sum is "+c);
	return c;
}
public int sub(int a, int b)
{
	int c;
	c= a-b;
	System.out.println("Subtraction is "+c);
	return c;
}

public void mul(int a, int b)
{
	int c;
	c= a*b;
	System.out.println("Multiplication is "+c);
}

public static void main(String[]args)
{
day2 renu =new day2();
int sum_result = renu.sub(11, 1);
int sub_result = renu.sub(12, 2);
renu.mul(sum_result, sub_result);


}
}
