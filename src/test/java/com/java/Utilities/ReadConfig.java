package com.java.Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties prop;
	String path = "C:\\Users\\Admin\\eclipse-workspace\\Zerodha\\Configuration\\Config.properties";

	public ReadConfig() {
		
		prop = new Properties();

		try {
			FileInputStream fs = new FileInputStream(path);
			prop.load(fs);
		} 
		catch (Exception e)
		{
			
			e.printStackTrace();
		}		
	}

	public String getBaseurl()
	{
		String value = prop.getProperty("Baseurl");
			return value;
		
	}

	public String getBrowser()
	{
		String Browser= prop.getProperty("Browser");
		
		if(Browser!= null)
		{
			return Browser;
		}
		else
		{
			throw new RuntimeException("Browser is not specified in Config File");
		}		
	}
	
	public String getUserId()
	{
		String UserId = prop.getProperty("Userid");
		
		if(UserId!=null)
		{
			return UserId;
		}
		else
		{
			throw new RuntimeException("Userid is not specified in Config File");
		}	
	}
	
	public String getPassword()
	{
		String Password = prop.getProperty("Password");

		if(Password!=null)
		{
			return Password;
		}
		else
		{
			throw new RuntimeException("password is not specified in Config File");
		}	
	}

	public String getPin()
	{
		String Pin = prop.getProperty("Pin");

		if(Pin!=null)
		{
			return Pin;
		}
		else
		{
			throw new RuntimeException("Pin is not specified in Config File");
		}	
	}
	
}
