package net.severo.entdes;
/**
 * 
 * @author Eduardo De la Cotera Martínez
 *
 */
public class Factorial {

	public static final java.lang.String VALUE_OF_N = "Arvo n!: ";
	public static final java.lang.String VALUE_OF_N1 = "Arvo n: ";

	public static void main(String[] args) {

		int n = (int) (Math.random() * 1);
		int result = 1;
		System.out.println(VALUE_OF_N1 + n);
		while (n > 1) {
			result = result * (n - 1);
		}
		System.out.println(VALUE_OF_N + result);

	}

}
