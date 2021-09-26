import java.util.Scanner;

public class PrimeNumber 
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number : ");
int number=sc.nextInt();
int i;
int temp=0;
for(i=2; i<=number-1;i++)
{
	if (number%i==0)
	{
		temp=temp+1;
	}
}
	if (temp>0)
	{
		System.out.println("not a prime number");
	}
	else
	{
		System.out.println("prime number");
	}
}
}

