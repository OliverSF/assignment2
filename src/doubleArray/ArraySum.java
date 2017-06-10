/*
 * Oliver Faherty
 * ID: 16102532
 * CT874: Programming 1
 */
package doubleArray;

import java.util.Scanner; //selecting and bringing in the scanner utility
import java.text.DecimalFormat;

public class ArraySum {
	//class name based on end goal

	public static void main(String[] args) {
		
		//declaring and initialising sum variable
		double sum = 0;
		
		//declaring x variable to hold user input for array size
		int x;
		
		//Declaring and creating instance of the scanner class
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		
		
		//Output to console asking user to input the array size
		System.out.println("Enter the size of your Array: ");
		
		x = input.nextInt(); //assigning user input to x
		
		double numbers [] = new double[x]; //Declare and create numbers array
		
		for (int counter = 0; counter < numbers.length; counter++) { 
		//Creating for loop to allow population of the array
			System.out.println("\nEnter number " + (counter + 1) ); //Output to console 
			numbers[counter] = input.nextDouble(); //Assigning each number entered to the array elements
		}
		
		System.out.println("\nThe Numbers You Entered Are:\n"); //Create heading for array contents
		
		for(double p : numbers){
			sum += p;
			System.out.println("\n " + p);
		}
		for (int counter = 0; counter < numbers.length; counter++) { 
		//Creating for loop to sum the values entered into the Array
			sum += numbers[counter]; 
			System.out.println(df.format(numbers[counter]));
			//Outputting values entered by user into the Array
		}
		
		System.out.println("\nThe sum of your numbers is: " + df.format(sum)); //Output sum value to console
		
		input.close(); //Close input to avoid possible leak

	} //end main method

} //end class
