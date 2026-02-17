package webdriver_project.jan7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class verifyExistorNot {

	public static void main(String[] args) throws Throwable {
		String month_Present ="Aug";
		boolean month_Exist =false;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(5000);
		Select dropdown=new Select(driver.findElement(By.name("birthday_month")));
		List<WebElement>all_months=dropdown.getOptions();
		for (WebElement each : all_months) {
			String Actual_month=each.getText();
			Thread.sleep(500);
			System.out.println(Actual_month);
			if(Actual_month.equalsIgnoreCase(month_Present)) {
				month_Exist=true;
				break;
			}
		}
		if(month_Exist) {
			System.out.println("month found in listbox "+month_Present+" "+"TestPass");
		}
		else {
			System.out.println("month not found in listbox"+month_Present+" "+"TestFail");
		}
		Thread.sleep(5000);
		driver.quit();

	}

}
