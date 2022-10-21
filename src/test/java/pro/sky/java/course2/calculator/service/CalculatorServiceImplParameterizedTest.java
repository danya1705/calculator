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
            "5, 10, 15",
            "3, -10, -7",
            "100, -100, 0"
    })
    public void parameterizedTestCalculatePlus(int a, int b, int expected) {
        int actual = calculatorService.calculatePlus(a,b);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "5, 10, -5",
            "3, -10, 13",
            "100, -100, 200"
    })
    public void parameterizedTestCalculateMinus(int a, int b, int expected) {
        int actual = calculatorService.calculateMinus(a,b);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyTest")
    public void parameterizedTestCalculateMultiply(int a, int b, int expected) {
        int actual = calculatorService.calculateMultiply(a,b);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivideTest")
    public void parameterizedTestCalculateDivide(int a, int b, double expected) {
        double actual = calculatorService.calculateDivide(a,b);
        assertEquals(expected, actual);
    }

    public static Stream<Arguments> provideParamsForMultiplyTest() {
        return Stream.of(
                Arguments.of(5,10,50),
                Arguments.of(3,-10,-30),
                Arguments.of(100,0,0)
        );
    }

    public static Stream<Arguments> provideParamsForDivideTest() {
        return Stream.of(
                Arguments.of(5,10,0.5),
                Arguments.of(3,-10,-0.3),
                Arguments.of(100,2,50)
        );
    }
}