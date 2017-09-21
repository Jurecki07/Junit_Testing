import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class MethodsClassTest {
    @Rule //Another annotation directed to JUnit
    public ExpectedException expected = ExpectedException.none();

    @Before
    public void setUp() throws Exception {
        System.out.println("Setting up...");

    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Setting up...");

    }

    @Test
    public void containsOne() throws Exception {
        System.out.println("Running basic test");
        assertTrue(MethodsClass.containsOne(1));
        //Happy Path: Will Return Ture
        assertFalse(MethodsClass.containsOne(2));

        expected.expect(BadInputExc.class);
        MethodsClass.containsOne((-5));
        // expecption processing

        // Will return False


// How to Check for a negative value?
// Grabbing the MethodClass from Methods file. Applying the method
// Using Assert= to return a boolean.
    }

    @Test
    public void testLargeNumbers() throws Exception {
        System.out.println("Testing large numbers");
        assertTrue(MethodsClass.containsOne(10000002));
        assertFalse(MethodsClass.containsOne(986974958));
    }


}