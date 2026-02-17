package webdriver_project.jan10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Example1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		Thread.sleep(5000);
		//create object for action class
		Actions ac=new Actions(driver);
		// enter some text
		driver.findElement(By.name("q")).sendKeys("Selenium Openings");
		Thread.sleep(1000);
		for(int i=1;i<=5;i++) {
			//Thread.sleep(1000);
			ac.pause(5000);
			//press down arrow
			ac.sendKeys(Keys.ARROW_DOWN).build().perform();
		}
		Thread.sleep(5000);
		// create enter key in keyboard
		ac.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
		driver.quit();

	}

}
