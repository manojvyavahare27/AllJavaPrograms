package JavaPrograms;

import java.util.Scanner;

public class evenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number please:");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}

	}

}
