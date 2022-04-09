package JavaPrograms;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Base");
		int num = sc.nextInt();
		System.out.println("Enter Exponent");
		int power = sc.nextInt();
		/*long result=1;
		while(power!=0)
		{
			result=result*num;
			--power;
		}*/
		
		//inbuilt functions also her in math class.
		long result= (long) Math.pow(num, power);
		System.out.println("Power of " + num+ " is : "+result);

	}

}
