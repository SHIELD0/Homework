package org.westos.enumDemo;

/**
 * @PROJECT_NAME:Homework
 * @PACKAGE_NAME:org.westos.enumDemo
 * @DESCRIPTION:TODO
 * @AUTHOR:S.H.I.E.L.D.
 * @CREATE_TIME:2018/11/29-17:30
 */
public enum Season {
    SPRING, SUMMER, AUTUMN, WINTER;

    private int num = 1;
    public int n = 2;
    private void method() {
        System.out.println("method");
    }
    public void pumethod() {
        System.out.println("pumethod");
    }
    Season() {
        System.out.println("Season Constructor");
    }

}
