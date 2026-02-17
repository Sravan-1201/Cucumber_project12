package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileUtils {
XSSFWorkbook wb;
//write constructor to read path of excel file
public ExcelFileUtils(String ExcelPath)throws Throwable
{
	FileInputStream fi = new FileInputStream(ExcelPath);
	wb = new XSSFWorkbook(fi);
}
//method to count no of rows in a sheet
public int rowCount(String sheetname)
{
	return wb.getSheet(sheetname).getLastRowNum();
}
//method to read cell data
public String getCellData(String sheetName,int row,int column)
{
	String data ="";
	if(wb.getSheet(sheetName).getRow(row).getCell(column).getCellType()==CellType.NUMERIC)
	{
		int celldata =(int) wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
		data = String.valueOf(celldata);
	}
	else
	{
		data = wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	}
	return data;
	
}
//method for writing results
public void setCellData(String sheetName,int row,int column,String Status,String WriteExcel)throws Throwable
{
	//get sheet from wb
	XSSFSheet ws = wb.getSheet(sheetName);
	//get row from sheet
	XSSFRow rowNum = ws.getRow(row);
	//create cell in a row
	XSSFCell cell = rowNum.createCell(column);
	//write status
	cell.setCellValue(Status);
	if(Status.equalsIgnoreCase("Pass"))
	{
		XSSFCellStyle style = wb.createCellStyle();
		XSSFFont font = wb.createFont();
		font.setBold(true);
		style.setFont(font);
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		rowNum.getCell(column).setCellStyle(style);
	}
	else if(Status.equalsIgnoreCase("Fail"))
	{
		XSSFCellStyle style = wb.createCellStyle();
		XSSFFont font = wb.createFont();
		font.setBold(true);
		style.setFont(font);
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		rowNum.getCell(column).setCellStyle(style);
	}
	FileOutputStream fo = new FileOutputStream(WriteExcel);
	wb.write(fo);
}
public static void main(String[] args) throws Throwable {
	ExcelFileUtils xl = new ExcelFileUtils("D:\\Book2.xlsx");
	int rc =xl.rowCount("mysheet");
	System.out.println(rc);
	for(int i=1;i<=rc;i++)
	{
		String fname = xl.getCellData("mysheet", i, 0);
		String mname = xl.getCellData("mysheet", i, 1);
		String lname = xl.getCellData("mysheet", i, 2);
		String eid = xl.getCellData("mysheet", i, 3);
		System.out.println(fname+"  "+mname+"   "+lname+"   "+eid);
		//xl.setCellData("mysheet", i, 4, "Pass", "D:/Results.xlsx");
		xl.setCellData("mysheet", i, 4, "Fail", "D:/Results.xlsx");
	}
}
}
