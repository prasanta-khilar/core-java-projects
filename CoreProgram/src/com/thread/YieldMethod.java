package com.thread;

public class YieldMethod extends Thread{
    public void run(){

        for(int i = 0;i<=5;i++){
            Thread.yield();
            System.out.println("YieldMethod class run method() : "+i);
        }
    }
}
class YieldMain{
    public static void main(String[] args) {
        YieldMethod yieldMethod = new YieldMethod();
        yieldMethod.start();
        for (int i =0;i<=5;i++){
            System.out.println("YieldMain class run method() : "+i);
        }
    }
}
