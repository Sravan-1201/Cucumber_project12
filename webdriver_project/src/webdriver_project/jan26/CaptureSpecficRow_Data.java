package webdriver_project.jan26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureSpecficRow_Data {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/tools/forex");
		Thread.sleep(5000);
		//capture specific row cell data
		String cname = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[2]/td[1]")).getText();
		String crate = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[2]/td[2]")).getText();
		System.out.println(cname+"     "+crate );
		driver.quit();

	}

}
