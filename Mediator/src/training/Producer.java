package training;

public class Producer implements Runnable {

	private Mediator med;
	private int id;
	private static int num = 1;
	
	public Producer(Mediator med) {
		this.med = med;
		this.id = num++;
	}
	
	@Override
	public void run() {	
		int num;
		while(true) {
			med.storeMsg(num = (int)(Math.random()*100));
			System.out.println("p" + id + "-" + num + " ");
		}		
	}
	
}
