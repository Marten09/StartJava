package com.startjava.lesson_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {    
        Scanner console = new Scanner(System.in);
        System.out.print("\nВведите имя первого игрока: ");
        Player player1 = new Player(console.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(console.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        String answer = "yes";
        while(!answer.equals("no")) {
            if (answer.equals("yes")) {
                game.start();
            }
            System.out.println("\nХотите продолжить вычисления ?[yes/no]");
            answer = console.nextLine();
        }
    }
}