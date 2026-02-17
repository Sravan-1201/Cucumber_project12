package util;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import ornageHrm.pages.AdminLogin;
import ornageHrm.pages.AdminLogout;

public class AppUtil {
public static WebDriver driver;
@BeforeTest
public static void setUp() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("http://orangehrm.qedgetech.com/");
	AdminLogin login=PageFactory.initElements(driver, AdminLogin.class);
	login.HRM_Login("Admin", "Qedge123!@#");
}
@AfterTest
public static void tearDown() throws Throwable {
	AdminLogout logout=PageFactory.initElements(driver, AdminLogout.class);
	logout.HRM_Logout();
	driver.quit();
}
}
