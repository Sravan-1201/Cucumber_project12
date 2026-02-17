package webdriver_project.jan22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBocCollection {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/checkboxradio/");
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		List<WebElement>all_checks=driver.findElements(By.xpath("//label[@class='ui-checkboxradio-label ui-corner-all ui-button ui-widget']"));
		System.out.println(all_checks.size());
		for (WebElement each : all_checks) {
			System.out.println(each.getText());
		}
		driver.quit();
	}

}
