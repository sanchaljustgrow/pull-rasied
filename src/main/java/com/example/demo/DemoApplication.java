package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoApplicationTests {
    @Test
    void testSum() {
        DemoApplication.CalculationClass calc = new DemoApplication().new CalculationClass();
        assertEquals(30, calc.calculateSum(10, 20));
    }
}
