package org.westos.designPattern.prototypePattern.shallowCopy;

/**
 * @PROJECT_NAME:Homework
 * @PACKAGE_NAME:org.westos.designPattern.prototypePattern.shallowCopy
 * @DESCRIPTION:TODO
 * @AUTHOR:S.H.I.E.L.D.
 * @CREATE_TIME:2018/11/30-17:10
 */
public class Student {
    String name;
    int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
