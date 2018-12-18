package training;

public abstract class Message {
	
	Sender sender;
	
	public Message(Sender sender) {
		this.sender = sender;
	}
	
	public abstract void send(); 

}
