package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        String answer = "yes";
        while(!answer.equals("no")) {
            if (answer.equals("yes")) {
                System.out.println("Введите первое число: ");
                int a = scanner.nextInt();
                System.out.println("Введите знак математической операции: ");
                char sign = scanner.next().charAt(0);
                System.out.println("Введите второе число: ");
                int b = scanner.nextInt();
                System.out.println("Результат вычисления : " + calc.calculate(a, b, sign));
            }
            System.out.println("Хотите продолжить вычисления ?[yes/no]");
            answer = scanner.nextLine();
        }
    }
}