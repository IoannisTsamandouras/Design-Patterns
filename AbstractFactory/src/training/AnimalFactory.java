package training;

public class AnimalFactory implements AbstractFactory {

	@Override
	public Animal getAnimal(String animal) {
		if("dog".equalsIgnoreCase(animal)) {
			return new DogToy();
		}
		else if("bird".equalsIgnoreCase(animal)) {
		return new BirdToy();
		}
		return null;
	}

	@Override
	public Color getColor(String color) {
		throw new UnsupportedOperationException();
	}	

}
