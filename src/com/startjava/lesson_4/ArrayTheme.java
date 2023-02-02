package com.startjava.lesson_4;

import java.util.Random;

import java.util.Arrays;

public class  ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1.Реверс значений массива");
        int[] intArr = {2, 3, 4, 1, 5, 6, 7};
        int len = intArr.length;
        System.out.println("Исходный массив : ");
        printIntArr(intArr, 0);
        for (int i = 0; i < len; i++) {
            len--;
            int temp = intArr[i];
            intArr[i] = intArr[len];
            intArr[len] = temp;
        }
        System.out.println("Измененный массив : ");
        printIntArr(intArr, 0);

        System.out.println("\n2.Вывод произведения элементов массива");
        intArr = new int[10];
        len = intArr.length;
        for (int i = 0; i < len; i++) {
            intArr[i] = i;
        }
        System.out.println("Исходный массив : ");
        printIntArr(intArr, 0);
        int mulDigits = 1;
        System.out.println("Результат: ");
        for (int i = 1; i < len - 1; i++) {
            mulDigits *= intArr[i];
            System.out.print(intArr[i] + (i < len - 2 ? " * " : " = " + mulDigits));
        }
        System.out.println("\n[0] = " + intArr[0]);
        System.out.println("[9] = " + intArr[9]);

        System.out.println("\n3.Удаление элементов массива");
        float[] floatArr = new float[15];
        Random random = new Random();
        len = floatArr.length;
        for (int i = 0; i < len; i++) {
            floatArr[i] = random.nextFloat();
        }
        System.out.println("Исходный массив : ");
        printFloatArr(floatArr, 8);
        float middleNumber = floatArr[len / 2];
        int count = 0;
        for (int i = 0; i < len; i++) {
            if(floatArr[i] > middleNumber) {
                floatArr[i] = 0;
                count++;
            }
        }
        System.out.println("Обновленный массив : ");
        printFloatArr(floatArr, 8);
        System.out.println("\nКоличество обнуленных ячеек " + count);

        System.out.println("\n4.Вывод элементов массива лесенкой в обратном порядке");
        char[] charArr = new char[26];
        char symbol = 'A';
        for (int i = 0; i < charArr.length; i++) {
            charArr[i] = symbol++;
        }
        for (int i = 0; i < charArr.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(charArr[charArr.length - j - 1]);
            }
            System.out.println();
        }

        System.out.println("\n5.Генерация уникальных чисел");
        int[] uniqueNumber = new int[30];
        len = uniqueNumber.length;
        int genNumber;
        boolean unique;
        for (int i = 0; i < len; i++) {
            do {
                unique = true;
                genNumber = 60 + (int) (Math.random()*(100 - 60));
                for (int j = 0; j <= i; j++) {
                    if(uniqueNumber[j] == genNumber) {
                        unique = false;
                        break;
                    }
                }
            } while (!unique);
            uniqueNumber[i] = genNumber;
        }
        System.out.println("Исходный массив : ");
        printIntArr(uniqueNumber, 10);
        Arrays.sort(uniqueNumber);
        System.out.println("Отсортированный массив : ");
        printIntArr(uniqueNumber, 10);

        System.out.println("\n6.Сдвиг элементов массива");
        String[] stringsArr = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        System.out.print("Исходный массив : ");
        printStringArr(stringsArr);
        int newLen = 0;
        for(String element : stringsArr) {
            if(!element.isBlank()) newLen++;
        }
        String[] destArr = new String[newLen];
        int startCopyRange = -1;
        int nextDestStartRange = 0;
        len = stringsArr.length;
        count = 0;
        for(int i = 0; i < len; i++) {
            boolean isBlank = stringsArr[i].isBlank();
            if(isBlank || i == len - 1) {
                if(!isBlank) count++;
                if(startCopyRange >= 0) {
                    System.arraycopy(stringsArr, startCopyRange, destArr, nextDestStartRange, count);
                    nextDestStartRange += i - startCopyRange;
                }
                startCopyRange = -1;
                count = 0;
            } else {
                if(startCopyRange < 0) startCopyRange = i;
                count++;
            }
        }
        System.out.print("Результат: ");
        printStringArr(destArr);
    }

        private static void printIntArr(int[] arr, int columns) {
            int len = arr.length;
            for (int i = 0; i < len; i++) {
                if(columns > 0 && i % columns == 0) {
                    System.out.println();
                }
                System.out.printf("%3d",arr[i]);
            }
            System.out.println();
        }

        private static void printFloatArr(float[] arr, int columns) {
            int len = arr.length;
            for (int i = 0; i < len; i++) {
                if(columns > 0 && i % columns == 0) {
                    System.out.println();
                }
                System.out.printf("%8.3f",arr[i]);
            }
            System.out.println();
        }

        private static void printStringArr(String[] arr) {
            System.out.print("{");
            int len = arr.length;
            for(int i = 0; i < len; i++) {
                System.out.print("\"" + arr[i] + "\"" + (i < len - 1 ? ", " : ""));
            }
            System.out.print("}");
            System.out.println();
        }
}