package webdriver_project.jan5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flight_project {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://flights.qedgetech.com/register.html");
		Thread.sleep(5000);
		WebElement Name=driver.findElement(By.xpath("//input[@id='name']"));
		Name.sendKeys("SravanKumar");
		WebElement ContactNumber=driver.findElement(By.xpath("//input[@id='contact']"));
		ContactNumber.sendKeys("7997675702");
		WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
		Email.sendKeys("shravankumar121999@gmail.com");
		WebElement Password=driver.findElement(By.xpath("//*[@id=\"address\"]"));
		Password.sendKeys("Flight@123");
		WebElement Gender=driver.findElement(By.xpath("//select[@name='gender']"));
		Gender.sendKeys("Male");
		WebElement dob=driver.findElement(By.xpath("//input[@id='popupDatepicker']"));
		dob.sendKeys("12-01-1999");
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='flexCheckChecked']"));
		checkbox.click();
		WebElement regbtn=driver.findElement(By.xpath("//input[@name='submit']"));
		regbtn.click();
		driver.quit();

	}

}
