import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ajio_searchbox_bor {

	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.ajio.com/");
      driver.manage().window().maximize();
    boolean status=  driver.findElement(By.xpath("placeholder=\"Search AJIO\"")).isDisplayed(); 
    
	}

}
