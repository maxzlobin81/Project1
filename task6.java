package Project1;

public class task6 {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable?
		
		int a = 10;
		int b = 5;

		System.out.println("Number a is " + a + " and number b is " + b);

		a = a + b; //-> a=10+5 (15)
		b = a - b; // b=(a+b)-b -> b=10-5 (5)
		a = a - b; // a=(a+b)-a -> a=15-5 (10)

		System.out.println("If we swap a and b, then a is " + a + " and b is " + b);
	}



	}


