package com.startjava.lesson_2_3.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("Man");
        wolfOne.setName("Lark");
        wolfOne.setWeight(16.4f);
        wolfOne.setAge(6);
        wolfOne.setColor("Grey");

        System.out.println(wolfOne.getGender());
        System.out.println(wolfOne.getName());
        System.out.println(wolfOne.getWeight());
        System.out.println(wolfOne.getAge());
        System.out.println(wolfOne.getColor());

        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}