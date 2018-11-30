package org.westos.designPattern.prototypePattern.deepCopy;

import java.io.*;

/**
 * @PROJECT_NAME:Homework
 * @PACKAGE_NAME:org.westos.designPattern.prototypePattern.deepCopy
 * @DESCRIPTION:TODO
 * @AUTHOR:S.H.I.E.L.D.
 * @CREATE_TIME:2018/11/30-17:55
 */
public class Prototype implements Cloneable, Serializable {// 深拷贝
    String string;
    int num;
    Student student;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();// 字节数组的输出流
        ObjectOutputStream objectOutputStream;
        ObjectInputStream objectInputStream;
        try {
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);// 对象输出流中可以实现把对象变为字节流
            objectOutputStream.writeObject(this);// 把当前对象写入输出流中。
            byte[] bytes = byteArrayOutputStream.toByteArray();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            return objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "string='" + string + '\'' +
                ", num=" + num +
                ", student=" + student +
                '}';
    }

    public Prototype(String string, int num, Student student) {
        this.string = string;
        this.num = num;
        this.student = student;
    }
}
