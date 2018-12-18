package training;

public class LaptopBuilder extends ComputerBuilder {

	@Override
	public void addProcessor() {
		parts.put("motherboard", "Laptop Motherboard");		
	}

	@Override
	public void setupMotherboard() {
		setup.add("Screwing the motherboard case...");
		setup.add("Plugging in the power supply...");
		setup.forEach(step -> System.out.println(step));
		
	}

	@Override
	public void addMotherboard() {
		parts.put("processor", "Laptop Processor");		
	}	

}
