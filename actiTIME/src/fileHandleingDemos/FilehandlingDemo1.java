package fileHandleingDemos;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FilehandlingDemo1 {

	public static void main(String[] args) throws IOException {
/*		File fil=new File("d:/samples");
		if(fil.exists())
		{
			System.out.println("get absolute path-->"+fil.getAbsolutePath());
			System.out.println("getting the name of file -->"+fil.getName());
			System.out.println("isDirectory-->"+fil.isDirectory());
			System.out.println("get parent directory -->"+fil.getParent());
		}
		else
		{
			System.out.println(fil.mkdirs());
		}



		//		 list all the files	
		File fils[]=new File(fil.getParent()).listFiles();
		//		File fils[]=fil.listFiles();
		//		File fils[]=fil.listRoots();
		System.out.println("-----");
	
		for(Object o: fils)
		{
			if(((File)o).isDirectory())
			{
				System.out.println(((File)o).getName()+"-->");
//				System.out.println(o);// prints absolute path
			}
		}

		System.out.println("<---------->");

		for(Object o: fils)
		{
			if(((File)o).isHidden())
			{
				System.out.println(((File)o).getName()+"-->");
//				System.out.println(o);// prints absolute path
			}
		}
		System.out.println("<---------->");


		for(Object o: fils)
		{
			if(((File)o).isFile())
			{
				//print all txt files present in the directory
				if(((File)o).getName().endsWith(".txt"))
				System.out.println(((File)o).getName()+"-->");
//				System.out.println(o);// prints absolute path
			}
		}
*/		
	/*	
		File fill=new File("d:/samples/12345.html");
		System.out.println(fill.isFile());
		System.out.println(fill.getParent());
		System.out.println(Arrays.toString(fill.listRoots()));
			System.out.println(fill.getName());
			System.out.println(fill.getFreeSpace());
			System.out.println(fill.setReadOnly());
			System.out.println(fill.toPath());
			System.out.println(fill.lastModified());
			
			System.out.println("----------------------------");
			
			File fil2=new File("d:/");
			//getName() works only for file or directory not for drive
			System.out.println(fil2.getName());
			System.out.println(fil2.getFreeSpace()/(1024*1024*1024));
			System.out.println(fil2.getTotalSpace()/(1024*1024*1024));
			System.out.println(fil2.getUsableSpace()/(1024*1024*1024));
			System.out.println(fil2.lastModified());
			System.out.println(fil2.getParent());
			System.out.println(fil2.setReadOnly());
			System.out.println(fil2.setWritable(false));
			System.out.println(fil2.toPath());
			System.out.println(fil2.canExecute());
			System.out.println(fil2.exists());
			*/
		
		
// 		Creating file
/*		File fil3=new File("d:/Demo.txt");
		fil3.createNewFile();
	*/
	
/*		File fil4=new File("d:/Demo1.txt");
		PrintWriter pw=new PrintWriter(fil4);
	*/
		
		
	}
}
