package Project1;

public class task10 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?
		
		int[] numbers = { 7, 101, 12, 645, 10254, 247, 9002, -10, 80, 9999};
		
		int max1 = 0;
		
		int max2 = 0;

		for (int a = 0; a < numbers.length; a++) {
			
			if(max1<numbers[a]) {
				
				max2 = max1;
				
				max1=numbers[a];
				
			}if (max2<numbers[a] && numbers[a]<max1) {
				
				max2=numbers[a];
			}
				

		} System.out.println("The second largest number in the array is: " +max2);

	}
}

		


