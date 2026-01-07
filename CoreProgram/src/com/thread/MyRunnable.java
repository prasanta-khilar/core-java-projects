package com.thread;

public class MyRunnable implements Runnable {
    public void run(){
        for (int i=0; i<=5 ; i++){
            System.out.println("My runnable class : "+ i);
        }
    }
}
class MyRunMain{

    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        for(int i = 0; i<= 5 ;i++){
            System.out.println("My runnable main class : "+ i);
        }
    }
}
