package webdriver_project.jan3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_webelement {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.clear();
		username.sendKeys("Ranga");
		// capture username value
		String uservalue=username.getAttribute("value");
		System.out.println(uservalue);
		WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.clear();
		password.sendKeys("Qedge123!@#");
		String passvalue=password.getAttribute("value");
		System.out.println(passvalue);
		WebElement loginbtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
		loginbtn.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		String Excepted="dashboard";
		String Actual=driver.getCurrentUrl();
		if(Actual.contains(Excepted)) {
			System.out.println("LoginSuccess "+Excepted+" "+Actual+" "+"TestPass");
		}
		else {
			String error_message=driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
			System.out.println(error_message+" "+Excepted+" "+Actual+" "+"TestFail");
		}
		driver.quit();

	}

}
