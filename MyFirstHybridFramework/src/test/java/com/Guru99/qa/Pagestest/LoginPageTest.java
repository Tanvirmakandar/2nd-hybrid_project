package com.Guru99.qa.Pagestest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Guru99.qa.base.TestBase;
import com.Guru99.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	
   @Test(priority=2)
   public void TitleBeforeLogon() {
	   String title=driver.getTitle();
	   Assert.assertEquals(title,"Guru99 Bank Home Page" );
	   
   }
	

	@Test(priority=1)
	public void loginTest() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		lp.setuserID(userName);
		lp.setpassword(Password);
		lp.clickLgnBtn();
		Assert.assertEquals(driver.getTitle(),"Guru99 Bank Manager HomePage");
		
		
		
	}

}
