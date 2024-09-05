import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Student_form {

	public static void main(String[] args) throws Exception
	{
		
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--incognito"           );
		WebDriver driver = new ChromeDriver();
		driver.get("https://docs.google.com/forms/d/1qPA2QNk73UpdWCFG3tLaCN40yjZbLqfQg1ZvMgsf_68/edit");
		driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fdocs.google.com%2Fforms%2Fd%2F1qPA2QNk73UpdWCFG3tLaCN40yjZbLqfQg1ZvMgsf_68%2Fviewform%3Fedit_requested%3Dtrue&ifkv=AdF4I773kOdsjoJzmfebyq1DZiZJZOnH9OVT9c1tFQJMVIVqa6HpKjCkwgPeg_IyKupvwKkzUXNbrQ&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-770885014%3A1722323702291877&ddm=0");
		
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("pavithrayadav026@gmail.com");
		 //WebElement Button = driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]"));
	      // Button.click();
	        
	        Thread.sleep(1000);
	       driver.get("https://docs.google.com/forms/d/1qPA2QNk73UpdWCFG3tLaCN40yjZbLqfQg1ZvMgsf_68/edit");
	        driver.findElement(By.xpath("//div[@class=\"g3VIld Up8vH J9Nfi iWO5td\"]"));
	        Thread.sleep(1000);
	        WebElement Signin =driver.findElement(By.xpath("(//span[@class=\"RveJvd snByac\"])[4]"));
	        Signin.click();
	        driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("pavithrayadav026@gmail.com");
			 WebElement Button = driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]"));
		        Button.click();
		        
	        //driver.quit();

		WebElement nameField= driver.findElement(By.id("name"));
		WebElement  ageField =driver.findElement(By.id("age"));
		WebElement emailField= driver.findElement(By.id("email"));
		WebElement submitButton = driver.findElement(By.id("submitButton"));
		
		nameField.sendKeys("Liyanshi");
		ageField.sendKeys("23");
		emailField.sendKeys("liyanshi@synycssolutions.com");
		submitButton.click();
		
		//
		Javascript js = (Javascript)driver;
		
		
		
		
		 
		
	
		
		
		
		
		
	}

}
