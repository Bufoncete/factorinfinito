package net.severo.entdes;
/**
 * 
 * @author Eduardo De la Cotera Martínez
 *
 */
public class Factorial {

	public static final java.lang.String STRING = "Value of n!: ";
	public static final java.lang.String STRING1 = "Value of n: ";

	public static void main(String[] args) {

		int n = (int) (Math.random() * 10);
		int result = 1;
		System.out.println(STRING1 + n);
		while (n > 1) {
			result = result * (n - 1);
		}
		System.out.println(STRING + result);

	}

}
