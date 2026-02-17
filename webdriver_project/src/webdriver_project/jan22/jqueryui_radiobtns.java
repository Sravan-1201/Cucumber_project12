package webdriver_project.jan22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jqueryui_radiobtns {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/checkboxradio/");
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		List<WebElement>all_btns=driver.findElements(By.xpath("//label[@class=\"ui-checkboxradio-label ui-corner-all ui-button ui-widget ui-checkboxradio-radio-label\"]"));
		System.out.println(all_btns.size());
		for (WebElement each : all_btns) {
			System.out.println(each.getText());
		}
		driver.quit();

	}

}
