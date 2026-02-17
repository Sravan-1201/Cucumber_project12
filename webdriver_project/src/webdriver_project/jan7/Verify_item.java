package webdriver_project.jan7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_item {

	public static void main(String[] args) throws Throwable {
		String Item_Present ="india";
		boolean Item_Exist =false;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://practice.expandtesting.com/dropdown");
		Thread.sleep(5000);
		Select dropdown=new Select(driver.findElement(By.name("country")));
		List<WebElement>all_Options=dropdown.getOptions();
		System.out.println("No.of items "+all_Options.size());
		for (WebElement each : all_Options) {
			String Actual_items=each.getText();
			Thread.sleep(500);
			System.out.println(Actual_items);
			if(Actual_items.equalsIgnoreCase(Item_Present)) {
				Item_Exist=true;
				break;
			}
		}
		if(Item_Exist)//true/false
		{
			System.out.println("Item found in Listbox "+Item_Present+" "+"TestPass");
		}
		else {
			System.out.println("Item not found in Listbox "+Item_Present+" "+"TestFail");
		}
		Thread.sleep(5000);
		driver.quit();

	}

}
