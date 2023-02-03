package com.startjava.lesson_4.calculator;

public class Calculator {

    public static double calculate (String mathExpression) {
        String[] saveMathExpressoin = mathExpression.split(" ");
        if(saveMathExpressoin.length != 3) {
            throw new IllegalArgumentException("Не верное выражение" );
        }
        int a;
        char sign;
        int b;
        try {
            a = Integer.parseInt(saveMathExpressoin[0]);
            sign = saveMathExpressoin[1].charAt(0);
            b = Integer.parseInt(saveMathExpressoin[2]);
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Число должно быть положительным");
        }
        } catch (NumberFormatException exc) {
            throw new IllegalArgumentException("Введенное выражение не является числом", exc);
        }
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
