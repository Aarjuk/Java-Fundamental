package chapter3f;

import java.util.Scanner;

public class DollarGame {
     public static void main(String args[]) {
    	 
    	 double penny = .01;
    	 double nickel = .05;
    	 double dime = .10;
    	 double quarter = .25;
    	 int dollar = 1;
    	
    	 Scanner scanner = new Scanner(System.in);
    	 
    	 
    	 System.out.println("How many Pennies do you like?");
    	 int numOfPennies = scanner.nextInt();
    	 
    	 System.out.println("How many nickel do you like?");
    	 int numOfNickels = scanner.nextInt();
    	 
    	 System.out.println("How many dime do you like?");
    	 int numOfDimes = scanner.nextInt(); 
    	 
    	 System.out.println("How many quarter do you like?");
    	 int numOfQuarters = scanner.nextInt();
    	 
    	 double total = numOfPennies*penny + numOfNickels*nickel + numOfDimes*dime + numOfQuarters*quarter;
    	 
    	 if (total == dollar) {
    		 System.out.println(" Congratulations! You won the game");
    	 }
    	 else if (total > dollar) {
    		 double amountExceed = dollar - total;
    		 System.out.println("You exceed by $" + amountExceed);
    	 }
    	 else  {
    		double amountShort = dollar - total;
     		 System.out.println("You are short by $" + amountShort);
     		
    	 }
      }
     
   }

