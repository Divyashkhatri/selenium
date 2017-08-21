import java.awt.Color;
import java.io.*;

import com.gnostice.pdfone.*;
import com.gnostice.pdfone.encodings.PdfEncodings;
import com.gnostice.pdfone.fonts.PdfFont;

public class PDFDemo {
	
	//https://www.gnostice.com/nl_article.asp?id=105&t=How_to_Create_PDF_Pages_and_Render_Text,_Shapes_and_Images
//	static {
//		PDFOne.activate("T95VZE:W8HBPVA:74VQ8QV:LO4V8",
//				"9B1HRZAP:X5853ERNE:5EREMEGRQ:TX1R10");
//	}

	public static void main(String[] args) throws PdfException, IOException {
		create_sample_doc1();
		get_pagecount_from_sample_doc1();
		write_to_sample_doc1();

		// NOTE: Requires Tahoma font file in the 
		// current directory
		write_to_sample_doc1_using_fonts();
	}

	static void create_sample_doc1() throws IOException, PdfException {
		// Create a PdfWriter instance
		PdfWriter w = PdfWriter.fileWriter("sample_doc1.pdf");

		// Create a PdfDocument instance with the PdfWriter
		PdfDocument d = new PdfDocument(w);

		// Write some text on page 1
		d.writeText("Hello, World!");

		// Set output file to be displayed after it is  
		// written to
		d.setOpenAfterSave(true);		
		
		// Write document to file
		d.write();

		// Close all I/O streams associated with the writer
		w.dispose();
	}

	static void get_pagecount_from_sample_doc1() throws IOException,
			PdfException {
		// Create a PdfReader instance
		PdfReader r = PdfReader.fileReader("sample_doc1.pdf");

		// Create a PdfDocument instance with the reader
		PdfDocument d = new PdfDocument(r);

		// Get page count and display on console
		System.out.println(
				"Number of pages in sample_doc1.pdf is " +
				d.getPageCount());
		
		// Close all I/O streams associated with the reader
		r.dispose();
	}

	static void write_to_sample_doc1() throws IOException, PdfException {
		// Create a PdfReader instance
		PdfReader r = PdfReader.fileReader(
		                       "sample_doc1.pdf",   // read from
		                       "sample_doc2.pdf");  // write to

		// Create a PdfDocument instance with the reader
		PdfDocument d = new PdfDocument(r);

		// Write text at position (100, 100) on page 1 
		d.writeText("Hello again, World!", 
				    100,   // x-coordinate 
				    50);   // y-coordinate

		// Set output file to be displayed after it is  
		// written to
		d.setOpenAfterSave(true);
				
		// Write to output file
		d.write();

		// Close all I/O streams associated with the reader
		r.dispose();
	}
	
	static void write_to_sample_doc1_using_fonts() throws IOException, PdfException {
		// Create a PdfReader instance
		PdfReader r = PdfReader.fileReader(
                       "sample_doc1.pdf",   // read from
                       "sample_doc3.pdf");  // write to

		// Create a PdfDocument instance with the reader
		PdfDocument d = new PdfDocument(r);
		
		// Create font objects
		PdfFont fontArialItalic = PdfFont.create(
		         "Arial",    // name of installed font
		        PdfFont.ITALIC | PdfFont.STROKE_AND_FILL, 
			    18, 
			    PdfEncodings.WINANSI);		
		PdfFont fontTahomaNormal = PdfFont.create(
			    "SNAP.TTF", // pathname of a font file
			    PdfFont.STROKE_AND_FILL, 
			    48, 
			    PdfEncodings.WINANSI);

		// Write text on page 1 using the Arial font created above 
		d.writeText("Hello again, World!", 
				    fontArialItalic,  // font
				    100, 50);

		// Set font properties
		fontTahomaNormal.setStrokeWidth(2);
		fontTahomaNormal.setStrokeColor(Color.RED);
		fontTahomaNormal.setColor(Color.ORANGE);

		// Write more text on page 1 using Tahoma
		d.writeText("Hello again, World!", 
				    fontTahomaNormal,  // font
				    100, 100);

		// Set output file to be displayed after it is  
		// written to
		d.setOpenAfterSave(true);
		
		// Write to output file
		d.write();

		// Close all I/O streams associated with the reader
		r.dispose();
	}

}
