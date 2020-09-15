package chapter6a;

public class Rectangle {
	
	//public static void main(String args[]) {
		private double length;
		private  double breadth;
		private  double ymp;
		
		public Rectangle() {
			this(0,0);
			//length = 0;
			//breadth = 0;
		}
		
		
		
		public Rectangle(double length, double breadth) {
			this.length = length;
			this.breadth = breadth;
			ymp = length;
		}
		
		double getLength(){
		 return length;	
		}
		void setLength(double length) {
			this.length = length;
		}
	
       double getBreadth() {
    	  return breadth;
       }
       void setBreadth(double breadth) {
    	  this.breadth = breadth;
       }

	public  double calculatePerimeter() {
		return (2*length)+(2*breadth);
		
	}

	public  double calculateArea() {
		return length * breadth;
		
	}

}
