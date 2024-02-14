package com.Guru99.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
	public static WebDriver driver;
	public static String baseUrl="https://demo.guru99.com/v4/";
	public static String userName="mngr384964";
	public static String Password="utEzAnA";
	
	@BeforeMethod
	public void setup() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\MyFirstHybridFramework\\Driver\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(baseUrl);

	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	
	
	
}}
