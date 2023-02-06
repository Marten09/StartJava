package com.startjava.lesson_4.guess;

import java.util.Arrays;

public class Player {
    public static final int MAX_TRY_COUNT = 10;
    private int[] enteredNumbers;
    private String name;
    private int countTry;

    public Player(String name) {
        this.name = name;
        enteredNumbers = new int[MAX_TRY_COUNT];
    }

    public int[] getEnteredNumbers() {
        return (countTry >= 0 ? Arrays.copyOf(enteredNumbers, countTry) : new int[0]);
    }

    public int getLastNumber() {
        return countTry > 0 ? enteredNumbers[countTry - 1] : 0;
    }

    public void addNumber(int number) {
        if (hasTries()) {
            return;
        }
        enteredNumbers[countTry] = number;
        countTry++;
    }

    public String getName() {
        return name;
    }

    public int getTryCount() {
        return countTry;
    }

    public boolean hasTries() {
        return countTry == MAX_TRY_COUNT;
    }

    public void reset() {
        Arrays.fill(enteredNumbers, 0, countTry, 0);
        countTry = 0;
    }
}