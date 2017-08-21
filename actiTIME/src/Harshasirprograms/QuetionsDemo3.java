//28<--write a script to print color of the present text in the text box
package Harshasirprograms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QuetionsDemo3 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();


		System.out.println("19<--write a script whether text box is enabled or not-->");
		/*driver.get("file:///D:/BCSM13/actiTime/HTMLpages/text.html");
		boolean enabled=driver.findElement(By.id("t2")).isEnabled();
		if(enabled)
			System.out.println("Test box is enabled");
		else
			System.out.println("Test box is disabled");
		 */

		System.out.println("20<--write a script to print content of list box");
		/*driver.get("file:///D:/BCSM13/actiTime/HTMLpages/dropdownlist.html");
		WebElement we = driver.findElement(By.id("mlb"));
		Select select=new Select(we);
		List<WebElement> optWes=select.getOptions();
		for(WebElement optwe:optWes)
		{
			System.out.println(optwe.getText());
		}*/
		System.out.println("21<--write a script to verify whether the listbox is "
				+ "dropdownlist or multi select list ");
		/*driver.get("file:///D:/BCSM13/actiTime/HTMLpages/dropdownlist.html");
		WebElement we1 = driver.findElement(By.id("mlb"));
		Select select1=new Select(we1);
		if(select1.isMultiple())
			System.out.println("yes it is multi select listbox");
		else
			System.out.println("it is not multi select listbox");
		 */

		System.out.println("22<---write a script to search a specified option in the "
				+ "listbox");
		/*		driver.get("file:///D:/BCSM13/actiTime/HTMLpages/dropdownlist.html");
		WebElement we2 = driver.findElement(By.id("mlb"));
		Select select2=new Select(we2);
		String expectedoption="poori";
		List<WebElement> optwes=select2.getOptions();
		int count=0;
		for(WebElement optwe:optwes)
		{	
			String option=optwe.getText();
			if(option.equals(expectedoption))
				count++;
		}
		if(count > 0)
			System.out.println(expectedoption+" option is present in the listbox");
		else
			System.out.println(expectedoption+" option is not present in the listbox");
		 */



		System.out.println("23<--write a script to verify whether the content of the listbox is sorted or not");
		/*		driver.navigate().to("file:///D:/BCSM13/actiTime/HTMLpages/dropdownlist.html");
		WebElement we=driver.findElement(By.id("mlb"));
		List<WebElement> options=we.findElements(By.tagName("option"));
		List<String> lst=new ArrayList<String>();
		for(WebElement option:options)
		{
			lst.add(option.getText());
		}
		List<String> lst1=new ArrayList(lst);
		Collections.sort(lst1);
		boolean flag=true;
		for(int i=0;i<lst.size();i++)
		{
			if(!lst.get(i).equals(lst.get(i)))
			{
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("list is sorted");
		else
			System.out.println("List is not sorted");
		 */
		System.out.println("24<---write a script to open google.com and  perform following operation");
		/*		driver.navigate().to("https://www.google.com");
		System.out.println("24.1<-- title of the page should be Google");
		if(driver.getTitle()=="Google")
			System.out.println("title of page is 'Google' of www.google.com");
		else
			System.err.println("title of page is not 'Google' of www.google.com");

		System.out.println("24.2<--page is redirected to google.co.in--->");
		if(driver.getCurrentUrl().contains("google.co.in"))
			System.out.println("page is redirected to google.co.in");
		else
			System.out.println("page is not redirected to google.co.in");
		System.out.println("24.3<-- it has google logo ");
		WebElement we=driver.findElement(By.xpath("//div[@title='Google']"));
		if(we.isDisplayed())
			System.out.println("google page have its logo on its home page");
		else
			System.out.println("google page doesn't have its logo on its home page");

		System.out.println("24.4<--It has search field and it is enabled");
		try
		{

			if(driver.findElement(By.xpath("(//input)[4]")).isEnabled())
				System.out.println("It has search field and it is enabled");
			else
				System.out.println("It has search field and it is disabled");

		}
		catch(NoSuchElementException e)
		{
				System.out.println("search field is not available on home page");
		}	*/


		System.out.println("25<---write a script to search selenium in google and print all auto suggetions which has webdriver");
		//		driver.navigate().to("https://www.google.com");
		//		driver.findElement(By.xpath("(//input)[4]")).sendKeys("selenium");
		//		List<WebElement> searchresults = driver.findElements(By.xpath("//div[@class='sbqs_c']"));
		//		Thread.sleep(1000l);
		//		System.out.println("size is -->"+searchresults.size());
		//		for(WebElement result:searchresults)
		//		{	
		//			String str=result.getText();
		//			//if(str.toLowerCase().contains("webdriver"))
		//			{
		//				System.out.println(str);
		//			}
		//		}
		
		System.out.println("26<---write a script to select an option in the listbox without using select class");
		/*driver.get("file:///D:/BCSM13/actiTime/HTMLpages/dropdownlist.html");
		driver.findElement(By.xpath("(//option[.='poori'])[3]")).click();
		driver.findElement(By.xpath("//select[2]/option[.='Ice cream']")).click();*/
	
		System.out.println("27<---write a script to select all the optionss in the multiselect listbox and also to deselect all the option in the list box in reverse order");
		/*driver.navigate().to("file:///D:/BCSM13/actiTime/HTMLpages/dropdownlist.html");
		List<WebElement> options=driver.findElements(By.xpath("//select[1]/option"));
		int len=options.size();
		for(int i=len-1;i>=0;i--)
		{
			options.get(i).click();
			Thread.sleep(1000);
		}
		List<WebElement> options1=driver.findElements(By.xpath("//select[2]/option"));
		int len1=options.size();
		for(int i=len1-1;i>=0;i--)
		{
			options1.get(i).click();
			Thread.sleep(1000);
		}
		*/
				System.out.println("28<--write a script to print color of the present text in the text box");
//			driver.navigate().to("file:///D:/BCSM13/actiTime/HTMLpages/textboxabcd.html");
//			System.out.println(driver.findElement(By.id("//p/font")).getAttribute("color"));
			
				
			System.out.println("movie finished");
	}

}
