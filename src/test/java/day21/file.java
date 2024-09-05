package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class file {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("")).sendKeys("");
	}
	

}
