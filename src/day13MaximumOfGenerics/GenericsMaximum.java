package day13MaximumOfGenerics;

import java.util.Scanner;

public class GenericsMaximum<T extends Comparable<T>> {

	public T x, y, z;
	static Scanner scanner = new Scanner(System.in);

	/**
	 * @param x
	 * @param y
	 * @param z
	 */
	public GenericsMaximum(T x, T y, T z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public T maximum() {
		return GenericsMaximum.maximum(x, y, z);
	}

	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {

		T max = x; // assume x is initially the largest
		if (y.compareTo(max) > 0 && y.compareTo(z) > 0)
			max = y; // y is the largest
		if (z.compareTo(max) > 0)
			max = z; // z is the largest
		return max; // returns the largest object
	}

	public static void main(String args[]) {
		System.out.println("Finding the Maximum number from given numbers:");
		System.out.println("Enter 3 Integer numbers: ");
		Integer x = scanner.nextInt();
		Integer y = scanner.nextInt();
		Integer z = scanner.nextInt();
		System.out.println("Maximum is  " + maximum(x, y, z));
		scanner.close();
	}

}