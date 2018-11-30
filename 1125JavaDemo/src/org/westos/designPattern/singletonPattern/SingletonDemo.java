package org.westos.designPattern.singletonPattern;

/**
 * @PROJECT_NAME:Homework
 * @PACKAGE_NAME:org.westos.designPattern.singletonPattern
 * @DESCRIPTION:TODO
 * @AUTHOR:S.H.I.E.L.D.
 * @CREATE_TIME:2018/11/29-20:46
 */
public class SingletonDemo {
    public static void main(String[] args) {
        Singleton1 s11 = Singleton1.getInstance();
        Singleton1 s12 = Singleton1.getInstance();
        System.out.println(s11 == s12);
        System.out.println(s11.equals(s12));
        Singleton2 s21 = Singleton2.getInstance();
        Singleton2 s22 = Singleton2.getInstance();
        System.out.println(s21 == s22);
        System.out.println(s21.equals(s22));
        Singleton3 s31 = Singleton3.SINGLETON;
        Singleton3 s32 = Singleton3.SINGLETON;
        System.out.println(s31 == s32);
        System.out.println(s31.equals(s32));
        Singleton4 s41 = Singleton4.getInstance();
        Singleton4 s42 = Singleton4.getInstance();
        System.out.println(s41 == s42);
        System.out.println(s41.equals(s42));
    }
}
