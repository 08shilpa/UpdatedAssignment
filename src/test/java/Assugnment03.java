
public class Assugnment03 
{
public void abc()
{
	System.out.println("Default method");
	this.abc(1,2,3,4);
}
public void abc(int a)
{
	System.out.println("1 parameterized method");
	this.abc(1,2,3);
}
public void abc(int a, int b)
{
	System.out.println("2 parameterized method");
}
public void abc(int a, int b, int c)
{
	System.out.println("3 parameterized method");
	this.abc(1,2);
}
public void abc(int a, int b, int c, int d)
{
	System.out.println("4 parameterized method");
	this.abc(1);
}


public static void main(String[] args)
{
	Assugnment03 obj=new Assugnment03();
	obj.abc();
}

}
