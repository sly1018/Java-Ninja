package hierarchicalInheritance;

public class Hierarchical {

	public static void main(String[] args) {
		System.out.println("Cat: ");
		Cat c = new Cat();
		c.doing();
		c.drinkingMilk();
		
		System.out.println("\nDog: ");
		Dog d = new Dog();
		d.doing();
		d.barking();
	}
	
}
