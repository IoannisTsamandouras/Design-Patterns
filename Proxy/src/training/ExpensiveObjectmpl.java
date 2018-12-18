package training;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExpensiveObjectmpl implements ExpensiveObject {

	private static final Logger LOG = LoggerFactory.getLogger(ExpensiveObject.class);
	
	public ExpensiveObjectmpl() {
		initConfig();
	}
	
	@Override
	public void process() {
		LOG.info("Processing complete");
	}
	
	public void initConfig() {
		LOG.info("Loading initial configuration...");
	}
	
}
