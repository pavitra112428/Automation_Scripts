package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_sdet 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Thread.sleep(1000);
		//x path with single attributer
		
		//driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]']")).sendKeys("Water bottle");
//x path with multiple attributes 
		//driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in'][@aria-label='Search Amazon.in']")).sendKeys("Waterbottle");
		
		//X path with AND operator
		//driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in' and @aria-label='Search Amazon.in']")).sendKeys("Waterbottles");
		
		//x path with or operator 
		//driver.findElement(By.xpath("//input[@placeholder='Search Amazon.'or @aria-label='Search Amazon.in']")).sendKeys("Water bottles");
		//driver.findElement(By.xpath("//*[text()='Amazon miniTV')").click();
		
		//x path with text()/inner text 
		/*driver.findElement(By.xpath("//*[text()='Amazon miniTV']")).click();
	boolean displaystatus =	driver.findElement(By.xpath("//h2[text()='Trending Top 10 on miniTV']")).isDisplayed();
	System.out.println(displaystatus);
	 String value = driver.findElement(By.xpath("//h2[text()='Trending Top 10 on miniTV']")).getText();
	 System.out.println(value);*/
		
		//x path with contains
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("Water bottle");
		
		//x path with start_with()
		//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Search')]")).sendKeys("Water bottle");
		//chained x-path 
		//boolean status=driver.findElement(By.xpath("//div[@id='navSwmHoliday']/a/img")).isDisplayed();
		System.out.println("status");
		
		
		
		
		
		
		}
	
}
