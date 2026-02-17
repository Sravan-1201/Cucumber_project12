package webdriver_project.jan10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Example2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
		Actions ac= new Actions(driver);
		driver.findElement(By.id("gh-cat")).click();
		Thread.sleep(5000);
		for(int i=1;i<=10;i++) {
			ac.pause(2000);
			ac.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(5000);
		ac.sendKeys(Keys.ENTER).perform();
		ac.pause(2000);
		driver.quit();

	}

}
