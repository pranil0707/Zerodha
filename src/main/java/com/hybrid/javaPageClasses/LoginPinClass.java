package com.hybrid.javaPageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPinClass {

	public WebDriver driver;
	
	@FindBy(xpath="//input[@id='pin']")
	WebElement LoginPin;
	
	@FindBy(xpath="//button[text()='Continue ']")
	WebElement ContinueBtn;
	
	public LoginPinClass(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void EnterPin(String Pin)
	{
		LoginPin.sendKeys(Pin);
		ContinueBtn.click();
	}
}
