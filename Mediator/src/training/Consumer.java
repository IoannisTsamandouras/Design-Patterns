package training;

public class Consumer implements Runnable {

	private Mediator med;
	private int id;
	private static int num = 1;
	
	public Consumer(Mediator med) {
		this.med = med;
		this.id = num++;
	}
	
	@Override
	public void run() {		
		while(true) {
			System.out.println("c" + id + "-" + med.retrieveMsg() + " ");
		}		
	}
	
}
