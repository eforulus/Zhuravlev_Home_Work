package com.zhuravlev.HomeWork5.monkeyBuisness;


import java.util.Random;

public class Monkey implements AutoCloseable {
    private Random random = new Random();

    public Monkey() {}

    public void wakeUp()  throws MonkeyWakeUpException {
        double decision;
        if ((decision = random.nextDouble() * 100) < 25) {
            throw new MonkeyWakeUpException(decision);
        }
        System.out.println("Monkey waked up without Boom!");
    }

    public void doMonkeyBusiness() {
        double decision;
        if ((decision = random.nextDouble() * 100) < 25) {
            throw new MonkeyBoomException(decision);
        }
        System.out.println("Good luck! Monkey acts something safe");
    }

    @Override
    public void close() {
        System.out.println("Monkey has lost grenade and goes to sleep! Bye-bye.");
    }
}
