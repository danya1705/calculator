package pro.sky.java.course2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String showGreetings() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String showPlus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " + " + num2 + " = " + calculatorService.calculatePlus(num1,num2);
    }

    @GetMapping("/minus")
    public String showMinus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " - " + num2 + " = " + calculatorService.calculateMinus(num1,num2);
    }

    @GetMapping("/multiply")
    public String showMultiply(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " * " + num2 + " = " + calculatorService.calculateMultiply(num1,num2);
    }

    @GetMapping("/divide")
    public String showDivide(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " / " + num2 + " = " + calculatorService.calculateDivide(num1,num2);
    }
}
