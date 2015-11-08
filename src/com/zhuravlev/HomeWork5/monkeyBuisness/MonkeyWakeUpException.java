package com.zhuravlev.HomeWork5.monkeyBuisness;


public class MonkeyWakeUpException extends Exception {

    public MonkeyWakeUpException(Double reason) {
        System.out.println("Reason is " + reason + ". Bad luck");
    }
}
