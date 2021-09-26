import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataCharacterByCharacter 
{
public static void main(String[] args) throws IOException 
{
	File f= new File("../SeleniumScratch/inputfile.txt");
	FileReader fr=new FileReader(f);
	BufferedReader br = new BufferedReader(fr); 
	String c;
	while ((c=br.readLine()) !=null)
			{
		System.out.println(c);
			}
	
	
	
	
	
	 //int a;                       For read the character by character
	//while ((a=fr.read()) !=-1)
//	{
	//	System.out.println((char)a);
//	}
	
	
	
}
}

