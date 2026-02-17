package testcases;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Config.AppUtil1;

public class SecondTestNGClass extends AppUtil1 {
@Test(priority = 2)
public void Addition() {
	driver.findElement(By.name("display")).sendKeys("2624");
	driver.findElement(By.xpath("(//input[@id='btn'])[6]")).click();
	driver.findElement(By.name("display")).sendKeys("2624");
	driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
	String addres=driver.findElement(By.name("display")).getAttribute("value");
	Reporter.log("Executing Addition Test Case "+addres,true);
}
@Test(priority = 1)
public void Multiplication() {
	driver.findElement(By.name("display")).sendKeys("2624");
	driver.findElement(By.xpath("(//input[@id='btn'])[16]")).click();
	driver.findElement(By.name("display")).sendKeys("8");
	driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
	String mulres=driver.findElement(By.name("display")).getAttribute("value");
	Reporter.log("Executing Multiplication Test Case "+mulres,true);
}
@Test(priority = 0)
public void division() {
	driver.findElement(By.name("display")).sendKeys("2624");
	driver.findElement(By.xpath("(//input[@id='btn'])[21]")).click();
	driver.findElement(By.name("display")).sendKeys("4");
	driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
	String divres=driver.findElement(By.name("display")).getAttribute("value");
	Reporter.log("Executing Division Test Case "+divres,true);
}
}
