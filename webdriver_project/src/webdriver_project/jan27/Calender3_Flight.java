package webdriver_project.jan27;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender3_Flight {

	public static void main(String[] args) throws Throwable {
		String dob ="20/February/2026";
		String temp[]= dob.split("/");
		String date = temp[0];
		String month = temp[1];
		String year =temp[2];
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://flights.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("email")).sendKeys("shravankumar121999@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Flight@123");
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		driver.findElement(By.id("search-date")).click();
		//capture calender year
		String calYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		while(!calYear.equals(year))
		{
			driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
			calYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		//capture month from calender
		String calMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		while(!calMonth.equalsIgnoreCase(month))
		{
			driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
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
