
public class bbb {

	public static void main(String... args) {
		int a = 30;
		int b = 45;
		System.out.println("Before swapping, a = " + a + " and b = " + b);
		//Invoke the swap method
		swapFunction(a, b);
		System.out.println("Now, before and after swapping values will be same here:");
		System.out.println("After swapping, a = " + a + " and b is " + b);
	}
	
	public static void swapFunction(int a, int b) {
		System.out.println("Before swapping(Inside), a = " + a + " b = " +b);
		//Swap n1 with n2
		int c = a;
		a = b;
		b = c;
	}
}
