package training;

public class ExpensiveObjectProxy implements ExpensiveObject {
	
	private ExpensiveObject obj;

	@Override
	public void process() {
		if(obj == null) {
			obj = new ExpensiveObjectmpl();
		}
		obj.process();
	}	

}