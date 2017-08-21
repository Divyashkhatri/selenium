import java.io.IOException;

import com.gnostice.pdfone.PdfDocument;
import com.gnostice.pdfone.PdfReader;

public class PDFDemo2 
{
	public static void main(String[] args) throws Exception 
	{
		
		//https://www.gnostice.com/nl_article.asp?id=105&t=How_to_Create_PDF_Pages_and_Render_Text,_Shapes_and_Images
		PdfReader r= PdfReader.fileReader("D:\\50 Selenium QnA.pdf");
		PdfDocument doc = new PdfDocument(r);
		System.out.println("pages -->"+doc.getPageCount());
	
		r.dispose();
		System.out.println("Finished execution");

	}

}
