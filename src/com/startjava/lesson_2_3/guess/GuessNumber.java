package com.startjava.lesson_2_3.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private static final int START_RANGE = 1;
    private static final int END_RANGE = 100;
    private Player player1;
    private Player player2;
    private int guessedNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Random random = new Random();
        guessedNumber = random.nextInt(END_RANGE + START_RANGE);
        System.out.printf("\nЗагадано число от %d до %d\n", START_RANGE, END_RANGE);
        while (!(isGuessed(player1) || isGuessed(player2))) {
            System.out.println("Не угадали,попробуйте снова");
        }
    }

    private boolean isGuessed(Player player) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("\nХодит %s. Введите число: ", player.getName());
        player.setNumber(sc.nextInt());
        sc.nextLine();
        int playerNumber = player.getNumber();
        if (playerNumber == guessedNumber) {
            System.out.println("\nВерно! Победил игрок " + player.getName());
            return true;
        }
        if (playerNumber > guessedNumber) {
            System.out.printf("Число %d больше того, что загадал компьютер\n", playerNumber);
        } else if (playerNumber < guessedNumber) {
            System.out.printf("Число %d меньше того, что загадал компьютер\n", playerNumber);
        }
        return false;
    }
}