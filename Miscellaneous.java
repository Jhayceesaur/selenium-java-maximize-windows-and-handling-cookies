import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscellaneous 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //Maximizing window
		driver.manage().deleteAllCookies(); //Delete all cookies in browser
//		driver.manage().deleteCookieNamed("sessionKey"); //Delete a specific cookie name
		
		driver.get("https://www.facebook.com/");

	}
}
