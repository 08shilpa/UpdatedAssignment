
public class Assignment01 
{
public int sum (int a, int b)
{
	int c ;
	c=a+b;
	System.out.println("Result of sum : " +c);
	return c;
}
public int sub (int a, int b)
{
	int c ;
	c=a-b;
	System.out.println("Result of sub : " +c);
	return c;
}

public int mul (int a, int b)
{
	int c ;
	c=a*b;
	System.out.println("Result of mul : " +c);
	return c;
}
public void div (int a, int b)
{
	int c ;
	c=a/b;
	System.out.println("Result of div : " +c);
	//return c;
	}


public static void main(String[] args) 
{
	Assignment01 obj=new Assignment01();
	int store_sum=obj.sum(10, 2);
	int store_sum1=obj.sum(store_sum, 2);
	
	int store_sub=obj.sub(store_sum1, 2);
	
	int store_mul=obj.mul(store_sub, 2 );
	
	obj.div(store_mul, 2);
	//System.out.println("Final result is : " +final_result);
	
}

}
