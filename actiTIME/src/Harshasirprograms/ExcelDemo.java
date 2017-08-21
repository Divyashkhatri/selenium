package Harshasirprograms;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//POI stands for "Poor Obfuscation Implementation"
public class ExcelDemo 
{
	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis = new FileInputStream("./data/input.xlsx");
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(0);
		System.out.println(sheet.getLastRowNum());
		System.out.println(sheet.getColumnWidth(0));
		System.out.println(sheet.getDefaultRowHeight());
		System.out.println(sheet.getColumnWidthInPixels(0));
		System.out.println(sheet.getFirstRowNum());

		System.out.println(sheet.getProtect());
		wb.getFontAt((short) 0).setBold(true);

		wb.getFontAt((short)0).setItalic(true);
		System.out.println(sheet.getDefaultColumnWidth());
		
		
		
	}
}