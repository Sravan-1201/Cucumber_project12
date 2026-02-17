package testcases;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Config.AppUtil;

public class FirstTestNGClass extends AppUtil{
@Test
public void admin_click() {
	driver.findElement(By.xpath("//b[normalize-space()='Admin']")).click();
	Reporter.log("Executing Admin TestCase",true);
}
@Test
public void pim_click() {
	driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
	Reporter.log("Executing Pim TestCase",true);
}
@Test
public void leave_click() {
	driver.findElement(By.xpath("//b[normalize-space()='Leave']")).click();
	Reporter.log("Executing Leave TestCase",true);
}
}
