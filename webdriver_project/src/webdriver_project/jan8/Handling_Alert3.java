package webdriver_project.jan8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Alert3 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		driver.switchTo().alert().sendKeys("Hello Selenium");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		String webtext=driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println(webtext);
		Thread.sleep(5000);
		driver.quit();

	}

}
