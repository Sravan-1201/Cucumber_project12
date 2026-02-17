package feb5;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ConvertIntToString {
public static void main(String[] args)throws  Throwable {
		FileInputStream fi = new FileInputStream("D:/Book2.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("mysheet");
		if(wb.getSheet("mysheet").getRow(5).getCell(3).getCellType()==CellType.NUMERIC)
		{
			int  celldata =(int) wb.getSheet("mysheet").getRow(5).getCell(3).getNumericCellValue();
			String eid = String.valueOf(celldata);
			System.out.println(eid);
		}

	}

}