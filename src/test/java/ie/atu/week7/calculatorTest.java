package ie.atu.week7;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {
    calculator cal;

    @BeforeEach
    void setUp() {
        cal = new calculator();
    }

    @Test
    void testaddSuccess() {
        assertEquals(8, cal.add(4,4));
    }
    @Test
    void testaddFailure() {
        Exception ex = assertThrows(IllegalArgumentException.class,() -> {cal.add(Integer.MAX_VALUE,2);});
        assertEquals("this value is too big", ex.getMessage());
    }
    @Test
    void testsubtractSuccess() {
        assertEquals(5, cal.subtract(10,5));
    }
    @Test
    void testsubtractFailure() {
        Exception ex = assertThrows(IllegalStateException.class, () ->{cal.subtract(5,10);});
        assertEquals("this value is not allowed", ex.getMessage());
    }
    @Test
    void testdivideSuccess() {
        assertEquals(2, myCalc.divide(10,5));
    }
    @Test
    void testdivideFailure() {
        Exception ex = assertThrows(ArithmeticException.class, () -> {myCalc.divide(10,0);});
        assertEquals("Cannot divide by zero", ex.getMessage());
    }
}