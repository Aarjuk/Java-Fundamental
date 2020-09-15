package chapter7a;

import java.util.Random;

public class LotteryTicket {

	
	static int LENGTH = 6;
    static int MAX_TICKET_NUMBER = 69;

	
	public static void main(String args[]) {
		int[] ticket = generateLotteryTicket();
		printTicket(ticket);
		
	}

	public static int[] generateLotteryTicket() {
		int[] ticket = new int [LENGTH];
		Random random = new Random();
		
		for(int i=0; i< LENGTH; i++ ) {
			ticket[i] = random.nextInt(MAX_TICKET_NUMBER) + 1;
		}
		return ticket;
		
	}

        public static void printTicket(int ticket[]) {
		
		for (int i=0; i<LENGTH; i++) {
			System.out.print(ticket[i] + " | " );
		}
	}
}
