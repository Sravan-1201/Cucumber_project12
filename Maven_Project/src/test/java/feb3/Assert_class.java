package feb3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assert_class {
	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
	}
	@Test(dataProvider = "dp")
	public void adminLogin(String user,String pass) throws Throwable {
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("txtUsername")).sendKeys(user);
		driver.findElement(By.name("txtPassword")).sendKeys(pass);
		driver.findElement(By.name("Submit")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		String Expected ="http://orangehrm.qedgetech.com/symfony/web/index.php/dashboard";
		String Actual = driver.getCurrentUrl();
		try {
			
			Assert.assertEquals(Actual, Expected, "Login Fail");
		} catch (AssertionError e) {
			String Error_message = driver.findElement(By.id("spanMessage")).getText();
			Reporter.log(Error_message,true);
		}
		
	}
	@DataProvider
	public Object[][] dp() {
		//store login data to supply to test method
		Object login[][]= {
				{"Admin","Qedge123!@#"},
				{"test","Qedge123!@#"},
				{"Admin","Qedge"},
				{"","Qedge123!@#"},
				{"Admin",""},
				{"Qedge","Admin"},
				{"Admin","Qedge123!@#"}};
		return login;
	}
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
