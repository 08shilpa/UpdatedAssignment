
public class Variable_Method_practice 
{
	int global; //Global variable
public void method1()
{
	int local ; //Local varible
	System.out.println("First method");
}
public void method2()
{
	System.out.println("Second method");
}

public static void main(String[] args) 
{
	Variable_Method_practice obj=new Variable_Method_practice();
	obj.method1();
	obj.global=50;
	
}
}
