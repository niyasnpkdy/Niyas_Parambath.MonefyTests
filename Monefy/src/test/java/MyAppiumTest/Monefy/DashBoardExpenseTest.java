package MyAppiumTest.Monefy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.monefy.pages.DashboardExpense;
import com.monefy.pages.DashboardIncome;
import com.monefy.pages.ExpenseCategories;


public class DashBoardExpenseTest extends MonefyApp {
	
	
	DashboardExpense DBexp;
	
	
	public DashBoardExpenseTest() throws IOException {
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
    public void DashboardExpenseButton()
    {
    	
	   String Nwexp=   DBexp.ExpensetoBillsCategory();
    	
        
       Assert.assertEquals(Nwexp, "New expense","Invalid Text");
        
    }
    
    
    
    @AfterTest
    public void teardown()
    {
    	//driver.close();
    }

}
