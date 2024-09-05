import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlecheckbox 
{

	public static void main(String[] args) throws Throwable 
	{
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	driver.manage().window().maximize();
	
	Thread.sleep(1000);
	
	//select specific check box 
	
	//scroll operation 
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
js.executeScript("window.scrollBy(0,3000)");

	driver.findElement(By.xpath("//li[@data-cy=\"oneWayTrip\"]")).click();
	
/*
 * driver.findElement(By.xpath("////label[@id=\"label_input_26_0\"]] ")).click()
 * ;
 */

}
}
