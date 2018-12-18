package training;

import org.junit.jupiter.api.Test;

public class MessageTest {
	
	@Test
	public void testSend() throws Exception {
		Sender emailSender = new EmailMessageSender();
		Message email = new EmailMessage(emailSender);
		email.send();
		
		Sender smsSender = new SmsMessageSender();
		Message sms = new SmsMessage(smsSender);
		sms.send();		
	}

}
