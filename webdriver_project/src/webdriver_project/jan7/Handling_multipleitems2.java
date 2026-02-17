package webdriver_project.jan7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_multipleitems2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///E:/MultiListboxHtmlpage_lyst1767770603945.html");
		Thread.sleep(5000);
		Select dropdown=new Select(driver.findElement(By.name("multiSelection")));
		//get collection of all items
		List<WebElement>all_Options=dropdown.getOptions();
		System.out.println("No.of items "+all_Options.size());
		//select some items
		for(int i=0;i<=10;i++) {
			Thread.sleep(5000);
			dropdown.selectByIndex(i);
		}
		//get collection of items which are selected above
		List<WebElement>all_Selected=dropdown.getAllSelectedOptions();
		System.out.println("No of items Selected"+all_Selected.size());
		//print each option name which are selected above
		for (WebElement each : all_Selected) {
			System.out.println(each.getText());
		}
		Thread.sleep(5000);
		driver.quit();


	}

}
