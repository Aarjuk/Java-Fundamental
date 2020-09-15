package chapter9d;

public class WeddingCake extends Cake {
	
	int tiers;

	public WeddingCake() {
		super("Chocolate", 1500);
		
	}
//	public WeddingCake(double price) {
//		super(1500);
//	}

	public int getTiers() {
		return tiers;
	}

	public void setTiers(int tiers) {
		this.tiers = tiers;
	}
    
	public void print() {
		System.out.println("Wedding Cake Flavor's " + flavor);
		System.out.println("Wedding cake price $" + price);
	}
}
