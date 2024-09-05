package sdetday26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javawebdriver 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
       
        driver.manage().window().maximize();
        
        //get url():open the url on the browser
        
        
        driver.get("https://www.facebook.com/login/");
        
        //driver.getTitle():returns title of the page 
        
       System.out.println (driver.getTitle());
        
       //get current url()-returns url of the page //https://www.facebook.com/login/
       
       System.out.println(driver.getCurrentUrl());
       
       
       //get page sorce()
       //System.out.println(driver.getPageSource());//https://www.facebook.com/login/
       
       //get window id ():reurns the id of the single browser window 
      // String windowid= driver.getWindowHandle();
      // System.out.println("window id:"+windowid);
       
       //get window handles()-returns id of the multiple browser windows 
       driver.findElement(By.linkText("https://www.facebook.com/login/")).click();
       
	}

}
