package chapter6a;

import java.util.Scanner;

public class HomeCalculatorRedo {

	private Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {

		HomeCalculatorRedo calculator = new HomeCalculatorRedo(); // =
		Rectangle room1 = calculator.getRoom(); // Room1 and Room2 are the instances
		Rectangle room2 = calculator.getRoom(); // using calculator. to call the method

		double area = calculator.calculateTotalArea(room1, room2);

		System.out.println("The total area is:" + area);
		calculator.scanner.close();

	}

	public Rectangle getRoom() { // method

		System.out.println("Please enter the length of the Room");
		double length = scanner.nextDouble();

		System.out.println("Please enter the breadth of the Room");
		double breadth = scanner.nextDouble();

		Rectangle room = new Rectangle(length, breadth);
		return room;

		// return new Rectangle(length, breadth);
	}

	public double calculateTotalArea(Rectangle room1, Rectangle room2) {
		return room1.calculateArea() + room2.calculateArea();

	}
}