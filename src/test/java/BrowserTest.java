import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest 
{

	public static void main(String[] args) 
	{
		String projectpath =System.getProperty("user.dir");
		System.out.println("The location of chrome driver is : " +projectpath);
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\SeleniumScratch\\driver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=nCJoia7wosc");
	}
}

