package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
	public static void main(String arg[]) {
		System.out.println("Enter the number of hours Employee has worked:");
		Scanner scanner = new Scanner(System.in);
		int hours = scanner.nextInt();
		
		System.out.println("Enter the Employee's Pay Rate");
		double rate = scanner.nextDouble();
		
     	double grosspay = hours*rate;
		
        System.out.println("The employee's gross pay is $"+grosspay);
        
        
	}

}
