package webdriver_project.dec27;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class source_command {

	public static void main(String[] args) throws Throwable{
		// create instance object
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// launch url
		driver.get("https://google.com");
		Thread.sleep(5000);
		//get source code 
		String str_source=driver.getPageSource();
		System.out.println(str_source);
		driver.quit();

	}

}
