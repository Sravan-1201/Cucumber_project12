package webdriver_project.jan8;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Window {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com");
		Thread.sleep(5000);
		// get parent window id
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		// click three links to open in new tabs
		driver.findElement(By.xpath("(//a[@target='_blank'])[2]")).click();
		driver.findElement(By.xpath("(//a[@target='_blank'])[3]")).click();
		driver.findElement(By.xpath("(//a[@target='_blank'])[4]")).click();
		//get all window id
		Set<String>allwins=driver.getWindowHandles();
		System.out.println(allwins);
		for (String each : allwins) {
			//parent should not be equal to child window
			if(!parent.equals(each)) {
				Thread.sleep(1000);
				// switch to child window
				driver.switchTo().window(each);
				System.out.println(driver.getTitle());
				Thread.sleep(5000);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		Thread.sleep(5000);
		driver.findElement(By.name("identifier")).sendKeys("pranga2010");
		Thread.sleep(5000);
		driver.quit();

	}

}
