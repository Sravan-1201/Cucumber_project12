package webdriver_project.jan8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Handling_Alerts1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(5000);	
		//click for js script
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		// capture alert text
		String Alert_Message=driver.switchTo().alert().getText();
		System.out.println(Alert_Message);
		Thread.sleep(3000);
		//Click ok alert
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		//capture text from webpage
		String resultmess=driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println(resultmess);
		Thread.sleep(5000);
		driver.quit();
		

	}

}
