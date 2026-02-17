package webdriver_project.jan19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop_example1 {
	public static void main(String[] args) throws Throwable{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://the-internet.herokuapp.com/drag_and_drop");
	Thread.sleep(5000);
	Actions ac = new Actions(driver);
	WebElement source=driver.findElement(By.id("column-a"));
	WebElement target=driver.findElement(By.id("column-b"));
	ac.dragAndDrop(source, target).build().perform();

  }
}