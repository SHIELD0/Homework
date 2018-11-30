package org.westos.designPattern.prototypePattern.shallowCopy;

/**
 * @PROJECT_NAME:Homework
 * @PACKAGE_NAME:org.westos.designPattern.prototypePattern.shallowCopy
 * @DESCRIPTION:TODO
 * @AUTHOR:S.H.I.E.L.D.
 * @CREATE_TIME:2018/11/30-16:57
 */
public class PrototypeDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype p1 = new Prototype("abc", 10, new Student("john", 10));
        System.out.println(p1);
        Prototype p2 = (Prototype) p1.clone();
        p2.string = "def";
        p2.num = 3;
        p2.student.name = "mike";
        p2.student.age = 9;
//        p2.student = new Student("mike", 8);// 这种方式并不能直接将
        System.out.println(p1);
        System.out.println(p2);

    }
}
