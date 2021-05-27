package MyAppiumTest.Monefy;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.monefy.pages.DashboardIncome;
import com.monefy.pages.ExpenseCategories;

import io.appium.java_client.remote.MobileCapabilityType;


public class DashBoardAddIncomeTest extends MonefyApp {
	
	
	DashboardIncome DBIcme;
	
	
	public DashBoardAddIncomeTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeTest
	public void setup() throws IOException
	{
		
		OpenMonefyApp();
	
	}
	@BeforeMethod
	public void openAppp() throws IOException
	{
		//boolean TF=IsMonefyAppOpen();
		
		//Assert.assertEquals(TF, true);
		System.out.println("Monefy Application launched successfully:");
	
	}
	    
	
	
	
   @Test
    public void IncomeCategorySalary()
    {
    	
    	String NewIncmSal=  DBIcme.SalaryIncome();
    			
    Assert.assertEquals(NewIncmSal, "New income","Invalid Text");  
    }
    
    @Test
    public void IncomeCategoryDeposit()
    {
    	String NewIncmDep= DBIcme.DepositIncome();
    	Assert.assertEquals(NewIncmDep, "New income","Invalid Text");  
    
    }

    
    @AfterTest
    public void teardown()
    {
    //driver.close();
    }

}
