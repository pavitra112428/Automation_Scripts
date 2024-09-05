import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launch_web_browser 
{

	public static void main(String[] args){
		
       WebDriver driver;
       
       driver=new ChromeDriver();
       driver=new FirefoxDriver();
   
       driver.get("https://www.myntra.com/");
       driver.manage().window().maximize();
       driver.findElement(By.xpath("//input[@placeholder=\"Search AJIO\"]")).sendKeys("");
       
             driver.findElement(By.xpath("")).sendKeys("");
            driver.get("httos://facebook.com");
            
            
           
      }
       
	}



