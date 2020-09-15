package chapter5b;

import java.util.Scanner;

public class PhoneBillCalculator {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		 
		 double baseCost = getBaseCost();
		 double overagefees = calculateOverageFees();
		 double subTotal = calculateSubTotal(overagefees, baseCost);
		 double tax = calculateTax(subTotal);
		 double TotalCost = calculateTotalCost(subTotal,tax);
		 printItemisedBill(baseCost,overagefees,tax,TotalCost);
		 
	}

	public static double getBaseCost() {
		System.out.println("Enter base cost of the plan");
		// double baseCost = 
		return scanner.nextDouble();
		
	}

	public static double calculateSubTotal(double overageFees, double baseCost) {
		//double subTotal = baseCost + overageFees;
		return baseCost + overageFees;
		
	
	}

	public static double calculateTax(double subTotal) {
	//	double tax =
		return  0.15 * subTotal;
	}

	public static double calculateTotalCost(double subTotal, double tax) {
		//double total =
		return subTotal + tax ;
	}

	public static double calculateOverageFees() {
		System.out.println("Enter the Overage Minutes");
		 double overageMinutes = scanner.nextDouble();
		 
		//double overageFees = overageMinutes * 0.25;
		
		return overageMinutes * 0.25;
	}
	

	private static void printItemisedBill(double baseCost, double overageFees, double tax, double total) {
		System.out.println("plan $" + baseCost);
		System.out.println("overage $" + overageFees);
		System.out.println("Tax $" +tax);
		System.out.println("Total:" + total);
	}

}
