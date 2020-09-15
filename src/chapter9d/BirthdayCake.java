package chapter9d;

public class BirthdayCake extends Cake {
     
	int candles;
      
	public BirthdayCake() { //call the multiple constructers )
		super("StrawBerry", 150);
	}
//	public BirthdayCake(double string) {
//		super(150);
//	
//	}

	public int getCandles() {
		return candles;
	}

	public void setCandles(int candles) {
		this.candles = candles;
	}

	public void print() {
		System.out.println("Birthday Cake flavor's " + flavor);
		System.out.println("Birthday Cake price $" + price);
	}
	
      
}
