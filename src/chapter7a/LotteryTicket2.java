package chapter7a;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket2 {

	
	static int LENGTH = 6;
    static int MAX_TICKET_NUMBER = 69;
	

	
	public static void main(String args[]) {
		int[] ticket = generateLotteryTicket();
		Arrays.sort(ticket);
		printTicket(ticket);
		
	}

	public static int[] generateLotteryTicket() {
		
		int[] ticket = new int [LENGTH];
		Random random = new Random();
		
		for(int i=0; i< LENGTH; i++ ) {
			int randomNumber;
			do {
				randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
		}while(search(ticket,randomNumber));
		
		 ticket[i] = randomNumber;
		}
		return ticket;
	}

        public static boolean search(int[] array, int numberToSearchFor) {
		for(int value : array) { //??? 
			if(value == numberToSearchFor) {
			return true;
		}
		}
		return false;
        
	}
//        public static boolean binarySearch(int[] array, int numberToSearchFor) {
//        	Arrays.sort(array);
//        	int index = Arrays.binarySearch(array,numberToSearchFor);
//        	
//        		if (index >= 0) {
//        		return true;
//        		}else return false;
//        	}
        
		public static void  printTicket(int ticket[]) {
		
		for (int i=0; i<LENGTH; i++) {
			System.out.print(ticket[i] + " | " );
		}
	}
}

