package Ajio_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts_ajio 
{

	public static void main(String[] args) 
	{
     WebDriver driver = new ChromeDriver();
      driver.get("https://www.ajio.com/");
      
    
      
      driver.findElement(By.xpath("")).sendKeys("");
      /*javascriptExecutor js = (javascriptExecutor) driver;*/
      
     
      
      

	}
}
