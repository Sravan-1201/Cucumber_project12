package feb5;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Alternte_ReadCelldata {

	public static void main(String[] args) throws Throwable {
		// path of file
				FileInputStream fi = new FileInputStream("E:\\\\Book2.xlsx");
				//get wb from fikle
				XSSFWorkbook wb = new XSSFWorkbook(fi);
				//get sheet from wb
				XSSFSheet ws = wb.getSheet("mysheet");
				//count no of rows 
				int rc = ws.getLastRowNum();
				System.out.println("No of rows  "+rc);
				//read 10 row first cell data
				String fname = ws.getRow(10).getCell(0).getStringCellValue();
				//read 5 row second cell data
				String mname = ws.getRow(5).getCell(1).getStringCellValue();
				//read 7 row third cell data
				String lname = ws.getRow(7).getCell(2).getStringCellValue();
				//read 1 row fourth cell data
				int eid =(int) ws.getRow(1).getCell(3).getNumericCellValue();
				System.out.println(fname+"   "+mname+"    "+lname+"   "+eid);
				fi.close();
				wb.close();
	}

}
