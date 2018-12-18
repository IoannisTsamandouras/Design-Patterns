package training;

/*
 * Thread safety with early initialization singleton 
 */

 public class EarlyInitSingleton {

	private static final EarlyInitSingleton INSTANCE = new EarlyInitSingleton();
	
	private EarlyInitSingleton() {}
	
	public static EarlyInitSingleton getInstance() {
		return INSTANCE;		
	}
		
}
