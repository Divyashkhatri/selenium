package EmailCommans;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.HtmlEmail;

public class EmailDemo4 {

	public static void main(String[] args) throws Exception 
	{
		 // Create the email message
		  HtmlEmail mail = new HtmlEmail();
		  mail.setHostName("smtp.gmail.com");
			mail.setSmtpPort(465);
			mail.setAuthenticator(new DefaultAuthenticator("divyashk5@gmail.com","myplacementaccount"));
			mail.setSSLOnConnect(true);
			mail.setFrom("divyashk5@gmail.com");
			// set the subjectof mail
			mail.setSubject("Automated mail_with_Logo_Attachment");
			mail.setMsg("this is test mail Divyash khatri");
			mail.addTo("divyashk4@gmail.com");

		  
		  // embed the image and get the content id
			//http://www.apache.org/images/asf_logo_wide.gif
		  URL url = new URL("http://localhost/img/default/login/timer.png");
		  String cid = mail.embed(url, "actiTime logo");
		  
		  // set the html message
		  mail.setHtmlMsg("<html>The actiTime logo - <img src=\"cid:"+cid+"\"></html>");

		  // set the alternative message
		  mail.setTextMsg("Your email client does not support HTML messages");

		  // send the email
		  mail.send();
		  System.out.println("Finished");
	}

}
