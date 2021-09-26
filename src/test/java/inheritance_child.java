
public class inheritance_child extends inheritance_Parent
{
	public void child1()
	{
		System.out.println("child method one");
	}
	public void child2()
	{
	System.out.println("child method two");	
	}

	public void child3()
	{
		System.out.println("child method three");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("inside main method");
		inheritance_child obj1=new inheritance_child();
		obj1.child1();
		obj1.child3();
		obj1.child2();
		int a=20;
		System.out.println("Value of a is :" +a);
		a= 30;
		System.out.println("Value of a is " +a);
		
	}
}
