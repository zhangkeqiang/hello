package agilejerry.hello;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: PrimeFactors
 * @Description:
 */
public class MathAssistant {

	/**
	 * @method generate
	 * @description analyze n to its prime factors
	 * @return List<Integer>
	 */
	public static List<Integer> generate(int n) {
		List<Integer> list = new ArrayList<Integer>();
		int m = n;
		int f = 2;
		while (f <= m ) {
			while (m % f == 0) {
				list.add(f);
				m = m / f;
			}
			f++;
		}
		return list;
	}

	/**@method calcToGCD
	 * @description 
	 * @return Object
	*/
	public static int calcToGCD(int n, int m) {
		return 1;
	}

}
