package chapter5b;

import java.util.Scanner;

public class InstantCreditCheck {
	static int requiredIncome = 25000;
	static int requiredCreditScore = 700;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		
		double income = getIncome();
	    int creditScore = getCreditCheck();
	    scanner.close();
		//qualificationForm();
		boolean qualified = isUserQualified(income,creditScore);
	 	notifyUser(qualified);
	}
     
     public static double getIncome() {
    	 System.out.println("Please Enter your Income");
    	// Scanner scanner = new Scanner(System.in);
         //double income = scanner.nextDouble();
         return scanner.nextDouble();
		
	}
     public static int getCreditCheck() {
    	 System.out.println(" Please, Enter your Credit Score");
	    // Scanner scanner = new Scanner(System.in); 
		// int creditScore = scanner.nextInt();
		return scanner.nextInt();
	}
//	public static void qualificationForm() { (since income and Credit score are only 
//	defined in this method, it is difficult for the main method to access it and since it has
	//two parenthesis and a method can only return one Value, so we will break it into two
//		System.out.println(" Please, Enter your Income");
//		Scanner scanner = new Scanner(System.in);
//		double income = scanner.nextDouble();
		
//		System.out.println("Please Enter your credit score");
//		int creditScore = scanner.nextInt();
		
	
	public static boolean isUserQualified(double income, int creditScore) { //using boolean to check if the user is qualified or not
		
		return (income >= requiredIncome) && (creditScore >= requiredCreditScore);
		
//		if (income >= requiredIncome && creditScore >= requiredCreditScore) {
//		//	System.out.println(" You are not qualified ");
//			return true;
//		}
//		else
//		   {
//			return false;
//			//System.out.println("Congratulations! You are qualified");
//		   }
		
	}
	public static void notifyUser(boolean qualified) {
		
		if(qualified) {
			System.out.println("Congratulation! You have been approved");
		}
		else {
			System.out.println("Sorry! You have been declined");
		}
	}

	

	
}