package training;

/*
 * Double-checked locking applied to a singleton  
 */

public class DoubleCheckedSingleton {
	
	// volatile to prevent cache incoherence issues
	private static volatile DoubleCheckedSingleton instance;
	
	private DoubleCheckedSingleton() {}
	
	public synchronized DoubleCheckedSingleton getInstance() {
		if(instance == null) {
			synchronized (DoubleCheckedSingleton.class) {
				if(instance == null) {
					instance = new DoubleCheckedSingleton();
				}
			}
		}		
		return instance;
	}	
	
}
