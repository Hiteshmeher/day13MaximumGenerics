package day13MaximumOfGenerics;

public class Main {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * initialiazing values and finding maximum
		 */
		System.out.println("Maximum of Integers is "+GenericsMaximum.toPrintMax(10,20,18));
		System.out.println("Maximum of Float is " +GenericsMaximum.toPrintMax(10.7f,20.4f,17.7f));
		System.out.println("Maximum of three Strings is" +GenericsMaximum.toPrintMax("Mango","Banana","Cherry"));
	}
}
