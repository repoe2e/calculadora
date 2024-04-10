package br.com.e2etreinamentos.calculator.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.e2etreinamentos.calculator.model.OperationResult;
import br.com.e2etreinamentos.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculadora")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @PostMapping("/somar")
    public OperationResult add(@RequestBody CalculationRequest request) {
        double resultado = calculatorService.add(request.getNum1(), request.getNum2());
        return new OperationResult(resultado);
    }

    @PostMapping("/subtrair")
    public OperationResult subtract(@RequestBody CalculationRequest request) {
        double resultado = calculatorService.subtract(request.getNum1(), request.getNum2());
        return new OperationResult(resultado);
    }

    @PostMapping("/multiplicar")
    public OperationResult multiply(@RequestBody CalculationRequest request) {
        double resultado = calculatorService.multiply(request.getNum1(), request.getNum2());
        return new OperationResult(resultado);
    }

    @PostMapping("/dividir")
    public OperationResult divide(@RequestBody CalculationRequest request) {
        double resultado = calculatorService.divide(request.getNum1(), request.getNum2());
        return new OperationResult(resultado);
    }
}