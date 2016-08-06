package agilejerry.hello.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import agilejerry.hello.MathAssistant;

/**@ClassName: GreatestCommonDivisorTest
 * @Description:  
 */
public class GreatestCommonDivisorTest {

	/**@method setUp
	 * @description setup
	 * @return void
	*/
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public final void testGCD() {
		assertEquals(1,MathAssistant.calcToGCD(1,2));
		assertEquals(1,MathAssistant.calcToGCD(2,3));
		assertEquals(2,MathAssistant.calcToGCD(2,4));
		assertEquals(3,MathAssistant.calcToGCD(3,6));
		assertEquals(3,MathAssistant.calcToGCD(6,3));
		assertEquals(2,MathAssistant.calcToGCD(6,4));
		assertEquals(21,MathAssistant.calcToGCD(63,42));
		
	}

}
