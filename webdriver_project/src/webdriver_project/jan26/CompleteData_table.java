package webdriver_project.jan26;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompleteData_table {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/tools/forex");
		Thread.sleep(5000);
		//Store table into webelement
		WebElement webtable=driver.findElement(By.className("dataTable"));
		List<WebElement>header=webtable.findElements(By.tagName("th"));
		System.out.println("Headers are "+header.size());
		for (WebElement eachheader : header) {
			System.out.println(eachheader.getText()+"\t");
		}
		//get rows collection
		List<WebElement>rows=webtable.findElements(By.tagName("tr"));
		System.out.println("No of rows "+rows.size());
		for (WebElement eachrow : rows) {
			// get cols collection from each row
			List<WebElement>cols=eachrow.findElements(By.tagName("td"));
			//iterate all cells
			for (WebElement eachcell : cols) {
				System.out.println(eachcell.getText()+"\t");
			}
			System.out.println();
			System.out.println("=====================================");
		}
		driver.quit();

	}

}
