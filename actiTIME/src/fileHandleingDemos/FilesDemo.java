package fileHandleingDemos;
/*
  Files class:
The Java NIO Files class (java.nio.file.Files) provides several methods for manipulating 
files in the file system.
The java.nio.file.Files class works with java.nio.file.Path instances, so you need to 
understand the Path class before you can work with the Files class.

*/
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesDemo 
{
	public static void main(String[] args) throws IOException 
	{	
/*		Path path = Paths.get("./Driver/chromedriver.exe");
		// 1st way to check file exists or not
		//		System.out.println(Files.exists(path, new LinkOption[]{ LinkOption.NOFOLLOW_LINKS})); 
		//2nd way to check file exists or not
		//		System.out.println(Files.exists(path, LinkOption.values()));

		//delete a file if exist and return true else false
		//		System.out.println(Files.deleteIfExists(path));
		// Files.deleteIfExists(path);//before executing keep backup of that file
*/
/*	first keep file at then execute and check(working)
 		Path source=Paths.get("./data/chromedriver.exe");
		Path target=Paths.get("./driver/chromedriver.exe");
		Files.copy(source, target);
*/
		
/*		Path source=Paths.get("./data/chromedriver.exe");
		FileOutputStream fos = new FileOutputStream("./driver/chromedriver.exe");
		Files.copy(source, fos);
		fos.close();
*/		
/*
		Path path = Paths.get("./Driver/Dum");
		try {
		    Path newDir = Files.createDirectory(path);
		} catch(FileAlreadyExistsException e){
		    // the directory already exists.
		} catch (IOException e) {
		    //something else went wrong
		    e.printStackTrace();
		}*/
		 			
	/*	Path sourcePath      = Paths.get("driver/chromedriver.exe");
		Path destinationPath = Paths.get("driver/damdum.exe");

		try {
		    Files.copy(sourcePath, destinationPath);
		} catch(FileAlreadyExistsException e) {
		    //destination file already exists
		} catch (IOException e) {
		    //something else went wrong
		    e.printStackTrace();
		}
*/		 
		//  MOVE OPERATION
/*		Path sourcePath      = Paths.get("driver/chromedriver.exe");
   		Path destinationPath = Paths.get("d:/chromedriver.exe");

		try {
		    Files.move(sourcePath, destinationPath, StandardCopyOption.ATOMIC_MOVE);//WORKING
		    Files.move(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);

		} catch (IOException e) {
		    //moving file failed.
		    e.printStackTrace();
		}
		 		
*/
		
		

		//to read all the lines in a file

/*		Path path = Paths.get("d:/pie_precision.txt");

		if(Files.exists(path,  new LinkOption[]{ LinkOption.NOFOLLOW_LINKS}))
		{
			List<String> alllines= Files.readAllLines(path);
			for(String line:alllines)
				System.out.println(line);
			System.out.println(alllines.size());
		}
*/	}
}
