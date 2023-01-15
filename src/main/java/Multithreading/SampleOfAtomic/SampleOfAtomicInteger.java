package Multithreading.SampleOfAtomic;

import java.util.concurrent.atomic.AtomicInteger;

public class SampleOfAtomicInteger {
    static int synchronizedCounter = 0;
    static int nonSynchronizedCounter = 0;

    static AtomicInteger atomicCounter = new AtomicInteger(0);

    public synchronized static void synchronizedIncrement() {
        synchronizedCounter++;
    }

    public static void nonSynchronizedIncrement() {
        nonSynchronizedCounter++;
    }

    public static void atomicIncrement() {
        atomicCounter.incrementAndGet();
    }



    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new NonSynchronizedCounter());
        Thread thread2 = new Thread(new NonSynchronizedCounter());

        Thread thread3 = new Thread(new SynchronizedCounter());
        Thread thread4 = new Thread(new SynchronizedCounter());

        Thread thread5 = new Thread(new AtomicCounter());
        Thread thread6 = new Thread(new AtomicCounter());

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        thread3.start();
        thread4.start();
        thread3.join();
        thread4.join();

        thread5.start();
        thread6.start();
        thread5.join();
        thread6.join();

        System.out.println("nonSynchronizedCounter " + nonSynchronizedCounter);
        System.out.println("synchronizedCounter " + synchronizedCounter);
        System.out.println("atomicCounter " + atomicCounter);
    }
}

class NonSynchronizedCounter implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            SampleOfAtomicInteger.nonSynchronizedIncrement();
        }
    }
}

class SynchronizedCounter implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            SampleOfAtomicInteger.synchronizedIncrement();
        }
    }
}

class AtomicCounter implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            SampleOfAtomicInteger.atomicIncrement();
        }
    }
}



