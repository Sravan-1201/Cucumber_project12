package feb5;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RedCellData {

	public static void main(String[] args) throws Throwable{
		// Read path of excel file
				FileInputStream fi = new FileInputStream("E:\\Book2.xlsx");
				//get wb from file
				XSSFWorkbook wb = new XSSFWorkbook(fi);
				//get shett from wb
				XSSFSheet ws = wb.getSheet("mysheet");
				//get any row from sheet
				XSSFRow row = ws.getRow(14);
				//count no of rows in a sheet
				int rc = ws.getLastRowNum();
				System.out.println("No of rows   "+rc);
				//get six row all cell
				XSSFCell fn =row.getCell(0);
				XSSFCell mn = row.getCell(1);
				XSSFCell ln = row.getCell(2);
				XSSFCell ei = row.getCell(3);
				//print each cell data
				String Fname = fn.getStringCellValue();
				String Mname = mn.getStringCellValue();
				String Lname = ln.getStringCellValue();
				int eid = (int) ei.getNumericCellValue();
				System.out.println(Fname+"   "+Mname+"    "+Lname+"   "+eid);
				fi.close();
				wb.close();
			}

		}
