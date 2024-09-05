package testng_dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider_demo {
	
	WebDriver driver;
	@BeforeMethod
	void setup(){
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	} 
	
	@Test (priority=1,dataProvider="dp")
  void testlogin(String username,String password) throws Exception {
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   //driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys(username);
		
		driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys(username);
	    driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys(password);
	    driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
	    boolean status= driver.findElement(By.xpath("//div[@class=\"oxd-topbar-header toggled\"]")).isDisplayed();
	    if(status=true){
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[text()='manda user']")).click();
	     driver.findElement(By.xpath("//*[text()='Logout']")).click();
	    Assert.assertTrue(true);
	 }
	 else
	 {
		 Assert.fail();
	 }
	  
	  
  }
  
  @Test(priority = 2)
  void teardown()
  {
	  //driver.quit();
  }
  
  @DataProvider(name="dp")
Object[][]  loginData(){
	  Object  data[][]= {
			  {"abc@gmail.com","test123"},
			  {"xyz@gmail.com","testo2"},
			  {"swathi@gmail.com","test098"},
			  {"bhargavi@gmail.com","test456"},
			  {"Admin","admin123"}};
	return data;		  
}
  

  
}






