package com.startjava.lesson_1.base;

public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("\n1.Подсчет суммы четных и нечетных чисел");
        int counter = -10;
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;
        do {
            if (counter % 2 == 0) {
                sumEvenNumbers = counter + sumEvenNumbers;
            } else {
                sumOddNumbers = counter + sumOddNumbers;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("Сумма четных чисел : " + sumEvenNumbers);
        System.out.println("Сумма нечетных чисел : " + sumOddNumbers);

        System.out.println("\n2.Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num3;
        int min = num2;
        if (num1 > max) {
            max = num1;
        }
        if (num2 > max) {
            max = num2;
        }
        if (num1 < min) {
            min = num1;
        }
        if (num3 < min) {
            min = num3;
        } 
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3.Вывод реверсивного числа и суммы его цифр");
        int numGiven = 1234;
        int sum3 = 0;
        while (numGiven > 0) {
            int digit = numGiven % 10;
            System.out.print(digit);
            sum3 += digit;
            numGiven /= 10;
        }
        System.out.println("\nсумма цифр " + sum3);

        System.out.println("\n4.Вывод чисел на консоль в несколько строк");
        int count = 0;
        for (int i = 1; i < 24; i += 2) {
            if (count == 5) {
                System.out.println();
                count = 0;
            }
            System.out.printf("%3d", i);
            count++;
        }
        for (int i = count; i < 5; i++) {
            System.out.printf("%3d",0);
        }

        System.out.println("\n\n5.Проверка количества двоек на четность/нечетность");
        int num = 3242592;
        int copyNum = num;
        int countTwos = 0;
        while (copyNum > 0) {
            int digit = copyNum % 10;
            if (digit == 2) {
                countTwos++;
            }
            copyNum /= 10;
        }
        String type = " (нечетное)";
        if (countTwos % 2 == 0) {
            type = " (четное)";
        } 
        System.out.println("Число " + num + " содержит " + countTwos + type + " количество двоек");

        System.out.println("\n6.Отображение фигур в консоли");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10;j++) {
                System.out.print("*");
            }
                System.out.println();
        }
        System.out.println();

        int countLines = 5;
        while (countLines > 0) {
            counter = 1;
            while (counter <= countLines) {
                System.out.print("#");
                counter++;
            }
            System.out.println();
            countLines--;
        }
        System.out.println();

        int countCharsPerLines = 1;
        countLines = 1;
        counter = 1;
        do {
            countCharsPerLines = 1;
            do {
                System.out.print("$");
                countCharsPerLines++;
            } while (countCharsPerLines <= counter);
            System.out.println();
            countLines++;
            if (countLines <= 3) {
                counter++;
            } else {
                counter--;
            }
        } while (countLines <= 5);

        System.out.println("\n7.Отображение ASCII-символов");
        System.out.printf("%6s%6s%n" , "Dec" , "Char");
        for (char i = 1; i <= 127; i++) {
            if (i < 48 && i % 2 != 0) {
                System.out.printf("%5d%5c%n",(int) i, i);
            } else if (i > 96 && i < 123 && i % 2 == 0) {
                System.out.printf("%5d%5c%n",(int) i, i);
            }
        }

        System.out.println("\n8.Проверка, является ли число палиндромом");
        int num8 = 1234321;
        int reverseNum8 = 0;
        int copyNum8 = num8;
        while (num8 > 0) {
            int digit = num8 % 10;
            reverseNum8 = reverseNum8 * 10 + digit;
            num8 /= 10;
        }
        if (copyNum8 == reverseNum8) {
            System.out.println("Число " + copyNum8 + " является палиндромом");
        } else {
            System.out.println("Число " + copyNum8 + " не является палиндромом");
        }

        System.out.println("\n9.Определение, является ли число счастливым");
        int num9 = 156237;
        int copyNum9 = num9;
        int leftHalf = num9 / 1000;
        int rightHalf = num9 % 1000;
        int sumLeftHalf = 0;
        int sumRightHalf = 0;
        while (rightHalf > 0) {
            sumLeftHalf += leftHalf % 10;
            leftHalf /= 10;
            sumRightHalf += rightHalf % 10;
            rightHalf /= 10;
        }
        System.out.println("Сумма первых трех цифр " + sumLeftHalf);
        System.out.println("Сумма последних трех цифр " + sumRightHalf);
        if (sumLeftHalf == sumRightHalf) {
            System.out.println("Число " + copyNum9 + " является счастливым");
        } else {
            System.out.println("Число " + copyNum9 + " не является счастливым");
        }

        System.out.println("\n10.Вывод таблицы умножения Пифагора");
        System.out.println("  |  2  3  4  5  6  7  8  9" + "\n___________________________");
        for (int i = 2; i < 10; i++) {
            System.out.print(i + " |");
            for (int j = 2; j < 10; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.print("\n");
        }
    }
}