package training;

public class DesktopBuilder extends ComputerBuilder {

	@Override
	public void addProcessor() {
		parts.put("processor", "Desktop Processor");		
	}

	@Override
	public void setupMotherboard() {
		setup.add("Screwing the desktop motherboard case...");
		setup.add("Plugging in the power supply...");
		setup.forEach(step -> System.out.println(step));
	}

	@Override
	public void addMotherboard() {
		parts.put("motherboard", "Desktop Motherboard");			
	}
	
}
