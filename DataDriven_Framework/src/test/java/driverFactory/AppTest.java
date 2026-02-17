package driverFactory;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import commonFunctions.Functionlibrary;
import utils.AppUtil;
import utils.ExcelFileUtils;

public class AppTest extends AppUtil{
	String inputpath ="./DataTables/TestData.xlsx";
	String outputpath ="./DataTables/DataDrivenResuls.xlsx";
	ExtentReports reports;
	ExtentTest logger;
	@Test
	public void startTest() throws Throwable
	{
		//define path to generate HTMl Report under target folder
		reports = new ExtentReports("./target/dataDriven/Login.html");
		//create reference object for Excelfileutil class
		ExcelFileUtils xl = new ExcelFileUtils(inputpath);
		//count no of rows in a sheet
		int rc = xl.rowCount("Sheet1");
		Reporter.log("No of rows are  "+rc,true);
		for(int i=1;i<=rc;i++)
		{
			logger = reports.startTest("Validate Login Test");
			logger.assignAuthor("Ranga");
			//read username and password cell from excel
			String username = xl.getCellData("Sheet1", i, 0);
			String password = xl.getCellData("Sheet1", i, 1);
			logger.log(LogStatus.INFO,username+"------------"+password);
			//call login method from functionlibrary claas
			boolean res = Functionlibrary.adminLogin(username, password);
			if(res)
			{
				//if res is true write pass into status cell outputpath
				xl.setCellData("Sheet1", i, 2, "pass", outputpath);
				logger.log(LogStatus.PASS, "Valid Username and password");
			}
			else
			{
				//if res is false write Fail into status cell outputpath
				xl.setCellData("Sheet1", i, 2, "Fail", outputpath);
				logger.log(LogStatus.FAIL, "Invalid Username and password");
			}
			reports.endTest(logger);
			reports.flush();
		}
	}

}

