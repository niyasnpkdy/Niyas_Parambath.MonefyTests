package MyAppiumTest.Monefy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EmptyFileException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class MonefyApp 
{
	
 public static AppiumDriver<MobileElement> driver;
 
 public static DesiredCapabilities cps;
 
 public static URL url;
 
 public static Properties prop;	
 	;
 
	public MonefyApp() throws IOException 
	{
			
		prop=new Properties();  
		FileInputStream ip = new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\Monefy\\src\\main\\java\\com\\monefy\\config\\Config.properties");  
   		prop.load(ip);  
   		
	}
	
    public static void main( String[] args )
    {
    
    	/*try
    	{
    	OpenMonefyApp();
    	}catch(Exception exp) {
    		 System.out.println( exp.getCause() );
    		 System.out.println(exp.getMessage());
    		 exp.printStackTrace();
    	}*/
        
     }
    
   
    
    public static void OpenMonefyApp() throws MalformedURLException 
    {
    	
    	cps=new DesiredCapabilities();
    	url = new URL("http://127.0.0.1:4723/wd/hub");
    	cps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A30");
    	cps.setCapability(MobileCapabilityType.UDID, "RZ8M63QAJMT");
		cps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
		cps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cps.setCapability("appPackage","com.monefy.app.lite");
		cps.setCapability("appActivity","com.monefy.activities.main.MainActivity_");
		driver = new AppiumDriver<MobileElement>(url,cps);
		
		
		 System.out.println( "Set up Ready" );
		
		
    }
    
    public static boolean IsMonefyAppOpen()
    {
    	
    	boolean TOF = driver.findElement(By.xpath("//android.widget.TextView[@text='EXPENSE']")).isEnabled();
    	return TOF;
    }

    
    
    
    
    
    
    
}
