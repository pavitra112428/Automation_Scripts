package Testng_listners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Orange_Hrm.class)
public class Testng_listners{
	WebDriver driver;
	@BeforeClass
	void setup() throws Exception
	{
		 driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
   @Test(priority=1)
   void testlogo()
   {
	boolean status =   driver.findElement(By.xpath("//img[@src=\"/web/images/ohrm_branding.png?v=1721393199309\"]")).isDisplayed();
	Assert.assertEquals(status, true);
   }
   @Test (priority=2)
   void testAppurl() 
   {
	   Assert.assertEquals(driver.getCurrentUrl(),"khttps://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   }
   @Test(priority=3,dependsOnMethods= {"testAppurl"})
   void testhomepagetitile()
   {
	  Assert.assertEquals(driver.getTitle(),"OrangeHRM");
   }
   @AfterClass
   void teardown()
   {
	   
	   driver.quit();
   }
}
