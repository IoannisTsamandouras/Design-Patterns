package training;

public class SingletonDemo {
	public static void main(String[] args) {
		ClassSingleton obj = ClassSingleton.getInstance();
		obj.setInfo("Class Singleton");
		System.out.println(obj.getInfo());
		
		EnumSingleton enumObj = EnumSingleton.INSTANCE.getInstance();
		enumObj.setInfo("Enum Singleton");
		System.out.println(enumObj.getInfo());
	}
}