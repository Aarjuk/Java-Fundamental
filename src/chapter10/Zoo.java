package chapter10;

public class Zoo {

	public static void main(String args[]) {
		Dog rocky = new Dog();
		rocky.fetch();
		rocky.makeSound();
		
		Animal loki = new Dog();
		loki.makeSound();
		feed(loki);
		
		loki = new Cat();
		loki.makeSound();
		((Cat)loki).scratch();
		
		
	}

	public static void feed(Animal animal) {
		if(animal instanceof Dog) {
			System.out.println("Here's your dog food");
		}
		else if(animal instanceof Cat) {
			System.out.println("hers's your cat food");
		}
	}
}
