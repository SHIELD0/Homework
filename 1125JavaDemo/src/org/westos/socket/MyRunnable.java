package org.westos.socket;

/**
 * @PROJECT_NAME:Homework
 * @PACKAGE_NAME:org.westos.socket
 * @DESCRIPTION:TODO
 * @AUTHOR:S.H.I.E.L.D.
 * @CREATE_TIME:2018/11/28-23:22
 */
public class MyRunnable implements Runnable {
    int i = 0;
    @Override
    public void run() {
        for (; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
