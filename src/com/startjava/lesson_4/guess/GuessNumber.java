package com.startjava.lesson_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private final int START_RANGE = 1;
    private final int END_RANGE = 100;
    private int guessedNumber;
    private Player player1;
    private Player player2;
    private Random rnd;
    private Scanner sc;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        rnd = new Random();
        sc = new Scanner(System.in);
    }

    public void start() {
        init();
        System.out.printf("\nУ каждого игрока по %d попыток", Player.MAX_TRY_COUNT);
        System.out.printf("\nЗагадано число от %d до %d\n", START_RANGE, END_RANGE);
        while (!(isGuessed(player1) || isGuessed(player2) || (player1.hasTries() && player2.hasTries()))) {}
        printEnteredNumbers(player1);
        printEnteredNumbers(player2);
    }

    public void init() {
        player1.reset();
        player2.reset();
        guessedNumber = START_RANGE + rnd.nextInt(END_RANGE - START_RANGE + 1);
    }

    private boolean isGuessed(Player player) {
        if (player.hasTries()) {
            System.out.printf("У %s закончились попытки!\n", player.getName());
            return false;
        }
        printNumber(player);
        if (player.getLastNumber() == guessedNumber) {
            System.out.printf("\nВерно! Игрок %s угадал число %d с %d попытки\n", player.getName(), guessedNumber,
                    player.getTryCount());
            return true;
        }
        checkEnteredNumber(player);
        if (player.hasTries()) {
            System.out.printf("У %s закончились попытки!\n", player.getName());
        }
        return false;
    }

    private void printNumber(Player player) {
        System.out.printf("\nХодит %s. Введите число: ", player.getName());
        player.addNumber(sc.nextInt());
        sc.nextLine();
    }

    private void checkEnteredNumber(Player player) {
        if (player.getLastNumber() > guessedNumber) {
            System.out.printf("Число %d больше того, что загадал компьютер\n", player.getLastNumber());
        } else if (player.getLastNumber() < guessedNumber) {
            System.out.printf("Число %d меньше того, что загадал компьютер\n", player.getLastNumber());
        }
    }

    private void printEnteredNumbers(Player player) {
        int counter = 1;
        System.out.println("\nХоды игрока " + player.getName());
        for (int number : player.getEnteredNumbers()) {
            System.out.printf("%5d", number);
            if (counter % 5 == 0) {
                System.out.println();
            }
            counter++;
        }
    }
}