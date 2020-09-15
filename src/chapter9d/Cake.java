package chapter9d;

public class Cake {
    String flavor;
    double price;
    
   
    
	public Cake(String flavor) {
		this.flavor = flavor;
		//setFlavor(flavor);
	}
    

	public Cake(String flavor, double price) {
		this.flavor = flavor;
		this.price = price;
		//setPrice(price);
	}


	public String getFlavor() {
		return flavor;
	}


	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
    
    
}
