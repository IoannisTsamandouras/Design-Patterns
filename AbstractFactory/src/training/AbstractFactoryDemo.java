package training;

public class AbstractFactoryDemo {
	
	public static void main(String[] args) {
		AbstractFactory abstractFactory;
		
		abstractFactory = FactoryProvider.getFactory("toy");
		Animal toy = abstractFactory.getAnimal("dog");
	
		abstractFactory = FactoryProvider.getFactory("color");
		Color color = abstractFactory.getColor("brown");
		
		System.out.println("A " + toy.getType() + " toy with " 
		+ color.getColor() + " color is " + toy.makeSound());
	}
	
}
