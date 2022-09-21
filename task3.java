package Project1;

public class task3 {

	public static void main(String[] args) {
		// Create a 2D array of integer values. Print the sum of all numbers.
		
		int[][] numbers = { 
				
				{ 7, 20, 40, 77, 18 }, 
				{ 110, 19, 55, 44 }, 
				{ 234, 8, 100, 6, 3, 8445 },
				{ 4, 8, 2, 3, 1, 11 },
				
		};

int sum = 0;
for (int a = 0; a < numbers.length; a++) { 
for (int b = 0; b < numbers[a].length; b++) {
	
	sum += (numbers[a][b]);
	
}

}

System.out.println(sum);

}

}
