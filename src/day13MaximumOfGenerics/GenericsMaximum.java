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

	private static String findStringMax(String str1, String str2, String str3) {
		String max = str1;
		if (str2.compareTo(max) > 0)
			max = str2;
		if (str3.compareTo(max) > 0)
			max = str3;
		return max;
	}

	public static void main(String[] args) {
		System.out.println("Enter 3 Strings");
		String str1 = scanner.next();
		String str2 = scanner.next();
		String str3 = scanner.next();
		System.out.println("Max: " + findStringMax(str1, str2, str3));
	}
}