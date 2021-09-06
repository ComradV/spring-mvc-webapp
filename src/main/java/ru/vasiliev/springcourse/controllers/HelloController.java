package ru.vasiliev.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import ru.vasiliev.springcourse.Calculator;

//import java.security.InvalidAlgorithmParameterException;

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

//    @GetMapping("/hello")
//    public String sayHello(@RequestParam("name") String nameS,
//                           Model model) {
//        System.out.println("in /hello");
//        model.addAttribute("name", nameS);
//        return "hello_world";
//    }
//    @GetMapping("/home")
//    public String sayHello() {
//        System.out.println("in /home");
//        return "home";
//    }
//    @GetMapping("/")
//    public String sayHello() {
//        System.out.println("in /home");
//        return "redirect:/mm";
////        return "home";
//    }

    @GetMapping("/hello")
    public String sayHello() {
//        System.out.println("in /home");
        return "hello/hello";
    }

    @GetMapping("/goodbye")
    public String sayGoodbye() {
//        System.out.println("in /home");
        return "hello/goodbye";
    }

    @GetMapping("/redirect")
    public String redirect() {
//        System.out.println("in /home");
        return "redirect:/hello";
    }

}
