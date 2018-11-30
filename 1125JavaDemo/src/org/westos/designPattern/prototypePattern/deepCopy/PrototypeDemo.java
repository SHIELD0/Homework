package org.westos.designPattern.prototypePattern.deepCopy;

import java.io.Serializable;

/**
 * @PROJECT_NAME:Homework
 * @PACKAGE_NAME:org.westos.designPattern.prototypePattern.deepCopy
 * @DESCRIPTION:TODO
 * @AUTHOR:S.H.I.E.L.D.
 * @CREATE_TIME:2018/11/30-17:57
 */
public class PrototypeDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype p1 = new Prototype("abc", 10, new Student("john", 10));
        System.out.println(p1);
        Prototype p2 = (Prototype) p1.clone();
        p2.string = "def";
        p2.num = 9;
        p2.student.name = "mike";
        p2.student.age = 8;
        System.out.println(p1);
        System.out.println(p2);
    }
}
