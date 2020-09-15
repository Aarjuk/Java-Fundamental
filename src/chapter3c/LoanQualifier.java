package chapter3c;

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
	 
		if (salary >= income) {
			if (year >= workingYear) {
				
				System.out.println("Congratulation! You are qualified for the loan");
			}
			else {
				System.out.println("Sorry, you must have worked at your current job for"
			          +workingYear+ " years ");
			}
		}
			else {
				System.out.println("Sorry, your anuual income shouldnot be less than"
			           + income);
       }
	}
}
