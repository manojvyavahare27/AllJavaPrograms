package JavaPrograms;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Calculator {

	
	public static void main(String[] args) {
		double result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter 1st number:");
		int first=sc.nextInt();
		System.out.println("Please enter 2nd number");
		int second=sc.nextInt();
		
		System.out.println("Please enter operator");
		char operator=sc.next().charAt(0);

		switch (operator) {
		case '+':
			result=first+second;
			break;
		case '-':
			result=first-second;
			break;
		case '*':
			result=first*second;
			break;
		case '/':
			result=first/second;
			break;
		default:
			System.out.println("Please enter correct operator");
			break;
		}
		System.out.println(result);
	}

}
