package scroll_operation_code;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_operation_code 
{

	public static void main(String[] args) 
	{
		

		WebDriver driver =new ChromeDriver();
		driver.get("");
		// Set the path to the chromedriver executable
		WebDriverManager.chromedriver().setup();
		
		   

		        // Initialize WebDriver (Chrome)
		        WebDriver driver1 = new ChromeDriver();

		        // Open the webpage
		        driver1.get("URL_OF_THE_PAGE");

		        // Scroll down by a specific number of pixels
		        JavascriptExecutor js = (JavascriptExecutor) driver1;
		        js.executeScript("window.scrollBy(0, 1000);");  // Scroll down by 1000 pixels

		        // Scroll to the bottom of the page
		        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

		        // Scroll up by a specific number of pixels
		        js.executeScript("window.scrollBy(0, -1000);");  // Scroll up by 1000 pixels

		        // Scroll to a specific element
		        WebElement element = driver1.findElement(By.id("element_id"));  // Replace 'element_id' with the actual ID of the element
		        js.executeScript("arguments[0].scrollIntoView(true);", element);

		        // Close the WebDriver
		        driver1.quit();
		    }
		


	}


