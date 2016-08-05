package agilejerry.hellomaven;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*; 
/**@ClassName: HelloMock
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author Administrator 
 * @date 2016年7月20日 上午7:35:06 
 * @Copyright © 2016上海通善互联网金融信息服务有限公司
 */
public class HelloMock {

	/**@method setUp(这里用一句话描述这个方法的作用)
	 * @return void
	 * @author Administrator
	 * @date 2016年7月20日 上午7:35:06
	*/
	@Before
	public void setUp() throws Exception {
	}

	/**@method tearDown(这里用一句话描述这个方法的作用)
	 * @return void
	 * @author Administrator
	 * @date 2016年7月20日 上午7:35:06
	*/
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testCarMock() {
		Car mockCar = mock(Car.class);
		when(mockCar.drive(45600)).thenReturn(23);
		assertEquals(23, mockCar.drive(45600));
		assertEquals(0, mockCar.drive(890));
	}

}
