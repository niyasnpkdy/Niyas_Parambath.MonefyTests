package com.monefy.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.monefy.util.MonefyTestUtil;

import MyAppiumTest.Monefy.MonefyApp;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class ExpenseCategories extends MonefyApp {
	
	public ExpenseCategories() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

			
	//This method is to add Expense from the Item listed on the dash board- Car
	public static void AddCar()
	{
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);		
		MonefyTestUtil.ClickWihXpathLocator(prop.getProperty("CarItemXpath"));
		
		driver.findElement(By.id(prop.getProperty("Button1"))).click();
		
		driver.findElement(By.id(prop.getProperty("Button0"))).click();
		
		MonefyTestUtil.ClickWithIDlocator(prop.getProperty("KeyBoardActionButton"));
		
		
				
	}
	
	//This method is to add Expense from the Item listed on the dash board- Cloths
	public static void AddCloths()
	{
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);		
		MonefyTestUtil.ClickWihXpathLocator(prop.getProperty("ClothsXpath"));
		
		driver.findElement(By.id(prop.getProperty("Button2"))).click();
		
		driver.findElement(By.id(prop.getProperty("Button0"))).click();
		
		MonefyTestUtil.ClickWithIDlocator(prop.getProperty("KeyBoardActionButton"));
				
				
	}
	
	//This method is to add Expense from the Item listed on the dash board- Entertainment
	
	public static void AddEntertainment()
	{
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);		
		MonefyTestUtil.ClickWihXpathLocator(prop.getProperty("EntertainmentXpath"));
		
		driver.findElement(By.id(prop.getProperty("Button3"))).click();
		
		driver.findElement(By.id(prop.getProperty("Button0"))).click();
		
		MonefyTestUtil.ClickWithIDlocator(prop.getProperty("KeyBoardActionButton"));
				
				
	}
	
	
	
	
	
	
	

}
