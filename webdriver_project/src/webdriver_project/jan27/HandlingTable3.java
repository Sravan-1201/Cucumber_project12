package webdriver_project.jan27;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable3 {

	public static void main(String[] args)throws Throwable {
		String Expected_Country ="canada";
		boolean item_Exist =false;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(5000);
		WebElement webtable = driver.findElement(By.cssSelector("table.ws-table-all"));
		List<WebElement> headers = webtable.findElements(By.tagName("th"));
		for (WebElement eachheader : headers) {
			System.out.print(eachheader.getText()+"\t");
		}
		//get rows collection from webtable
		List<WebElement> rows = webtable.findElements(By.tagName("tr"));
		System.out.println("No of rows are::"+rows.size());
		//iterate all rows
		for(int i=1;i<rows.size();i++)
		{
			//get cell collection from each row
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			//iterate all cell 
			for(int j=0;j<cols.size();j++)
			{
				//get each row cell data
				String Actual_data = cols.get(j).getText();
				System.out.println(Actual_data);
				if(Actual_data.equalsIgnoreCase(Expected_Country))
				{
					System.out.println("Country Found In Row No."+i+"     "+"Cell No."+(j+1));
					item_Exist=true;
				}
			}
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		}
		if(item_Exist)
		{
			System.out.println("Country Found in table   "+Expected_Country+"    "+"Test pass");
		}
		else
		{
			System.out.println("Country Not Found in table   "+Expected_Country+"    "+"Test Fail");
		}
		driver.quit();
	}


	}


