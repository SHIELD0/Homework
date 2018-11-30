package org.westos.socket;

/**
 * @PROJECT_NAME:Homework
 * @PACKAGE_NAME:org.westos.socket
 * @DESCRIPTION:TODO
 * @AUTHOR:S.H.I.E.L.D.
 * @CREATE_TIME:2018/11/28-22:48
 */
public class MyThread extends Thread {
    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i + this.getName());
        }
    }
}
