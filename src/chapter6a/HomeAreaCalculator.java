package chapter6a;

public class HomeAreaCalculator {
	
	public static void main(String args[]) {
		
		Rectangle room1 = new Rectangle();
		room1.setLength(50);
		room1.setBreadth(35);
		double areaOfRoom1=room1.calculateArea();
		
		Rectangle room2 = new Rectangle(40,38);
		//room2.setLength(40);
		//room2.setBreadth(38);
		double areaOfRoom2 = room2.calculateArea();
		
		double totalArea = areaOfRoom1 + areaOfRoom2;
		
		System.out.println("The total area of the two rooms are: " +totalArea);
	}
	
	
	
}
