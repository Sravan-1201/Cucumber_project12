package webdriver_project.jan6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_listbox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(5000);
		Select categeory=new Select(driver.findElement(By.id("searchDropdownBox")));
		categeory.selectByVisibleText("Appliances");
		System.out.println(categeory.getFirstSelectedOption().getText());
		List<WebElement>categeoryElements=driver.findElements(By.tagName("select"));
		System.out.println(categeoryElements.size());
		driver.quit();


	}

}
