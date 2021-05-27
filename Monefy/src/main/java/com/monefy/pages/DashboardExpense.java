package com.monefy.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.monefy.util.MonefyTestUtil;

import MyAppiumTest.Monefy.MonefyApp;
import io.appium.java_client.MobileElement;

public class DashboardExpense extends MonefyApp {
	
	public DashboardExpense() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

			
	//This method is to add an expense from dash board Expense main button, and choose a category to add
	public static String ExpensetoBillsCategory()
	{
		
				
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		MonefyTestUtil.ClickWihXpathLocator(prop.getProperty("ExpenseButton"));
		
		String NewExpPage=driver.findElement(By.xpath("//android.widget.TextView[@text='New expense']")).getText();
		
		System.out.println("PrintText:"+NewExpPage);
		driver.findElement(By.id(prop.getProperty("Button4"))).click();
		
		driver.findElement(By.id(prop.getProperty("Button0"))).click();
		
		MonefyTestUtil.ClickWithIDlocator(prop.getProperty("KeyBoardActionButton"));
		MonefyTestUtil.ClickWihXpathLocator(prop.getProperty("WidgetTextViewBills"));
		
		return NewExpPage;
		
				
	}
	
	
	
	
	
	
	
	
	

}
