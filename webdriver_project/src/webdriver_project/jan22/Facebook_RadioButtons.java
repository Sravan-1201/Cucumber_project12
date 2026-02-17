package webdriver_project.jan22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_RadioButtons {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(5000);
		List<WebElement>all_radiobtns=driver.findElements(By.xpath("//label[@class=\"_58mt\"]"));
		System.out.println(all_radiobtns.size());
		for (WebElement each : all_radiobtns) {
			System.out.println(each.getText());
		}
		driver.quit();

	}

}
