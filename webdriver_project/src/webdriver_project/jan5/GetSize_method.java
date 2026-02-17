package webdriver_project.jan5;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize_method {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		//get username height and width 
		WebElement username = driver.findElement(By.name("txtUsername"));
		Dimension dm=username.getSize();
		System.out.println("Height is  "+dm.getHeight()+"     "+"Width is  "+dm.getWidth());
		//get login button height and width
		WebElement loginbtn = driver.findElement(By.name("Submit"));
		Dimension dm1 = loginbtn.getSize();
		System.out.println("Height is  "+dm1.getHeight()+"     "+"Widght is  "+dm1.getWidth());
		driver.quit();

	}

}
