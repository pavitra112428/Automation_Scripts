import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testngdemo4 {
	WebDriver driver;
	    @BeforeClass
	    
	   void openapp()
	   {
	    	ChromeOptions options=new ChromeOptions();
	    	options.addArguments("..incognito");
		   driver = new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   driver.manage().window().maximize();
		   
	   }
	    @Test
	    void login ()
	    {
	    	driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Admin");
	    	driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("admin123");
	    	driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
	    	
	    }
	    @Test
	    void testurl()
	    {
	          boolean status=  driver.findElement(By.xpath("//img[@src=\"/web/images/orangehrm-logo.png?v=1721393199309\"]")).isDisplayed();
	          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	          Assert.assertEquals(status, null);
	    }
	    @Test
	     void closeapp()
	    {
	    	driver.quit();
	    
	   
	//javascriptExecutor js = (javascriptExecutor) driver;
	   //js.executeScrpit(window.scrollBy("0,500"));
	   
	   
	   //JavascriptExecutor js =javascript*//
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
	    }
}
