package com.startjava.lesson_1.finaly;

public class MyFirstGame {

    public static void main(String[] args) {
        int hiddenNumber = 56;
        int playerNumber = 39;
        while (playerNumber != hiddenNumber) {
            if (playerNumber > hiddenNumber) {
                System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
                playerNumber--;
            } else {
                System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
                playerNumber++;
            }
        }
        System.out.println("Вы победили!");
    }
}