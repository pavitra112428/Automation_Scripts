import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class incognito_opening_launch_video 
{

	public static void main(String[] args) 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		  /*driver.findElement(By.id("women")).click(); 
		  Alert alert =driver .switchTo().alert();
		   String textONAlert = alert.getText();
		 System.out.println(textONAlert);
		 alert.accept();*/
		 
		 

		
	}

}
