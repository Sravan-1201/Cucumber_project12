package webdriver_project.jan26;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/tools/forex");
		Thread.sleep(5000);
		//store table into Webelement
		WebElement webtable = driver.findElement(By.className("dataTable"));
		//get rows collection from webtable
		List<WebElement> rows = webtable.findElements(By.tagName("tr"));
		int row =rows.size()-1;
		System.out.println("No of rows are::"+row);
		//iterate all rows within table
		for(int i=1;i<rows.size();i++)
		{
			//get cell size from each row
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			System.out.println("Row No."+i+"      "+"Column No"+"   "+cols.size());
		}
		driver.quit();


	}

}
