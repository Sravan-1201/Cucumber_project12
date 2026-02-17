package feb6;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UsingProperties {
	Properties conpro;
	WebDriver driver;
	@Test
	public void adminLogin()throws Throwable
	{
		conpro = new Properties();
		//load file
		conpro.load(new FileInputStream("Login.properties"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(conpro.getProperty("Url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(conpro.getProperty("ObjUser"))).sendKeys(conpro.getProperty("username"));
		driver.findElement(By.xpath(conpro.getProperty("Objpass"))).sendKeys(conpro.getProperty("password"));
		driver.findElement(By.xpath(conpro.getProperty("ObjLogin"))).click();
		driver.quit();
		
	}
	}


