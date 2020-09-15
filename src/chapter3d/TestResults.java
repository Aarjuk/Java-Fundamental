package chapter3d;

import java.util.Scanner;

public class TestResults {

	public static void main(String args[]) {
		char grade;
		
	    System.out.println(" Please Enter your Score");
		Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        
        if(score >= 80) {
        	grade = 'A';
        }
        else if (score >= 70) {
        	grade = 'B';
        		
        	}
        else if (score >= 60) {
        	grade = 'C';
        }
        else if (score >= 50) {
        	grade = 'D';
        	
        }
        else {
        	grade = 'E';
        }
         System.out.println("Your Test Results is " + grade + ".");
        }
		
	}
	

	

