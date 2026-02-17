package ornageHrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminLogout {
@FindBy(xpath="//a[@id='welcome']")
WebElement click_welcome;
@FindBy(xpath="//a[normalize-space()='Logout']")
WebElement click_logout;
public void HRM_Logout()throws Throwable{
	click_welcome.click();
	Thread.sleep(1000);
	click_logout.click();
}

}
