package training;

public class ColorFactory implements AbstractFactory {

	@Override
	public Animal getAnimal(String toy) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Color getColor(String color) {
		if ("brown".equalsIgnoreCase(color)) {
			return new Brown();
		} else if ("yellow".equalsIgnoreCase(color)) {
			return new Yellow();
		}
		return null;
	}
}