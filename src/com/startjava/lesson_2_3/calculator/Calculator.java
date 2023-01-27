package com.startjava.lesson_2_3.calculator;

public class Calculator {

    public int calculate(int a, int b, char sign) {
        switch (sign) {
            case '+' :
                return a + b;
            case '-' :
                return a - b;
            case '*' :
                return a * b;
            case '/' :
                return a / b;
            case '^' :
                for (int i = 2; i <= b; i++) {
                    a *= a;
                }
                return a;
            case '%' :
                return a % b;
            default :
                return 0;
        }
    }
}
