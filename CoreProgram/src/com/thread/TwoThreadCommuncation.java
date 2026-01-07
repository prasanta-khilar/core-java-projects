package com.thread;

public class TwoThreadCommuncation {

    Object lock = new Object();
    private  boolean evenDone = false;
    public void printEven(){
        synchronized (lock){
    for(int i=2;i<=10;i+=2){
        System.out.println("Print even number : " + i);
    }
    evenDone = true;
    lock.notify();
        }
    }
    public  void printOdd()  {
        synchronized (lock){
            while (!evenDone){
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            for (int i =1;i<=10;i+=2){
                System.out.println("print odd number : "+ i);
            }
        }
    }

    public static void main(String[] args) {
        TwoThreadCommuncation communcation = new TwoThreadCommuncation();
        Thread t1 = new Thread(communcation :: printEven);
        Thread t2 = new Thread(communcation :: printOdd);
        t2.start();
        t1.start();

    }
}
