import java.io.IOException;
import com.gnostice.pdfone.PdfDocument;
import com.gnostice.pdfone.PdfMeasurement;
import com.gnostice.pdfone.PdfPage;
import com.gnostice.pdfone.PdfPageSize;
import com.gnostice.pdfone.PdfTextFormatter;
import com.gnostice.pdfone.PdfWriter;
import com.gnostice.pdfone.encodings.PdfEncodings;
import com.gnostice.pdfone.fonts.PdfFont;

public class PDFDemo3 
{
	public static void main(String[] args) throws Exception, IOException 
	{
		
		//https://www.gnostice.com/nl_article.asp?id=105&t=How_to_Create_PDF_Pages_and_Render_Text,_Shapes_and_Images
		PdfWriter w = PdfWriter.fileWriter("./fileHandleingData/Demo.pdf");
		// Create a PdfDocument instance 
		
		PdfDocument doc1 = new PdfDocument(w);

		// Create a page
		PdfPage page1 = new PdfPage(
			PdfPageSize.A4, // page size
		        25,  // header height
			25,  // footer height
			50,  // left margin
			50,  // top margin
			50,  // right margin
			50,  // bottom margin
			PdfMeasurement.MU_POINTS // measurement unit
		);


		// Create more pages by cloning the above
		PdfPage page2 = (PdfPage) page1.clone();
		PdfPage page3 = (PdfPage) page1.clone();

		// Add the pages to the document
		doc1.add(page1);
		doc1.add(page2);
		doc1.add(page3);

		doc1.writeText(
			    "Hi baby affection is food for us i like you baby",
			    100, // x-coordinate of top-left position 
			    100, // y-coordinate of top-left position
			    PdfTextFormatter.LEFT, // text alignment 
			    PdfTextFormatter.WRAP, // text wrapping
			    "1-3" // page range (pages 1, 2 & 3)
			    );
		
		
		// Create a PDF font
		PdfFont font1 = PdfFont.create( "Helvetica",25, PdfEncodings.WINANSI);

		// Add text header to pages 1 and 2
		doc1.addHeaderText(
		 	"The five boxing wizards jump quickly.",
			// font
		        font1,
		        // vertical and horizontal alignment
		        PdfPage.VP_CENTRE | PdfPage.HP_MIDDLE,
		        // underlay
		        true,
		        // page range
		        "1-2");

		// Add text header to pages 3
		page3.addHeaderText(
		    "The five boxing wizards jump quickly.",
		    // font
		    font1,
		    // vertical and horizontal alignment
		    PdfPage.VP_CENTRE | PdfPage.HP_LEFT,
		    // underlay
		    true);

		
		// Set measurement unit to inches for document object
		doc1.setMeasurementUnit(PdfMeasurement.MU_INCHES);	
		
		// Draw a circle on pages 1 & 2
		doc1.drawCircle(3, 4.5, 2.5, false, true, "1-2");

		// Draw an image on pages 1 & 3
		doc1.drawImage(
			// pathname of image
		"./fileHandleingData/I-Miss-You-Picture.jpg", 
			// x-y coordinates of the location where
			// the image needs to be drawn
			1, 3,
			// width and height of the image
			4, 3,				       
			// angle of rotation of the image
			20,
			// page range
			"1,3");

		// Increase font size
		font1.setSize(45);
		// Add a text watermark to pages 2 & 3  
		doc1.addWatermarkText(
			// watermark text
			"Divyash Khatri", 
			// watermark font
			font1, 
			// vertical and horizontal alignment of watermark
			PdfPage.VP_CENTRE | PdfPage.HP_MIDDLE, 
			// apply margins? 
			true,
			// angle of rotation
			45, 
			// underlay
			true, 
			// page range
			"2-3");
		// Add a text watermark to page 1
		page1.addWatermarkText(
			"Ramya samantha", 
			font1, 
			PdfPage.VP_CENTRE | PdfPage.HP_MIDDLE, 
			false, 
			45,
			false);
		
		doc1.write();
		w.dispose();
		doc1.setOpenAfterSave(true);
		
		System.out.println("Execution Finished");
		
	
	}
}