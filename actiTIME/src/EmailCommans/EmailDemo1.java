package EmailCommans;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/*<!-- https://mvnrepository.com/artifact/org.apache.commons/commons-email -->
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-email</artifactId>
    <version>1.4</version>
</dependency>
*/

public class EmailDemo1 
{
	public static void main(String[] args) throws EmailException 
	{		//Working mail sent
		Email mail = new SimpleEmail();
		mail.setHostName("smtp.gmail.com");
		mail.setSmtpPort(465);
		mail.setAuthenticator(new DefaultAuthenticator("divyashk5@gmail.com","myplacementaccount"));
		mail.setSSLOnConnect(true);
		mail.setFrom("divyashk5@gmail.com");
		mail.setMsg("this is test mail");
		mail.addTo("divyashk4@gmail.com");
		mail.send();
		System.out.println("finished");
	}
}