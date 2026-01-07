package com.thread;

public class MyThread extends Thread{

    public void run(){

        for(int i=0;i<=5;i++){
            System.out.println("My Thread class : "+ i);
        }
    }
}

 class ThreadMain{
     public static void main(String[] args) {
         MyThread myThread = new MyThread();
         myThread.start();
         for (int i=0; i<=5 ; i++){
             System.out.println("Main class : "+i);
         }
     }
}
