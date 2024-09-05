package sdetday26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_methods 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		// is displayed():check the ststsu of elememt 
		
		//WebElement logo= driver.findElement(By.xpath("//img[@alt='Ajio logo']"));
	//System.out.println("dispaly status of logo:"+logo.isDisplayed());
		
		//boolean status=driver.findElement(By.xpath("")).isDisplayed();
		//System.out.println("display status:"+status);
		
		
		//is enabled():enable ,disable status of the element 
		
		//driver.findElement(By.xpath("//input[@name='username']")).isEnabled();
		//System.out.println("enable status:"+"status");
		
		//is selected():the element is selected or not 
		
		//driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).isSelected();
		//System.out.println("selected status:"+"status");
		
		
		
		
		
	
		
		
		
		
		
		

	}

}
