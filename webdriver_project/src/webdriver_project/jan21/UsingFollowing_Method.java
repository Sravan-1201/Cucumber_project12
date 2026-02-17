package webdriver_project.jan21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingFollowing_Method {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//form[@id='reg']//following::input[2]")).sendKeys("Akhilesh");
		driver.findElement(By.xpath("//form[@id='reg']//following::input[3]")).sendKeys("Akhilesh");
		new Select(driver.findElement(By.xpath("//form[@id='reg']//following::select[1]"))).selectByIndex(10);
		new Select(driver.findElement(By.xpath("//form[@id='reg']//following::select[2]"))).selectByIndex(5);
		new Select(driver.findElement(By.xpath("//form[@id='reg']//following::select[3]"))).selectByIndex(50);
		driver.findElement(By.xpath("//form[@id='reg']//following::input[7]")).click();
		driver.findElement(By.xpath("//form[@id='reg']//following::input[10]")).sendKeys("pranga2010@gmail.com");
		driver.findElement(By.xpath("//form[@id='reg']//following::input[12]")).sendKeys("test@1234");
		driver.findElement(By.xpath("//form[@id='reg']//following::input[1]")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
