package webdriver_project.dec30;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyTitle {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		Thread.sleep(5000);
		String Excepted_Title = "google";
		// Get title in runtime
		String Actual_Title=driver.getTitle();
		if(Actual_Title.equalsIgnoreCase(Excepted_Title)) {
			System.out.println("Title is matching "+Excepted_Title+" "+Actual_Title+" "+"Test Pass");
		}
		else {
			System.out.println("Title is not matching"+Excepted_Title+" "+Actual_Title+" "+"Test Fail");
		}
		driver.quit();

	}

}
