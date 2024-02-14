package com.Guru99.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Guru99.qa.base.TestBase;

public class LoginPage extends TestBase {
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@name='uid']")
	WebElement userID;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement loginbtn;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void setuserID(String userName) {
	userID.sendKeys(userName);
	}
	
	public void setpassword(String Password) {
		password.sendKeys(Password);

	}
    
	public void clickLgnBtn() {
		loginbtn.click();
		
	}
	
		
	}



	
	
