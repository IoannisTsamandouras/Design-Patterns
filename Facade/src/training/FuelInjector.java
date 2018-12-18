package training;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FuelInjector {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(FuelInjector.class);
	private FuelPump pump = new FuelPump();
	
	public void on() {
		LOGGER.info("Fuel injector ready to inject fuel");
	}
	
	public void inject() {
		pump.pump();
		LOGGER.info("Fuel injected");
	}
	
	public void off() {
		LOGGER.info("Stopping fuel injector...");
	}

}
