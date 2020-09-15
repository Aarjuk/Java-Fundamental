package chapter4c;

import java.util.Scanner;

public class Cashier {
  
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		double total = 0;
		
		System.out.println("How many items would you like to scan?");
		int numOfItems = scanner.nextInt();
		 
		for(int i=0; i<numOfItems; i++) {
			
			System.out.println(" Enter the total cost of item");
			double price = scanner.nextDouble();
			 
			 total = total + price;
		
		}
		//scanner.close();
		System.out.println("The total cost of teh scaned items is" + total);
	}
}
