package com.monefy.pages;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.monefy.util.MonefyTestUtil;

import MyAppiumTest.Monefy.MonefyApp;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class DashboardIncome extends MonefyApp {
	public DashboardIncome() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		
		
	}

			
	//This method is to add Income using dash board main button-Category salary
	public static String SalaryIncome()
	{
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		MonefyTestUtil.ClickWithIDlocator(prop.getProperty("IncomeButton"));
		
		String Header=driver.findElement(By.xpath("//android.widget.TextView[@text='New income']")).getText();
		
		System.out.println("Header: "+Header);
		driver.findElement(By.id(prop.getProperty("Button1"))).click();
		

		driver.findElement(By.id(prop.getProperty("Button0"))).click();
		
		MonefyTestUtil.ClickWithIDlocator(prop.getProperty("KeyBoardActionButton"));
		MonefyTestUtil.ClickWihXpathLocator(prop.getProperty("Salary"));
		return Header;
		
	
	}
	
	//This method is to add Income using dash board main button-Category Deposit
	public static String DepositIncome()
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		MonefyTestUtil.ClickWithIDlocator(prop.getProperty("IncomeButton"));
		String Header=driver.findElement(By.xpath("//android.widget.TextView[@text='New income']")).getText();
		
		System.out.println("Header: "+Header);

		driver.findElement(By.id(prop.getProperty("Button5"))).click();
		
		driver.findElement(By.id(prop.getProperty("Button0"))).click();
		
		MonefyTestUtil.ClickWithIDlocator(prop.getProperty("KeyBoardActionButton"));
		MonefyTestUtil.ClickWihXpathLocator(prop.getProperty("Deposits"));
		return Header;
	}
	
	
	
	

}
