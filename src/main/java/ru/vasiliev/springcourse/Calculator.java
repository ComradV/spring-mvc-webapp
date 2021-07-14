package ru.vasiliev.springcourse;

import java.security.InvalidAlgorithmParameterException;

public class Calculator {
    public static double getResult(double a, double b, String operation) throws InvalidAlgorithmParameterException {
        switch (operation){
        case "SUB": return a - b;
        case "ADD": return a + b;
        case "MUL": return a * b;
        case "DIV": return a / b;
        default:
            throw new InvalidAlgorithmParameterException("Wrong operation type!");

        }
    }
}
