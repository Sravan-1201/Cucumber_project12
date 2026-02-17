package webdriver_project.jan7;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_multipleitems {
	
		public static void main(String[] args) throws Throwable {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("file:///E:/MultiListboxHtmlpage_lyst1767770603945.html");
			Thread.sleep(5000);
			Select dropdown=new Select(driver.findElement(By.name("multiSelection")));
			//verify dropdown is single or multi selection
			boolean value=dropdown.isMultiple();
			System.out.println(value);
			for(int i=0;i<8;i++) {
				Thread.sleep(5000);
				dropdown.selectByIndex(i);
			}
			//deselect from selection
			dropdown.deselectByVisibleText("White");
			Thread.sleep(5000);
			dropdown.deselectByIndex(5);
			Thread.sleep(5000);
			dropdown.deselectAll();
			Thread.sleep(5000);
			driver.quit();
				
			}


	}


