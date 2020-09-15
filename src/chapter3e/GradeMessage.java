package chapter3e;

import java.util.Scanner;

public class GradeMessage {
	
	public static void main(String args[]) {
		String gradeMessage;
		
		System.out.println("Please enter your Grade");
		Scanner scanner = new Scanner(System.in);
		String grade = scanner.next();
		
		switch(grade) {
		case "A":
			gradeMessage = "Excellent job";
            break;
            
		case "B":
			gradeMessage = " Great Job. ";
			break;
		case "C":
			gradeMessage = " Good job ";
			break;
		case "D":
			gradeMessage = " Work harder";
			break;
		case "E":
			gradeMessage = " Oh No!";
			break;
		default:
			gradeMessage = "Invalid Grade";
		    break;
		}
		System.out.println(gradeMessage);
	}

}
