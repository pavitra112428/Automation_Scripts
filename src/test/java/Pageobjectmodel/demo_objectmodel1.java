package Pageobjectmodel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class demo_objectmodel1 {
	WebDriver driver;

     
//constructor 
demo_objectmodel1(WebDriver driver)  
                                                                                   //while craeting page object class using page factory or without using page factory need to do thse mandatory steps 
{

 this.driver= driver;
 PageFactory.initElements(driver, this);// mandatory 
}
    //locators                                                                         //locators 2nd part ..>all x path ,locators ,id everything like 
   /*By txt_Username_loc=By.xpath("//input[@placeholder='Username']");
    By txt_password_loc=By.xpath("//input[@placeholder='Password']");
   By btn_login_loc=By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");*/

   @FindBy(xpath="//input[@placeholder='Username']")

   WebElement txt_username;
  @FindBy(xpath="//input[@placeholder='Password']")
  WebElement txt_Password;
  @FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
  WebElement btn_login;
  
  @FindBy(tagName="a")//this we called as group of all elements link
  List<WebElement>links;
  






//Action methods 


                                              //constructor ..>it will intiate the driver avtomatically it is the first part
public void setUserName(String user)	
{
  txt_username.sendKeys(user);                                     //action methods
}

public void setPassword(String pwd)
{
	txt_Password.sendKeys(pwd);
}
public void clickLogin()
{ 
	btn_login.click();


}

	

}//using page factory 
