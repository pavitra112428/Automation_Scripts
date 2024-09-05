package day22;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
	
public class Locators_demo 
{
	public static void main(String[] args) throws Throwable //throws InterruptedException 
	
	{
		 //Setup ChromeDriver using WebDriverManager
      WebDriverManager.chromedriver().setup();
      
     // WebDriver driver = new ChromeDriver();
      
     WebDriver driver=new ChromeDriver();
      
      driver.manage().window().maximize();
      
      
     driver.get("https://www.amazon.in/");
     
     File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     
     FileUtils.copyFile(src,new File("C:\\Users\\Pavithra\\Desktop\\screenshots.jpg"));
     
WebElement abc=    driver.findElement(By.id("nav-xshop-container"));

List<WebElement>abc1=abc.findElements(By.tagName("a"));

System.out.println(abc1.size());
     
  
   
     
		/*
		 * driver.get("https://www.makemytrip.com/");
		 * 
		 * WebElement abc=
		 * driver.findElement(By.xpath("(//*[@class='tabsCircle appendRight5'])[2]"));
		 * 
		 * System.out.println(abc.isSelected());
		 */
      

         //Initialize the ChromeDriver
       // WebDriver driver = new ChromeDriver();
        //driver.get("https://demo.opencart.com/");
        //driver.manage().window().maximize();

        // Open a website URL
       //driver.get("https://www.makemytrip.com/");
       
      // Thread.sleep(1000);
       
  //WebElement abc=  driver.findElement(By.xpath("(//*[@class='tabsCircle appendRight5'])[1]"));
  
 // System.out.println(abc.isSelected());
    
        //bolean logoDisplaystatus = driver.findelement(by.id("logo")).isdisplayed();
        //System.out.println(logodisplayststus);
        //linktext & partiallinktext
        //driver.findElement(By.linkText("Cameras")).click();
   
	
		// driver.findElement(By.linkText("Movies")).click();
		  
		 // driver.findElement(By.partialLinkText("Movi")).click();
		
		 
		   // driver.findElements(By.className(""))
		 
		 
		// System.out.println("total number of header links:+headerlinks.size()");

 }

}
