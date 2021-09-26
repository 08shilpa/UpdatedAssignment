package org.testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base 
{
public ChromeDriver driver;
public Properties pr; //(2ed class )
	
	@BeforeMethod
public void method () throws InterruptedException, IOException
{
		File f=new File("../SeleniumScratch/Object.properties");         //connection establish (1)
		 FileInputStream fi=new FileInputStream(f);       //load ke liye input steam ka obje chahiye, uske liye imput steam ka object bnayiya
		pr=new Properties();  //object create
		pr.load(fi);       
		
		System.setProperty("webdriver.chrome.driver","../SeleniumScratch/driver/ChromeDriver/chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
Thread.sleep(5000);


}
	
	/*@AfterMethod
	public void method2()
	{
		driver.close();
	}*/
	
	
	
	
}
