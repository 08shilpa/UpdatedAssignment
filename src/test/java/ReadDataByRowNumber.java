import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.apache.hc.client5.http.impl.classic.MainClientExec;
import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.junit.validator.PublicClassValidator;

public class ReadDataByRowNumber 
{
public void readData(int RowNo) throws IOException
{
	File f= new File("../SeleniumScratch/inputfile.txt");
	FileReader fr= new FileReader(f);
	BufferedReader br=new BufferedReader(fr);
	int b=0;
	String a;
	while((a=br.readLine())!=null )
	{
		b=b+1;
		if (b==RowNo)
		{
		System.out.println("data found is : ");
		System.out.println(a);
		break;
		}
	}
	br.close();

}
	public static void main(String[] args) throws IOException {
	{
		ReadDataByRowNumber obj=new ReadDataByRowNumber();
		//Scanner s=new Scanner(System.in);
		//System.out.println("enter the line number");
		//int obj=s.nextInt();
		//ReadDataByRowNumber obj = null;
		//int obj;
		obj.readData(4);
		
	}
	
}
	



}
