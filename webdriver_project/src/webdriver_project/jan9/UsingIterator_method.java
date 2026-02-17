package webdriver_project.jan9;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIterator_method {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(5000);
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.xpath("(//a[@target='_blank'])[61]")).click();
		driver.findElement(By.xpath("(//a[@target='_blank'])[62]")).click();
		driver.findElement(By.xpath("(//a[@target='_blank'])[63]")).click();
		driver.findElement(By.xpath("(//a[@target='_blank'])[64]")).click();
		//get collection all window ids
		Set<String>allwins=driver.getWindowHandles();
		System.out.println(allwins);
		//Iterator all windows
		Iterator<String>brw=allwins.iterator();
		while(brw.hasNext()) {
			String eachwin=(String)brw.next();
			if(!parent.equals(eachwin)) {
				Thread.sleep(5000);
				driver.switchTo().window(eachwin);
				System.out.println(driver.getTitle());
				Thread.sleep(5000);
				driver.close();
				
			}
		}
		Thread.sleep(5000);
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.quit();

	}

}
