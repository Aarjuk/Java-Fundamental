package chapter4d;

import java.util.Scanner;

public class AverageTestScores {

	public static void main(String args[]) {
		int noOfStds = 24;
		int noOfTests = 4;
	
		Scanner scanner = new Scanner(System.in);
		
		for(int i=1; i<=noOfStds; i++) {
			double total = 0;
			
			for(int j=1; j<=noOfTests; j++) {
				System.out.println("Please enter the test score"+ (j));
				double score = scanner.nextDouble();
				
				total = total + score;
				
			}
			double Avg = total/noOfTests;
			System.out.println("The Average Test score for student " + i + " is "+ Avg);
		}
	}
	
}
