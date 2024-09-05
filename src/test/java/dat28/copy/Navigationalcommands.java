package dat28.copy;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationalcommands 
{

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{	
	
       WebDriver driver =new ChromeDriver();
      driver.get("https://in.bookmyshow.com/explore/home/hyderabad");
       driver.navigate().to("https://in.bookmyshow.com/explore/home/hyderabad");
        
       URL myurl= new URL ("https://in.bookmyshow.com/explore/home/hyderabad");
    driver.navigate().to(myurl);
      
       driver.navigate().to("https://in.bookmyshow.com/explore/home/hyderabad");
       driver.manage().window().maximize();
       driver.navigate().to("https://www.netflix.com/in/");
       Thread.sleep(2000);
       driver.navigate().back();
       System.out.println((driver.getCurrentUrl()));
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl()); 
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		//driver.navigate.refresh();
		
	}	
	       

}

