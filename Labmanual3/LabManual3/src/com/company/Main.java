package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ClockDisplay clock = new ClockDisplay(4,59,50);
        System.out.println(clock.getTime());
        while (true) {
            clock.timeTick();
            Thread.sleep(1000);
            System.out.print('\r');
            System.out.print(clock.getTime());
        }
    }
}
