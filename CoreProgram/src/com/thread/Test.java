package com.thread;

public class Test{

    Object lock = new Object();
    private boolean evenDone = false;

    public void even(){
        synchronized (lock){

            for(int i =2;i<=10;i+=2){
                System.out.println("Even : "+i);
            }
            evenDone = true;
            lock.notify();
        }
    }
    public void Odd(){
        synchronized (lock){
            while (!evenDone){
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            for(int i =1;i<=10;i+=2){
                System.out.println("Odd : "+i);
            }
        }
    }


    public static void main(String[] args) {
        Test test = new Test();
        Thread t1 = new Thread(test::even);
        Thread t2 = new Thread(test::Odd);
        t2.start();
        t1.start();
    }



}