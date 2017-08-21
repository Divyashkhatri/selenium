import java.awt.Color;
import java.io.IOException;

import com.gnostice.pdfone.PdfDocument;
import com.gnostice.pdfone.PdfException;
import com.gnostice.pdfone.PdfReader;
import com.gnostice.pdfone.PdfWriter;
import com.gnostice.pdfone.readers.PdfCharSequenceReader;

public class PDFDemo1 
{
	public static void main(String[] args) throws Exception 
	{
		//https://www.gnostice.com/nl_article.asp?id=105&t=How_to_Create_PDF_Pages_and_Render_Text,_Shapes_and_Images
		
		// Create a PdfWriter instance
		PdfWriter w = PdfWriter.fileWriter("SamplePDF");

		// Create a PdfDocument instance with the PdfWriter
		PdfDocument d = new PdfDocument(w);

		// Write some text on page 1
		d.writeText("Hello, World! have you done your work ? ");
		

		// Set output file to be displayed after it is  
		// written to
		d.setOpenAfterSave(true);		
		
		// Write document to file
		d.write();
		System.out.println("Finished execution");
	}   

}