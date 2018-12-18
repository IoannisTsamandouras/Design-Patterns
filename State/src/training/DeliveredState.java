package training;

public class DeliveredState implements PackageState {

	@Override
	public void prev(Package pkg) {
		pkg.setState(new OrderedState());		
	}

	@Override
	public void next(Package pkg) {
		pkg.setState(new ReceivedState());		
	}

	@Override
	public void printStatus() {
		System.out.println("Package delivered but not received yet...");		
	}	
	
	@Override 
	public String toString() {
		return "DeliveredState{}" ; 
	}

}
