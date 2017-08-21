package EmailCommans;
import org.apache.commons.mail.resolver.DataSourceUrlResolver;
import org.apache.commons.mail.*;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.*;
public class EmailDmeo5 {

	public static void main(String[] args) throws Exception 
	{
		// load your HTML mail template  
		String htmlEmailTemplate = ".... <img src=\"http://localhost/img/default/login/timer.png\"> ....";  

		// define you base URL to resolve relative resource locations  
		URL url = new URL("http://www.apache.org"); 

		// create the mail message  
		ImageHtmlEmail mail = new ImageHtmlEmail();  
		mail.setDataSourceResolver(new DataSourceUrlResolver(url));  
		mail.setHostName("smtp.gmail.com");
		mail.setSmtpPort(465);
		mail.setAuthenticator(new DefaultAuthenticator("divyashk5@gmail.com","myplacementaccount"));
		mail.setSSLOnConnect(true);
		mail.setFrom("divyashk5@gmail.com");
		
		// set the subject of mail
		mail.setSubject("Automated mail_with__Attachment");
		mail.setMsg("this is test mail Divyash khatri");
		mail.addTo("divyashk4@gmail.com");
		
		// set the html message  
		mail.setHtmlMsg(htmlEmailTemplate);  

		// set the alternative message  
		mail.setTextMsg("Your mail client does not support HTML messages");  

		// send the mail  
		mail.send();
		System.out.println("Finished");
	}

}
