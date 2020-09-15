package chapter3a;

import java.util.Scanner;

public class SalaryCalculator {
	
	public static void main (String args[]) {
		int salary = 1000;
		int bonus = 250;
		int quota = 10;
		
		System.out.println(" how many sales did an employee made?");
		Scanner scanner = new Scanner(System.in);
		int sales = scanner.nextInt();
		
		if (sales > quota) {
			salary = salary + bonus ;
		}
		System.out.println("The employee salary is  $" + salary);
	}

	
	
}
