package chapter10Exercise;

public class Banana extends Fruit{
	
	@Override
	public void makeJuice() {
		System.out.println("Banana Smoothie is made");
	}
	
	public void peel() {
    	System.out.println("The Banana is now peeled off");
    }
   

}
