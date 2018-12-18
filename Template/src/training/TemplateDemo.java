package training;

public class TemplateDemo {
	
	public static void main(String[] args) {
		
		ComputerBuilder computer = new LaptopBuilder();
		Computer laptop = computer.buildComputer();
		laptop.getParts().forEach((k,v) -> System.out.println("Part: " + k + " Value:" + v));
		
		ComputerBuilder _computer = new DesktopBuilder();
		Computer desktop = _computer.buildComputer();
		desktop.getParts().forEach((k,v) -> System.out.println("Part: " + k + " Value:" + v));
	}
	
}
