package webdriver_project.jan19;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='https://tatacliq.com'");
		Thread.sleep(4000);
		//print title and length of title
		String page_title=js.executeScript("return document.title").toString();
		System.out.println(page_title);
		System.out.println(page_title.length());
		// print url and length of url
		String str_url=js.executeScript("return document.URL").toString();
		System.out.println(str_url);
		System.out.println(str_url.length());
		//print domain and length of domain
		String str_domain=js.executeScript("return document.domain").toString();
		System.out.println(str_domain);
		System.out.println(str_domain.length());
		driver.quit();

	}

}
