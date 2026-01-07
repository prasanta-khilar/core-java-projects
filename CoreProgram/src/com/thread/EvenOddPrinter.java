package com.thread;

public class EvenOddPrinter {

    private final Object lock = new Object();
    private boolean evenDone = false;  // flag

    public void printEven() {
        synchronized (lock) {
            for (int i = 0; i <= 10; i += 2) {
                System.out.println("Even: " + i);
            }
            evenDone = true;
            lock.notify(); // signal odd thread
        }
    }

    public void printOdd() {
        synchronized (lock) {
            while (!evenDone) { // wait until even printing completes
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int i = 1; i <= 10; i += 2) {
                System.out.println("Odd: " + i);
            }
        }
    }

    public static void main(String[] args) {

        EvenOddPrinter printer = new EvenOddPrinter();

        Thread t1 = new Thread(printer::printEven);
        Thread t2 = new Thread(printer::printOdd);

        t2.start();
        t1.start();
    }
}