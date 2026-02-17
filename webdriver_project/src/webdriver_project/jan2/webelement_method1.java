package webdriver_project.jan2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement_method1 {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/");
	    Thread.sleep(5000);
	    //fill username,password & login button
	    driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
	    driver.findElement(By.name("Submit")).click();
	    Thread.sleep(5000);
	    driver.quit();

	}

}
