package day23;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;

public class Locators_demo 
{

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		
		//Thread.sleep(1000);
		
		
		
		//driver.findElement(By.cssSelector("#search-container")).sendKeys("Hyderabad");
		
		
		  driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("kakinada");
		  
			
	    //driver.findElement(By.xpath("//*[@placeholder='To Station']")).sendKeys("Bangalore");
			 
		
	//	Thread.sleep(1000);
		
		//  driver.findElement(By.xpath("//input[@value='Bangalore']")).click();
		 
        
		
		/*
		 * driver.findElement(By.xpath("//*[text()='Today']")).click();
		 */


		
		/* driver.findElement(By.xpath("//*[text()='Search']")).click(); */
		  
		 
	
		
	
	}

}
