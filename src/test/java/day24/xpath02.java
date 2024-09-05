package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class xpath02 
{

	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("Longtops for women");
		
		//driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys.searchBox.sendKeys("Longtops for women");
		
		//WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).searchBox.sendKeys("Longtops for women");

		//WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		//searchBox.sendKeys("Longtops for women");

		WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		searchBox.sendKeys("Longtops for women");
		//searchBox.click();
		
		driver.findElement(By.xpath("nav-search-submit-button")).click();
		
	//	id="nav-search-submit-button"

		
	}

}
