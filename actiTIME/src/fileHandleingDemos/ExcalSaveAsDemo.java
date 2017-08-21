package fileHandleingDemos;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcalSaveAsDemo 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis=new FileInputStream(new File("./fileHandleingData/Demo4.xlsx"));
		Workbook workbook=new XSSFWorkbook(fis);

		FileOutputStream fos=new FileOutputStream(new File("./fileHandleingData/Demo5.xlsx"));
		workbook.write(fos);
		fis.close();
		fos.close();
		workbook.close();
	}
}