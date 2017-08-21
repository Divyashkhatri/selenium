package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {

	public static void main(String[] args) throws IOException {
		Workbook workbook=new XSSFWorkbook(new FileInputStream("./data/input.xlsx"));
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		
		int colcount=row.getLastCellNum();
		
		for(int i=0;i<colcount;i++)
		{	
			Cell cell = row.getCell(i);
			if(cell!=null)
				System.out.println(cell.getStringCellValue());
			else
				System.out.println("hello");
		}		
	}

}
