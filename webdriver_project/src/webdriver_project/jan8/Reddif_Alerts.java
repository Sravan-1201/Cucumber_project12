package webdriver_project.jan8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Reddif_Alerts {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/form/button")).click();
		String Alert_Message=driver.switchTo().alert().getText();
		System.out.println(Alert_Message);
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.quit();

	}

}
