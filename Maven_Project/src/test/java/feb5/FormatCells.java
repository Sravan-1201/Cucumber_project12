package feb5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FormatCells {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi = new FileInputStream("E:\\Book2.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("mysheet");
		int rc = ws .getLastRowNum();
		System.out.println("No of rows   "+rc);
		for(int i=1;i<=rc;i++)
		{
			//ws.getRow(i).createCell(4).setCellValue("Pass");
			ws.getRow(i).createCell(4).setCellValue("Fail");
			XSSFCellStyle style = wb.createCellStyle();
			XSSFFont font = wb.createFont();
			font.setBold(true);
			style.setFont(font);
			//style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
			style.setFillForegroundColor(IndexedColors.RED.getIndex());
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			ws.getRow(i).getCell(4).setCellStyle(style);
			
		}
		FileOutputStream fo = new FileOutputStream("E:\\Book4.xlsx");
		wb.write(fo);
	
	}

}
