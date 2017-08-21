package selenium;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMclassFindElements {
	@FindBy(xpath="//a")
	private List<WebElement> alllinks;
	
	 POMclassFindElements(WebDriver driver){
		 PageFactory.initElements(driver,this);
	 }
	
	public void getAllLinks(){
		int count=alllinks.size();
		System.out.println(count);
		for(WebElement link:alllinks)
		{
			System.out.println(link.getText());
		}
	}

}
