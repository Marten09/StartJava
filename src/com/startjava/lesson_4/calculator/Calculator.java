package com.startjava.lesson_4.calculator;

public class Calculator {

    public static double calculate(String mathExpression) {
        String[] partsExpressoin = mathExpression.split(" ");
        if(partsExpressoin.length != 3) {
            throw new IllegalArgumentException("Не верное выражение" );
        }
        int a;
        int b;
        try {
            a = Integer.parseInt(partsExpressoin[0]);
            b = Integer.parseInt(partsExpressoin[2]);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("В выражении допустимо использовать только" + 
                    " целые положительные числа!", e);
        }
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Число должно быть положительным");
        }
        char sign = partsExpressoin[1].charAt(0);
        return switch (sign) {
            case '+' -> Math.addExact(a, b);
            case '-' -> Math.subtractExact(a, b);
            case '*' -> Math.multiplyExact(a, b);
            case '/' -> (double) a / (double) b;
            case '^' -> Math.pow(a, b);
            case '%' -> a % b;
            default -> throw new IllegalArgumentException("Неизвестный знак " + sign);
        };
    }
}
