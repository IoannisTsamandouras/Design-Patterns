package training;

public class AdapterDemo {
	
	public static void main(String[] args) {
		Charger batteries = new Batteries();
		AdjustableCharger batteriesCharger = new ChargerImpl(batteries);
		System.out.println("Batteries output is " + batteriesCharger.getOuput() + " Volts");
		
		Charger flashlight = new Flashlight();
		AdjustableCharger flashlightCharger = new ChargerImpl(flashlight);
		System.out.println("Flashlight output is " + flashlightCharger.getOuput() + " Volts");
		
		Charger fan = new Fan();	
		AdjustableCharger fanCharger = new ChargerImpl(fan);
		System.out.println("Fan output is " + fanCharger.getOuput() + " Volts");
	}

}
