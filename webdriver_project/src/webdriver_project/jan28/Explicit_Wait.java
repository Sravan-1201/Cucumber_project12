package webdriver_project.jan28;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://webapp.qedgetech.com/");
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(200));
		//wait until resset button clickable
		mywait.until(ExpectedConditions.elementToBeClickable(By.name("btnreset")));
		driver.findElement(By.name("btnreset")).click();
		//wait until username textbox is visible
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("master");
		driver.findElement(By.name("btnsubmit")).click();
		mywait.until(ExpectedConditions.textToBe(By.cssSelector("#ewPageCaption"), "Dashboard"));
		String elementtext = driver.findElement(By.cssSelector("#ewPageCaption")).getText();
		System.out.println(elementtext);
		driver.quit();


	}

}
