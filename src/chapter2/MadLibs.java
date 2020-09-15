package chapter2;

import java.util.Scanner;

public class MadLibs {

	public static void main (String args[]) {
		System.out.println("Please Enter the Season of the Year");
		Scanner scanner = new Scanner(System.in);
		String Year = scanner.next();
		
		System.out.println("Please Enter the Whole number");
		int num = scanner.nextInt();
		
		System.out.println("Please enter the adjactive");
		String adj = scanner.next();
		
		System.out.print("on a "+ adj +" "+ Year +
				" day, i drink a minimum of " + num + "Cups of coffee");
		
	}
}
