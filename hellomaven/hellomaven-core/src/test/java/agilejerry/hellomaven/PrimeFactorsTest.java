package agilejerry.hellomaven;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**@ClassName: PrimeFactorsTest
 * @Description: to test the prime factors analyzer 
 */
public class PrimeFactorsTest {

	/**@method setUp
	 * @description 
	 * @return void
	*/
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public final void test2() {
		List<Integer> list = PrimeFactors.generate(2);
		assertNotNull(list);
		assertEquals(generateList(2), list);
	}
	
	@Test
	public final void test3() {
		assertEquals(generateList(3), PrimeFactors.generate(3));
	}
	@Test
	public final void test4(){
		assertEquals(generateList(2,2), PrimeFactors.generate(4));
	}

	protected List<Integer> generateList(int ... factors) {
		List<Integer> expectedList = new ArrayList<Integer>();
		for(int factor:factors)
			expectedList.add(factor);
		return expectedList;
	}
	
	@Test
	public final void test5() {
		assertEquals(generateList(5), PrimeFactors.generate(5));
	}
	
	@Test
	public final void test6() {
		assertEquals(generateList(2,3), PrimeFactors.generate(6));
	}
	
	@Test
	public final void testBiggerthan6() {
		assertEquals(generateList(7), PrimeFactors.generate(7));
		assertEquals(generateList(2,2,2), PrimeFactors.generate(8));
		assertEquals(generateList(3,3), PrimeFactors.generate(9));
		assertEquals(generateList(2,2,3,3), PrimeFactors.generate(36));
		assertEquals(generateList(7,7), PrimeFactors.generate(49));
		
	}

}
