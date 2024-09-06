import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo_class {
	   
	
	
	@BeforeClass
	void setup()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("");
		driver.manage().window().maximize();
		
	}
	
	@Test
	void login()
	{
		//boolean status = driver.findElement(By.xpath("By.xpath(\"//span[@aria-label=\\\"BEAUTY\\\"]\"")).isDisplayed();
              //Assert.assertEquals(status, null);
   	} 
	@Test
	void loginpage()
	{
		System.out.println("Automation");
	}
	@Test
	void mainsearch()
	{
		
	}

}
