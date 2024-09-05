package day21;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sreenshot_02 
{

	private static WebElement dropd;

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//take screenshot and filed asa  store format 
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(src,new File("C:\\Users\\Pavithra\\Desktop\\screenshots"));
		 
		 WebElement droped = driver.findElement(By.xpath(""));
		 
		 droped.click();
		 
				 
		 
		 
		 
		 
		 
		 
		 
	}
}
