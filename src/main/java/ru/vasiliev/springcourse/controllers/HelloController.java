package ru.vasiliev.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.vasiliev.springcourse.Calculator;

import java.security.InvalidAlgorithmParameterException;

@Controller
public class HelloController {

//    @GetMapping("/calculator")
//    public String showCalculator(@RequestParam("a") double a, @RequestParam("b") double b,
//                           @RequestParam("operation") String operation,
//                           Model model) throws InvalidAlgorithmParameterException {
//        model.addAttribute("result",
//                "" + a + " " + operation + " " + b + " = " + Calculator.getResult(a,b,operation));
//        return "calculator";
//    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam("name") String nameS,
                           Model model) {
        model.addAttribute("name", nameS);
        return "hello_world";
    }
    @GetMapping("/home")
    public String sayHello() {
        return "home";
    }
}
