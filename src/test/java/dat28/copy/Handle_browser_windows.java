package dat28.copy;

import java.time.Duration;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.JList;
import javax.swing.ListModel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.java.swing.plaf.windows.resources.windows;

public class Handle_browser_windows 
{

	
	/*
	 * 
	 * private static final String Child = null; private static final String
	 * Childid= null;
	 */
	 

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
	
       Set<String>windowids=driver.getWindowHandles();//A QA Engineer is a professional who finds and fixes bugs in a product or program before its launch, collaborating with developers on fixes to those problems when necessary. They're needed across many industries, including automotive, medical devices and food/beverage
		List<String>windowlist=new ArrayList<String>(windowids);		
		
		String parentid=windowlist.get(0);
		String parentid1=windowlist.get(1);
		String parentid2=windowlist.get(1);
		System.out.println(driver.getTitle());
		
		
		//switch to child window 
		driver.switchTo().window(parentid1);
		System.out.println(driver.getTitle());
		
		//switch to parent child 
		driver.switchTo().window(parentid2);
		System.out.println(driver.getTitle());
		
		
		
	
		
		
	
			
		
		
		
		
 
	}

}
