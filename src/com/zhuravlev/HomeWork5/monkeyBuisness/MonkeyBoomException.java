package com.zhuravlev.HomeWork5.monkeyBuisness;

public class MonkeyBoomException extends RuntimeException {
    public MonkeyBoomException(double reason) {
        System.out.println("Reason is " + reason + ". Bad luck, boom-boom and bye-bye!");
    }
}
