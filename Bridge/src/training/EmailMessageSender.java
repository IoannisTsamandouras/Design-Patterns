package training;

public class EmailMessageSender implements Sender {

	@Override
	public void sendMessage() {
		System.out.println("Sending Email...");		
	}
	
}
