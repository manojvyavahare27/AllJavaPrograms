package JavaPrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num=371;
		double result=0;
		int actno=num;
		while(actno!=0)
		{
			int n=actno%10;
			result=result+Math.pow(n,3);
			actno=actno/10;
		}
		if(result==num)
		{
			System.out.println("number is armstrong");
		}
		else
		{
			System.out.println("Number is not armstrong");
		}

	}

}
