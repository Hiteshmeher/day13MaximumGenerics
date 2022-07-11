package day13MaximumOfGenerics;

import java.util.Scanner;
/**
 * 
 * @author LENOVO
 *
 */

public class GenericsMaximum {

	static Scanner sc = new Scanner(System.in);

	public static int maximum(Integer a, Integer b, Integer c) {
		/**
	     * This method compare numbers and print the results
	     * @return - returning result of the operation
	     */
		Integer max = a;
		if (b.compareTo(max) > 0 && b.compareTo(c) > 0)
			max = b;
		else if (c.compareTo(max) > 0)
			max = c;
		return max;
	}

	public static void main(String[] args) {
		 /*
         * Taking 3 numbers from user
         * Printing which is bigger
         */
		
		System.out.println("<< Finding the Maximum of given 3 numbers >>");
		System.out.println("Enter 3 numbers ");
		Integer x = sc.nextInt();
		Integer y = sc.nextInt();
		Integer z = sc.nextInt();
		System.out.println("Maximum is -> " + maximum(x, y, z));
	}
}
