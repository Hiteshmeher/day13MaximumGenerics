package day13MaximumOfGenerics;

import java.util.Scanner;

/**
 * 
 * @author LENOVO
 *
 */

public class GenericsMaximum {

	static Scanner scanner = new Scanner(System.in);

	/**
	 * 
	 * @param x taking first value
	 * @param y taking second value
	 * @param z taking third value
	 * @return returning the result which is maximum
	 */

	private static Float maxfloat(Float a, Float b, Float c) {
		Float max = a;
		if (b.compareTo(max) > 0 && b.compareTo(c) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		return max;
	}

	public static void main(String[] args) {
		System.out.println("Enter 3 Floating point numbers");
		Float a = scanner.nextFloat();
		Float b = scanner.nextFloat();
		Float c = scanner.nextFloat();
		System.out.println("Max: " + maxfloat(a, b, c));

	}
}