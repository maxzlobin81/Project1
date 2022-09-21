package Project1;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		// Using Scanner create an array of integer values. After the array is created, calculate the sum of all stored elements in that array.
	
		
		Scanner scan = new Scanner(System.in);

		System.out.println("How many numbers would you like to enter?");
		int input=scan.nextInt();
		        int numbers[] = new int[input];
		        int sum = 0;

		        for (int i = 0; i < numbers.length; i++) {
		            int order=i+1;
		            System.out.println("Please enter number " +order);
		            numbers[i] = scan.nextInt();
		            sum += numbers[i];
		        }
		        System.out.println("Sum of entered numbers is: " + sum);

		    }

		}

			
			
			
			
			
		
   





