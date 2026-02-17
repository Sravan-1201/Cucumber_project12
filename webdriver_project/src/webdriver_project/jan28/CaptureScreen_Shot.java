package webdriver_project.jan28;

import java.io.File;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreen_Shot {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://webapp.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("btnreset")).click();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("master2");
		driver.findElement(By.name("btnsubmit")).click();
		//create java timestamp
		DateFormat df = new SimpleDateFormat("YYYY_MM_dd hh_mm_ss");
		Date date = new Date();
		String datef = df.format(date);
		String Expected ="dashboard";
		String Actual = driver.getCurrentUrl();
		if(Actual.contains(Expected))
		{
			System.out.println("Login success");
		}
		else
		{
			Thread.sleep(2000);
		//take screen shot and store into one variable
			File screen =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//copy screen shot into local system
			FileUtils.copyFile(screen, new File("E:/Automation ScreenShot/"+datef+"----"+"Homepage.png"));
			System.out.println("Login Fail");
		}
		
driver.quit();


	}

}
