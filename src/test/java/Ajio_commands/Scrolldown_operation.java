package Ajio_commands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldown_operation 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		WebElement Searchbox=driver.findElement(By.xpath("//input[@placeholder=\"Search AJIO\"]"));
		
		Searchbox.sendKeys("T_shirts");
		Searchbox.submit();	
		//optionally wait for the search results to load depending on the sites behaviour
		
		
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		//scroll down by 1000 pixels 
		js.executeScript("window.scrollBy(0, 1000);");
		 
		//perform a scroll down operation using javascriptexecutor
		js.executeScript("window.scrollBy(0,3000);");
		 // Optionally wait to see the scroll effect
         WebElement searchResult = driver.findElement(By.xpath("//a[contains(@href, 't-shirts')]"));
        searchResult.click();
       //Thread.sleep(4000);
        // Quit the driver
       // driver.quit();

	}
	}		