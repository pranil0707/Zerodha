package com.hybrid.TestClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.hybrid.javaPageClasses.LoginPinClass;
import com.hybrid.javaPageClasses.MainLoginClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_LoginPage extends BaseClass {

@BeforeTest
public void setup()
{
	driver = Initalize();
}
	

@Test(priority = 1)
public void Login() throws InterruptedException
{
	MainLoginClass ml = new MainLoginClass(driver);
	ml.EnterCred(Userid, Password);
	LoginPinClass lp = new LoginPinClass(driver);
	lp.EnterPin(Pin);
	Thread.sleep(5000);
	
}
}
