package com.zhuravlev.HomeWork5.monkeyBuisness;


public class MonkeyTest {
    public static void main(String[] args) {
        try (Monkey monkey = new Monkey();
             ){
            monkey.wakeUp();
            monkey.doMonkeyBusiness();
            //monkey.doMonkeyBusiness();
        } catch (MonkeyWakeUpException | MonkeyBoomException e) {

        }
    }
}
