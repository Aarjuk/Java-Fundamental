package chapter4d;

import java.util.Random;
//import java.util.Scanner;

public class RollTheDiceGame {
	
	public static void main(String args[]) {
		
		int maxRolls = 5;
		int lastSpace = 20;
		int currentSpace = 0;
		
		Random random = new Random ();
		//Scanner scanner = new Scanner(System.in);
		System.out.println("welcome to the dice game");
		
		 
		
		for (int i = 1; i<=maxRolls; i++ ) {
				
			int rolls = random.nextInt(6)+1;
			currentSpace = currentSpace + rolls;
			
			System.out.println("#Roll " +i+ " You have rolled " + rolls + " rolls ");
			
	if (currentSpace > lastSpace) {
		System.out.println("you advance to space" + currentSpace + "is a bug");
		 
			 }
	         else if(currentSpace < lastSpace){
				 int space = lastSpace - currentSpace;
				 System.out.println(" You are now on space "
				 + currentSpace + " and have "+space+" to go");
				 
			 }
			 else {
				 System.out.println(" You are on space "+currentSpace+ ". Congrats you win");
			 }
		}
		
		
	}

}
