package training;

public class BirdToy implements Animal {

	@Override
	public String getType() {
		return "duck";
	}

	@Override
	public String makeSound() {
		return "singing...";
	}

}
