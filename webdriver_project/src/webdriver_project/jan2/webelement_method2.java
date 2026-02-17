package webdriver_project.jan2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement_method2 {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.clear();
		username.sendKeys("Admin");
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.clear();
		password.sendKeys("Qedge123!@#");
		WebElement loginbtn=driver.findElement(By.id("btnLogin"));
		//loginbtn.submit();
		loginbtn.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.quit();

	}

}
