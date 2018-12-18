package training;

public class ChargerImpl implements AdjustableCharger {
	
	private Charger charger;
	
	public ChargerImpl(Charger charger) {
		this.charger = charger;		
	}

	@Override
	public double getOuput() {
		double output = charger.getOutput();	
		return convertJoulesToVolts(output);
	}
	
	public double convertJoulesToVolts(double output) {
		return output / 4;
	} 

}
