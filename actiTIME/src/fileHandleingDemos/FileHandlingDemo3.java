package fileHandleingDemos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandlingDemo3 {

	public static void main(String[] args) throws IOException {
		/*File fil=new File("./fileHandleingData/Demo1.txt");
		System.out.println(fil.createNewFile());
		FileWriter fwriter=new FileWriter(fil);
		BufferedWriter bufwriter=new BufferedWriter(fwriter);
		bufwriter.write("Hello Good Moring");
		bufwriter.newLine();
		bufwriter.write("Writing new line");
		bufwriter.newLine();
		bufwriter.write(48);//ascii value of zero is passed here
		bufwriter.close();
		*/
		
		//2nd way of wrieing in file
		File fil1=new File("./fileHandleingData/Demo2.txt");
		System.out.println(fil1.createNewFile());
		PrintWriter pwrite=new PrintWriter(fil1);
		pwrite.println("Hello world means i am here meeting the world firdt time");
		pwrite.append("qwertyuiewertyu");
		pwrite.close();
	}

}
