package webdriver_project.dec30;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrl {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://gmail.com");
		Thread.sleep(5000);
		String Excepted="https://";
		String Actual=driver.getCurrentUrl();
		if(Actual.startsWith(Excepted)) {
			System.out.println("url is secured "+Excepted+" "+Actual+"Test Pass");
		}
		else {
			System.out.println("url is not secured "+Excepted+" "+Actual+" "+"Test Fail");
		}
		driver.quit();

	}

}
