package training;

public class SantaClaus extends Fir{
	
	public SantaClaus(ChristmasTree fir) {
		super(fir);		
	}
	
	public String decorate() {
		return super.decorate() + santaClaus();
	}
	
	private String santaClaus() {
		return " with Santa- Claus";
	}
}
