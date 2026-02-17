package feb4;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Count_RowsandColumns {

	public static void main(String[] args) throws Throwable {
		//Read path of excel file
		FileInputStream fi= new FileInputStream("E:\\Book2.xlsx");
		//get workbook from file
		 XSSFWorkbook wb=new XSSFWorkbook(fi);
		 //get sheet from wb
		 XSSFSheet ws=wb.getSheet("mysheet");
		 //get first row from sheet
		 XSSFRow row=ws.getRow(0);
		 //count no.of.rows in a sheet
		 int rc=ws.getLastRowNum();
		 //count no.of.cells from first row
		 int cc=row.getLastCellNum();
		 System.out.println("No.of rows "+rc);
		 System.out.println("No.of cells "+cc);
		 fi.close();
		 wb.close();

	}

}
