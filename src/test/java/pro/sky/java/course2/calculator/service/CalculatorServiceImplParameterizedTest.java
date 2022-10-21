package pro.sky.java.course2.calculator.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplParameterizedTest {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @ParameterizedTest
    @CsvSource({
            "5, 10",
            "3, -10",
            "100, -100"
    })
    public void testCalculatePlus(int a, int b) {
        int actual = calculatorService.calculatePlus(a, b);
        assertEquals(a + b, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "5, 10",
            "3, -10",
            "100, -100"
    })
    public void testCalculateMinus(int a, int b) {
        int actual = calculatorService.calculateMinus(a, b);
        assertEquals(a - b, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void testCalculateMultiply(int a, int b) {
        int actual = calculatorService.calculateMultiply(a, b);
        assertEquals(a * b, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void testCalculateDivide(int a, int b) {
        double actual = calculatorService.calculateDivide(a, b);
        assertEquals((double) a / b, actual);
    }

    public static Stream<Arguments> provideParamsForTest() {
        return Stream.of(
                Arguments.of(5, 10),
                Arguments.of(3, -10),
                Arguments.of(100, 2)
        );
    }
}