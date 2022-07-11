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
		System.out.println("Maximum of Integers is "+GenericsMaximum.maximum(22,10,20,18));
		System.out.println("Maximum of Float is " +GenericsMaximum.maximum(10.7f,20.4f,22.09f,17.7f));
		System.out.println("Maximum of three Strings is " +GenericsMaximum.maximum("Strawberry","Mango","Banana","Cherry"));
	}
}