package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestMain {

    @Test
    public void testSqrt() {
        assertEquals(2.0, Main.sqrt(4), 0.001); // Square root of 4 is 2.0
        assertEquals(3.0, Main.sqrt(9), 0.001); // Square root of 9 is 3.0
        assertEquals(4.0, Main.sqrt(16), 0.001); // Square root of 16 is 4.0
    }

    @Test
    public void testFactorial() {
        assertEquals(1, Main.factorial(0)); // Factorial of 0 is 1
        assertEquals(1, Main.factorial(1)); // Factorial of 1 is 1
        assertEquals(6, Main.factorial(3)); // Factorial of 3 is 6
        assertEquals(24, Main.factorial(4)); // Factorial of 4 is 24
    }

    @Test
    public void testLn() {
        assertEquals(0.0, Main.ln(1), 0.001); // Natural log of 1 is 0.0
        assertEquals(0.693, Main.ln(2), 0.001); // Natural log of 2 is approximately 0.693
        assertEquals(1.609, Main.ln(5), 0.001); // Natural log of 5 is approximately 1.609
    }

    @Test
    public void testPower() {
        assertEquals(8.0, Main.power(2, 3), 0.001); // 2 raised to the power of 3 is 8.0
        assertEquals(27.0, Main.power(3, 3), 0.001); // 3 raised to the power of 3 is 27.0
        assertEquals(16.0, Main.power(2, 4), 0.001); // 2 raised to the power of 4 is 16.0
    }
}
