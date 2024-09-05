package day42_testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*1).open application
2).test logo presence
3).login

 4).close*/
public class Ajio_demo_testcase {
	WebDriver driver ;
	 @Test(priority=1)
	 void openapp()
	 
	 {
		 driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
	 }
	@Test(priority=2)
	void testlogo() throws Exception
	{
		Thread.sleep(3000);
		boolean status =driver.findElement(By.xpath("//div[@class=\"orangehrm-login-branding\"]")).isDisplayed();
		System.out.println("logo displayed..+status");
	}
	@Test (
)
	void testlogin() throws Exception
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
	}
	@Test(priority=4)
	
	void testclose()
	{
		driver.quit();
	}
	
	
}
