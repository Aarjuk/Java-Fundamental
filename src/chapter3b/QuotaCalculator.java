package chapter3b;

import java.util.Scanner;

public class QuotaCalculator {
	
  public static void main(String args[]) {
	int quota = 10;
	
	
	System.out.println("Please enter the number of sales made");
	Scanner scanner = new Scanner(System.in);
	int saleMade = scanner.nextInt();
	scanner.close();
	
	if (saleMade >= quota) {
		System.out.print(" Congratulation! you have achieved this week quota");
	}
	  else if(saleMade < quota) {
		int saleShortage =  quota - saleMade;
		System.out.print("Oops! you are short by " + saleShortage);
	}
  }
}
