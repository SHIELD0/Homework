package org.westos.socket;

/**
 * @PROJECT_NAME:Homework
 * @PACKAGE_NAME:org.westos.socket
 * @DESCRIPTION:TODO
 * @AUTHOR:S.H.I.E.L.D.
 * @CREATE_TIME:2018/11/28-22:47
 */
public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.start();
        MyThread t2 = new MyThread();
        t2.start();
        MyThread t3 = new MyThread();
        t3.start();
        System.out.println("-------");
        Thread.sleep(10000);
        MyRunnable r1 = new MyRunnable();
        Thread th1 = new Thread(r1);
        Thread th2 = new Thread(r1);
        Thread th3 = new Thread(r1);
        th1.start();
        th2.start();
        th3.start();
        Thread.sleep(10000);
        System.out.println("====");
        MyRunnable r2 = new MyRunnable();
        MyRunnable r3 = new MyRunnable();
        MyRunnable r4 = new MyRunnable();
        Thread thr1 = new Thread(r2);
        Thread thr2 = new Thread(r3);
        Thread thr3 = new Thread(r4);
        thr1.start();
        thr2.start();
        thr3.start();
    }
}
