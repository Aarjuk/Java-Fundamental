package chapter3c;

import java.util.Scanner;

public class LoanQualifier2 {
	public static void main(String args[]){
		 
		 System.out.println(" Enter the income you earned ");
		 Scanner scanner = new Scanner(System.in);
		 double salary = scanner.nextDouble();
		 
		 System.out.println(" Enter the number of years you have been working");
		 double year = scanner.nextDouble();
		 scanner.close();
		 
			if (salary >= 30000) {
				if (year >= 2) {
					
					System.out.println("Congratulation! You are qualified for the loan");
				}
				else {
					System.out.println("Sorry, you must have worked at your current job for 2 years");
				}
			}
				else {
					System.out.println("Sorry, your anuual income shouldnot be less than $30000");
	       }
		}
	}



