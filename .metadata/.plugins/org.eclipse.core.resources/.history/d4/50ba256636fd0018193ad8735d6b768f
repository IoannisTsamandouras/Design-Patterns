package training;

import java.util.Observable;

public class Model extends Observable {
	
	private int counter;
	
	Model() {
		System.out.println("Model constructor...");
	}
	
	public void setValue(int counter) {
		this.counter = counter;
		setChanged();
		notifyObservers(counter);
	}
	
	public void increaseValue() {
		++counter;
		setChanged();
		notifyObservers(counter);
	}
	
}
