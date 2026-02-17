package webdriver_project.jan10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Example3 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(4000);
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//button[normalize-space()='OK']")));
		ac.click().perform();
		Thread.sleep(4000);
		ac.moveToElement(driver.findElement(By.xpath("//input[@aria-label='Enter From station. Input is Mandatory.']"))).sendKeys("hy");
		Thread.sleep(1000);
		for(int i=1;i<=3;i++) {
			Thread.sleep(4000);
			ac.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@aria-label='Enter To station. Input is Mandatory.']")).sendKeys("ma");
		Thread.sleep(1000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		for(int i=1;i<=3;i++) {
			Thread.sleep(4000);
			ac.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);
		driver.quit();

	}

}
