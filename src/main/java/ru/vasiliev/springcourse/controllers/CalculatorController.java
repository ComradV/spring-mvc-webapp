package ru.vasiliev.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.vasiliev.springcourse.Calculator;

import java.security.InvalidAlgorithmParameterException;

@Controller
@RequestMapping("/calc")
public class CalculatorController {

    @GetMapping()
    String calculate(@RequestParam("a") double a,
                     @RequestParam("b") double b,
                     @RequestParam("operation") String operation,
                     Model model){
        try {
            model.addAttribute("message", a+operation + b + " = " + Calculator.getResult(a, b, operation));
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
            model.addAttribute("message", a+", "+b+", "+operation+" are not valid attributes for calc!");
        }
        return "calculator/calc";
    }
}
