package training;

public interface PackageState {
	
	public abstract void prev(Package pkg);
	public abstract void next(Package pkg);
	public abstract void printStatus();

}
