package training;

public class SmsMessageSender implements Sender {

	@Override
	public void sendMessage() {
		System.out.println("Sending SMS...");			
	}

}
