package EmailCommans;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.MultiPartEmail;

public class EmailDemo3 {

	public static void main(String[] args) throws Exception 
	{
		//http://localhost/img/default/login/timer.png
		// Create the attachment
				EmailAttachment attachment =new EmailAttachment();
				attachment.setURL(new URL("http://localhost/img/default/login/timer.png"));
				attachment.setDisposition(EmailAttachment.ATTACHMENT);
				attachment.setDescription("Picture of John");
				attachment.setName("John");

				// Create the email message
				MultiPartEmail mail = new MultiPartEmail();
				mail.setHostName("smtp.gmail.com");
				mail.setSmtpPort(465);
				mail.setAuthenticator(new DefaultAuthenticator("divyashk5@gmail.com","myplacementaccount"));
				mail.setSSLOnConnect(true);
				mail.setFrom("divyashk5@gmail.com");
				// set the subjectof mail
				mail.setSubject("Automated mail_with_URL_Attachment");
				mail.setMsg("this is test mail Divyash khatri");
				mail.addTo("divyashk4@gmail.com");

				// add the attachment
				mail.attach(attachment);
				// send the email
				mail.send();

				System.out.println("finished");
	}

}
