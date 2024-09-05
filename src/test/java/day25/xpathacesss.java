package day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathacesss 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("")).sendKeys("");
		

	}

}
