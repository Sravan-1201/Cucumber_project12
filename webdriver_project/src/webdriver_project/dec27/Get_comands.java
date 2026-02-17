package webdriver_project.dec27;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_comands {

	public static void main(String[] args) throws Throwable{
		// create instance object
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// delete all cookies
		driver.manage().deleteAllCookies();
		// launch url
		driver.get("http://flipkart.com");
		// suspended tool for 5 sec
		Thread.sleep(5000);
		//print title of the page and print length of title
		String page_title = driver.getTitle();
		System.out.println(page_title.length());
		//print url and length of url
		String str_url=driver.getCurrentUrl();
		System.out.println(str_url.length());
		//suspended tool for 5 sec
		Thread.sleep(5000);
		// kill opened browser
		driver.quit();

	}

}
