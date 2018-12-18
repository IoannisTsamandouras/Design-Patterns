package training;

import java.util.HashMap;
import java.util.Map;

public class Computer {
	
	private Map<String, String> parts = new HashMap<>();
	
	public Computer(Map<String, String> parts) {
		this.parts = parts;
	}
	
	public Map<String, String> getParts() {
		return parts;		
	}
	
}
