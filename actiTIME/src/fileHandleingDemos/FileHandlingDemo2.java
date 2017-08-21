package fileHandleingDemos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
 * 	reading from a file
 * 
 *  To read the file path should be mentioned and 	*/
public class FileHandlingDemo2 
{	
	public static void main(String[] args) throws IOException 
	{
		File fil=new File("d:/Demo1.txt");
		// if file does not exit then it create file
//		System.out.println(fil.createNewFile());
		FileReader fread=new FileReader(fil);
		BufferedReader bufread=new BufferedReader(fread);
		String s="";
		while((s=bufread.readLine())!=null)
		{
			if(s.length()>0)//to skip empty line
			System.out.println(s);
		}
	}
}