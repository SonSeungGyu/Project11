package quiz;

public class quiz3 {
	public static void main(String[] args) {
		Dog dog = new Dog("초코", "진돗개");
		System.out.println(dog);
	}
}

class Dog{
	String name;
	String type;
	public Dog(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	@Override
	public String toString() {
		return type + " " +name;
	}
	
	
}
