
package MyAppiumTest.Monefy;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import com.monefy.pages.ExpenseCategories;


public class ExpenseCategoriesTest extends MonefyApp
{
	
	ExpenseCategories Expcat;
	
	public ExpenseCategoriesTest() throws IOException
	{
		super();
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
    public void AddCarItem()
    {
    	Expcat.AddCar();
    	    	
     
    }
    
    @Test
    public void AddClothsItem()
    {
    	Expcat.AddCloths();
    	    	
       
    }
    
    @Test
    public void AddEntertainmentItem()
    {
    	Expcat.AddEntertainment();
    	    	
       
    }
    

    @AfterTest
    public void teardown()
    {
    	//driver.close();
    }
    
    
}
