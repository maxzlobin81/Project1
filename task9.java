package Project1;

public class task9 {

	public static void main(String[] args) {
		// Maximum and minimum number in the array?
		
		int[] numbers = { 7, 101, 12, 645, 10254, 247, 9002, -10, 80, 9999};
		int max = numbers[0];
		
		{
			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] > max)
					max = numbers[i];
			}
			
			System.out.println("The maximum number is: " + max);

		} for (int a = numbers.length-1; a >=0 ; a--) {
			
			if (numbers[a] < max)
				max = numbers[a];
		}
		
		System.out.println("The minimum number is: " + max);
		
		
	}

}



