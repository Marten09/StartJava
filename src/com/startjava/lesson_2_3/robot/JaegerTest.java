package com.startjava.lesson_2_3.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger strikerEureka = new Jaeger();
        strikerEureka.setModelName("Eureka");
        strikerEureka.setMark("Mark-5");
        strikerEureka.setOrigin("Australia");
        strikerEureka.setHeight(76.2f);
        strikerEureka.setWeight(1.850f);
        strikerEureka.setStrength(10);
        strikerEureka.setArmor(9);

        Jaeger gipsyDanger = new Jaeger("Danger","Mark-3","USA",79.25f,1.980f,8,6);

        System.out.println("name - " + gipsyDanger.getModelName());
        System.out.println("mark - " + gipsyDanger.getMark());
        System.out.println("origin - " + gipsyDanger.getOrigin());
        System.out.println("height - " + gipsyDanger.getHeight());
        System.out.println("weight - " + gipsyDanger.getWeight());
        System.out.println("strength - " + gipsyDanger.getStrength());
        System.out.println("armor - " + gipsyDanger.getArmor());
        System.out.println("\nname - " + strikerEureka.getModelName());
        System.out.println("mark - " + strikerEureka.getMark());
        System.out.println("origin - " + strikerEureka.getOrigin());
        System.out.println("height - " + strikerEureka.getHeight());
        System.out.println("weight - " + strikerEureka.getWeight());
        System.out.println("strength - " + strikerEureka.getStrength());
        System.out.println("armor - " + strikerEureka.getArmor());

        strikerEureka.move();
        gipsyDanger.shoot();
    }
}