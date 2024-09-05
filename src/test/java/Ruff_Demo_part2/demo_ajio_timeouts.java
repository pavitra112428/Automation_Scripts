package Ruff_Demo_part2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_ajio_timeouts {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("placeholder=\"Search for Products, Brands and More\"")).click();

	}

}
