package chapter10Exercise;

public class Market {
	
	public static void main(String args[]) {
		
		Apple apple = new Apple();
		apple.removeSeeds();
		//apple.makeJuice();
		serve(apple);
		
		Fruit pear = new Apple();
		pear.makeJuice();
		serve(pear);
		
		
		Banana banana = new Banana();
		banana.peel();
		
		pear = new Banana();
		((Banana)pear).makeJuice();
		serve(pear); 
		
	}
	
	public static void serve(Fruit fruit) {
		if (fruit instanceof Apple) {
			System.out.println(" Here's your Apple juice");
			
		}else if(fruit instanceof Banana) {
			System.out.println("Here's your Banana Smoothie");
		}
	}

}
