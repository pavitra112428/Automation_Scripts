package day21;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot_day21 
{

	public static void main(String[] args) throws IOException                 
	{
		WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        
        driver.get("https://www.amazon.in/");
        
        driver.manage().window().maximize();
        
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        FileUtils.copyFile(src,new File("C:\\Users\\Pavithra\\Desktop\\screenshots.jpg"));
        
    WebElement dropd=driver.findElement(By.xpath("//*[@id='nav-search-dropdown-card']"));
    
    dropd.click();
    
      List<WebElement>values=dropd.findElements(By.tagName("option"));
      
      for (int i = 0; i < values.size(); i++) {
    	  
    	  System.out.println(values.get(i).getText());
		       
	}
      
     
      
      
    
                     
                         
    
    
    
    
	}

}
