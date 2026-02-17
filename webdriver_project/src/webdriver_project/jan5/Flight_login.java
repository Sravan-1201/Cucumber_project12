package webdriver_project.jan5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flight_login {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://flights.qedgetech.com/");
		Thread.sleep(5000);
		WebElement Email_id=driver.findElement(By.xpath("//input[@placeholder='Email ID']"));
		Email_id.sendKeys("shravankumar121999@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("Flight@123");
		WebElement signIn=driver.findElement(By.xpath("//button[normalize-space()='Sign In']"));
		signIn.click();
		driver.quit();

	}

}
