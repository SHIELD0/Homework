package org.westos.designPattern.prototypePattern.shallowCopy;

/**
 * @PROJECT_NAME:Homework
 * @PACKAGE_NAME:org.westos.designPattern.prototypePattern.shallowCopy
 * @DESCRIPTION:TODO
 * @AUTHOR:S.H.I.E.L.D.
 * @CREATE_TIME:2018/11/30-16:54
 */
public class Prototype implements Cloneable{// 原型模式
    String string;
    int num;
    Student student;

    public Prototype(String string, int num, Student student) {
        this.string = string;
        this.num = num;
        this.student = student;
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "string='" + string + '\'' +
                ", num=" + num +
                ", student=" + student +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
