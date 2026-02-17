package webdriver_project.jan10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Example4 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Create account']"))).click().perform();
		Thread.sleep(2000);
		for(int i=1;i<=3;i++) {
			ac.pause(3000);
			ac.sendKeys(Keys.ARROW_UP).perform();
		}
		Thread.sleep(2000);
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.id("firstName")).sendKeys("Akhilesh");
		Thread.sleep(2000);
		ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Next']"))).click().perform();
		Thread.sleep(5000);
		driver.quit();

	}

}
