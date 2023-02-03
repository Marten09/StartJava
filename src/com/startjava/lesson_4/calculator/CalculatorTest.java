package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        while(!answer.equals("no")) {
            if (answer.equals("yes")) {
                System.out.println("Введите математическое выражение (например : 2 ^ 10) :");
                try {
                    double result = Calculator.calculate(scanner.nextLine());
                    if (result % 1.0 == 0.0) {
                        int resultInt = (int) result;
                        System.out.println("Результат вычисления: " + resultInt);
                    }
                    else {
                        System.out.println("Результат вычисления: " + result);
                    }
                } catch (IllegalArgumentException exc) {
                    System.out.print("ОШИБКА: " + exc.getMessage());
                }
            }
            System.out.println("\nХотите продолжить вычисления ?[yes/no]");
            answer = scanner.nextLine();
        }
    }
}