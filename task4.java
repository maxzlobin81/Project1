package Project1;

public class task4 {

	public static void main(String[] args) {
		/*Create a 2D array or integer type where you will store odd and even numbers. 
		 *Develop a program which will identify/print the even numbers only
		 */

		
		int[][] numbers = { 
				

				{ 7, 20, 40, 77, 18 }, 
				{ 110, 19, 55, 44 }, 
				{ 234, 8, 100, 6, 3, 8445 },
				{ 4, 8, 2, 3, 1, 11 },
				
		};

		for (int a = 0; a < numbers.length; a++) { 

			for (int b = 0; b < numbers[a].length; b++) {

				if (numbers[a][b] % 2 == 0) {
					System.out.print(numbers[a][b] + "  ");
				}
			}
		}
	}

}