package kata.handler;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class A1HandlerTest {
    @Test
    public void testA1_protected_method_should_be_called(){
        A1Handler a1 = new A1Handler();
        Assert.assertEquals(1004, a1.analyzeJobStep1("ddd"));
    }
    
    @Test
    public void testA1_function1(){
        A1Handler a1 = new A1Handler();
        int nRet = a1.function1(6);
        assertEquals(6, nRet);
    }
}
