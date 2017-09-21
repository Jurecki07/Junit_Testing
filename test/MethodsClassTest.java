import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MethodsClassTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("Setting up...");

    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Setting up...");

    }

    @Test
    public void testBasicCase() throws Exception {
        System.out.println("Running basic test");
        assertTrue(MethodsClass.containsOne(1));
        assertFalse(MethodsClass.containsOne(2));

    }

}