package Ajio_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.SearchItem;

public class practice_demo_ajio 
{

	

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		WebElement WOMEN=	driver.findElement(By.xpath("//span[@aria-label=\"WOMEN\"]"));
		WOMEN.click();
		Thread.sleep(20000);
	
     WebElement Searchbox=  driver.findElement(By.xpath("//input[@placeholder=\"Search AJIO\"]"));
     
     Searchbox.sendKeys("t-shirts");
     Searchbox.submit();
     Thread.sleep(2000);
     driver.quit();
     
	
	

		
	}

}
