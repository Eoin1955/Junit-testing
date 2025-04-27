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
    void testadd() {
        assertEquals(5, cal.add(3,2));
    }
}