package testng_dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class Parallel_testing_using_xmlfile {
	WebDriver driver;
	
	@BeforeClass

	void Setup() throws InterruptedException
	{
	
		
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://www.orangehrm.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
	}
		
	@Test(priority=1)
    void Testlogo()
    
    {
    	boolean status =driver.findElement(By.xpath("//img[@src='/_resources/themes/orangehrm/dist/images/OrangeHRM_Logo.svg']")).isDisplayed();
    	Assert.assertEquals(status, true);
    }
	@Test(priority=2)
    void Testtitle()
    {
		Assert.assertEquals(driver.getTitle(),"orangehrm");
    }
	@Test(priority=3)
	void Testurl()
	{
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.orangehrm.com/");
	}
	@AfterClass
	void TearDown()
	{
		driver.close();
	}
}

