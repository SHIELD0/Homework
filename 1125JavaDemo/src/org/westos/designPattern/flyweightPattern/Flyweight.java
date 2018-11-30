package org.westos.designPattern.flyweightPattern;

/**
 * @PROJECT_NAME:Homework
 * @PACKAGE_NAME:org.westos.designPattern.flyweightPattern
 * @DESCRIPTION:TODO
 * @AUTHOR:S.H.I.E.L.D.
 * @CREATE_TIME:2018/11/30-11:12
 */
public class Flyweight {
    public static void main(String[] args) {
        // 这里Integer类中实现了享元模式，==比较来判断两者地址值是否相同。重用已有对象。String类同样在是相同对象时，不创建新的对象而是使用常量池中的数据。
        System.out.println(Integer.valueOf(-129) == Integer.valueOf(-129));
        System.out.println(Integer.valueOf(-128) == Integer.valueOf(-128));
        System.out.println(Integer.valueOf(1) == Integer.valueOf(1));
        System.out.println(Integer.valueOf(127) == Integer.valueOf(127));
        System.out.println(Integer.valueOf(128) == Integer.valueOf(128));
    }
}
