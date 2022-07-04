package com.hybrid.TestClass;

import org.testng.annotations.Test;

import com.hybrid.javaPageClasses.LoginPinClass;
import com.hybrid.javaPageClasses.MainLoginClass;

public class TC_LoginPage extends BaseClass {

@Test(priority = 1)
public void Setup()
{
	driver.get(URL);
	driver.manage().deleteAllCookies();
	driver.manage().window().minimize();
}

@Test(priority = 2)
public void Login()
{
	MainLoginClass ml = new MainLoginClass(driver);
	ml.EnterCred(Userid, Password);
	LoginPinClass lp = new LoginPinClass(driver);
	lp.EnterPin(Pin);
	
}



}
