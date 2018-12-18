package training;

public class SmsMessage extends Message {

	public SmsMessage(Sender sender) {
		super(sender);
	}

	@Override
	public void send() {
		sender.sendMessage();		
	}	

}
