package webdriver_project.jan7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ebay_handlinglistbox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.ebay.com/");
		Thread.sleep(5000);
		//store listbox into select class
		Select categeorylistbox=new Select(driver.findElement(By.name("_sacat")));
		//get collection all optins inside listbox
		List<WebElement>all_Options=categeorylistbox.getOptions();
		System.out.println("No of items "+all_Options.size());
		for (WebElement each : all_Options) {
			System.out.println(each.getText());
			
		}
		driver.quit();

	}

}
