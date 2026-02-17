package Config;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class AppUtil {
public static WebDriver driver;
@BeforeTest
public static void setUP() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://orangehrm.qedgetech.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
	driver.findElement(By.name("Submit")).click();
	Reporter.log("Running in BeforeTest",true);
}
@AfterTest
public static void tearDown() {
	driver.quit();
	Reporter.log("Running in AfterTest",true);
}
}
