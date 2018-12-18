package training;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoolingController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CoolingController.class);
	private static final Integer SPEED = 10;
	
	private Integer tempUpperLimit;
	private Radiator radiator = new Radiator();
	private TemperatureSensor tempSensor = new TemperatureSensor();
	
	public void setTemperatureUpperLimit(Integer tempUpperLimit) {
		LOGGER.info("Setting temperature upper limit to {}", tempUpperLimit);
		this.tempUpperLimit = tempUpperLimit;
	}
	
	public void run() {
		LOGGER.info("Cooling controller done");
		radiator.setSpeed(SPEED);
	}
	
	public void cool(Integer maxTemp) {
		LOGGER.info("Scheduled cooling with maximum allowed temperature {}", maxTemp);
		tempSensor.getTemperature();
		radiator.on();
	}
	
	public void stop() {
		LOGGER.info("Stopping cooling controller...");
		radiator.off();
	}

}
