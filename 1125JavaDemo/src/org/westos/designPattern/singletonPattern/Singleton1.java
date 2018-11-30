package org.westos.designPattern.singletonPattern;

/**
 * @PROJECT_NAME:Homework
 * @PACKAGE_NAME:org.westos.designPattern.singlePattern
 * @DESCRIPTION:TODO
 * @AUTHOR:S.H.I.E.L.D.
 * @CREATE_TIME:2018/11/29-20:42
 */
public class Singleton1 {
    private static final Singleton1 singleton = new Singleton1();

    private Singleton1() {

    }

    public static final Singleton1 getInstance() {
        return singleton;
    }
}
