package webdriver_project.jan7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook_Handling {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(5000);
		//store listbox into daylist class
		Select daylistbox=new Select(driver.findElement(By.name("birthday_day")));
		//Select monthlistbox=new Select(driver.findElement(By.name("")));
		//Select yearlistbox=new Select(driver.findElement(By.name("")));
		//get collection all optins inside listbox
		List<WebElement>all_Options1=daylistbox.getOptions();
		System.out.println("No of items "+all_Options1.size());
		for (WebElement each : all_Options1) {
			System.out.println(each.getText());
			
		}
		driver.quit();

	}

}
