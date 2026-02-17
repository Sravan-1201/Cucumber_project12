package webdriver_project.jan8;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_WindowHandling {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(5000);
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.xpath("(//a[@target='_blank'])[2]")).click();
		driver.findElement(By.xpath("(//a[@target='_blank'])[3]")).click();
		driver.findElement(By.xpath("(//a[@target='_blank'])[4]")).click();
		Set<String>allwins=driver.getWindowHandles();
		System.out.println(allwins);
		for (String each : allwins) {
			if(!parent.equals(each)) {
				Thread.sleep(1000);
				driver.switchTo().window(each);
				System.out.println(driver.getTitle());
				Thread.sleep(5000);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		Thread.sleep(5000);
		Set<String>year=driver.getWindowHandles();
		String year_list="T";
		for (String each : year) {
			year_list=each;
			driver.switchTo().window(year_list);
			WebElement year_dropdown=driver.findElement(By.id("year"));
			Select year_select=new Select(year_dropdown);
			List<WebElement>all_years=year_select.getOptions();
			System.out.println("years_count: "+all_years.size());
			System.out.println("avaliable_years");
			for (WebElement list : all_years) {
				System.out.println(list.getText());
			}
			driver.quit();
				
		}

	}

}
