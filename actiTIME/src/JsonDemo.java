import java.io.File;
import java.io.IOException;
import com.jayway.jsonpath.JsonPath;
/* //jar files required
accessors-smart-1.2.jar
json-path-2.3.0.jar
json-smart-2.3.jar
slf4j-api-1.7.25.jar
*/
public class JsonDemo 
{
	public static void main(String[] args) throws IOException 
	{
		/*www.jsoneditoronline.org */	
//		File OR_json=new File("./fileHandleingData/OR.json");
//		System.out.println((String)JsonPath.read(OR_json, "locators.homepage.username.css"));
//		System.out.println((String)JsonPath.read(OR_json, "locators.homepage.password.xpath"));


		File file=new File("./fileHandleingData/Practice.json");
		Object x ;
//		System.out.println(x=JsonPath.read(file,"$.store.book[*].author"));	//$.store.book[*].author.		The authors of all books
//		System.out.println(x=JsonPath.read(file,"$..author"));//$..author		All authors
//		System.out.println(x=JsonPath.read(file, "$.store.*"));//$.store.*		All things, both books and bicycles
//		System.out.println(x=JsonPath.read(file, "$.store..price"));//$.store..price		The price of everything
//		System.out.println(x=JsonPath.read(file, "$..book[0]"));//$..book[0]		The first book
//		System.out.println(x=JsonPath.read(file, "$..book[-2]"));//$..book[-2]		The second to last book
//		System.out.println(x=JsonPath.read(file, "$..book[0,1]"));//$..book[0,1]		The first two books
//		System.out.println(x=JsonPath.read(file, "$..book[:2]"));//$..book[:2]		All books from index 0 (inclusive) until index 2 (exclusive)
//		System.out.println(x=JsonPath.read(file, "$..book[1:2]"));//$..book[1:2]		All books from index 1 (inclusive) until index 2 (exclusive)
//		System.out.println(x=JsonPath.read(file, "$..book[-1:]"));//$..book[-2:]		Last two books
//		System.out.println(x=JsonPath.read(file, "$..book[2:]"));//$..book[2:]		Book number two till tail(all books from 2 to end)
//		System.out.println(x=JsonPath.read(file, "$..book[?(@.isbn)]"));//$..book[?(@.isbn)]		All books with an ISBN numer
//		System.out.println(x=JsonPath.read(file, "$.store.book[?(@.price < 10)]"));//$.store.book[?(@.price < 10)]		All books in store cheaper than 10
//		System.out.println(x=JsonPath.read(file, "$..book[?(@.price <= $['expensive'])]"));//$..book[?(@.price <= $['expensive'])]		All books in store that are not "expensive"
//		System.out.println(x=JsonPath.read(file, "$..*"));//$..*		Give me every thing
//		System.out.println(x=JsonPath.read(file, "$..book.length()"));//$..book.length()		The number of books
		
		//difficult jsonpath 
		System.out.println(x=JsonPath.read(file, "$..book[?(@.author =~ /.*ash/i)]"));//$..book[?(@.author =~ /.*REES/i)]  All books matching regex (ignore case)

	}
}