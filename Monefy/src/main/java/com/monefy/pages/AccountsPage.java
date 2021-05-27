package com.monefy.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.monefy.util.MonefyTestUtil;

import MyAppiumTest.Monefy.MonefyApp;
import io.appium.java_client.MobileElement;

public class AccountsPage extends MonefyApp {
	
	public AccountsPage() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

			
	//Method to add a new Account
	public static void AddAccount()
	{
		
				
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		MonefyTestUtil.ClickWithIDlocator(prop.getProperty("MoreButtonID"));
		MonefyTestUtil.ClickWithIDlocator(prop.getProperty("AccountButton"));
				
		MonefyTestUtil.ClickWihXpathLocator(prop.getProperty("AddAccountButton"));
		
		driver.findElement(By.id(prop.getProperty("NewAccountName"))).sendKeys(prop.getProperty("AccountName"));
		driver.findElement(By.id(prop.getProperty("AccountInitialAmountID"))).sendKeys(prop.getProperty("AccountInitialAmountValue"));
		MonefyTestUtil.ClickWihXpathLocator(prop.getProperty("ChoseImageforAccount"));
		
		MonefyTestUtil.ClickWithIDlocator(prop.getProperty("SaveAccountInfoID"));
		
	}
	
	
	
	
	
	
	

}
