package webdriver_project.jan9;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcSpecfic_Window {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
		Set<String>irctc=driver.getWindowHandles();
		Object windows[]=irctc.toArray();
		String parent=windows[0].toString();
		String child=windows[1].toString();
		Thread.sleep(1000);
		driver.switchTo().window(child);
		String visibleText=driver.findElement(By.xpath("//img[@alt='air-logo.png']")).getText();
		System.out.println(visibleText);
		Thread.sleep(1000);
		driver.close();
		driver.switchTo().window(parent);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-label='Enter From station. Input is Mandatory.']")).sendKeys("JN - SC (SECUNDERABAD)");
		driver.findElement(By.xpath("//input[@aria-label='Enter To station. Input is Mandatory.']")).sendKeys("VIJAYAWADA JN - BZA (VIJAYAWADA)");
		Thread.sleep(1000);
		driver.quit();

	}

}
