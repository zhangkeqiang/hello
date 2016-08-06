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
	public final void test1_2() {
		assertEquals(1,MathAssistant.calcToGCD(1,2));
	}

}
