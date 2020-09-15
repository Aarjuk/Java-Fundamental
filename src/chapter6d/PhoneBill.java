package chapter6d;

public class PhoneBill {

	public static void main(String args[]) {
		PhoneBillCalculator2 phoneBills = new PhoneBillCalculator2();
		phoneBills.setId(12345);
		//phoneBills.setNumOfMinutesUsed(40);

		int Id = phoneBills.getId();
		double baseCost = phoneBills.getBaseCost();
		double numOfAllottedMins = phoneBills.getNumOfAllottedMins();
		double overageFees1 = phoneBills.calculateOverageFees();
		double subTotal1 = phoneBills.calculateSubTotal(overageFees1, baseCost);
		double tax1 = phoneBills.calculateTax(subTotal1);
		double total1 = phoneBills.calculateTotalCost(subTotal1, tax1);

		System.out.println("ID : " + Id);
		System.out.println("plan: $" + baseCost);
		System.out.println("Number of Allotted Minutes:" + numOfAllottedMins);
		System.out.println("overage $" + overageFees1);
		System.out.println("Tax $" + tax1);
		System.out.println("Total:" + total1);

	}
}