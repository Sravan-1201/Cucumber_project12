package webdriver_project.jan3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class for_validation {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		// capture text in webpage
		String elementText=driver.findElement(By.partialLinkText("Forgot your passwor")).getText();
		System.out.println(elementText);
		// capture element url
		String elementUrl=driver.findElement(By.partialLinkText("Forgot your passwor")).getAttribute("href");
		System.out.println(elementUrl);
		driver.quit();

	}

}
