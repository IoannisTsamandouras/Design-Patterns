package training;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DecoratorDemo {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DecoratorDemo.class);
	
	public static void main(String[] args) {
		
		ChristmasTree ct = new SantaClaus(new ChristmasTreeImpl());
		LOGGER.info(ct.decorate());
		
		ChristmasTree ctr = new FairyLights(new SantaClaus(new ChristmasTreeImpl()));
		LOGGER.info(ctr.decorate());		
	} 

}
