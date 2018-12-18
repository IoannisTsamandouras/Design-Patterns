package training;

public class FacadeDemo {
	private static final Integer TEMP = 90;
	private static final Integer MAX_TEMP = 50;
	private FuelInjector fi = new FuelInjector();
	private AirFlowController afc = new AirFlowController();
	private Starter starter = new Starter();
	private CoolingController cc = new CoolingController();
	private CatalyticConverter caco = new CatalyticConverter();
	
	public void startEngine() {
		fi.on();
		afc.takeAir();
		fi.on();
		fi.inject();
		starter.start();
		cc.setTemperatureUpperLimit(TEMP);
		cc.run();
		caco.on();
	}
	
	public void stopEngine() {
		fi.off();
		caco.off();
		cc.cool(MAX_TEMP);
		cc.stop();
		afc.off();
	} 
}
