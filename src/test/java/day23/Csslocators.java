package day23;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.tree.JCTree.Tag;

import day21.file;



public class Csslocators 
{

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();//maximize the browser window
		//driver.findElement(By.cssSelector("input/Search,")).sendKeys("marketkeys");
		//driver.findElement(By.cssSelector("#small searchterms")).sendKeys("T-shirts");
		//Tag.class 
		//driver.findElement(By.cssSelector("input.Pke_EE  ")).sendKeys("T-shirts");//tag name that is input and mention class name that is .pke_EE
	           driver.get("https://amazon.com/");
	           driver.get("https://netflix.com");
	           
	           
		//tag attribute 
		//driver.findElement(By.cssSelector("input.'_1sFryS _2x2Mmc']")).sendKeys("T-shirts");
  	                                                                         
		//driver.findElement(By.cssSelector("input.Pke_EE")).sendKeys("Kurti-sets women");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("C:\\Users\\Pavithra\\Desktop\\screenshots.jpg"));
	       
		
	           
		
	         
		 
		
		
		
		
	}

}
