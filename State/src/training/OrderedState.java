package training;

public class OrderedState implements PackageState {

	@Override
	public void prev(Package pkg) {
		System.out.println("The package is its in root state...");		
	}

	@Override
	public void next(Package pkg) {
		pkg.setState(new DeliveredState());				
	}

	@Override
	public void printStatus() {
		System.out.println("Package ordered but not delivered yet...");
		
	}	
	
	@Override
	public String toString() {
		return "OrderedState{}";				
	}

}
