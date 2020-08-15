package pkggg1;

public class day2assign3 
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

		public int multiply(int a, int b)
		{
			int c;
			c= a*b;
			System.out.println("Multiplication is "+c);
			return c;
		}
		
		public void div(int a, int b)
		{
			int c;
			c= a/b;
			System.out.println("Div is "+c);
		}
		
	public static void main(String[] args)
	{
		day2assign3 renu = new day2assign3();
		int sub_result = renu.sub(10, 2);
		int sum_result = renu.sum(sub_result, 2);
		int sub1_result = renu.sub(sum_result, 2);
		int mul_result = renu.multiply(sub1_result, 2);
		renu.div(mul_result, 2);
	}
}
