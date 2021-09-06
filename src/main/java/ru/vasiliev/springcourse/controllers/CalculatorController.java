package ru.vasiliev.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.vasiliev.springcourse.Calculator;

import java.security.InvalidAlgorithmParameterException;

@Controller
public class CalculatorController {

    @GetMapping("/calc")
    String calculate(@RequestParam("a") String a,
                     @RequestParam("b") String b,
                     @RequestParam("operation") String operation,
                     Model model){
        try {
            model.addAttribute("message", a+operation + b + " = " + Calculator.getResult(Double.parseDouble(a), Double.parseDouble(b), operation));
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
            model.addAttribute("message", a+", "+b+", "+operation+" are not valid attributes for calc!");
        }
        return "calculator/calc";
    }
}
