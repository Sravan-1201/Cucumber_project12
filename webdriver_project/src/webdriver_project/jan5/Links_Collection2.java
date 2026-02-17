package webdriver_project.jan5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_Collection2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		//driver.get("https://rediff.com");
		Thread.sleep(5000);
		//get collection of links in webpage which are stored in html tag <a>
				List<WebElement> all_Links = driver.findElements(By.tagName("a"));
				System.out.println("no of links  "+all_Links.size());
				//iterate all links
				for (WebElement each : all_Links) {
					System.out.println(each.getText());
					//print each link url
					System.out.println(each.getAttribute("href"));
					
				}
				driver.quit();
	}
		

}
