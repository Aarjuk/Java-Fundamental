
package chapter3f;

import java.util.Scanner;

public class LoanQualifier {
	  
	public static void main(String args[]){
	 int income = 30000;
	 int workingYear = 2;
	 
	 System.out.println(" Enter the income you earned ");
	 Scanner scanner = new Scanner(System.in);
	 double salary = scanner.nextDouble();
	 
	 System.out.println(" Enter the number of years you have been working");
	 double year = scanner.nextDouble();
	 scanner.close();
	 
		if (salary >= income && year >= workingYear) {
				
				System.out.println("Congratulation! You are qualified for the loan");
			}
			else {
				System.out.println("Sorry, you are not qualified for the loan");
			
		}
		
	}
}

