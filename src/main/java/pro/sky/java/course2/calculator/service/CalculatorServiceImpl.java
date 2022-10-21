package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int calculatePlus(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int calculateMinus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int calculateMultiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public double calculateDivide(int num1, int num2) {
        if (num2 == 0) throw new IllegalArgumentException("Division by zero");
        return (double) num1 / num2;
    }
}
