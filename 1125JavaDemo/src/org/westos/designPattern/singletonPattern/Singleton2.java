package org.westos.designPattern.singletonPattern;

/**
 * @PROJECT_NAME:Homework
 * @PACKAGE_NAME:org.westos.designPattern.singletonPattern
 * @DESCRIPTION:TODO
 * @AUTHOR:S.H.I.E.L.D.
 * @CREATE_TIME:2018/11/29-20:56
 */
public class Singleton2 {
    private static Singleton2 singleton;

    private Singleton2() {
    }

    public static final Singleton2 getInstance() {
        if (Singleton2.singleton == null) {
            singleton = new Singleton2();
        }
        return singleton;
    }
}
