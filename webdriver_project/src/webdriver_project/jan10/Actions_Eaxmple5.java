package webdriver_project.jan10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Eaxmple5 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Fashion')]"))).perform();
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.linkText("All"))).click().perform();
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Electronics']"))).perform();
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.linkText("Apple"))).click().perform();
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Baby & Kids']"))).perform();
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.linkText("Puzzles"))).click().perform();
		Thread.sleep(5000);
		driver.quit();

	}

}
