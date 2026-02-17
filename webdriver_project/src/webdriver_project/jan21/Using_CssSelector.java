package webdriver_project.jan21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_CssSelector {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.cssSelector("#btnLogin")).click();

	}

}
