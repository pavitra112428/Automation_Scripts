package Pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class demo_objectmodel {
	 
	
WebDriver driver;

												                              //page object model contains only web elements and corresponding webelements
	//constructor //whatever class name is given need to give same 
	demo_objectmodel(WebDriver driver)  
	                                                                                //while craeting page object class using page factory or without using page factory need to do thse mandatory steps 
	{
		
		this.driver= driver;  
	}
	//locators                                                                         //locators 2nd part ..>all x path ,locators ,id everything like 
	By txt_Username_loc=By.xpath("//input[@placeholder='Username']");
	By txt_password_loc=By.xpath("//input[@placeholder='Password']");
	By btn_login_loc=By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
	 //Action methods 
	                                             //constructor ..>it will intiate the driver avtomatically it is the first part
	public void setUserName(String user)	
	{
		  driver.findElement(txt_Username_loc).sendKeys(user);                                     //action methods
	}
	
    public void setPassword(String pwd)
    {
    	driver.findElement(txt_password_loc).sendKeys("pwd");
    }
    public void clickLogin()
    { 
    	
		driver.findElement(btn_login_loc).click();
		//driver.findElement(by.)
    }
}
