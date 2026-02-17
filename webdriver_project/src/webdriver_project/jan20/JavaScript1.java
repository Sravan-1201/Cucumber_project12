package webdriver_project.jan20;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.location='http://orangehrm.qedgetech.com/'");
		Thread.sleep(5000);
		js.executeScript("document.querySelector('#txtUsername').value='Admin2'");
		js.executeScript("document.getElementById('txtPassword').value='Qedge123!@#'");
		js.executeScript("document.querySelector('#btnLogin').click()");
		Thread.sleep(2000);
		String Excepted="dashboard";
		String Actual=js.executeScript("return document.URL").toString();
		if(Actual.contains(Excepted)) {
			System.out.println("LoginSucess"+"TestPass");
		}
		else {
			String error_message=js.executeScript("return document.querySelector('#spanMessage').innerHTML").toString();
			System.out.println(error_message+" "+"TestFail");
		}
		Thread.sleep(5000);
		driver.quit();

	}

}
