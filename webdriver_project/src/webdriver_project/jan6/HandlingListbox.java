package webdriver_project.jan6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListbox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(5000);
		//store day ,month and year listboxes into select class
		Select daylist=new Select(driver.findElement(By.id("day")));
		Select monthlist=new Select(driver.findElement(By.id("month")));
		Select yearlist=new Select(driver.findElement(By.id("year")));
		//verify day listbox is single or multi selection
		boolean value=daylist.isMultiple();
		System.out.println(value);
		daylist.selectByVisibleText("20");
		Thread.sleep(5000);
		monthlist.selectByIndex(10);
		System.out.println(monthlist.getFirstSelectedOption().getText());
		Thread.sleep(5000);
		yearlist.selectByVisibleText("1978");
		Thread.sleep(5000);
		daylist.selectByIndex(25);
		System.out.println(daylist.getFirstSelectedOption().getText());
		Thread.sleep(5000);
		monthlist.selectByVisibleText("Aug");
		Thread.sleep(5000);
		yearlist.selectByIndex(100);
		System.out.println(yearlist.getFirstSelectedOption().getText());
		Thread.sleep(5000);
		driver.quit();
	



	}

}
