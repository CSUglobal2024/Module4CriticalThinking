package loopingfloatingpointnumbers;

import java.util.Scanner;

public class Looping {

	public static void main(String[] args) {
//		Option #1: Looping Construct with Floating Point Numbers
//		Write a program that utilizes a while-loop to read a set of five floating-point values from user input. 
//		Include code to prevent an endless loop. Ask the user to enter the values, then print the following data:
//
//		Total
//		Average
//		Maximum
//		Minimum
//		Interest on total at 20%
//		
//		Compile and submit your pseudocode, source code, and screenshots of the application executing the application, 
//		the results and GIT repository in a single document.

		try (/*
				 * 
				Step 1: import and use scanner
				Step 2 : set count variable to 0. 
				Step 2a: set maximum to -1 so that each number inputed can become max, if new input is greater than max, set max to new input
				Step 3: set up for loop so that while count is 5 or under, loop reiterates
				Step 4: initiate minimum outside before loop, set new input to minimum on second iteration,if the iteration is the third loop, 
				second input, and if the new input is less than the current minimum, set minimum to the new input
				Step 5: After 6 loops, 5 inputs, loop should end.
				Step 6: calculate and output the total, average (total / 5), the maximum number and the minimum numbers, then multiply 
				the total by 0.20 to get the 20% interest rate. 
				Step 6: Do not forget to close the scanner
				 */
		Scanner scnr = new Scanner(System.in)) {
			int count;
	        float maximum = Float.NEGATIVE_INFINITY;
	        float minimum = 0; 
	        float total = 0;

	        for (count = 0; count < 5; count++) {
	            System.out.print("Enter a floating-point value: ");
	            float input = scnr.nextFloat();

	            if (count == 0) {
	                minimum = input;
	            } else if (input < minimum) {
	                minimum = input;
	            }

	            if (input > maximum) {
	                maximum = input;
	               // System.out.println(maximum);
	            }
	            
	            total += input;
	           // System.out.println(total);
	        }
	        scnr.close();
	       // System.out.println("End of first loop");


	        float average = total / 5;
	        float interest = total * 0.2f;

	        System.out.println("Total: " + total);
	        System.out.println("Average: " + average);
	        System.out.println("Maximum: " + maximum);
	        System.out.println("Minimum: " + minimum);
	        System.out.println("Interest on total at 20%: " + interest);
		}
	        
	}

}
