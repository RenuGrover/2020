package pckggg2;
import pkggg1.*;

public class day4assign2 extends day4assign1
{
	public day4assign2() 
	{
		this(2,4,6);
		System.out.println("Child Default");
	}
	public day4assign2(int a) 
	{
		this();
		System.out.println("Child one");
	}
	public day4assign2(int a, int b) 
	{
		this(4);
		System.out.println("Child Two");
	}
	public day4assign2(int a, int b, int c) 
	{
		super(2, 6);
		System.out.println("Child Three ");
	}
	
	public static void main(String[] args)
	{
		day4assign2 da4= new day4assign2(1,2);
		
	
	}
	

}
