package chapter7a;

import java.util.Scanner;

public class DayOfTheWeek {
	static Scanner scanner = new Scanner(System.in);
	static int num;

	public static void main(String args[]) {

		//
		int num = inputNumber();
		if(num < 0 || num >7) {
			System.out.println("Invalid number");
		}
		else {
		String[] weekDay = generateWeekDays();

		System.out.println(weekDay[num - 1]);
		}
	}

     // public static boolean isValid(int num) {
//		if (num < 0 || num > 7) {
//			System.out.println("Invalid number");// false;
//		}
//		else return true;
//	}

	public static String[] generateWeekDays() {
		String[] weekDay = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "sunday" };
		return weekDay;

	}

	public static int inputNumber() {

		System.out.println("Please Input the Number from 1 to 7");
		int num = scanner.nextInt();
//		if(num < 0 || num >7) {
//			System.out.println("Invalid number");
//		}
//	 
//        return num;
	
		return num;
	}
}
