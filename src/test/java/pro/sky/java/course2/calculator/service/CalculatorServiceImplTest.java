package pro.sky.java.course2.calculator.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    public void testCalculatePlus() {

        int a = 5;
        int b = 10;
        int expected = 15;
        int actual = calculatorService.calculatePlus(a, b);
        assertEquals(expected, actual);

        a = 3;
        b = -10;
        expected = -7;
        actual = calculatorService.calculatePlus(a, b);
        assertEquals(expected, actual);

    }

    @Test
    public void testCalculateMinus() {

        int a = 5;
        int b = 10;
        int expected = -5;
        int actual = calculatorService.calculateMinus(a, b);
        assertEquals(expected, actual);

        a = 3;
        b = -10;
        expected = 13;
        actual = calculatorService.calculateMinus(a, b);
        assertEquals(expected, actual);

    }

    @Test
    public void testCalculateMultiply() {

        int a = 5;
        int b = 10;
        int expected = 50;
        int actual = calculatorService.calculateMultiply(a, b);
        assertEquals(expected, actual);

        a = 3;
        b = -10;
        expected = -30;
        actual = calculatorService.calculateMultiply(a, b);
        assertEquals(expected, actual);

    }

    @Test
    public void testCalculateDivide() {

        int a = 5;
        int b = 10;
        double expected = 0.5;
        double actual = calculatorService.calculateDivide(a, b);
        assertEquals(expected, actual);

        a = 3;
        b = -10;
        expected = -0.3;
        actual = calculatorService.calculateDivide(a, b);
        assertEquals(expected, actual);

    }

    @Test
    public void shouldReturnIllegalArgumentExceptionWhenDividedByZero() {

        int a = 5;
        int b = 0;

        assertThrows(IllegalArgumentException.class, () -> calculatorService.calculateDivide(a, b));
    }
}