package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public abstract class Excel {
	public static String getCellValue(String path,String sheet,int r,int c){
		String v="";	
		try{
			FileInputStream fis=new FileInputStream("./data/input.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			v=wb.getSheet(sheet).getRow(r).getCell(c).getStringCellValue();
			
		}catch(Exception e){
			
		}		
		return v;
	}
	
	public static boolean setCellValue(String path,String sheet,int row,int column,String value){
		System.out.println("set");
		try{
			
		}
		catch(Exception e){
			
		}
		
		return true;
	}
	
	public static int getRowCount(String path,String sheet){
		int rc=0;
		try{
			FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		rc=wb.getSheet(sheet).getLastRowNum();
		}catch(Exception e){
			
		}
		return rc;
	}
}
