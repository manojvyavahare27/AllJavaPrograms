package JavaPrograms;

import java.util.Scanner;

public class AlphabetCheck {

	public static void main(String[] args) {
        //Checking entered char is alphabet or not
		char c='R';

		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
			System.out.println("It is alphabet");
		} else {
			System.out.println("It is not alphabet");
		}
		
		
		

	}

}
