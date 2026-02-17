package webdriver_project.jan19;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_RobotActions {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("Gmail"))).perform();
		//right click on gmail link
		ac.contextClick().perform();
		Thread.sleep(3000);
		//create object for robot class
		Robot r=new Robot();
		//press down arrow for two times
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		//click enter key
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		//get all window ids
		Set<String>allwins=driver.getWindowHandles();
		Object brw[]=allwins.toArray();
		String parent=brw[0].toString();
		String child=brw[1].toString();
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();

	}

}
