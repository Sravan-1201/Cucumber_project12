package webdriver_project.jan22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinks {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://facebook.com");
		Thread.sleep(5000);
		//get footers collection
		List<WebElement>footer_links=driver.findElements(By.cssSelector("#pageFooterChildren ul li a"));
		System.out.println("No of footer links are:"+footer_links.size());
		for (WebElement each : footer_links) {
			System.out.println(each.getText());
			System.out.println(each.getAttribute("href"));
		}
		driver.quit();

	}

}
