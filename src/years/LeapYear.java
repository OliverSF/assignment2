/*
 * Oliver Faherty
 * ID: 16102532
 * CT874: Programming 1
 */
package years;

import java.util.Scanner; //selecting and bringing in the scanner utility

public class LeapYear {
	//class name based on goal
	
	public static void main(String[] args) {
		
		//Declaring year variable
		int year;
		
		//Declaring and creating instance of the scanner class
		Scanner input = new Scanner(System.in);
		
		//Creating boolean statement and naming it Leap
		boolean Leap = false;
		
		System.out.println("Enter the Year you want to check: "); //Output to console
		year = input.nextInt(); //Assigning user input to the year variable
		
		//Creating if statement to check if user input is a Leap year
		if (((year % 4 == 0) && (year % 100 != 0) ) || ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))) {
			Leap = true;
		}
		if (Leap) {
			System.out.println("\nThis is a leap Year"); //Output if true
		}
		else {
			System.out.println("\nThis is not a Leap Year"); //Output if false
		}

		input.close(); //Close input to avoid possible leak
		
	}//end main method
}//end class
