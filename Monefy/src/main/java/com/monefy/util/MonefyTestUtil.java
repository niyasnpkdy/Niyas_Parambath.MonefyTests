package com.monefy.util;

import java.io.IOException;

import org.openqa.selenium.By;

import MyAppiumTest.Monefy.MonefyApp;
import io.appium.java_client.MobileElement;

public class MonefyTestUtil extends MonefyApp{

	public MonefyTestUtil() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void ClickWithIDlocator(String locator)
	
	{
		driver.findElement(By.id(locator)).click();	
	}
	
	
	
	
	
public static void ClickWihXpathLocator(String locator)
	
	{
		driver.findElement(By.xpath(locator)).click();	
	}
	
}
