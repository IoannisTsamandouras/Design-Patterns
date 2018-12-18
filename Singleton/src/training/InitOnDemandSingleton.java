package training;

/*
 * Lazy initialization with nested static class 
 */

public class InitOnDemandSingleton {
	
	private static class InstanceHolder {
		
		private static final InitOnDemandSingleton INSTANCE 
			= new InitOnDemandSingleton();
	}
	
	private InitOnDemandSingleton() {}
	
	public static InitOnDemandSingleton getInstance() {
		return InstanceHolder.INSTANCE;
	}
}
