
public class Dog {
	String name;
	String breed;
	int age;
	String color;

	// constructor
	public Dog(String name, String breed, int age, String color) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}

	// methods
	public String getName() {
		return name;
	}

	public String getBreed() {
		return breed;
	}

	public int getAge() {
		return age;
	}

	public String getColor() {
		return color;
	}

	public String toString() {
		return ("Hi my name is " + this.getName() + "\nMy breed, age and color are " + this.getBreed() + ", "
				+ this.getAge() + ", " + this.getColor());
	}

	// main
	public static void main(String[] args) {
		Dog tuffy = new Dog("Tuffy", "Papillon", 5, "white");
		System.out.println(tuffy.toString());
	}

}
