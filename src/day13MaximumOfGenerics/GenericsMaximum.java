package day13MaximumOfGenerics;

/**
 * 
 * @author LENOVO
 *
 */

public class GenericsMaximum<T extends Comparable> {

	public static <T extends Comparable> T maximum(T w, T x, T y, T z) {
		/**
		 * @param w taking first value
		 * @param x taking second value
		 * @param y taking third value
		 * @param z taking fourth value
		 * @return returning the result which is maximum
		 */

		T max = w;
		if (x.compareTo(max) > 0)
			max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		return max;
	}
}