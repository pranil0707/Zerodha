package com.hybrid.javaPageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainLoginClass {
	
	public WebDriver driver;
	
	@FindBy(xpath="//input[@id='userid']")
	WebElement userid;
	
	@FindBy(xpath="//input[@id='password']']")
	WebElement password;

	@FindBy(xpath="//button[text()='Login ']")
	WebElement loginbtn;
	
	public MainLoginClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void EnterCred(String UserId, String Password)
	{

		userid.sendKeys();
		password.sendKeys();
		loginbtn.click();
	
	}
		
}
