package driverFactory;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import ornageHrm.pages.AddEmp;
import util.AppUtil;

public class AppTest extends AppUtil {
@Test
public void StartTest()throws Throwable{
	AddEmp emp=PageFactory.initElements(driver, AddEmp.class);
	boolean res=emp.Validate_Emp("Sravan", "Selenium", "playwright");
	Reporter.log("method executed success "+res,true);
}
}
