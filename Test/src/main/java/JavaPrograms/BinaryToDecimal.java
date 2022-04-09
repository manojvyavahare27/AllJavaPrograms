package JavaPrograms;

public class BinaryToDecimal {

	public static void main(String[] args) {

		long num = 10011001;
		int decimal = BinaryToDecimal(num);
		System.out.println(decimal);
	}

	public static int BinaryToDecimal(long num) {
		int decimalnumber = 0;
		int i = 0;
		long remainder;
		while (num != 0) {
			remainder = num % 10;
			num = num / 10;
			decimalnumber += remainder * Math.pow(2, i);
			++i;
		}
		return decimalnumber;
	}

}
