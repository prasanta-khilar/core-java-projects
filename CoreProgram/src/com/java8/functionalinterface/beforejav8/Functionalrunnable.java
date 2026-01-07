package com.java8.functionalinterface.beforejav8;

public class Functionalrunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("functional interface Runnable Run method");
    }

    public static void main(String[] args) {
        Functionalrunnable functionalrunnable = new Functionalrunnable();
        functionalrunnable.run();
    }
}
