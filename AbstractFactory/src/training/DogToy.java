package training;

public class DogToy implements Animal {

	@Override
	public String getType() {
		return "dog";
	}

	@Override
	public String makeSound() {
		return "barking...";
	}

}
