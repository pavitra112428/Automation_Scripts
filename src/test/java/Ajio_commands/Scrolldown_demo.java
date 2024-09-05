package Ajio_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldown_demo 

{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
   WebElement searchbox=   driver.findElement(By.xpath("//input[@placeholder=\"Search AJIO\"]"));
   searchbox.sendKeys("Womens_traditional dresses");
   searchbox.submit(); 
   Thread.sleep(1000);
   JavascriptExecutor js = (JavascriptExecutor) driver;
   
   js.executeScript("window.scrollBy(0, 1000);");
   Thread.sleep(1000);
   js.executeScript("window.scrollBy(0,3000);");
   WebElement  HOMEANDKITCHEN= driver.findElement(By.xpath("//span[@aria-label=\"HOME AND KITCHEN\"]"));
 
   HOMEANDKITCHEN.submit();
   //driver.findElement(By.xpath("//span[@aria-label=\"HOME AND KITCHEN\"]"));
    searchbox.submit();
	/* javascriptExecutor js = (javascriptExecutor) driver; */
   
   
	}

}
