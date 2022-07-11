package day13MaximumOfGenerics;

/**
 * 
 * @author LENOVO
 *
 */

public class GenericsMaximum<T extends Comparable<T>> {

	public static <T extends Comparable<T>> T toPrintMax(T x, T y, T z) {

		/**
		 * 
		 * @param x taking first value
		 * @param y taking second value
		 * @param z taking third value
		 * @return returning the result which is maximum
		 */

		T max = x;

		if (y.compareTo(max) > 0 && y.compareTo(z) > 0) {
			max = y;
		}

		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}
}