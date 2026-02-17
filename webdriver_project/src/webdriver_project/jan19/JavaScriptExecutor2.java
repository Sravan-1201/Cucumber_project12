package webdriver_project.jan19;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location='https:/tatacliq.com/'");
		Thread.sleep(5000);
		//scroll top to bottom vertically
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		//scroll bottom to top vertically
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(5000);
		//scroll to certain pixel
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		driver.quit();

	}

}
