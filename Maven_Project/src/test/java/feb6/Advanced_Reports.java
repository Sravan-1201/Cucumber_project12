package feb6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Advanced_Reports {
ExtentReports reports = new ExtentReports("./target/ExtentReports/Demo.html");
ExtentTest logger;
WebDriver driver;
@BeforeMethod
public void setUp()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://google.com");
}
@Test
public void testpass()
{
	logger = reports.startTest("Pass test");
	logger.assignAuthor("Ranga");
	String Expected ="Google";
	String Actual = driver.getTitle();
	logger.log(LogStatus.INFO,  Expected+"-----------"+Actual);
	if(Actual.equalsIgnoreCase(Expected))
	{
		logger.log(LogStatus.PASS, "Title is Matching");
	}
	else
	{
		logger.log(LogStatus.FAIL, "Title is Not Matching");
	}
	
}
@Test
public void failTest()
{
	logger = reports.startTest("Fail Test");
	logger.assignAuthor("Ranga");
	String Expected ="Gmail";
	String Actual = driver.getTitle();
	logger.log(LogStatus.INFO,  Expected+"-----------"+Actual);
	if(Actual.equalsIgnoreCase(Expected))
	{
		logger.log(LogStatus.PASS, "Title is Matching");
	}
	else
	{
		logger.log(LogStatus.FAIL, "Title is Not Matching");
	}
}
@AfterMethod
public void tearDown()
{
	reports.endTest(logger);
	reports.flush();
	driver.quit();
}
}
