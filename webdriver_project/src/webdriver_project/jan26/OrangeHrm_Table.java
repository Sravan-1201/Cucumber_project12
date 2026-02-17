package webdriver_project.jan26;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm_Table {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);

		//login ghrm webpage
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin"); driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Qedge123!@#");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(2000);
		//click on admin link
		driver.findElement(By.linkText("Admin")).click();
		//store table into webelement
		//WebElement webTable = driver.findElement(By.cssSelector(".table.hover")); 
		WebElement webTable= driver.findElement(By.xpath("//table [@id='resultTable']")); 
		//get collection from webTable
		List<WebElement> header = webTable.findElements (By.tagName("th")); 
		System.out.println("Header are "+header.size());
		for (WebElement eachheader : header) {
			System.out.println(eachheader.getText()+"\t");
		}
		//get row collection
		List<WebElement> rows = webTable.findElements (By.tagName("tr")); 
		System.out.println("No of rows"+rows.size());
		for (WebElement eachrow : rows) {
		//get cols collection from each row
		List<WebElement> cols = eachrow.findElements (By.tagName("td"));
		 //iterate all cells
		for (WebElement eachcell: cols) {
			System.out.println(eachcell.getText()+"\t");
		}
		System.out.println();
		System.out.println("===============================");
		}
		driver.quit();

	}

}
