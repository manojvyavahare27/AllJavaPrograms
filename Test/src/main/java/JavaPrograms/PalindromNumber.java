package JavaPrograms;

public class PalindromNumber {

	public static void main(String[] args) {
		//Palindrom Number Check
		int num=12121;
		int rev=0;
		int actno=num;
		while(num!=0)
		{
			int n=num%10;
			rev=rev*10+n;
			num=num/10;
		}
		if(actno==rev)
		{
			System.out.println("Number is palindrom");
		}
		else
		{
			System.out.println("Not Palindrom");
		}
	}

}
