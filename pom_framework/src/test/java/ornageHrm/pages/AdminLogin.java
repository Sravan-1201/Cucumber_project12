package ornageHrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AdminLogin {
WebDriver driver;
// write constructor
public AdminLogin(WebDriver dr) {
	this.driver=dr;
}
// define repositry
@FindBy(name="txtUsername")
WebElement username;
@FindBy(xpath="//input[@id='txtPassword']")
WebElement objpass;
@FindBy(id="btnLogin")
WebElement objlogin;
//write a method for login
public void HRM_Login(String username,String password) {
	this.username.sendKeys(username);
	this.objpass.sendKeys(password);
	this.objlogin.click();
	String Excepted="dashboard";
	String Actual=driver.getCurrentUrl();
	if(Actual.contains(Excepted)) {
		Reporter.log("Login sucess",true);
	}
	else {
		Reporter.log("Login Unsuccess",true);
	}
}

}
