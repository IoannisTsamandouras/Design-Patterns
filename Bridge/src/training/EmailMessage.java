package training;

public class EmailMessage extends Message {

	public EmailMessage(Sender sender) {
		super(sender);		
	}

	@Override
	public void send() {
		sender.sendMessage();		
	}

}
