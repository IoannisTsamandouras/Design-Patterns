package training;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class ComputerBuilder {
	
	protected Map<String, String> parts = new HashMap<>();
	protected List<String> setup = new ArrayList<>();
	
	public Computer buildComputer() {
		addMotherboard();
		setupMotherboard();
		addProcessor();
		return getComputer();
	}

	private Computer getComputer() {

		return new Computer(parts);
	}

	public abstract void addProcessor();

	public abstract void setupMotherboard();

	public abstract void addMotherboard();

	public Map<String, String> getParts() {
		return parts;
	}

	public List<String> getSetup() {
		return setup;
	}
	
}
