import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class implicityWait_class_demo2 {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("htts://filpkart.com");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("")).sendKeys("(//div[@class=\"_3ETuFY\"])[3]");
		driver.findElement(By.xpath("//div[@class=\\\"_3ETuFY\\\"])[3]\"")).click();
		Assert.assertEquals(false, null);
		
	boolean status=	driver.findElement(By.xpath("\"//div[@class=\\\\\\\"_3ETuFY\\\\\\\"])[3]\\\"\"")).isDisplayed();
	driver.switchTo();
	Thread.sleep(1000);
	      driver.quit();
	

	}

}
