
public class Assignment02 
{
	public Assignment02()
	{
		this(1,2,3);
		System.out.println("Default Constructor");
		
	}
	
	public Assignment02(int a)
	{
		//this();
		System.out.println("1 parameterized Construtor");
	}
	
	public Assignment02(int a, int b)
	{
		this(1,2,3,4);
		System.out.println("2 parameterized Construtor");
	}
	
	public Assignment02(int a, int b, int c)
	{
		System.out.println("3 parameterized Construtor");
		
	}
	
	
	public Assignment02(int a, int b, int c, int d)
	{
		this();
		System.out.println("4 parameterized Construtor");
		
	}
	
	
	
	
	
public static void main(String[] args) 
{
	//Assignment02 obj=new Assignment02(1);
	Assignment02 obj1= new Assignment02(1,2);
	
}
}
