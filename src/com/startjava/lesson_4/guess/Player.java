package com.startjava.lesson_4.guess;

import java.util.Arrays;

public class Player {
    public static final int MAX_TRY_COUNT = 10;
    private int[] enteredNumbers;
    private String name;
    private int tryCount;

    public Player(String name) {
        this.name = name;
        enteredNumbers = new int[MAX_TRY_COUNT];
    }

    public int[] getEnteredNumbers() {
        return (tryCount > 0 ? Arrays.copyOf(enteredNumbers, tryCount) : new int[0]);
    }

    public int getLastNumber() {
        return tryCount > 0 ? enteredNumbers[tryCount - 1] : 0;
    }

    public void addNumber(int number) {
        if (noMoreTries()) {
            return;
        }
        enteredNumbers[tryCount] = number;
        tryCount++;
    }

    public String getName() {
        return name;
    }

    public int getTryCount() {
        return tryCount;
    }

    public boolean noMoreTries() {
        return tryCount == MAX_TRY_COUNT;
    }

    public void reset() {
        Arrays.fill(enteredNumbers, 0, tryCount, 0);
        tryCount = 0;
    }
}