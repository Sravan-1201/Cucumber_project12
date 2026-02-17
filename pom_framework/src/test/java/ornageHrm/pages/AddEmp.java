package ornageHrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AddEmp {
WebDriver driver;
public AddEmp(WebDriver dr) {
	this.driver=dr;
}
//Define OR
@FindBy(xpath="//b[normalize-space()='PIM']")
WebElement click_pim;
@FindBy(xpath="//input[@id='btnAdd']")
WebElement click_Add;
@FindBy(xpath="//input[@id='firstName']")
WebElement objfname;
@FindBy(xpath="//input[@id='middleName']")
WebElement objmname;
@FindBy(xpath="//input[@id='lastName']")
WebElement objlname;
@FindBy(xpath="//input[@id='employeeId']")
WebElement employee_id;
@FindBy(xpath="//input[@id='btnSave']")
WebElement click_save;
@FindBy(xpath="//input[@id='personal_txtEmployeeId']")
WebElement eid;
public boolean Validate_Emp(String firstname,String middlename,String lastname) throws Throwable
{
this.click_pim.click();
Thread.sleep(1000);
this.click_Add.click();
this.objfname.sendKeys(firstname);
this.objmname.sendKeys(middlename);
this.objlname.sendKeys(lastname);
String Excepted_Eid=this.employee_id.getAttribute("value");
this.click_save.click();
Thread.sleep(2000);
String Actual_eid=this.eid.getAttribute("value");
if(Excepted_Eid.equals(Actual_eid)) {
	Reporter.log("Add Employee success "+Excepted_Eid+"  "+Actual_eid,true);
	return true;
}

else {
	Reporter.log("Add Employee unsuccess "+Excepted_Eid+"  "+Actual_eid,true);
	return false;
}
}
}

