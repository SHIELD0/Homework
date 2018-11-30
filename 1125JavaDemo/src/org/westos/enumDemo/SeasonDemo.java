package org.westos.enumDemo;

/**
 * @PROJECT_NAME:Homework
 * @PACKAGE_NAME:org.westos.enumDemo
 * @DESCRIPTION:TODO
 * @AUTHOR:S.H.I.E.L.D.
 * @CREATE_TIME:2018/11/29-17:34
 */
public class SeasonDemo {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        Season summer = Season.SUMMER;
        Season autumn = Season.AUTUMN;
        Season winter = Season.WINTER;
        System.out.println(spring.toString() + "\t" + summer.name());
        autumn.n = 3;
        System.out.println(autumn.n + "\t" + winter.n);
        System.out.println(spring == summer);
        System.out.println(spring == Season.SPRING);
        Season spring2 = Season.SPRING;
        System.out.println(spring == spring2);
        spring.n = 12;
        System.out.println(spring2.n);
        System.out.println(Season.SPRING.n);
        System.out.println(spring.ordinal());
        System.out.println(spring2.ordinal());
        System.out.println(Season.SPRING.ordinal());
        System.out.println(summer.ordinal());
        System.out.println("-------");
        Season[] values = Season.values();
        for (Season value : values) {
            System.out.println(value.ordinal() + "\t" + value.name());
        }
        for (int i = 0; i < 6; i++) {
//            System.out.print(Season[i]);
        }
    }
}
