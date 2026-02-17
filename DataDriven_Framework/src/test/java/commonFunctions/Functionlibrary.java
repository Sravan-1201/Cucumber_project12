package commonFunctions;
import java.time.Duration;
import org.openqa.selenium.By;
import org.testng.Reporter;
import utils.AppUtil;
public class Functionlibrary extends AppUtil{
//method for login
	public static boolean adminLogin(String user,String pass) throws Throwable
	{
		
		driver.get(conpro.getProperty("Url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(conpro.getProperty("Objusername"))).sendKeys(user);
		driver.findElement(By.xpath(conpro.getProperty("Objpassword"))).sendKeys(pass);
		driver.findElement(By.xpath(conpro.getProperty("Objlogin"))).click();
		Thread.sleep(3000);
		String Expected ="dashboard";
		String Actual = driver.getCurrentUrl();
		if(Actual.contains(Expected))
		{
			
			Reporter.log("Login Success",true);
			return true;
		}
		else
		{
			String Error_Message = driver.findElement(By.xpath(conpro.getProperty("ObjErrormessage"))).getText();
			Reporter.log(Error_Message,true);
			return false;
		}
		
		
		
	}
}

