package webdriver_project.jan8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Alerts2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(5000);
		//click for js script
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		//capture alert text
		String Alert_message = driver.switchTo().alert().getText();
		System.out.println(Alert_message);
		Thread.sleep(3000);
		//click cancel
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		//capture web text
		String webtext=driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println(webtext);
		Thread.sleep(5000);
		driver.quit();

	}

}
