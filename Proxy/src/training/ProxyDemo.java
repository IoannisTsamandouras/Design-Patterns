package training;

public class ProxyDemo {
	
	public static void main(String[] args) {
		ExpensiveObject obj = new ExpensiveObjectProxy();
		
		obj.process();
		obj.process();
	}

}
