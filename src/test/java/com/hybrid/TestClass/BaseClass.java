package com.hybrid.TestClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.java.Utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	ReadConfig p = new ReadConfig();
	String URL = p.getBaseurl();
	String Browser = p.getBrowser();
	String Userid = p.getUserId();
	String Password = p.getPassword();
	String Pin = p.getPin();
	
	@BeforeSuite
	public void Setup()
	{
		
		switch (Browser.toLowerCase()) {
		case "chrome":
						WebDriverManager.chromedriver().setup();
						driver = new ChromeDriver();
			break;
			
		case "edge":
					WebDriverManager.edgedriver().setup();
					driver= new EdgeDriver();
			break;
			
		case "firefox":
					WebDriverManager.firefoxdriver().setup();
					driver= new FirefoxDriver();
			break;

		default:
			
			break;
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
	}

	@AfterSuite
	public void Tearup() throws InterruptedException
	{
		Thread.sleep(5);
		driver.close();
	}
}
