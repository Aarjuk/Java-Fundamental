package chapter5a;

import java.util.Scanner;

public class Greetings {
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter you name");
		String name = scanner.next();
	    greetName (name);
	
	}

	 public static void greetName(String name) {
	 System.out.println("Good Morning " + name);
		
	}

}
