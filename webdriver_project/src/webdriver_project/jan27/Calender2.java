package webdriver_project.jan27;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender2 {

	public static void main(String[] args) throws Throwable {
		String dob ="20/July/2021";
		String temp[]= dob.split("/");
		String date = temp[0];
		String month = temp[1];
		String year =temp[2];
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		//capture calender year
		String calYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		while(!calYear.equals(year))
		{
			driver.findElement(By.xpath("//span[contains(text(),'Prev')]")).click();
			calYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		//capture month from calender
		String calMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		while(!calMonth.equalsIgnoreCase(month))
		{
			driver.findElement(By.xpath("//span[contains(text(),'Prev')]")).click();
			calMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		
		WebElement webtable = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> rows = webtable.findElements(By.tagName("tr"));
		for (WebElement eachrow : rows) {
			List<WebElement> cols = eachrow.findElements(By.tagName("td"));
			for (WebElement eachcell : cols) {
				if(eachcell.getText().equals(date))
				{
					eachcell.click();
				}
				
			}
		}
        driver.quit();
	}

}