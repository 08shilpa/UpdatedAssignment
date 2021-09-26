import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDateOfRange 
{
public void DateRange(int initial, int end) throws IOException 
{
	File f=new File("../SeleniumScratch/inputfile.txt");
	FileReader fr=new FileReader(f);
	BufferedReader br=new BufferedReader(fr);
	String a;
	int c=0;
	while((a=br.readLine()) != null)
	{
		c=c+1;
		if((c>=initial)&&(c<=end))
		{
			System.out.println(a);
		}
	}
	br.close();
	
}

public static void main(String[] args) throws IOException 
{
	ReadDateOfRange obj=new ReadDateOfRange();
	obj.DateRange(4, 4);
	
	
}
}
