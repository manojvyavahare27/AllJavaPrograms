package JavaPrograms;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		
		
        int temp;        
        System.out.println("Before Swapping:");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping:");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        
        
        //without having 3rd variable
		System.out.println("Before Swapping:");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println("After Swapping:");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
		
        
	}

}
