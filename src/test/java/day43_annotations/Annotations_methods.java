package day43_annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*Login =@BeforeMethod
 * search=@Test
 * logout=@AfterMethod
 * login
 * adavanced search=@Test
 * log out
 */
public class Annotations_methods {
	
	WebDriver driver;
	@BeforeMethod
	void login()
	{
		System.out.println("This is a login");
		
	}
	@Test
    void serach()
    {
    	System.out.println("This is search");
    }
	@Test
    void advancedsearch()
    {
    System.out.println("This is advanced search");	
    }
	@AfterMethod
	void logout()
	{
		System.out.println("this is log out");
	}
}
