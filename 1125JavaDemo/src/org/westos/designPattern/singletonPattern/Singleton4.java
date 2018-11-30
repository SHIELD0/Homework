package org.westos.designPattern.singletonPattern;

/**
 * @PROJECT_NAME:Homework
 * @PACKAGE_NAME:org.westos.designPattern.singletonPattern
 * @DESCRIPTION:TODO
 * @AUTHOR:S.H.I.E.L.D.
 * @CREATE_TIME:2018/11/29-21:20
 */
public class Singleton4 {
    private Singleton4() {
    }

    public static class Inner {// 静态内部类仅在调用时加载，且只加载一次。类加载过程是线程安全的。
        private static final Singleton4 inner = new Singleton4();
    }

    public static final Singleton4 getInstance() {
        return Inner.inner;
    }
}