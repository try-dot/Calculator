package com.calc;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        startCalculator();
    }

    public static void startCalculator() {
        String welcomeMessage = "Welcome to Console Calculator for Base Camp\n" +
                "Please press \"Enter\" after each typed number or operation\n";
        String firstNumberMessage = "Enter first number";
        String secondNumberMessage = "Enter second number";
        String operationMessage = "Select operation between +,-,*,/";
        String errorMessage = "Unsupported operation";

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        Calculator calculator = new Calculator();

        System.out.println(welcomeMessage);

        while (true) {
            System.out.println(firstNumberMessage);
            double firstNumber = scanner.nextDouble();
            System.out.println(operationMessage);
            String operation = scanner.next();
            System.out.println(secondNumberMessage);
            double secondNumber = scanner.nextDouble();

            switch (operation) {
                case "+":
                    System.out.println(calculator.getSum(firstNumber, secondNumber));
                    break;
                case "-":
                    System.out.println(calculator.getSubtraction(firstNumber, secondNumber));
                    break;
                case "*":
                    System.out.println(calculator.getMultiplication(firstNumber, secondNumber));
                    break;
                case "/":
                    System.out.println(calculator.getDivide(firstNumber, secondNumber));
                    break;
                default:
                    System.out.println(errorMessage);
            }

        }
    }
}
