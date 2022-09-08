package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String calculatePlus(int num1, int num2) {
        return Integer.toString(num1 + num2);
    }

    @Override
    public String calculateMinus(int num1, int num2) {
        return Integer.toString(num1 - num2);
    }

    @Override
    public String calculateMultiply(int num1, int num2) {
        return Integer.toString(num1 * num2);
    }

    @Override
    public String calculateDivide(int num1, int num2) {
        if (num2 == 0) return "∞";
        return Integer.toString(num1 / num2);
    }
}
