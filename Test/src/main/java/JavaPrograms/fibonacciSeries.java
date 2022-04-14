package JavaPrograms;

public class fibonacciSeries {

	public static void main(String[] args) {
		int t1=0;
		int t2=1;
		int num=10;
		for(int i =1;i<=num;i++)
		{
			System.out.println(t1);
			int sum=t1+t2;
			t1=t2;
			t2=sum;
		}

	}

}
