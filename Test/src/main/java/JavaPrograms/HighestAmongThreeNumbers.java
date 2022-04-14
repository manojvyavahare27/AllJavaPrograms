package JavaPrograms;

public class HighestAmongThreeNumbers {

	//HighestAmongThreeNumbers code
	public static void main(String[] args) {
		int x=500; int y=400; int z=300;
		if(x>y && x>z)
		{
			System.out.println("X is the highest Number");
		}
		else if(y>x && y>z)
		{
			System.out.println("Y is the highest Number");
		}
		else if(z>x && z>y)
		{
			System.out.println("Z is highest Number");
		}

	}

}
