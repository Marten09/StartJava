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
            int temp = intArr[i];
            intArr[i] = intArr[--len];
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
        char[] alphabet = new char[26];
        len = alphabet.length;
        for (int i = 0; i < len; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(alphabet[len - j - 1]);
            }
            System.out.println();
        }

        System.out.println("\n5.Генерация уникальных чисел");
        int[] uniqueNumbers = new int[30];
        len = uniqueNumbers.length;
        for (int i = 0; i < len; i++) {
            int genNumber;
            boolean unique;
            do {
                unique = true;
                genNumber = 60 + (int) (Math.random() * (100 - 60));
                for (int j = 0; j <= i; j++) {
                    if(uniqueNumbers[j] == genNumber) {
                        unique = false;
                        break;
                    }
                }
            } while (!unique);
            uniqueNumbers[i] = genNumber;
        }
        System.out.println("Исходный массив : ");
        printIntArr(uniqueNumbers, 10);
        Arrays.sort(uniqueNumbers);
        System.out.println("Отсортированный массив : ");
        printIntArr(uniqueNumbers, 10);

        System.out.println("\n6.Сдвиг элементов массива");
        String[] srcArr = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        System.out.print("Исходный массив : ");
        printStringArr(srcArr);
        int newLen = 0;
        for(String element : srcArr) {
            if(!element.isBlank()) newLen++;
        }

        String[] destArr = new String[newLen];
        int startCopyRange = -1;
        int nextDestStartRange = 0;
        len = srcArr.length;
        count = 0;
        for(int i = 0; i < len; i++) {
            if(srcArr[i].isBlank() || i == len - 1) {
                if(srcArr[i] == " ") {
                    count++;
                }
                if(startCopyRange >= 0) {
                    System.arraycopy(srcArr, startCopyRange, destArr, nextDestStartRange, count);
                    nextDestStartRange += i - startCopyRange;
                }
                startCopyRange = -1;
                count = 0;
            } else {
                if(startCopyRange < 0) {
                    startCopyRange = i;
                }
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