package training;

public class Mediator {
	
	private boolean slotFull = false;
	private int number;
	
	public synchronized void storeMsg(int num) {
		while(slotFull == true) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				Thread.currentThread().interrupt();				
			}
		}		
		slotFull = true;
		number = num;
		notifyAll();
	}
	
	public synchronized int retrieveMsg() {
		while(slotFull == false) {
			try {
				wait();
			}			
			catch(InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		slotFull = false;
		notifyAll();
		return number;		
	}

}
