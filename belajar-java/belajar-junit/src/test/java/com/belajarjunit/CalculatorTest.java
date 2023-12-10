package com.belajarjunit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

@DisplayName("Calculator Test")
public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    @DisplayName("Test add method")
    public void testAdd() {
        var result = calculator.add(10, 10);
        assertEquals(20, result);
    }

    @DisplayName("Test divide method")
    @Test
    public void testDivide() {
        var result = calculator.divide(100, 10);
        assertEquals(10, result);
    }

    @DisplayName("Test divide by zero")
    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(100, 0);
        });
    }

    @Test
    @DisplayName("Test Assumptions")
    public void testAssumptions() {
        assumeTrue("DEV".equals(System.getenv("ENV")));
        assertTrue(true);
    }
}
