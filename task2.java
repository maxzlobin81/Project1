package Project1;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		/* Using Scanner create an array of countries.
		 * When an array is created, retrieve all values from it and while retrieving those values print capital for each country.
		 * (use 2 different loops).
		 */

		Scanner input=new Scanner(System.in);
		
		System.out.println("How many countries are you going to enter?");
		
		int length=input.nextInt();
		
		String [] countries=new String[length];
		String [] capitals=new String[length];
		
		for(int i=0; i<length; i++) {
			
			System.out.println("Enter the country " +(i+1));
			countries[i]=input.next();
			
			System.out.println("Enter the capital " +(i+1));
			capitals[i]=input.next();
			
		}
		
		System.out.println("Countries and Capitals:");
		
		
		for(int i=0; i<length; i++) {
			
        System.out.println("Capital City of "+countries[i]+ " is "+capitals[i]);		
		
		}
			
	}
		
		
}