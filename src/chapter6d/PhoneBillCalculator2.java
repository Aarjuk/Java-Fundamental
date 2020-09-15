package chapter6d;

import java.util.Scanner;

public class PhoneBillCalculator2 {

	 int id;
	 double baseCost;
	 double numOfAllottedMins;
	 double numOfMinutesUsed;

	Scanner scanner = new Scanner(System.in);

	public PhoneBillCalculator2() {
		this(0, 0, 0, 0);

	}

	public PhoneBillCalculator2(int id) {
		this.id = id;
	}

	public PhoneBillCalculator2(int id, double baseCost, double numOfAllottedMins, double numOfMinutesUsed) {
		this.id = 12345;
		this.baseCost = 85.00;
		this.numOfAllottedMins = 30.30;
		this.numOfMinutesUsed = numOfMinutesUsed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBaseCost() {
		return baseCost;
	}

	public void setBaseCost(double baseCost) {
		this.baseCost = baseCost;
	}

	public double getNumOfAllottedMins() {
		return numOfAllottedMins;
	}

	public void setNumOfAllottedMins(double numOfAllottedMins) {
		this.numOfAllottedMins = numOfAllottedMins;
	}

	public double getNumOfMinutesUsed() {
		return numOfMinutesUsed;
	}

	public void setNumOfMinutesUsed(double numOfMinutesUsed) {
		this.numOfMinutesUsed = numOfMinutesUsed;
	}

	public double calculateSubTotal(double overageFees, double baseCost) {
		return baseCost + overageFees;

	}

	public double calculateTax(double subTotal) {
		return 0.15 * subTotal;
	}

	public double calculateTotalCost(double subTotal, double tax) {
		return subTotal + tax;
	}

	public double calculateOverageFees() {
		System.out.println("Enter the Num of minutes used");
		double numOfMinutesUsed = scanner.nextDouble();
		if (numOfMinutesUsed > numOfAllottedMins) {
			double overageMinutes = numOfMinutesUsed - numOfAllottedMins;

			return 0.25 * overageMinutes;
		} else {
			return 0;
		}

	}
}