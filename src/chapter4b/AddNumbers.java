package chapter4b;

import java.util.Scanner;

public class AddNumbers {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		boolean again;
		
		do {
		System.out.println(" Enter the first Number");
		double firstNum = scanner.nextDouble();
		
		System.out.println(" Enter the Second Number");
		double SecondNum = scanner.nextDouble();
		
		double sum = firstNum + SecondNum;
		System.out.println("The sum is " + sum + ".");
		
		System.out.println("Would you like to start again?");
		again = scanner.nextBoolean();
		
		}while(again) ;
			scanner.close();
		
	}

}
