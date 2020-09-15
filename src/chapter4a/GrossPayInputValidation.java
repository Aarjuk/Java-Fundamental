package chapter4a;

import java.util.Scanner;

public class GrossPayInputValidation {

	public static void main(String args[]) {
		int hourlyPay = 15;
		int maxHours = 40;
		
		
		System.out.println("Enter the Number of weekly hours");
		Scanner scanner = new Scanner(System.in);
		double hours = scanner.nextDouble();
		

		
		while(hours > maxHours|| hours < 1){
            System.out.println("Invalid hours. Hours should be in between 1 and 40");
            hours = scanner.nextDouble(); // if i don't use this then it keeps on looping 
		}
	
	     scanner.close();
		 double pay = hourlyPay * hours;
		 System.out.println("your pay is $" + pay + ".");
	}
}
